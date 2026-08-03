.class public final synthetic Lx9/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Landroid/content/Context;

.field public final synthetic h:Lx9/e;

.field public final synthetic i:Lx9/c;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Z


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lx9/e;Lx9/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx9/a;->g:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lx9/a;->h:Lx9/e;

    .line 7
    .line 8
    iput-object p3, p0, Lx9/a;->i:Lx9/c;

    .line 9
    .line 10
    iput-object p4, p0, Lx9/a;->j:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lx9/a;->k:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lx9/a;->l:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Lx9/a;->m:Ljava/lang/String;

    .line 17
    .line 18
    iput-boolean p8, p0, Lx9/a;->n:Z

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Lx9/a;->g:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v0, v1, Lx9/a;->h:Lx9/e;

    .line 6
    .line 7
    iget-object v3, v1, Lx9/a;->i:Lx9/c;

    .line 8
    .line 9
    iget-object v4, v1, Lx9/a;->j:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, v1, Lx9/a;->k:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, v1, Lx9/a;->l:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v7, v1, Lx9/a;->m:Ljava/lang/String;

    .line 16
    .line 17
    iget-boolean v8, v1, Lx9/a;->n:Z

    .line 18
    .line 19
    sget-object v9, Lx9/d;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 20
    .line 21
    const-string v9, "notification"

    .line 22
    .line 23
    invoke-virtual {v2, v9}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v9

    .line 27
    instance-of v10, v9, Landroid/app/NotificationManager;

    .line 28
    .line 29
    if-eqz v10, :cond_0

    .line 30
    .line 31
    check-cast v9, Landroid/app/NotificationManager;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v9, 0x0

    .line 35
    :goto_0
    if-eqz v9, :cond_25

    .line 36
    .line 37
    iget-object v10, v3, Lx9/c;->j:Ljava/lang/String;

    .line 38
    .line 39
    const-string v12, "keyword_notify_sound"

    .line 40
    .line 41
    const/4 v13, 0x1

    .line 42
    invoke-virtual {v0, v12, v13}, Lx9/e;->a(Ljava/lang/String;Z)Z

    .line 43
    .line 44
    .line 45
    move-result v12

    .line 46
    invoke-virtual {v0, v10, v12}, Lx9/e;->a(Ljava/lang/String;Z)Z

    .line 47
    .line 48
    .line 49
    move-result v10

    .line 50
    iget-object v12, v3, Lx9/c;->k:Ljava/lang/String;

    .line 51
    .line 52
    const-string v14, "keyword_notify_vibrate"

    .line 53
    .line 54
    invoke-virtual {v0, v14, v13}, Lx9/e;->a(Ljava/lang/String;Z)Z

    .line 55
    .line 56
    .line 57
    move-result v14

    .line 58
    invoke-virtual {v0, v12, v14}, Lx9/e;->a(Ljava/lang/String;Z)Z

    .line 59
    .line 60
    .line 61
    move-result v12

    .line 62
    iget-object v3, v3, Lx9/c;->l:Ljava/lang/String;

    .line 63
    .line 64
    const-string v14, "keyword_notify_ringtone"

    .line 65
    .line 66
    const-string v15, ""

    .line 67
    .line 68
    invoke-virtual {v0, v14, v15}, Lx9/e;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v14

    .line 72
    invoke-virtual {v0, v3, v14}, Lx9/e;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    const-string v0, "0"

    .line 77
    .line 78
    const-string v14, "1"

    .line 79
    .line 80
    if-eqz v10, :cond_1

    .line 81
    .line 82
    move-object v11, v14

    .line 83
    goto :goto_1

    .line 84
    :cond_1
    move-object v11, v0

    .line 85
    :goto_1
    if-eqz v12, :cond_2

    .line 86
    .line 87
    move-object v0, v14

    .line 88
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 89
    .line 90
    .line 91
    move-result v14

    .line 92
    move/from16 v16, v13

    .line 93
    .line 94
    const-string v13, "_v"

    .line 95
    .line 96
    const-string v1, "_"

    .line 97
    .line 98
    move-object/from16 v17, v3

    .line 99
    .line 100
    const-string v3, "Hchat_keyword_notification_s"

    .line 101
    .line 102
    invoke-static {v3, v11, v13, v0, v1}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    const/4 v1, 0x0

    .line 114
    :try_start_0
    invoke-virtual {v9}, Landroid/app/NotificationManager;->getNotificationChannels()Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    if-eqz v3, :cond_7

    .line 119
    .line 120
    new-instance v11, Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    :cond_3
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v13

    .line 133
    if-eqz v13, :cond_5

    .line 134
    .line 135
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v13

    .line 139
    check-cast v13, Landroid/app/NotificationChannel;

    .line 140
    .line 141
    invoke-virtual {v13}, Landroid/app/NotificationChannel;->getId()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v13

    .line 145
    if-eqz v13, :cond_4

    .line 146
    .line 147
    const-string v14, "Hchat_keyword_notification_"

    .line 148
    .line 149
    invoke-static {v13, v14, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 150
    .line 151
    .line 152
    move-result v14

    .line 153
    if-eqz v14, :cond_4

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_4
    const/4 v13, 0x0

    .line 157
    :goto_3
    if-eqz v13, :cond_3

    .line 158
    .line 159
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_5
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    const/16 v13, 0x3c

    .line 168
    .line 169
    if-gt v3, v13, :cond_6

    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_6
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    sub-int/2addr v3, v13

    .line 177
    invoke-static {v3, v11}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    .line 187
    .line 188
    move-result v11

    .line 189
    if-eqz v11, :cond_7

    .line 190
    .line 191
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v11

    .line 195
    check-cast v11, Ljava/lang/String;

    .line 196
    .line 197
    invoke-virtual {v9, v11}, Landroid/app/NotificationManager;->deleteNotificationChannel(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 198
    .line 199
    .line 200
    goto :goto_4

    .line 201
    :catchall_0
    :cond_7
    :goto_5
    new-instance v3, Landroid/app/NotificationChannel;

    .line 202
    .line 203
    const-string v11, "Hchat \u5173\u952e\u8bcd\u901a\u77e5"

    .line 204
    .line 205
    const/4 v13, 0x4

    .line 206
    invoke-direct {v3, v0, v11, v13}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v3, v12}, Landroid/app/NotificationChannel;->enableVibration(Z)V

    .line 210
    .line 211
    .line 212
    const-wide/16 v18, 0x0

    .line 213
    .line 214
    const/4 v11, 0x2

    .line 215
    if-eqz v12, :cond_8

    .line 216
    .line 217
    new-array v12, v13, [J

    .line 218
    .line 219
    aput-wide v18, v12, v1

    .line 220
    .line 221
    const-wide/16 v13, 0xfa

    .line 222
    .line 223
    aput-wide v13, v12, v16

    .line 224
    .line 225
    aput-wide v13, v12, v11

    .line 226
    .line 227
    const/16 v18, 0x3

    .line 228
    .line 229
    aput-wide v13, v12, v18

    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_8
    move/from16 v12, v16

    .line 233
    .line 234
    new-array v13, v12, [J

    .line 235
    .line 236
    aput-wide v18, v13, v1

    .line 237
    .line 238
    move-object v12, v13

    .line 239
    :goto_6
    invoke-virtual {v3, v12}, Landroid/app/NotificationChannel;->setVibrationPattern([J)V

    .line 240
    .line 241
    .line 242
    const/4 v12, 0x0

    .line 243
    invoke-virtual {v3, v12, v12}, Landroid/app/NotificationChannel;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v9, v3}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 247
    .line 248
    .line 249
    new-instance v3, Landroid/app/Notification$Builder;

    .line 250
    .line 251
    invoke-direct {v3, v2, v0}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    sget-object v0, Lx9/d;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 255
    .line 256
    new-instance v12, Lba/c;

    .line 257
    .line 258
    const/4 v13, 0x5

    .line 259
    invoke-direct {v12, v13}, Lba/c;-><init>(I)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, v12}, Ljava/util/concurrent/atomic/AtomicInteger;->updateAndGet(Ljava/util/function/IntUnaryOperator;)I

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 267
    .line 268
    .line 269
    move-result v12

    .line 270
    int-to-long v12, v12

    .line 271
    const-wide/16 v18, 0xff

    .line 272
    .line 273
    and-long v12, v12, v18

    .line 274
    .line 275
    const/16 v14, 0x14

    .line 276
    .line 277
    shl-long/2addr v12, v14

    .line 278
    const-wide/32 v18, 0x51000000

    .line 279
    .line 280
    .line 281
    or-long v12, v12, v18

    .line 282
    .line 283
    move v14, v11

    .line 284
    move-wide/from16 v18, v12

    .line 285
    .line 286
    int-to-long v11, v0

    .line 287
    const-wide/32 v20, 0xfffff

    .line 288
    .line 289
    .line 290
    and-long v11, v11, v20

    .line 291
    .line 292
    or-long v11, v18, v11

    .line 293
    .line 294
    const-wide/32 v18, 0x7fffffff

    .line 295
    .line 296
    .line 297
    and-long v11, v11, v18

    .line 298
    .line 299
    long-to-int v11, v11

    .line 300
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 305
    .line 306
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 307
    .line 308
    .line 309
    move-result-object v12

    .line 310
    if-eqz v0, :cond_9

    .line 311
    .line 312
    goto :goto_7

    .line 313
    :cond_9
    const/4 v12, 0x0

    .line 314
    :goto_7
    if-eqz v12, :cond_a

    .line 315
    .line 316
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 317
    .line 318
    .line 319
    move-result v0

    .line 320
    goto :goto_8

    .line 321
    :cond_a
    const v0, 0x1080077

    .line 322
    .line 323
    .line 324
    :goto_8
    invoke-virtual {v3, v0}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    invoke-static {v5, v7}, Lx9/d;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 329
    .line 330
    .line 331
    move-result-object v12

    .line 332
    invoke-virtual {v0, v12}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    invoke-static {v6, v7}, Lx9/d;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 337
    .line 338
    .line 339
    move-result-object v12

    .line 340
    invoke-virtual {v0, v12}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    invoke-virtual {v0, v6}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 349
    .line 350
    .line 351
    move-result-wide v12

    .line 352
    invoke-virtual {v0, v12, v13}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    const/4 v12, 0x1

    .line 357
    invoke-virtual {v0, v12}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-virtual {v0, v12}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    const-string v13, "msg"

    .line 370
    .line 371
    invoke-virtual {v0, v13}, Landroid/app/Notification$Builder;->setCategory(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    invoke-virtual {v0, v12}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    if-eqz v8, :cond_b

    .line 380
    .line 381
    const-string v8, "\u7fa4\u6d88\u606f"

    .line 382
    .line 383
    goto :goto_9

    .line 384
    :cond_b
    const-string v8, "\u597d\u53cb\u6d88\u606f"

    .line 385
    .line 386
    :goto_9
    invoke-virtual {v0, v8}, Landroid/app/Notification$Builder;->setSubText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    new-instance v8, Landroid/app/Notification$BigTextStyle;

    .line 391
    .line 392
    invoke-direct {v8}, Landroid/app/Notification$BigTextStyle;-><init>()V

    .line 393
    .line 394
    .line 395
    invoke-static {v6, v7}, Lx9/d;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 396
    .line 397
    .line 398
    move-result-object v6

    .line 399
    invoke-virtual {v8, v6}, Landroid/app/Notification$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    .line 400
    .line 401
    .line 402
    move-result-object v6

    .line 403
    invoke-static {v5, v7}, Lx9/d;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 404
    .line 405
    .line 406
    move-result-object v5

    .line 407
    invoke-virtual {v6, v5}, Landroid/app/Notification$BigTextStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    .line 408
    .line 409
    .line 410
    move-result-object v5

    .line 411
    invoke-virtual {v0, v5}, Landroid/app/Notification$Builder;->setStyle(Landroid/app/Notification$Style;)Landroid/app/Notification$Builder;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    new-instance v5, Ljava/util/ArrayList;

    .line 416
    .line 417
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 418
    .line 419
    .line 420
    new-instance v6, Landroid/content/Intent;

    .line 421
    .line 422
    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 423
    .line 424
    .line 425
    new-instance v7, Landroid/content/ComponentName;

    .line 426
    .line 427
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v8

    .line 431
    const-string v12, "com.tencent.mm.ui.LauncherUI"

    .line 432
    .line 433
    invoke-direct {v7, v8, v12}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v6, v7}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 437
    .line 438
    .line 439
    const/high16 v7, 0x34000000

    .line 440
    .line 441
    invoke-virtual {v6, v7}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 448
    .line 449
    .line 450
    move-result v6

    .line 451
    if-nez v6, :cond_c

    .line 452
    .line 453
    new-instance v6, Landroid/content/Intent;

    .line 454
    .line 455
    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 456
    .line 457
    .line 458
    new-instance v7, Landroid/content/ComponentName;

    .line 459
    .line 460
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v8

    .line 464
    const-string v12, "com.tencent.mm.ui.chatting.ChattingUI"

    .line 465
    .line 466
    invoke-direct {v7, v8, v12}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v6, v7}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 470
    .line 471
    .line 472
    const-string v7, "Chat_User"

    .line 473
    .line 474
    invoke-virtual {v6, v7, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 475
    .line 476
    .line 477
    const-string v7, "Chat_Mode"

    .line 478
    .line 479
    const/4 v12, 0x1

    .line 480
    invoke-virtual {v6, v7, v12}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 481
    .line 482
    .line 483
    const-string v7, "finish_direct"

    .line 484
    .line 485
    invoke-virtual {v6, v7, v12}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 486
    .line 487
    .line 488
    const/high16 v7, 0x24000000

    .line 489
    .line 490
    invoke-virtual {v6, v7}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    :cond_c
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 497
    .line 498
    .line 499
    move-result v6

    .line 500
    if-eqz v6, :cond_d

    .line 501
    .line 502
    const/4 v12, 0x0

    .line 503
    goto :goto_a

    .line 504
    :cond_d
    new-array v6, v1, [Landroid/content/Intent;

    .line 505
    .line 506
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v5

    .line 510
    check-cast v5, [Landroid/content/Intent;

    .line 511
    .line 512
    const/high16 v6, 0xc000000

    .line 513
    .line 514
    invoke-static {v2, v11, v5, v6}, Landroid/app/PendingIntent;->getActivities(Landroid/content/Context;I[Landroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 515
    .line 516
    .line 517
    move-result-object v12

    .line 518
    :goto_a
    invoke-virtual {v0, v12}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    new-instance v5, Landroid/os/Bundle;

    .line 523
    .line 524
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 525
    .line 526
    .line 527
    const-string v6, "hchat_keyword_notification"

    .line 528
    .line 529
    const/4 v12, 0x1

    .line 530
    invoke-virtual {v5, v6, v12}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 531
    .line 532
    .line 533
    const-string v6, "talker"

    .line 534
    .line 535
    invoke-virtual {v5, v6, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    invoke-virtual {v0, v5}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 539
    .line 540
    .line 541
    sget-object v5, Lx9/d;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 542
    .line 543
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 544
    .line 545
    .line 546
    move-result v0

    .line 547
    if-eqz v0, :cond_e

    .line 548
    .line 549
    const/4 v8, 0x0

    .line 550
    const/4 v12, 0x0

    .line 551
    goto/16 :goto_14

    .line 552
    .line 553
    :cond_e
    const-string v0, "Hchat_custom_friend_avatar_config"

    .line 554
    .line 555
    invoke-static {v2, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 556
    .line 557
    .line 558
    move-result-object v6

    .line 559
    const-string v7, "enable"

    .line 560
    .line 561
    invoke-interface {v6, v7, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 562
    .line 563
    .line 564
    move-result v6

    .line 565
    if-eqz v6, :cond_f

    .line 566
    .line 567
    invoke-static {v2, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    const-string v6, "scope_notifications"

    .line 572
    .line 573
    const/4 v12, 0x1

    .line 574
    invoke-interface {v0, v6, v12}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 575
    .line 576
    .line 577
    move-result v0

    .line 578
    if-eqz v0, :cond_f

    .line 579
    .line 580
    invoke-static {v2, v4}, Ld9/o;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 581
    .line 582
    .line 583
    move-result-object v12

    .line 584
    if-eqz v12, :cond_f

    .line 585
    .line 586
    :goto_b
    const/4 v8, 0x0

    .line 587
    goto/16 :goto_14

    .line 588
    .line 589
    :cond_f
    invoke-virtual {v5, v4}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    if-eqz v0, :cond_10

    .line 594
    .line 595
    invoke-virtual {v5, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    move-object v12, v0

    .line 600
    check-cast v12, Landroid/graphics/Bitmap;

    .line 601
    .line 602
    goto :goto_b

    .line 603
    :cond_10
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    if-eqz v0, :cond_11

    .line 608
    .line 609
    const/4 v12, 0x1

    .line 610
    invoke-virtual {v0, v4, v12}, Lg8/i;->m(Ljava/lang/String;Z)Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v6

    .line 614
    move-object v12, v6

    .line 615
    goto :goto_c

    .line 616
    :cond_11
    const/4 v12, 0x0

    .line 617
    :goto_c
    if-nez v12, :cond_12

    .line 618
    .line 619
    move-object v12, v15

    .line 620
    :cond_12
    if-eqz v0, :cond_13

    .line 621
    .line 622
    invoke-virtual {v0, v4, v1}, Lg8/i;->m(Ljava/lang/String;Z)Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    goto :goto_d

    .line 627
    :cond_13
    const/4 v0, 0x0

    .line 628
    :goto_d
    if-nez v0, :cond_14

    .line 629
    .line 630
    goto :goto_e

    .line 631
    :cond_14
    move-object v15, v0

    .line 632
    :goto_e
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 633
    .line 634
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 635
    .line 636
    .line 637
    invoke-static {v12}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 638
    .line 639
    .line 640
    move-result v6

    .line 641
    if-nez v6, :cond_15

    .line 642
    .line 643
    invoke-interface {v0, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 644
    .line 645
    .line 646
    :cond_15
    invoke-static {v15}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 647
    .line 648
    .line 649
    move-result v6

    .line 650
    if-nez v6, :cond_16

    .line 651
    .line 652
    invoke-interface {v0, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 653
    .line 654
    .line 655
    :cond_16
    invoke-static {v4, v1}, Lx9/d;->i(Ljava/lang/String;Z)Ljava/lang/String;

    .line 656
    .line 657
    .line 658
    move-result-object v6

    .line 659
    if-eqz v6, :cond_17

    .line 660
    .line 661
    invoke-interface {v0, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 662
    .line 663
    .line 664
    :cond_17
    const/4 v12, 0x1

    .line 665
    invoke-static {v4, v12}, Lx9/d;->i(Ljava/lang/String;Z)Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v6

    .line 669
    if-eqz v6, :cond_18

    .line 670
    .line 671
    invoke-interface {v0, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 672
    .line 673
    .line 674
    :cond_18
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 679
    .line 680
    .line 681
    move-result-object v6

    .line 682
    :cond_19
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 683
    .line 684
    .line 685
    move-result v0

    .line 686
    if-eqz v0, :cond_1f

    .line 687
    .line 688
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    check-cast v0, Ljava/lang/String;

    .line 693
    .line 694
    :try_start_1
    const-string v7, "http://"

    .line 695
    .line 696
    invoke-static {v0, v7, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 697
    .line 698
    .line 699
    move-result v7

    .line 700
    if-nez v7, :cond_1d

    .line 701
    .line 702
    const-string v7, "https://"

    .line 703
    .line 704
    invoke-static {v0, v7, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 705
    .line 706
    .line 707
    move-result v7

    .line 708
    if-eqz v7, :cond_1a

    .line 709
    .line 710
    goto :goto_10

    .line 711
    :cond_1a
    new-instance v12, Ljava/io/File;

    .line 712
    .line 713
    invoke-direct {v12, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 714
    .line 715
    .line 716
    invoke-virtual {v12}, Ljava/io/File;->exists()Z

    .line 717
    .line 718
    .line 719
    move-result v0

    .line 720
    if-eqz v0, :cond_1b

    .line 721
    .line 722
    goto :goto_f

    .line 723
    :cond_1b
    const/4 v12, 0x0

    .line 724
    :goto_f
    if-eqz v12, :cond_1c

    .line 725
    .line 726
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 731
    .line 732
    .line 733
    move-result-object v12

    .line 734
    const/4 v8, 0x0

    .line 735
    goto :goto_12

    .line 736
    :catchall_1
    move-exception v0

    .line 737
    const/4 v8, 0x0

    .line 738
    goto :goto_11

    .line 739
    :cond_1c
    const/4 v8, 0x0

    .line 740
    const/4 v12, 0x0

    .line 741
    goto :goto_12

    .line 742
    :cond_1d
    :goto_10
    new-instance v7, Ljava/net/URL;

    .line 743
    .line 744
    invoke-direct {v7, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 745
    .line 746
    .line 747
    invoke-virtual {v7}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    const/16 v7, 0xbb8

    .line 752
    .line 753
    invoke-virtual {v0, v7}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 754
    .line 755
    .line 756
    invoke-virtual {v0, v7}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 757
    .line 758
    .line 759
    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 760
    .line 761
    .line 762
    move-result-object v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 763
    :try_start_2
    invoke-static {v7}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    .line 764
    .line 765
    .line 766
    move-result-object v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 767
    const/4 v8, 0x0

    .line 768
    :try_start_3
    invoke-static {v7, v8}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 769
    .line 770
    .line 771
    goto :goto_12

    .line 772
    :catchall_2
    move-exception v0

    .line 773
    goto :goto_11

    .line 774
    :catchall_3
    move-exception v0

    .line 775
    const/4 v8, 0x0

    .line 776
    move-object v12, v0

    .line 777
    :try_start_4
    throw v12
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 778
    :catchall_4
    move-exception v0

    .line 779
    :try_start_5
    invoke-static {v7, v12}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 780
    .line 781
    .line 782
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 783
    :goto_11
    new-instance v7, Lsf/f;

    .line 784
    .line 785
    invoke-direct {v7, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 786
    .line 787
    .line 788
    move-object v12, v7

    .line 789
    :goto_12
    instance-of v0, v12, Lsf/f;

    .line 790
    .line 791
    if-eqz v0, :cond_1e

    .line 792
    .line 793
    move-object v12, v8

    .line 794
    :cond_1e
    check-cast v12, Landroid/graphics/Bitmap;

    .line 795
    .line 796
    if-eqz v12, :cond_19

    .line 797
    .line 798
    goto :goto_13

    .line 799
    :cond_1f
    const/4 v8, 0x0

    .line 800
    move-object v12, v8

    .line 801
    :goto_13
    invoke-virtual {v5, v4, v12}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    :goto_14
    if-eqz v12, :cond_20

    .line 805
    .line 806
    invoke-virtual {v3, v12}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;

    .line 807
    .line 808
    .line 809
    :cond_20
    invoke-virtual {v3}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 810
    .line 811
    .line 812
    move-result-object v0

    .line 813
    invoke-virtual {v9, v11, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 814
    .line 815
    .line 816
    if-eqz v10, :cond_25

    .line 817
    .line 818
    :try_start_6
    invoke-static/range {v17 .. v17}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 819
    .line 820
    .line 821
    move-result v0

    .line 822
    if-eqz v0, :cond_21

    .line 823
    .line 824
    invoke-static {v14}, Landroid/media/RingtoneManager;->getDefaultUri(I)Landroid/net/Uri;

    .line 825
    .line 826
    .line 827
    move-result-object v0

    .line 828
    goto :goto_16

    .line 829
    :catchall_5
    move-exception v0

    .line 830
    goto :goto_15

    .line 831
    :cond_21
    invoke-static/range {v17 .. v17}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 832
    .line 833
    .line 834
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 835
    goto :goto_16

    .line 836
    :goto_15
    new-instance v1, Lsf/f;

    .line 837
    .line 838
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 839
    .line 840
    .line 841
    move-object v0, v1

    .line 842
    :goto_16
    nop

    .line 843
    instance-of v1, v0, Lsf/f;

    .line 844
    .line 845
    if-eqz v1, :cond_22

    .line 846
    .line 847
    move-object v11, v8

    .line 848
    goto :goto_17

    .line 849
    :cond_22
    move-object v11, v0

    .line 850
    :goto_17
    check-cast v11, Landroid/net/Uri;

    .line 851
    .line 852
    if-nez v11, :cond_23

    .line 853
    .line 854
    goto :goto_18

    .line 855
    :cond_23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 856
    .line 857
    .line 858
    move-result-wide v0

    .line 859
    sget-wide v3, Lx9/d;->f:J

    .line 860
    .line 861
    sub-long v3, v0, v3

    .line 862
    .line 863
    const-wide/16 v5, 0x4b0

    .line 864
    .line 865
    cmp-long v3, v3, v5

    .line 866
    .line 867
    if-gez v3, :cond_24

    .line 868
    .line 869
    goto :goto_18

    .line 870
    :cond_24
    sput-wide v0, Lx9/d;->f:J

    .line 871
    .line 872
    sget-object v0, Lx9/d;->b:Landroid/os/Handler;

    .line 873
    .line 874
    new-instance v1, Le9/e;

    .line 875
    .line 876
    const/4 v12, 0x1

    .line 877
    invoke-direct {v1, v2, v11, v12}, Le9/e;-><init>(Landroid/content/Context;Landroid/net/Uri;I)V

    .line 878
    .line 879
    .line 880
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 881
    .line 882
    .line 883
    :cond_25
    :goto_18
    return-void
.end method
