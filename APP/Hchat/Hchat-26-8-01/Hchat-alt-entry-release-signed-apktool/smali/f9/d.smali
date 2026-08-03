.class public final Lf9/d;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lf9/d;->a:I

    .line 2
    .line 3
    iput-boolean p1, p0, Lf9/d;->b:Z

    .line 4
    .line 5
    iput-object p2, p0, Lf9/d;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v2, v1, Lf9/d;->a:I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    packed-switch v2, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-boolean v2, v1, Lf9/d;->b:Z

    .line 14
    .line 15
    if-eqz v2, :cond_b

    .line 16
    .line 17
    iget-object v2, v1, Lf9/d;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lqb/k;

    .line 20
    .line 21
    invoke-virtual {v2}, Lqb/k;->p()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    goto/16 :goto_5

    .line 28
    .line 29
    :cond_0
    const-string v3, "voice_forward_chat_forward_enable"

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Lqb/k;->O(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v5, 0x1

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    iget-object v3, v2, Lqb/k;->d:Landroid/content/SharedPreferences;

    .line 40
    .line 41
    const-string v6, "message_forward_enable"

    .line 42
    .line 43
    invoke-interface {v3, v6, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-nez v3, :cond_1

    .line 48
    .line 49
    move v3, v5

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move v3, v4

    .line 52
    :goto_0
    const-string v6, "voice_forward_chat_save_enable"

    .line 53
    .line 54
    invoke-virtual {v2, v6}, Lqb/k;->O(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-nez v3, :cond_2

    .line 59
    .line 60
    if-nez v6, :cond_2

    .line 61
    .line 62
    goto/16 :goto_5

    .line 63
    .line 64
    :cond_2
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 65
    .line 66
    if-eqz v0, :cond_b

    .line 67
    .line 68
    array-length v7, v0

    .line 69
    const/4 v8, 0x3

    .line 70
    if-ge v7, v8, :cond_3

    .line 71
    .line 72
    goto/16 :goto_5

    .line 73
    .line 74
    :cond_3
    aget-object v9, v0, v4

    .line 75
    .line 76
    if-eqz v9, :cond_b

    .line 77
    .line 78
    new-instance v7, Ljava/util/WeakHashMap;

    .line 79
    .line 80
    invoke-direct {v7}, Ljava/util/WeakHashMap;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-static {v7}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    check-cast v7, Ljava/util/Set;

    .line 91
    .line 92
    invoke-virtual {v2, v4, v0, v7}, Lqb/k;->C(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    if-eqz v2, :cond_b

    .line 97
    .line 98
    invoke-static {v2}, Lqb/k;->u(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-nez v2, :cond_4

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_4
    invoke-static {v5, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    instance-of v7, v2, Landroid/view/View;

    .line 110
    .line 111
    const/4 v8, 0x0

    .line 112
    if-eqz v7, :cond_5

    .line 113
    .line 114
    check-cast v2, Landroid/view/View;

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_5
    move-object v2, v8

    .line 118
    :goto_1
    if-eqz v2, :cond_6

    .line 119
    .line 120
    invoke-virtual {v2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    if-eqz v2, :cond_6

    .line 125
    .line 126
    const-string v7, "c"

    .line 127
    .line 128
    const-string v10, "d"

    .line 129
    .line 130
    filled-new-array {v7, v10}, [Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    move v10, v4

    .line 135
    :goto_2
    const/4 v11, 0x2

    .line 136
    if-lt v10, v11, :cond_7

    .line 137
    .line 138
    :cond_6
    :goto_3
    move v11, v4

    .line 139
    goto :goto_4

    .line 140
    :cond_7
    aget-object v11, v7, v10

    .line 141
    .line 142
    new-array v12, v4, [Ljava/lang/Object;

    .line 143
    .line 144
    invoke-static {v2, v11, v12}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v11

    .line 148
    instance-of v12, v11, Ljava/lang/Number;

    .line 149
    .line 150
    if-eqz v12, :cond_8

    .line 151
    .line 152
    check-cast v11, Ljava/lang/Number;

    .line 153
    .line 154
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    goto :goto_3

    .line 159
    :cond_8
    add-int/lit8 v10, v10, 0x1

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :goto_4
    invoke-static {v5, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    instance-of v2, v0, Landroid/view/View;

    .line 167
    .line 168
    if-eqz v2, :cond_9

    .line 169
    .line 170
    move-object v8, v0

    .line 171
    check-cast v8, Landroid/view/View;

    .line 172
    .line 173
    :cond_9
    move-object v10, v8

    .line 174
    if-eqz v3, :cond_a

    .line 175
    .line 176
    const-string v13, "\u8f6c\u53d1[H]"

    .line 177
    .line 178
    const-string v14, "icons_filled_share"

    .line 179
    .line 180
    const v12, 0x48435646    # 200025.1f

    .line 181
    .line 182
    .line 183
    invoke-static/range {v9 .. v14}, Lqb/k;->a(Ljava/lang/Object;Landroid/view/View;IILjava/lang/String;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    :cond_a
    if-eqz v6, :cond_b

    .line 187
    .line 188
    const-string v13, "\u4fdd\u5b58[H]"

    .line 189
    .line 190
    const-string v14, "icons_filled_download"

    .line 191
    .line 192
    const v12, 0x48435653    # 200025.3f

    .line 193
    .line 194
    .line 195
    invoke-static/range {v9 .. v14}, Lqb/k;->a(Ljava/lang/Object;Landroid/view/View;IILjava/lang/String;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    :cond_b
    :goto_5
    return-void

    .line 199
    :pswitch_0
    iget-boolean v2, v1, Lf9/d;->b:Z

    .line 200
    .line 201
    if-eqz v2, :cond_2d

    .line 202
    .line 203
    iget-object v2, v1, Lf9/d;->c:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v2, Llb/i;

    .line 206
    .line 207
    iget-object v3, v2, Llb/i;->s:Ljava/util/concurrent/ConcurrentHashMap;

    .line 208
    .line 209
    iget-object v4, v2, Llb/i;->r:Ljava/util/Map;

    .line 210
    .line 211
    invoke-interface {v4}, Ljava/util/Map;->clear()V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 215
    .line 216
    .line 217
    iget-object v5, v2, Llb/i;->a:Lr8/g;

    .line 218
    .line 219
    iget-object v5, v5, Lr8/g;->a:Landroid/content/Context;

    .line 220
    .line 221
    const-string v6, "Hchat_swipe_quote_config"

    .line 222
    .line 223
    invoke-static {v5, v6}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    const-string v6, "repeat_menu_enable"

    .line 228
    .line 229
    const/4 v7, 0x0

    .line 230
    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    if-nez v5, :cond_c

    .line 235
    .line 236
    goto/16 :goto_1a

    .line 237
    .line 238
    :cond_c
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 239
    .line 240
    if-eqz v0, :cond_2d

    .line 241
    .line 242
    invoke-static {v7, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    if-eqz v5, :cond_2d

    .line 247
    .line 248
    const/4 v6, 0x1

    .line 249
    invoke-static {v6, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    instance-of v8, v0, Landroid/view/View;

    .line 254
    .line 255
    if-eqz v8, :cond_d

    .line 256
    .line 257
    check-cast v0, Landroid/view/View;

    .line 258
    .line 259
    move-object v8, v0

    .line 260
    goto :goto_6

    .line 261
    :cond_d
    const/4 v8, 0x0

    .line 262
    :goto_6
    if-eqz v8, :cond_2d

    .line 263
    .line 264
    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    if-eqz v0, :cond_2d

    .line 269
    .line 270
    invoke-static {v0}, Llb/i;->K(Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    if-eqz v0, :cond_2d

    .line 275
    .line 276
    invoke-static {v0}, Llb/i;->x(Ljava/lang/Object;)J

    .line 277
    .line 278
    .line 279
    move-result-wide v10

    .line 280
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->chatPage()Lq8/m;

    .line 281
    .line 282
    .line 283
    move-result-object v12

    .line 284
    if-eqz v12, :cond_e

    .line 285
    .line 286
    invoke-virtual {v12}, Lq8/m;->a()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v12

    .line 290
    goto :goto_7

    .line 291
    :cond_e
    const/4 v12, 0x0

    .line 292
    :goto_7
    if-nez v12, :cond_f

    .line 293
    .line 294
    const-string v12, ""

    .line 295
    .line 296
    :cond_f
    const-wide/16 v13, 0x0

    .line 297
    .line 298
    cmp-long v13, v10, v13

    .line 299
    .line 300
    if-lez v13, :cond_2d

    .line 301
    .line 302
    invoke-static {v12}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 303
    .line 304
    .line 305
    move-result v13

    .line 306
    if-eqz v13, :cond_10

    .line 307
    .line 308
    goto/16 :goto_1a

    .line 309
    .line 310
    :cond_10
    new-instance v13, Llb/c;

    .line 311
    .line 312
    invoke-direct {v13, v10, v11, v12, v0}, Llb/c;-><init>(JLjava/lang/String;Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    :try_start_0
    invoke-virtual {v2, v10, v11, v12, v0}, Llb/i;->w(JLjava/lang/String;Ljava/lang/Object;)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    if-eqz v0, :cond_11

    .line 320
    .line 321
    goto :goto_9

    .line 322
    :cond_11
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messageStore()Lk8/s;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    if-eqz v0, :cond_12

    .line 327
    .line 328
    invoke-virtual {v0, v10, v11}, Lk8/s;->c(J)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 329
    .line 330
    .line 331
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 332
    goto :goto_9

    .line 333
    :catchall_0
    move-exception v0

    .line 334
    goto :goto_8

    .line 335
    :cond_12
    const/4 v0, 0x0

    .line 336
    goto :goto_9

    .line 337
    :goto_8
    new-instance v2, Lsf/f;

    .line 338
    .line 339
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 340
    .line 341
    .line 342
    move-object v0, v2

    .line 343
    :goto_9
    nop

    .line 344
    instance-of v2, v0, Lsf/f;

    .line 345
    .line 346
    if-eqz v2, :cond_13

    .line 347
    .line 348
    const/4 v0, 0x0

    .line 349
    :cond_13
    check-cast v0, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 350
    .line 351
    if-eqz v0, :cond_2d

    .line 352
    .line 353
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isRedPacket()Z

    .line 354
    .line 355
    .line 356
    move-result v2

    .line 357
    if-nez v2, :cond_2d

    .line 358
    .line 359
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isTransfer()Z

    .line 360
    .line 361
    .line 362
    move-result v2

    .line 363
    if-eqz v2, :cond_14

    .line 364
    .line 365
    goto/16 :goto_1a

    .line 366
    .line 367
    :cond_14
    iget v2, v0, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 368
    .line 369
    if-gtz v2, :cond_15

    .line 370
    .line 371
    goto :goto_a

    .line 372
    :cond_15
    and-int/lit16 v10, v2, 0xff

    .line 373
    .line 374
    const v11, 0xffff

    .line 375
    .line 376
    .line 377
    and-int/2addr v11, v2

    .line 378
    ushr-int/lit8 v12, v2, 0x10

    .line 379
    .line 380
    if-nez v12, :cond_16

    .line 381
    .line 382
    goto :goto_a

    .line 383
    :cond_16
    const/16 v12, 0x2710

    .line 384
    .line 385
    if-eq v11, v12, :cond_17

    .line 386
    .line 387
    const/16 v12, 0x2712

    .line 388
    .line 389
    if-eq v11, v12, :cond_17

    .line 390
    .line 391
    if-eqz v10, :cond_18

    .line 392
    .line 393
    if-ne v11, v10, :cond_18

    .line 394
    .line 395
    move v2, v10

    .line 396
    goto :goto_a

    .line 397
    :cond_17
    move v2, v11

    .line 398
    :cond_18
    :goto_a
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isQuote()Z

    .line 399
    .line 400
    .line 401
    move-result v10

    .line 402
    if-nez v10, :cond_19

    .line 403
    .line 404
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVoice()Z

    .line 405
    .line 406
    .line 407
    move-result v10

    .line 408
    if-nez v10, :cond_19

    .line 409
    .line 410
    invoke-static {v0}, Lfb/v0;->y(Lh/Hchat/hooks/api/model/WeChatMessage;)Z

    .line 411
    .line 412
    .line 413
    move-result v10

    .line 414
    if-nez v10, :cond_19

    .line 415
    .line 416
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isText()Z

    .line 417
    .line 418
    .line 419
    move-result v10

    .line 420
    if-nez v10, :cond_19

    .line 421
    .line 422
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isShareCard()Z

    .line 423
    .line 424
    .line 425
    move-result v10

    .line 426
    if-nez v10, :cond_19

    .line 427
    .line 428
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isImage()Z

    .line 429
    .line 430
    .line 431
    move-result v10

    .line 432
    if-nez v10, :cond_19

    .line 433
    .line 434
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isEmoji()Z

    .line 435
    .line 436
    .line 437
    move-result v10

    .line 438
    if-nez v10, :cond_19

    .line 439
    .line 440
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isLocation()Z

    .line 441
    .line 442
    .line 443
    move-result v10

    .line 444
    if-nez v10, :cond_19

    .line 445
    .line 446
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVideo()Z

    .line 447
    .line 448
    .line 449
    move-result v0

    .line 450
    if-nez v0, :cond_19

    .line 451
    .line 452
    const/16 v0, 0x3e

    .line 453
    .line 454
    if-ne v2, v0, :cond_2d

    .line 455
    .line 456
    :cond_19
    const-string v0, "size"

    .line 457
    .line 458
    new-array v2, v7, [Ljava/lang/Object;

    .line 459
    .line 460
    invoke-static {v5, v0, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    instance-of v2, v0, Ljava/lang/Number;

    .line 465
    .line 466
    if-eqz v2, :cond_1a

    .line 467
    .line 468
    check-cast v0, Ljava/lang/Number;

    .line 469
    .line 470
    goto :goto_b

    .line 471
    :cond_1a
    const/4 v0, 0x0

    .line 472
    :goto_b
    if-eqz v0, :cond_1b

    .line 473
    .line 474
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 475
    .line 476
    .line 477
    move-result v0

    .line 478
    goto :goto_c

    .line 479
    :cond_1b
    move v0, v7

    .line 480
    :goto_c
    move v2, v7

    .line 481
    :goto_d
    if-lt v2, v0, :cond_1c

    .line 482
    .line 483
    move v10, v7

    .line 484
    goto :goto_f

    .line 485
    :cond_1c
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 486
    .line 487
    .line 488
    move-result-object v10

    .line 489
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v10

    .line 493
    const-string v11, "getItem"

    .line 494
    .line 495
    invoke-static {v5, v11, v10}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v10

    .line 499
    instance-of v11, v10, Landroid/view/MenuItem;

    .line 500
    .line 501
    if-eqz v11, :cond_1d

    .line 502
    .line 503
    check-cast v10, Landroid/view/MenuItem;

    .line 504
    .line 505
    goto :goto_e

    .line 506
    :cond_1d
    const/4 v10, 0x0

    .line 507
    :goto_e
    if-eqz v10, :cond_2c

    .line 508
    .line 509
    invoke-interface {v10}, Landroid/view/MenuItem;->getGroupId()I

    .line 510
    .line 511
    .line 512
    move-result v0

    .line 513
    move v10, v0

    .line 514
    :goto_f
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 515
    .line 516
    .line 517
    move-result-object v11

    .line 518
    new-instance v12, Llb/d;

    .line 519
    .line 520
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 525
    .line 526
    .line 527
    invoke-direct {v12, v0}, Llb/d;-><init>(Landroid/content/Context;)V

    .line 528
    .line 529
    .line 530
    const v0, 0x48435250    # 200009.25f

    .line 531
    .line 532
    .line 533
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 534
    .line 535
    .line 536
    move-result-object v14

    .line 537
    invoke-static {v5}, Llb/i;->f(Ljava/lang/Object;)Landroid/view/MenuItem;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    if-eqz v0, :cond_1e

    .line 542
    .line 543
    invoke-static {v5, v0, v12}, Llb/i;->a(Ljava/lang/Object;Landroid/view/MenuItem;Llb/d;)V

    .line 544
    .line 545
    .line 546
    :goto_10
    move-object v9, v0

    .line 547
    goto/16 :goto_19

    .line 548
    .line 549
    :cond_1e
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 554
    .line 555
    .line 556
    move-result-object v15

    .line 557
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    const-string v2, "raw"

    .line 566
    .line 567
    const-string v8, "drawable"

    .line 568
    .line 569
    filled-new-array {v2, v8}, [Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v16

    .line 573
    move v2, v7

    .line 574
    :goto_11
    const/4 v8, 0x2

    .line 575
    move/from16 p1, v6

    .line 576
    .line 577
    if-lt v2, v8, :cond_1f

    .line 578
    .line 579
    move v6, v7

    .line 580
    move/from16 v17, v6

    .line 581
    .line 582
    goto :goto_12

    .line 583
    :cond_1f
    aget-object v6, v16, v2

    .line 584
    .line 585
    move/from16 v17, v7

    .line 586
    .line 587
    const-string v7, "icons_filled_edit_photo_pencil"

    .line 588
    .line 589
    invoke-virtual {v15, v7, v6, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 590
    .line 591
    .line 592
    move-result v6

    .line 593
    if-eqz v6, :cond_2b

    .line 594
    .line 595
    :goto_12
    const-string v0, "\u590d\u8bfb[H]"

    .line 596
    .line 597
    if-eqz v6, :cond_24

    .line 598
    .line 599
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    .line 601
    .line 602
    move-result-object v2

    .line 603
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 604
    .line 605
    .line 606
    move-result-object v2

    .line 607
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 608
    .line 609
    .line 610
    move-result-object v2

    .line 611
    :goto_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 612
    .line 613
    .line 614
    move-result v7

    .line 615
    if-eqz v7, :cond_22

    .line 616
    .line 617
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v7

    .line 621
    move-object v15, v7

    .line 622
    check-cast v15, Ljava/lang/reflect/Method;

    .line 623
    .line 624
    move/from16 v18, v8

    .line 625
    .line 626
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 627
    .line 628
    .line 629
    move-result-object v8

    .line 630
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v15

    .line 634
    const-string v9, "c"

    .line 635
    .line 636
    invoke-static {v15, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 637
    .line 638
    .line 639
    move-result v9

    .line 640
    if-eqz v9, :cond_20

    .line 641
    .line 642
    array-length v9, v8

    .line 643
    const/4 v15, 0x5

    .line 644
    if-ne v9, v15, :cond_20

    .line 645
    .line 646
    aget-object v9, v8, v17

    .line 647
    .line 648
    sget-object v15, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 649
    .line 650
    invoke-static {v9, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 651
    .line 652
    .line 653
    move-result v9

    .line 654
    if-eqz v9, :cond_20

    .line 655
    .line 656
    aget-object v9, v8, p1

    .line 657
    .line 658
    invoke-static {v9, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 659
    .line 660
    .line 661
    move-result v9

    .line 662
    if-eqz v9, :cond_20

    .line 663
    .line 664
    aget-object v9, v8, v18

    .line 665
    .line 666
    invoke-static {v9, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 667
    .line 668
    .line 669
    move-result v9

    .line 670
    if-eqz v9, :cond_20

    .line 671
    .line 672
    const/4 v9, 0x3

    .line 673
    aget-object v9, v8, v9

    .line 674
    .line 675
    move-object/from16 v16, v2

    .line 676
    .line 677
    const-class v2, Ljava/lang/String;

    .line 678
    .line 679
    invoke-virtual {v9, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 680
    .line 681
    .line 682
    move-result v2

    .line 683
    if-eqz v2, :cond_21

    .line 684
    .line 685
    const/4 v2, 0x4

    .line 686
    aget-object v2, v8, v2

    .line 687
    .line 688
    invoke-static {v2, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 689
    .line 690
    .line 691
    move-result v2

    .line 692
    if-eqz v2, :cond_21

    .line 693
    .line 694
    goto :goto_14

    .line 695
    :cond_20
    move-object/from16 v16, v2

    .line 696
    .line 697
    :cond_21
    move-object/from16 v2, v16

    .line 698
    .line 699
    move/from16 v8, v18

    .line 700
    .line 701
    goto :goto_13

    .line 702
    :cond_22
    const/4 v7, 0x0

    .line 703
    :goto_14
    check-cast v7, Ljava/lang/reflect/Method;

    .line 704
    .line 705
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 706
    .line 707
    .line 708
    move-result-object v2

    .line 709
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 710
    .line 711
    .line 712
    move-result-object v6

    .line 713
    filled-new-array {v2, v14, v11, v0, v6}, [Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v2

    .line 717
    invoke-static {v7, v5, v2}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 718
    .line 719
    .line 720
    move-result v2

    .line 721
    if-eqz v2, :cond_24

    .line 722
    .line 723
    invoke-static {v5}, Llb/i;->f(Ljava/lang/Object;)Landroid/view/MenuItem;

    .line 724
    .line 725
    .line 726
    move-result-object v0

    .line 727
    if-eqz v0, :cond_23

    .line 728
    .line 729
    invoke-static {v5, v0, v12}, Llb/i;->a(Ljava/lang/Object;Landroid/view/MenuItem;Llb/d;)V

    .line 730
    .line 731
    .line 732
    goto/16 :goto_10

    .line 733
    .line 734
    :cond_23
    const/4 v9, 0x0

    .line 735
    goto :goto_19

    .line 736
    :cond_24
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 737
    .line 738
    .line 739
    move-result-object v2

    .line 740
    filled-new-array {v2, v14, v11, v0}, [Ljava/lang/Object;

    .line 741
    .line 742
    .line 743
    move-result-object v2

    .line 744
    const-string v6, "add"

    .line 745
    .line 746
    invoke-static {v5, v6, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    move-result-object v2

    .line 750
    if-eqz v2, :cond_25

    .line 751
    .line 752
    goto :goto_15

    .line 753
    :cond_25
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 754
    .line 755
    .line 756
    move-result-object v2

    .line 757
    filled-new-array {v2, v14, v11, v0}, [Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v2

    .line 761
    invoke-static {v5, v6, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v2

    .line 765
    :goto_15
    instance-of v6, v2, Landroid/view/MenuItem;

    .line 766
    .line 767
    if-eqz v6, :cond_26

    .line 768
    .line 769
    move-object v9, v2

    .line 770
    check-cast v9, Landroid/view/MenuItem;

    .line 771
    .line 772
    invoke-static {v5, v9, v12}, Llb/i;->a(Ljava/lang/Object;Landroid/view/MenuItem;Llb/d;)V

    .line 773
    .line 774
    .line 775
    goto :goto_19

    .line 776
    :cond_26
    if-eqz v2, :cond_27

    .line 777
    .line 778
    invoke-static {v5}, Llb/i;->f(Ljava/lang/Object;)Landroid/view/MenuItem;

    .line 779
    .line 780
    .line 781
    move-result-object v0

    .line 782
    if-eqz v0, :cond_23

    .line 783
    .line 784
    invoke-static {v5, v0, v12}, Llb/i;->a(Ljava/lang/Object;Landroid/view/MenuItem;Llb/d;)V

    .line 785
    .line 786
    .line 787
    goto/16 :goto_10

    .line 788
    .line 789
    :cond_27
    filled-new-array {v14, v0}, [Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v2

    .line 793
    const-string v6, "f"

    .line 794
    .line 795
    invoke-static {v5, v6, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    move-result-object v2

    .line 799
    if-eqz v2, :cond_28

    .line 800
    .line 801
    goto :goto_16

    .line 802
    :cond_28
    filled-new-array {v14, v0}, [Ljava/lang/Object;

    .line 803
    .line 804
    .line 805
    move-result-object v0

    .line 806
    invoke-static {v5, v6, v0}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 807
    .line 808
    .line 809
    move-result-object v2

    .line 810
    :goto_16
    instance-of v0, v2, Landroid/view/MenuItem;

    .line 811
    .line 812
    if-eqz v0, :cond_29

    .line 813
    .line 814
    check-cast v2, Landroid/view/MenuItem;

    .line 815
    .line 816
    goto :goto_17

    .line 817
    :cond_29
    const/4 v2, 0x0

    .line 818
    :goto_17
    if-eqz v2, :cond_2a

    .line 819
    .line 820
    goto :goto_18

    .line 821
    :cond_2a
    invoke-static {v5}, Llb/i;->f(Ljava/lang/Object;)Landroid/view/MenuItem;

    .line 822
    .line 823
    .line 824
    move-result-object v2

    .line 825
    :goto_18
    if-eqz v2, :cond_23

    .line 826
    .line 827
    invoke-static {v5, v2, v12}, Llb/i;->a(Ljava/lang/Object;Landroid/view/MenuItem;Llb/d;)V

    .line 828
    .line 829
    .line 830
    move-object v9, v2

    .line 831
    :goto_19
    if-eqz v9, :cond_2d

    .line 832
    .line 833
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 834
    .line 835
    .line 836
    check-cast v4, Ljava/util/Map;

    .line 837
    .line 838
    invoke-interface {v4, v9, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    invoke-interface {v9}, Landroid/view/MenuItem;->getGroupId()I

    .line 842
    .line 843
    .line 844
    move-result v0

    .line 845
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    invoke-virtual {v3, v0, v13}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    goto :goto_1a

    .line 853
    :cond_2b
    add-int/lit8 v2, v2, 0x1

    .line 854
    .line 855
    move/from16 v6, p1

    .line 856
    .line 857
    move/from16 v7, v17

    .line 858
    .line 859
    goto/16 :goto_11

    .line 860
    .line 861
    :cond_2c
    move/from16 p1, v6

    .line 862
    .line 863
    move/from16 v17, v7

    .line 864
    .line 865
    add-int/lit8 v2, v2, 0x1

    .line 866
    .line 867
    goto/16 :goto_d

    .line 868
    .line 869
    :cond_2d
    :goto_1a
    return-void

    .line 870
    :pswitch_1
    iget-boolean v2, v1, Lf9/d;->b:Z

    .line 871
    .line 872
    if-eqz v2, :cond_67

    .line 873
    .line 874
    iget-object v2, v1, Lf9/d;->c:Ljava/lang/Object;

    .line 875
    .line 876
    check-cast v2, Lf9/e;

    .line 877
    .line 878
    iget-object v3, v2, Lf9/e;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 879
    .line 880
    iget-object v4, v2, Lf9/e;->d:Ljava/util/Map;

    .line 881
    .line 882
    const v5, 0x48434544    # 199957.06f

    .line 883
    .line 884
    .line 885
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 886
    .line 887
    .line 888
    move-result-object v6

    .line 889
    invoke-interface {v4}, Ljava/util/Map;->clear()V

    .line 890
    .line 891
    .line 892
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 893
    .line 894
    .line 895
    iget-object v7, v2, Lf9/e;->a:Lr8/g;

    .line 896
    .line 897
    iget-object v8, v7, Lr8/g;->a:Landroid/content/Context;

    .line 898
    .line 899
    const-string v9, "Hchat_edit_message_config"

    .line 900
    .line 901
    invoke-static {v8, v9}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 902
    .line 903
    .line 904
    move-result-object v8

    .line 905
    const-string v9, "edit_message_enable"

    .line 906
    .line 907
    const/4 v10, 0x0

    .line 908
    invoke-interface {v8, v9, v10}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 909
    .line 910
    .line 911
    move-result v8

    .line 912
    if-nez v8, :cond_2e

    .line 913
    .line 914
    goto/16 :goto_3f

    .line 915
    .line 916
    :cond_2e
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 917
    .line 918
    if-eqz v0, :cond_67

    .line 919
    .line 920
    array-length v8, v0

    .line 921
    const/4 v9, 0x3

    .line 922
    if-ge v8, v9, :cond_2f

    .line 923
    .line 924
    goto/16 :goto_3f

    .line 925
    .line 926
    :cond_2f
    aget-object v8, v0, v10

    .line 927
    .line 928
    if-eqz v8, :cond_67

    .line 929
    .line 930
    const/4 v11, 0x1

    .line 931
    invoke-static {v11, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 932
    .line 933
    .line 934
    move-result-object v0

    .line 935
    instance-of v12, v0, Landroid/view/View;

    .line 936
    .line 937
    if-eqz v12, :cond_30

    .line 938
    .line 939
    check-cast v0, Landroid/view/View;

    .line 940
    .line 941
    goto :goto_1b

    .line 942
    :cond_30
    const/4 v0, 0x0

    .line 943
    :goto_1b
    if-eqz v0, :cond_67

    .line 944
    .line 945
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 946
    .line 947
    .line 948
    move-result-object v12

    .line 949
    instance-of v14, v12, Landroid/view/View;

    .line 950
    .line 951
    if-eqz v14, :cond_31

    .line 952
    .line 953
    check-cast v12, Landroid/view/View;

    .line 954
    .line 955
    invoke-virtual {v12}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 956
    .line 957
    .line 958
    move-result-object v12

    .line 959
    :cond_31
    const-wide/16 v14, 0x0

    .line 960
    .line 961
    move/from16 p1, v9

    .line 962
    .line 963
    const-class v9, Ljava/lang/Object;

    .line 964
    .line 965
    if-nez v12, :cond_33

    .line 966
    .line 967
    move/from16 v16, v11

    .line 968
    .line 969
    move-wide/from16 v20, v14

    .line 970
    .line 971
    :cond_32
    const/4 v12, 0x0

    .line 972
    goto/16 :goto_21

    .line 973
    .line 974
    :cond_33
    move/from16 v16, v11

    .line 975
    .line 976
    const-string v11, "com.tencent.mm.storage."

    .line 977
    .line 978
    invoke-static {v11, v12, v10}, Leh/a;->z(Ljava/lang/String;Ljava/lang/Object;Z)Z

    .line 979
    .line 980
    .line 981
    move-result v17

    .line 982
    if-eqz v17, :cond_34

    .line 983
    .line 984
    invoke-virtual {v2, v12}, Lf9/e;->c(Ljava/lang/Object;)J

    .line 985
    .line 986
    .line 987
    move-result-wide v17

    .line 988
    cmp-long v17, v17, v14

    .line 989
    .line 990
    if-lez v17, :cond_34

    .line 991
    .line 992
    invoke-virtual {v2, v12}, Lf9/e;->c(Ljava/lang/Object;)J

    .line 993
    .line 994
    .line 995
    move-result-wide v17

    .line 996
    cmp-long v17, v17, v14

    .line 997
    .line 998
    if-lez v17, :cond_34

    .line 999
    .line 1000
    move-wide/from16 v20, v14

    .line 1001
    .line 1002
    goto/16 :goto_21

    .line 1003
    .line 1004
    :cond_34
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v17

    .line 1008
    move-object/from16 v13, v17

    .line 1009
    .line 1010
    :goto_1c
    if-eqz v13, :cond_38

    .line 1011
    .line 1012
    invoke-virtual {v13, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1013
    .line 1014
    .line 1015
    move-result v17

    .line 1016
    if-nez v17, :cond_38

    .line 1017
    .line 1018
    invoke-static {v13}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v17

    .line 1022
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v17

    .line 1026
    :goto_1d
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 1027
    .line 1028
    .line 1029
    move-result v19

    .line 1030
    if-eqz v19, :cond_37

    .line 1031
    .line 1032
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v19

    .line 1036
    move-wide/from16 v20, v14

    .line 1037
    .line 1038
    move-object/from16 v14, v19

    .line 1039
    .line 1040
    check-cast v14, Ljava/lang/reflect/Field;

    .line 1041
    .line 1042
    invoke-static {v14}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    .line 1043
    .line 1044
    .line 1045
    move-result v15

    .line 1046
    if-nez v15, :cond_36

    .line 1047
    .line 1048
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v15

    .line 1052
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1053
    .line 1054
    .line 1055
    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v15

    .line 1059
    invoke-static {v15, v11, v10}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1060
    .line 1061
    .line 1062
    move-result v15

    .line 1063
    if-nez v15, :cond_35

    .line 1064
    .line 1065
    goto :goto_1e

    .line 1066
    :cond_35
    invoke-static {v14, v12}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v14

    .line 1070
    if-eqz v14, :cond_36

    .line 1071
    .line 1072
    invoke-virtual {v2, v14}, Lf9/e;->c(Ljava/lang/Object;)J

    .line 1073
    .line 1074
    .line 1075
    move-result-wide v22

    .line 1076
    cmp-long v15, v22, v20

    .line 1077
    .line 1078
    if-lez v15, :cond_36

    .line 1079
    .line 1080
    move-object v12, v14

    .line 1081
    goto/16 :goto_21

    .line 1082
    .line 1083
    :cond_36
    :goto_1e
    move-wide/from16 v14, v20

    .line 1084
    .line 1085
    goto :goto_1d

    .line 1086
    :cond_37
    move-wide/from16 v20, v14

    .line 1087
    .line 1088
    invoke-virtual {v13}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v13

    .line 1092
    goto :goto_1c

    .line 1093
    :cond_38
    move-wide/from16 v20, v14

    .line 1094
    .line 1095
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v13

    .line 1099
    :goto_1f
    if-eqz v13, :cond_32

    .line 1100
    .line 1101
    invoke-virtual {v13, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1102
    .line 1103
    .line 1104
    move-result v14

    .line 1105
    if-nez v14, :cond_32

    .line 1106
    .line 1107
    invoke-static {v13}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v14

    .line 1111
    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v14

    .line 1115
    :goto_20
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 1116
    .line 1117
    .line 1118
    move-result v15

    .line 1119
    if-eqz v15, :cond_3b

    .line 1120
    .line 1121
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v15

    .line 1125
    check-cast v15, Ljava/lang/reflect/Method;

    .line 1126
    .line 1127
    invoke-static {v15}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 1128
    .line 1129
    .line 1130
    move-result v17

    .line 1131
    if-nez v17, :cond_39

    .line 1132
    .line 1133
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v5

    .line 1137
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1138
    .line 1139
    .line 1140
    array-length v5, v5

    .line 1141
    if-nez v5, :cond_39

    .line 1142
    .line 1143
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v5

    .line 1147
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v5

    .line 1154
    invoke-static {v5, v11, v10}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1155
    .line 1156
    .line 1157
    move-result v5

    .line 1158
    if-nez v5, :cond_3a

    .line 1159
    .line 1160
    :cond_39
    const v5, 0x48434544    # 199957.06f

    .line 1161
    .line 1162
    .line 1163
    goto :goto_20

    .line 1164
    :cond_3a
    new-array v5, v10, [Ljava/lang/Object;

    .line 1165
    .line 1166
    invoke-static {v15, v12, v5}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v5

    .line 1170
    if-eqz v5, :cond_39

    .line 1171
    .line 1172
    invoke-virtual {v2, v5}, Lf9/e;->c(Ljava/lang/Object;)J

    .line 1173
    .line 1174
    .line 1175
    move-result-wide v22

    .line 1176
    cmp-long v15, v22, v20

    .line 1177
    .line 1178
    if-lez v15, :cond_39

    .line 1179
    .line 1180
    move-object v12, v5

    .line 1181
    goto :goto_21

    .line 1182
    :cond_3b
    invoke-virtual {v13}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v13

    .line 1186
    const v5, 0x48434544    # 199957.06f

    .line 1187
    .line 1188
    .line 1189
    goto :goto_1f

    .line 1190
    :goto_21
    if-eqz v12, :cond_67

    .line 1191
    .line 1192
    iget-object v5, v7, Lr8/g;->a:Landroid/content/Context;

    .line 1193
    .line 1194
    invoke-virtual {v2, v12}, Lf9/e;->c(Ljava/lang/Object;)J

    .line 1195
    .line 1196
    .line 1197
    move-result-wide v13

    .line 1198
    invoke-static {v5, v13, v14}, Lbe/h;->t(Landroid/content/Context;J)Lf9/h;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v2

    .line 1202
    if-eqz v2, :cond_67

    .line 1203
    .line 1204
    iget-wide v13, v2, Lf9/h;->a:J

    .line 1205
    .line 1206
    cmp-long v2, v13, v20

    .line 1207
    .line 1208
    if-gtz v2, :cond_3c

    .line 1209
    .line 1210
    goto/16 :goto_3f

    .line 1211
    .line 1212
    :cond_3c
    const-string v2, "size"

    .line 1213
    .line 1214
    new-array v5, v10, [Ljava/lang/Object;

    .line 1215
    .line 1216
    invoke-static {v8, v2, v5}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v2

    .line 1220
    instance-of v5, v2, Ljava/lang/Number;

    .line 1221
    .line 1222
    if-eqz v5, :cond_3d

    .line 1223
    .line 1224
    check-cast v2, Ljava/lang/Number;

    .line 1225
    .line 1226
    goto :goto_22

    .line 1227
    :cond_3d
    const/4 v2, 0x0

    .line 1228
    :goto_22
    if-eqz v2, :cond_3e

    .line 1229
    .line 1230
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 1231
    .line 1232
    .line 1233
    move-result v2

    .line 1234
    goto :goto_23

    .line 1235
    :cond_3e
    move v2, v10

    .line 1236
    :goto_23
    move v5, v10

    .line 1237
    :goto_24
    if-lt v5, v2, :cond_3f

    .line 1238
    .line 1239
    move v2, v10

    .line 1240
    goto :goto_26

    .line 1241
    :cond_3f
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v7

    .line 1245
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v7

    .line 1249
    const-string v11, "getItem"

    .line 1250
    .line 1251
    invoke-static {v8, v11, v7}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v7

    .line 1255
    instance-of v11, v7, Landroid/view/MenuItem;

    .line 1256
    .line 1257
    if-eqz v11, :cond_40

    .line 1258
    .line 1259
    check-cast v7, Landroid/view/MenuItem;

    .line 1260
    .line 1261
    goto :goto_25

    .line 1262
    :cond_40
    const/4 v7, 0x0

    .line 1263
    :goto_25
    if-eqz v7, :cond_66

    .line 1264
    .line 1265
    invoke-interface {v7}, Landroid/view/MenuItem;->getGroupId()I

    .line 1266
    .line 1267
    .line 1268
    move-result v2

    .line 1269
    :goto_26
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v5

    .line 1273
    invoke-static {v8}, Lf9/e;->a(Ljava/lang/Object;)Landroid/view/MenuItem;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v7

    .line 1277
    if-eqz v7, :cond_41

    .line 1278
    .line 1279
    move-object/from16 v22, v4

    .line 1280
    .line 1281
    move/from16 v19, v10

    .line 1282
    .line 1283
    goto/16 :goto_31

    .line 1284
    .line 1285
    :cond_41
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v0

    .line 1289
    const/4 v7, 0x2

    .line 1290
    if-eqz v0, :cond_42

    .line 1291
    .line 1292
    goto :goto_28

    .line 1293
    :cond_42
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v0

    .line 1297
    if-eqz v0, :cond_43

    .line 1298
    .line 1299
    invoke-virtual {v0}, Lq8/o;->a()Landroid/app/Activity;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v0

    .line 1303
    goto :goto_27

    .line 1304
    :cond_43
    const/4 v0, 0x0

    .line 1305
    :goto_27
    if-eqz v0, :cond_46

    .line 1306
    .line 1307
    :goto_28
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v11

    .line 1311
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v0

    .line 1315
    const-string v15, "raw"

    .line 1316
    .line 1317
    move/from16 v19, v10

    .line 1318
    .line 1319
    const-string v10, "drawable"

    .line 1320
    .line 1321
    filled-new-array {v15, v10}, [Ljava/lang/String;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v10

    .line 1325
    move/from16 v15, v19

    .line 1326
    .line 1327
    :goto_29
    move/from16 v20, v7

    .line 1328
    .line 1329
    if-lt v15, v7, :cond_44

    .line 1330
    .line 1331
    :goto_2a
    move/from16 v1, v19

    .line 1332
    .line 1333
    goto :goto_2b

    .line 1334
    :cond_44
    aget-object v7, v10, v15

    .line 1335
    .line 1336
    const-string v1, "icons_filled_edit_photo_pencil"

    .line 1337
    .line 1338
    invoke-virtual {v11, v1, v7, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 1339
    .line 1340
    .line 1341
    move-result v1

    .line 1342
    if-eqz v1, :cond_45

    .line 1343
    .line 1344
    goto :goto_2b

    .line 1345
    :cond_45
    add-int/lit8 v15, v15, 0x1

    .line 1346
    .line 1347
    move-object/from16 v1, p0

    .line 1348
    .line 1349
    move/from16 v7, v20

    .line 1350
    .line 1351
    goto :goto_29

    .line 1352
    :cond_46
    move/from16 v20, v7

    .line 1353
    .line 1354
    move/from16 v19, v10

    .line 1355
    .line 1356
    goto :goto_2a

    .line 1357
    :goto_2b
    const-string v0, "\u4fee\u6539[H]"

    .line 1358
    .line 1359
    if-eqz v1, :cond_4a

    .line 1360
    .line 1361
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v7

    .line 1365
    invoke-static {v7}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v7

    .line 1369
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v7

    .line 1373
    :goto_2c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1374
    .line 1375
    .line 1376
    move-result v10

    .line 1377
    if-eqz v10, :cond_49

    .line 1378
    .line 1379
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v10

    .line 1383
    move-object v11, v10

    .line 1384
    check-cast v11, Ljava/lang/reflect/Method;

    .line 1385
    .line 1386
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v15

    .line 1390
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v11

    .line 1394
    move/from16 v21, v2

    .line 1395
    .line 1396
    const-string v2, "c"

    .line 1397
    .line 1398
    invoke-static {v11, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1399
    .line 1400
    .line 1401
    move-result v2

    .line 1402
    if-eqz v2, :cond_47

    .line 1403
    .line 1404
    array-length v2, v15

    .line 1405
    const/4 v11, 0x5

    .line 1406
    if-ne v2, v11, :cond_47

    .line 1407
    .line 1408
    aget-object v2, v15, v19

    .line 1409
    .line 1410
    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 1411
    .line 1412
    invoke-static {v2, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1413
    .line 1414
    .line 1415
    move-result v2

    .line 1416
    if-eqz v2, :cond_47

    .line 1417
    .line 1418
    aget-object v2, v15, v16

    .line 1419
    .line 1420
    invoke-static {v2, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1421
    .line 1422
    .line 1423
    move-result v2

    .line 1424
    if-eqz v2, :cond_47

    .line 1425
    .line 1426
    aget-object v2, v15, v20

    .line 1427
    .line 1428
    invoke-static {v2, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1429
    .line 1430
    .line 1431
    move-result v2

    .line 1432
    if-eqz v2, :cond_47

    .line 1433
    .line 1434
    aget-object v2, v15, p1

    .line 1435
    .line 1436
    move-object/from16 v22, v4

    .line 1437
    .line 1438
    const-class v4, Ljava/lang/String;

    .line 1439
    .line 1440
    invoke-virtual {v2, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1441
    .line 1442
    .line 1443
    move-result v2

    .line 1444
    if-eqz v2, :cond_48

    .line 1445
    .line 1446
    const/4 v2, 0x4

    .line 1447
    aget-object v2, v15, v2

    .line 1448
    .line 1449
    invoke-static {v2, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1450
    .line 1451
    .line 1452
    move-result v2

    .line 1453
    if-eqz v2, :cond_48

    .line 1454
    .line 1455
    goto :goto_2d

    .line 1456
    :cond_47
    move-object/from16 v22, v4

    .line 1457
    .line 1458
    :cond_48
    move/from16 v2, v21

    .line 1459
    .line 1460
    move-object/from16 v4, v22

    .line 1461
    .line 1462
    goto :goto_2c

    .line 1463
    :cond_49
    move/from16 v21, v2

    .line 1464
    .line 1465
    move-object/from16 v22, v4

    .line 1466
    .line 1467
    const/4 v10, 0x0

    .line 1468
    :goto_2d
    check-cast v10, Ljava/lang/reflect/Method;

    .line 1469
    .line 1470
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v2

    .line 1474
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v4

    .line 1478
    filled-new-array {v2, v6, v5, v0, v4}, [Ljava/lang/Object;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v2

    .line 1482
    invoke-static {v10, v8, v2}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 1483
    .line 1484
    .line 1485
    move-result v2

    .line 1486
    if-eqz v2, :cond_4b

    .line 1487
    .line 1488
    invoke-static {v8}, Lf9/e;->a(Ljava/lang/Object;)Landroid/view/MenuItem;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v7

    .line 1492
    goto/16 :goto_31

    .line 1493
    .line 1494
    :cond_4a
    move/from16 v21, v2

    .line 1495
    .line 1496
    move-object/from16 v22, v4

    .line 1497
    .line 1498
    :cond_4b
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v2

    .line 1502
    filled-new-array {v2, v6, v5, v0}, [Ljava/lang/Object;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v2

    .line 1506
    const-string v4, "add"

    .line 1507
    .line 1508
    invoke-static {v8, v4, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v2

    .line 1512
    if-eqz v2, :cond_4c

    .line 1513
    .line 1514
    goto :goto_2e

    .line 1515
    :cond_4c
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v2

    .line 1519
    filled-new-array {v2, v6, v5, v0}, [Ljava/lang/Object;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v2

    .line 1523
    invoke-static {v8, v4, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v2

    .line 1527
    :goto_2e
    instance-of v4, v2, Landroid/view/MenuItem;

    .line 1528
    .line 1529
    if-eqz v4, :cond_4d

    .line 1530
    .line 1531
    if-eqz v1, :cond_4d

    .line 1532
    .line 1533
    :try_start_1
    move-object v0, v2

    .line 1534
    check-cast v0, Landroid/view/MenuItem;

    .line 1535
    .line 1536
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1537
    .line 1538
    .line 1539
    :catchall_1
    move-object v7, v2

    .line 1540
    check-cast v7, Landroid/view/MenuItem;

    .line 1541
    .line 1542
    goto :goto_31

    .line 1543
    :cond_4d
    if-eqz v4, :cond_4e

    .line 1544
    .line 1545
    move-object v7, v2

    .line 1546
    check-cast v7, Landroid/view/MenuItem;

    .line 1547
    .line 1548
    goto :goto_31

    .line 1549
    :cond_4e
    if-eqz v2, :cond_4f

    .line 1550
    .line 1551
    invoke-static {v8}, Lf9/e;->a(Ljava/lang/Object;)Landroid/view/MenuItem;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v7

    .line 1555
    goto :goto_31

    .line 1556
    :cond_4f
    filled-new-array {v6, v0}, [Ljava/lang/Object;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v1

    .line 1560
    const-string v2, "f"

    .line 1561
    .line 1562
    invoke-static {v8, v2, v1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1563
    .line 1564
    .line 1565
    move-result-object v1

    .line 1566
    if-eqz v1, :cond_50

    .line 1567
    .line 1568
    goto :goto_2f

    .line 1569
    :cond_50
    filled-new-array {v6, v0}, [Ljava/lang/Object;

    .line 1570
    .line 1571
    .line 1572
    move-result-object v0

    .line 1573
    invoke-static {v8, v2, v0}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1574
    .line 1575
    .line 1576
    move-result-object v1

    .line 1577
    :goto_2f
    instance-of v0, v1, Landroid/view/MenuItem;

    .line 1578
    .line 1579
    if-eqz v0, :cond_51

    .line 1580
    .line 1581
    check-cast v1, Landroid/view/MenuItem;

    .line 1582
    .line 1583
    move-object v7, v1

    .line 1584
    goto :goto_30

    .line 1585
    :cond_51
    const/4 v7, 0x0

    .line 1586
    :goto_30
    if-eqz v7, :cond_52

    .line 1587
    .line 1588
    goto :goto_31

    .line 1589
    :cond_52
    invoke-static {v8}, Lf9/e;->a(Ljava/lang/Object;)Landroid/view/MenuItem;

    .line 1590
    .line 1591
    .line 1592
    move-result-object v7

    .line 1593
    :goto_31
    if-eqz v7, :cond_67

    .line 1594
    .line 1595
    new-instance v0, Lf9/c;

    .line 1596
    .line 1597
    invoke-direct {v0, v12, v13, v14}, Lf9/c;-><init>(Ljava/lang/Object;J)V

    .line 1598
    .line 1599
    .line 1600
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1601
    .line 1602
    .line 1603
    move-object/from16 v4, v22

    .line 1604
    .line 1605
    check-cast v4, Ljava/util/Map;

    .line 1606
    .line 1607
    invoke-interface {v4, v7, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1608
    .line 1609
    .line 1610
    invoke-interface {v7}, Landroid/view/MenuItem;->getGroupId()I

    .line 1611
    .line 1612
    .line 1613
    move-result v1

    .line 1614
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v1

    .line 1618
    invoke-virtual {v3, v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1619
    .line 1620
    .line 1621
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v0

    .line 1625
    :goto_32
    if-eqz v0, :cond_67

    .line 1626
    .line 1627
    invoke-virtual {v0, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1628
    .line 1629
    .line 1630
    move-result v1

    .line 1631
    if-nez v1, :cond_67

    .line 1632
    .line 1633
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 1634
    .line 1635
    .line 1636
    move-result-object v1

    .line 1637
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1638
    .line 1639
    .line 1640
    move-result-object v1

    .line 1641
    :cond_53
    :goto_33
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1642
    .line 1643
    .line 1644
    move-result v2

    .line 1645
    if-eqz v2, :cond_65

    .line 1646
    .line 1647
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v2

    .line 1651
    check-cast v2, Ljava/lang/reflect/Field;

    .line 1652
    .line 1653
    const-class v3, Ljava/util/List;

    .line 1654
    .line 1655
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1656
    .line 1657
    .line 1658
    move-result-object v4

    .line 1659
    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1660
    .line 1661
    .line 1662
    move-result v3

    .line 1663
    if-nez v3, :cond_54

    .line 1664
    .line 1665
    goto :goto_33

    .line 1666
    :cond_54
    invoke-static {v2, v8}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v2

    .line 1670
    invoke-static {v2}, Lgg/x;->e(Ljava/lang/Object;)Z

    .line 1671
    .line 1672
    .line 1673
    move-result v3

    .line 1674
    if-eqz v3, :cond_55

    .line 1675
    .line 1676
    check-cast v2, Ljava/util/List;

    .line 1677
    .line 1678
    goto :goto_34

    .line 1679
    :cond_55
    const/4 v2, 0x0

    .line 1680
    :goto_34
    if-eqz v2, :cond_53

    .line 1681
    .line 1682
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v3

    .line 1686
    move/from16 v4, v19

    .line 1687
    .line 1688
    :goto_35
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1689
    .line 1690
    .line 1691
    move-result v5

    .line 1692
    const/4 v6, -0x1

    .line 1693
    if-eqz v5, :cond_5a

    .line 1694
    .line 1695
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1696
    .line 1697
    .line 1698
    move-result-object v5

    .line 1699
    if-eq v5, v7, :cond_59

    .line 1700
    .line 1701
    instance-of v10, v5, Landroid/view/MenuItem;

    .line 1702
    .line 1703
    if-eqz v10, :cond_56

    .line 1704
    .line 1705
    check-cast v5, Landroid/view/MenuItem;

    .line 1706
    .line 1707
    goto :goto_36

    .line 1708
    :cond_56
    const/4 v5, 0x0

    .line 1709
    :goto_36
    if-eqz v5, :cond_57

    .line 1710
    .line 1711
    invoke-interface {v5}, Landroid/view/MenuItem;->getItemId()I

    .line 1712
    .line 1713
    .line 1714
    move-result v5

    .line 1715
    const v10, 0x48434544    # 199957.06f

    .line 1716
    .line 1717
    .line 1718
    if-ne v5, v10, :cond_58

    .line 1719
    .line 1720
    goto :goto_37

    .line 1721
    :cond_57
    const v10, 0x48434544    # 199957.06f

    .line 1722
    .line 1723
    .line 1724
    :cond_58
    add-int/lit8 v4, v4, 0x1

    .line 1725
    .line 1726
    goto :goto_35

    .line 1727
    :cond_59
    const v10, 0x48434544    # 199957.06f

    .line 1728
    .line 1729
    .line 1730
    goto :goto_37

    .line 1731
    :cond_5a
    const v10, 0x48434544    # 199957.06f

    .line 1732
    .line 1733
    .line 1734
    move v4, v6

    .line 1735
    :goto_37
    if-gez v4, :cond_5b

    .line 1736
    .line 1737
    goto :goto_33

    .line 1738
    :cond_5b
    invoke-interface {v2, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1739
    .line 1740
    .line 1741
    move-result-object v0

    .line 1742
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v1

    .line 1746
    move/from16 v3, v19

    .line 1747
    .line 1748
    :goto_38
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1749
    .line 1750
    .line 1751
    move-result v4

    .line 1752
    if-eqz v4, :cond_5e

    .line 1753
    .line 1754
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1755
    .line 1756
    .line 1757
    move-result-object v4

    .line 1758
    instance-of v5, v4, Landroid/view/MenuItem;

    .line 1759
    .line 1760
    if-eqz v5, :cond_5c

    .line 1761
    .line 1762
    check-cast v4, Landroid/view/MenuItem;

    .line 1763
    .line 1764
    goto :goto_39

    .line 1765
    :cond_5c
    const/4 v4, 0x0

    .line 1766
    :goto_39
    if-eqz v4, :cond_5d

    .line 1767
    .line 1768
    invoke-interface {v4}, Landroid/view/MenuItem;->getItemId()I

    .line 1769
    .line 1770
    .line 1771
    move-result v4

    .line 1772
    const v5, 0x48434657    # 199961.36f

    .line 1773
    .line 1774
    .line 1775
    if-ne v4, v5, :cond_5d

    .line 1776
    .line 1777
    goto :goto_3a

    .line 1778
    :cond_5d
    add-int/lit8 v3, v3, 0x1

    .line 1779
    .line 1780
    goto :goto_38

    .line 1781
    :cond_5e
    move v3, v6

    .line 1782
    :goto_3a
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1783
    .line 1784
    .line 1785
    move-result-object v1

    .line 1786
    move/from16 v4, v19

    .line 1787
    .line 1788
    :goto_3b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1789
    .line 1790
    .line 1791
    move-result v5

    .line 1792
    if-eqz v5, :cond_61

    .line 1793
    .line 1794
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1795
    .line 1796
    .line 1797
    move-result-object v5

    .line 1798
    instance-of v7, v5, Landroid/view/MenuItem;

    .line 1799
    .line 1800
    if-eqz v7, :cond_5f

    .line 1801
    .line 1802
    check-cast v5, Landroid/view/MenuItem;

    .line 1803
    .line 1804
    goto :goto_3c

    .line 1805
    :cond_5f
    const/4 v5, 0x0

    .line 1806
    :goto_3c
    if-eqz v5, :cond_60

    .line 1807
    .line 1808
    invoke-interface {v5}, Landroid/view/MenuItem;->getItemId()I

    .line 1809
    .line 1810
    .line 1811
    move-result v5

    .line 1812
    const v7, 0x48435250    # 200009.25f

    .line 1813
    .line 1814
    .line 1815
    if-ne v5, v7, :cond_60

    .line 1816
    .line 1817
    move v6, v4

    .line 1818
    goto :goto_3d

    .line 1819
    :cond_60
    add-int/lit8 v4, v4, 0x1

    .line 1820
    .line 1821
    goto :goto_3b

    .line 1822
    :cond_61
    :goto_3d
    if-ltz v3, :cond_62

    .line 1823
    .line 1824
    add-int/lit8 v10, v3, 0x1

    .line 1825
    .line 1826
    goto :goto_3e

    .line 1827
    :cond_62
    if-ltz v6, :cond_63

    .line 1828
    .line 1829
    add-int/lit8 v10, v6, 0x1

    .line 1830
    .line 1831
    goto :goto_3e

    .line 1832
    :cond_63
    move/from16 v10, v19

    .line 1833
    .line 1834
    :goto_3e
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1835
    .line 1836
    .line 1837
    move-result v1

    .line 1838
    if-le v10, v1, :cond_64

    .line 1839
    .line 1840
    move v10, v1

    .line 1841
    :cond_64
    invoke-interface {v2, v10, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 1842
    .line 1843
    .line 1844
    goto :goto_3f

    .line 1845
    :cond_65
    const v10, 0x48434544    # 199957.06f

    .line 1846
    .line 1847
    .line 1848
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 1849
    .line 1850
    .line 1851
    move-result-object v0

    .line 1852
    goto/16 :goto_32

    .line 1853
    .line 1854
    :cond_66
    move-object/from16 v22, v4

    .line 1855
    .line 1856
    move/from16 v19, v10

    .line 1857
    .line 1858
    const v10, 0x48434544    # 199957.06f

    .line 1859
    .line 1860
    .line 1861
    add-int/lit8 v5, v5, 0x1

    .line 1862
    .line 1863
    move-object/from16 v1, p0

    .line 1864
    .line 1865
    move/from16 v10, v19

    .line 1866
    .line 1867
    goto/16 :goto_24

    .line 1868
    .line 1869
    :cond_67
    :goto_3f
    return-void

    .line 1870
    nop

    .line 1871
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lf9/d;->a:I

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    packed-switch v2, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-boolean v2, v0, Lf9/d;->b:Z

    .line 14
    .line 15
    if-nez v2, :cond_11

    .line 16
    .line 17
    iget-object v2, v0, Lf9/d;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lqb/k;

    .line 20
    .line 21
    invoke-virtual {v2}, Lqb/k;->p()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    goto/16 :goto_8

    .line 28
    .line 29
    :cond_0
    iget-object v3, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 30
    .line 31
    if-eqz v3, :cond_11

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-static {v4, v3}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    instance-of v6, v5, Landroid/view/MenuItem;

    .line 39
    .line 40
    const/4 v7, 0x0

    .line 41
    if-eqz v6, :cond_1

    .line 42
    .line 43
    check-cast v5, Landroid/view/MenuItem;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move-object v5, v7

    .line 47
    :goto_0
    if-eqz v5, :cond_11

    .line 48
    .line 49
    invoke-interface {v5}, Landroid/view/MenuItem;->getItemId()I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    const v8, 0x48435646    # 200025.1f

    .line 54
    .line 55
    .line 56
    const v9, 0x48435653    # 200025.3f

    .line 57
    .line 58
    .line 59
    if-eq v6, v8, :cond_2

    .line 60
    .line 61
    invoke-interface {v5}, Landroid/view/MenuItem;->getItemId()I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-eq v6, v9, :cond_2

    .line 66
    .line 67
    goto/16 :goto_8

    .line 68
    .line 69
    :cond_2
    invoke-interface {v5}, Landroid/view/MenuItem;->getItemId()I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-ne v6, v8, :cond_3

    .line 74
    .line 75
    const-string v6, "voice_forward_chat_forward_enable"

    .line 76
    .line 77
    invoke-virtual {v2, v6}, Lqb/k;->O(Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-nez v6, :cond_3

    .line 82
    .line 83
    goto/16 :goto_8

    .line 84
    .line 85
    :cond_3
    invoke-interface {v5}, Landroid/view/MenuItem;->getItemId()I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    if-ne v6, v9, :cond_4

    .line 90
    .line 91
    const-string v6, "voice_forward_chat_save_enable"

    .line 92
    .line 93
    invoke-virtual {v2, v6}, Lqb/k;->O(Ljava/lang/String;)Z

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    if-nez v6, :cond_4

    .line 98
    .line 99
    goto/16 :goto_8

    .line 100
    .line 101
    :cond_4
    new-instance v6, Ljava/util/WeakHashMap;

    .line 102
    .line 103
    invoke-direct {v6}, Ljava/util/WeakHashMap;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-static {v6}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    check-cast v6, Ljava/util/Set;

    .line 114
    .line 115
    invoke-virtual {v2, v4, v3, v6}, Lqb/k;->C(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    const/4 v8, 0x1

    .line 120
    invoke-static {v8, v3}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    if-eqz v8, :cond_5

    .line 129
    .line 130
    invoke-virtual {v8}, Lq8/o;->a()Landroid/app/Activity;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    goto :goto_1

    .line 135
    :cond_5
    move-object v8, v7

    .line 136
    :goto_1
    if-eqz v8, :cond_6

    .line 137
    .line 138
    invoke-virtual {v8}, Landroid/app/Activity;->isFinishing()Z

    .line 139
    .line 140
    .line 141
    move-result v10

    .line 142
    if-nez v10, :cond_6

    .line 143
    .line 144
    move-object v7, v8

    .line 145
    goto/16 :goto_5

    .line 146
    .line 147
    :cond_6
    if-eqz v3, :cond_c

    .line 148
    .line 149
    iget-object v8, v2, Lqb/k;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 150
    .line 151
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    move-result-object v10

    .line 155
    invoke-virtual {v8, v10}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v11

    .line 159
    check-cast v11, Ljava/lang/reflect/Method;

    .line 160
    .line 161
    if-eqz v11, :cond_7

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_7
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    move-result-object v11

    .line 168
    invoke-static {v11}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object v11

    .line 172
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object v11

    .line 176
    :cond_8
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result v12

    .line 180
    if-eqz v12, :cond_9

    .line 181
    .line 182
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v12

    .line 186
    move-object v13, v12

    .line 187
    check-cast v13, Ljava/lang/reflect/Method;

    .line 188
    .line 189
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    move-result-object v14

    .line 193
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    array-length v14, v14

    .line 197
    if-nez v14, :cond_8

    .line 198
    .line 199
    const-class v14, Landroid/app/Activity;

    .line 200
    .line 201
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    move-result-object v13

    .line 205
    invoke-virtual {v14, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 206
    .line 207
    .line 208
    move-result v13

    .line 209
    if-eqz v13, :cond_8

    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_9
    move-object v12, v7

    .line 213
    :goto_2
    move-object v11, v12

    .line 214
    check-cast v11, Ljava/lang/reflect/Method;

    .line 215
    .line 216
    if-eqz v11, :cond_a

    .line 217
    .line 218
    invoke-virtual {v8, v10, v11}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    goto :goto_3

    .line 222
    :cond_a
    move-object v11, v7

    .line 223
    :goto_3
    if-eqz v11, :cond_c

    .line 224
    .line 225
    new-array v4, v4, [Ljava/lang/Object;

    .line 226
    .line 227
    invoke-static {v11, v3, v4}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    instance-of v4, v3, Landroid/app/Activity;

    .line 232
    .line 233
    if-eqz v4, :cond_b

    .line 234
    .line 235
    check-cast v3, Landroid/app/Activity;

    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_b
    move-object v3, v7

    .line 239
    :goto_4
    if-eqz v3, :cond_c

    .line 240
    .line 241
    invoke-virtual {v3}, Landroid/app/Activity;->isFinishing()Z

    .line 242
    .line 243
    .line 244
    move-result v4

    .line 245
    if-nez v4, :cond_c

    .line 246
    .line 247
    move-object v7, v3

    .line 248
    :cond_c
    :goto_5
    if-eqz v6, :cond_10

    .line 249
    .line 250
    if-nez v7, :cond_d

    .line 251
    .line 252
    goto :goto_7

    .line 253
    :cond_d
    invoke-virtual {v2, v6}, Lqb/k;->D(Ljava/lang/Object;)Lqb/i;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    if-nez v3, :cond_e

    .line 258
    .line 259
    const-string v2, "\u8bed\u97f3\u6587\u4ef6\u4e0d\u5b58\u5728"

    .line 260
    .line 261
    invoke-static {v7, v2}, Lqb/k;->N(Landroid/app/Activity;Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 265
    .line 266
    invoke-virtual {v1, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    goto :goto_8

    .line 270
    :cond_e
    invoke-interface {v5}, Landroid/view/MenuItem;->getItemId()I

    .line 271
    .line 272
    .line 273
    move-result v4

    .line 274
    if-ne v4, v9, :cond_f

    .line 275
    .line 276
    new-instance v4, Ljava/lang/Thread;

    .line 277
    .line 278
    new-instance v5, Lac/l;

    .line 279
    .line 280
    const/16 v6, 0x1d

    .line 281
    .line 282
    invoke-direct {v5, v2, v7, v3, v6}, Lac/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 283
    .line 284
    .line 285
    const-string v2, "Hchat-VoiceSave"

    .line 286
    .line 287
    invoke-direct {v4, v5, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v4}, Ljava/lang/Thread;->start()V

    .line 291
    .line 292
    .line 293
    goto :goto_6

    .line 294
    :cond_f
    invoke-virtual {v2, v7, v3}, Lqb/k;->J(Landroid/app/Activity;Lqb/i;)V

    .line 295
    .line 296
    .line 297
    :goto_6
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 298
    .line 299
    invoke-virtual {v1, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    goto :goto_8

    .line 303
    :cond_10
    :goto_7
    const-string v2, "\u8bed\u97f3\u6d88\u606f\u4e0d\u53ef\u7528"

    .line 304
    .line 305
    invoke-static {v7, v2}, Lqb/k;->N(Landroid/app/Activity;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 309
    .line 310
    invoke-virtual {v1, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    :cond_11
    :goto_8
    return-void

    .line 314
    :pswitch_0
    iget-boolean v2, v0, Lf9/d;->b:Z

    .line 315
    .line 316
    if-nez v2, :cond_1a

    .line 317
    .line 318
    iget-object v2, v0, Lf9/d;->c:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v2, Llb/i;

    .line 321
    .line 322
    iget-object v3, v2, Llb/i;->s:Ljava/util/concurrent/ConcurrentHashMap;

    .line 323
    .line 324
    iget-object v4, v2, Llb/i;->r:Ljava/util/Map;

    .line 325
    .line 326
    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 327
    .line 328
    if-eqz v1, :cond_1a

    .line 329
    .line 330
    array-length v5, v1

    .line 331
    const/4 v6, 0x0

    .line 332
    :goto_9
    const/4 v7, 0x0

    .line 333
    if-ge v6, v5, :cond_14

    .line 334
    .line 335
    aget-object v8, v1, v6

    .line 336
    .line 337
    instance-of v9, v8, Landroid/view/MenuItem;

    .line 338
    .line 339
    if-eqz v9, :cond_12

    .line 340
    .line 341
    check-cast v8, Landroid/view/MenuItem;

    .line 342
    .line 343
    goto :goto_a

    .line 344
    :cond_12
    move-object v8, v7

    .line 345
    :goto_a
    if-eqz v8, :cond_13

    .line 346
    .line 347
    goto :goto_b

    .line 348
    :cond_13
    add-int/lit8 v6, v6, 0x1

    .line 349
    .line 350
    goto :goto_9

    .line 351
    :cond_14
    move-object v8, v7

    .line 352
    :goto_b
    if-eqz v8, :cond_1a

    .line 353
    .line 354
    invoke-interface {v8}, Landroid/view/MenuItem;->getItemId()I

    .line 355
    .line 356
    .line 357
    move-result v1

    .line 358
    const v5, 0x48435250    # 200009.25f

    .line 359
    .line 360
    .line 361
    if-eq v1, v5, :cond_15

    .line 362
    .line 363
    goto :goto_e

    .line 364
    :cond_15
    invoke-interface {v4, v8}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    check-cast v1, Llb/c;

    .line 369
    .line 370
    if-eqz v1, :cond_16

    .line 371
    .line 372
    goto :goto_c

    .line 373
    :cond_16
    invoke-interface {v8}, Landroid/view/MenuItem;->getGroupId()I

    .line 374
    .line 375
    .line 376
    move-result v1

    .line 377
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    invoke-virtual {v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    check-cast v1, Llb/c;

    .line 386
    .line 387
    :goto_c
    invoke-interface {v4}, Ljava/util/Map;->clear()V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 391
    .line 392
    .line 393
    if-eqz v1, :cond_17

    .line 394
    .line 395
    invoke-virtual {v2, v1}, Llb/i;->F(Llb/c;)Z

    .line 396
    .line 397
    .line 398
    move-result v1

    .line 399
    if-nez v1, :cond_1a

    .line 400
    .line 401
    :cond_17
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    if-eqz v1, :cond_18

    .line 406
    .line 407
    invoke-virtual {v1}, Lq8/o;->a()Landroid/app/Activity;

    .line 408
    .line 409
    .line 410
    move-result-object v7

    .line 411
    :cond_18
    if-eqz v7, :cond_19

    .line 412
    .line 413
    goto :goto_d

    .line 414
    :cond_19
    iget-object v1, v2, Llb/i;->a:Lr8/g;

    .line 415
    .line 416
    iget-object v7, v1, Lr8/g;->a:Landroid/content/Context;

    .line 417
    .line 418
    :goto_d
    iget-object v1, v2, Llb/i;->l:Landroid/os/Handler;

    .line 419
    .line 420
    new-instance v2, Lc9/p1;

    .line 421
    .line 422
    const/4 v3, 0x2

    .line 423
    invoke-direct {v2, v7, v3}, Lc9/p1;-><init>(Landroid/content/Context;I)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 427
    .line 428
    .line 429
    :cond_1a
    :goto_e
    return-void

    .line 430
    :pswitch_1
    iget-boolean v2, v0, Lf9/d;->b:Z

    .line 431
    .line 432
    if-nez v2, :cond_30

    .line 433
    .line 434
    iget-object v2, v0, Lf9/d;->c:Ljava/lang/Object;

    .line 435
    .line 436
    move-object v4, v2

    .line 437
    check-cast v4, Lf9/e;

    .line 438
    .line 439
    iget-object v2, v4, Lf9/e;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 440
    .line 441
    iget-object v3, v4, Lf9/e;->d:Ljava/util/Map;

    .line 442
    .line 443
    iget-object v5, v4, Lf9/e;->a:Lr8/g;

    .line 444
    .line 445
    iget-object v6, v5, Lr8/g;->a:Landroid/content/Context;

    .line 446
    .line 447
    const-string v7, "Hchat_edit_message_config"

    .line 448
    .line 449
    invoke-static {v6, v7}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 450
    .line 451
    .line 452
    move-result-object v6

    .line 453
    const-string v7, "edit_message_enable"

    .line 454
    .line 455
    const/4 v9, 0x0

    .line 456
    invoke-interface {v6, v7, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 457
    .line 458
    .line 459
    move-result v6

    .line 460
    if-nez v6, :cond_1b

    .line 461
    .line 462
    goto/16 :goto_1e

    .line 463
    .line 464
    :cond_1b
    iget-object v6, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 465
    .line 466
    if-eqz v6, :cond_30

    .line 467
    .line 468
    array-length v7, v6

    .line 469
    move v8, v9

    .line 470
    :goto_f
    const/4 v10, 0x0

    .line 471
    if-ge v8, v7, :cond_1e

    .line 472
    .line 473
    aget-object v11, v6, v8

    .line 474
    .line 475
    instance-of v12, v11, Landroid/view/MenuItem;

    .line 476
    .line 477
    if-eqz v12, :cond_1c

    .line 478
    .line 479
    check-cast v11, Landroid/view/MenuItem;

    .line 480
    .line 481
    goto :goto_10

    .line 482
    :cond_1c
    move-object v11, v10

    .line 483
    :goto_10
    if-eqz v11, :cond_1d

    .line 484
    .line 485
    goto :goto_11

    .line 486
    :cond_1d
    add-int/lit8 v8, v8, 0x1

    .line 487
    .line 488
    goto :goto_f

    .line 489
    :cond_1e
    move-object v11, v10

    .line 490
    :goto_11
    if-eqz v11, :cond_30

    .line 491
    .line 492
    invoke-interface {v11}, Landroid/view/MenuItem;->getItemId()I

    .line 493
    .line 494
    .line 495
    move-result v6

    .line 496
    const v7, 0x48434544    # 199957.06f

    .line 497
    .line 498
    .line 499
    if-eq v6, v7, :cond_1f

    .line 500
    .line 501
    goto/16 :goto_1e

    .line 502
    .line 503
    :cond_1f
    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 504
    .line 505
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 506
    .line 507
    .line 508
    move-result-object v6

    .line 509
    if-eqz v6, :cond_20

    .line 510
    .line 511
    invoke-virtual {v6}, Lq8/o;->a()Landroid/app/Activity;

    .line 512
    .line 513
    .line 514
    move-result-object v6

    .line 515
    goto :goto_12

    .line 516
    :cond_20
    move-object v6, v10

    .line 517
    :goto_12
    if-eqz v6, :cond_21

    .line 518
    .line 519
    invoke-virtual {v6}, Landroid/app/Activity;->isFinishing()Z

    .line 520
    .line 521
    .line 522
    move-result v7

    .line 523
    if-nez v7, :cond_21

    .line 524
    .line 525
    :goto_13
    move-object v14, v6

    .line 526
    goto/16 :goto_17

    .line 527
    .line 528
    :cond_21
    if-eqz v1, :cond_27

    .line 529
    .line 530
    iget-object v6, v4, Lf9/e;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 531
    .line 532
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    move-result-object v7

    .line 536
    invoke-virtual {v6, v7}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v8

    .line 540
    check-cast v8, Ljava/lang/reflect/Method;

    .line 541
    .line 542
    if-eqz v8, :cond_22

    .line 543
    .line 544
    goto :goto_15

    .line 545
    :cond_22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 546
    .line 547
    .line 548
    move-result-object v8

    .line 549
    invoke-static {v8}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 550
    .line 551
    .line 552
    move-result-object v8

    .line 553
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 554
    .line 555
    .line 556
    move-result-object v8

    .line 557
    :cond_23
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 558
    .line 559
    .line 560
    move-result v12

    .line 561
    if-eqz v12, :cond_24

    .line 562
    .line 563
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v12

    .line 567
    move-object v13, v12

    .line 568
    check-cast v13, Ljava/lang/reflect/Method;

    .line 569
    .line 570
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 571
    .line 572
    .line 573
    move-result-object v14

    .line 574
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 575
    .line 576
    .line 577
    array-length v14, v14

    .line 578
    if-nez v14, :cond_23

    .line 579
    .line 580
    const-class v14, Landroid/app/Activity;

    .line 581
    .line 582
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 583
    .line 584
    .line 585
    move-result-object v13

    .line 586
    invoke-virtual {v14, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 587
    .line 588
    .line 589
    move-result v13

    .line 590
    if-eqz v13, :cond_23

    .line 591
    .line 592
    goto :goto_14

    .line 593
    :cond_24
    move-object v12, v10

    .line 594
    :goto_14
    move-object v8, v12

    .line 595
    check-cast v8, Ljava/lang/reflect/Method;

    .line 596
    .line 597
    if-eqz v8, :cond_25

    .line 598
    .line 599
    invoke-virtual {v6, v7, v8}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    goto :goto_15

    .line 603
    :cond_25
    move-object v8, v10

    .line 604
    :goto_15
    if-eqz v8, :cond_27

    .line 605
    .line 606
    new-array v6, v9, [Ljava/lang/Object;

    .line 607
    .line 608
    invoke-static {v8, v1, v6}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v1

    .line 612
    instance-of v6, v1, Landroid/app/Activity;

    .line 613
    .line 614
    if-eqz v6, :cond_26

    .line 615
    .line 616
    check-cast v1, Landroid/app/Activity;

    .line 617
    .line 618
    move-object v6, v1

    .line 619
    goto :goto_16

    .line 620
    :cond_26
    move-object v6, v10

    .line 621
    :goto_16
    if-eqz v6, :cond_27

    .line 622
    .line 623
    invoke-virtual {v6}, Landroid/app/Activity;->isFinishing()Z

    .line 624
    .line 625
    .line 626
    move-result v1

    .line 627
    if-nez v1, :cond_27

    .line 628
    .line 629
    goto :goto_13

    .line 630
    :cond_27
    move-object v14, v10

    .line 631
    :goto_17
    invoke-interface {v3, v11}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object v1

    .line 635
    check-cast v1, Lf9/c;

    .line 636
    .line 637
    if-eqz v1, :cond_28

    .line 638
    .line 639
    :goto_18
    move-object v6, v1

    .line 640
    goto :goto_19

    .line 641
    :cond_28
    invoke-interface {v11}, Landroid/view/MenuItem;->getGroupId()I

    .line 642
    .line 643
    .line 644
    move-result v1

    .line 645
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 646
    .line 647
    .line 648
    move-result-object v1

    .line 649
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v1

    .line 653
    check-cast v1, Lf9/c;

    .line 654
    .line 655
    goto :goto_18

    .line 656
    :goto_19
    invoke-interface {v3}, Ljava/util/Map;->clear()V

    .line 657
    .line 658
    .line 659
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 660
    .line 661
    .line 662
    if-eqz v6, :cond_2a

    .line 663
    .line 664
    iget-wide v1, v6, Lf9/c;->a:J

    .line 665
    .line 666
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 667
    .line 668
    .line 669
    move-result-object v3

    .line 670
    const-wide/16 v7, 0x0

    .line 671
    .line 672
    cmp-long v1, v1, v7

    .line 673
    .line 674
    if-lez v1, :cond_29

    .line 675
    .line 676
    goto :goto_1a

    .line 677
    :cond_29
    move-object v3, v10

    .line 678
    :goto_1a
    if-eqz v3, :cond_2a

    .line 679
    .line 680
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 681
    .line 682
    .line 683
    move-result-wide v1

    .line 684
    iget-object v3, v5, Lr8/g;->a:Landroid/content/Context;

    .line 685
    .line 686
    invoke-static {v3, v1, v2}, Lbe/h;->t(Landroid/content/Context;J)Lf9/h;

    .line 687
    .line 688
    .line 689
    move-result-object v1

    .line 690
    move-object v5, v1

    .line 691
    goto :goto_1b

    .line 692
    :cond_2a
    move-object v5, v10

    .line 693
    :goto_1b
    if-eqz v14, :cond_2f

    .line 694
    .line 695
    if-eqz v6, :cond_2f

    .line 696
    .line 697
    if-nez v5, :cond_2b

    .line 698
    .line 699
    goto/16 :goto_1d

    .line 700
    .line 701
    :cond_2b
    new-instance v1, Lc9/q0;

    .line 702
    .line 703
    invoke-direct {v1, v4, v5, v6, v14}, Lc9/q0;-><init>(Lf9/e;Lf9/h;Lf9/c;Landroid/app/Activity;)V

    .line 704
    .line 705
    .line 706
    new-instance v3, Lc9/n0;

    .line 707
    .line 708
    const/4 v8, 0x4

    .line 709
    move-object v7, v14

    .line 710
    invoke-direct/range {v3 .. v8}, Lc9/n0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 711
    .line 712
    .line 713
    new-instance v2, Lc9/h0;

    .line 714
    .line 715
    const/4 v4, 0x3

    .line 716
    invoke-direct {v2, v5, v1, v3, v4}, Lc9/h0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 717
    .line 718
    .line 719
    new-instance v15, Ls0/d;

    .line 720
    .line 721
    const v1, 0x42b4843c

    .line 722
    .line 723
    .line 724
    const/4 v3, 0x1

    .line 725
    invoke-direct {v15, v1, v2, v3}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 726
    .line 727
    .line 728
    invoke-virtual {v14}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 729
    .line 730
    .line 731
    move-result-object v1

    .line 732
    if-eqz v1, :cond_2c

    .line 733
    .line 734
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 735
    .line 736
    .line 737
    move-result-object v1

    .line 738
    goto :goto_1c

    .line 739
    :cond_2c
    move-object v1, v10

    .line 740
    :goto_1c
    instance-of v2, v1, Landroid/view/ViewGroup;

    .line 741
    .line 742
    if-eqz v2, :cond_2d

    .line 743
    .line 744
    move-object v10, v1

    .line 745
    check-cast v10, Landroid/view/ViewGroup;

    .line 746
    .line 747
    :cond_2d
    if-eqz v10, :cond_30

    .line 748
    .line 749
    new-instance v13, Lc9/a1;

    .line 750
    .line 751
    const/4 v1, 0x1

    .line 752
    invoke-direct {v13, v1}, Lc9/a1;-><init>(I)V

    .line 753
    .line 754
    .line 755
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 756
    .line 757
    invoke-direct {v1, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 758
    .line 759
    .line 760
    new-instance v2, Landroid/widget/FrameLayout;

    .line 761
    .line 762
    invoke-direct {v2, v14}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 763
    .line 764
    .line 765
    invoke-virtual {v2, v9}, Landroid/view/View;->setBackgroundColor(I)V

    .line 766
    .line 767
    .line 768
    invoke-virtual {v2, v3}, Landroid/view/View;->setClickable(Z)V

    .line 769
    .line 770
    .line 771
    invoke-virtual {v2, v3}, Landroid/view/View;->setFocusable(Z)V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v2, v3}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 775
    .line 776
    .line 777
    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    .line 778
    .line 779
    const/4 v5, -0x1

    .line 780
    invoke-direct {v4, v5, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 781
    .line 782
    .line 783
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 784
    .line 785
    .line 786
    invoke-static {v10, v13, v13, v13, v13}, Lx6/d;->H(Landroid/view/View;Landroidx/lifecycle/q;Lu3/c;Lc9/a1;Lc9/a1;)V

    .line 787
    .line 788
    .line 789
    invoke-static {v2, v13, v13, v13, v13}, Lx6/d;->H(Landroid/view/View;Landroidx/lifecycle/q;Lu3/c;Lc9/a1;Lc9/a1;)V

    .line 790
    .line 791
    .line 792
    iget-boolean v4, v13, Lc9/a1;->l:Z

    .line 793
    .line 794
    if-nez v4, :cond_2e

    .line 795
    .line 796
    iget-object v4, v13, Lc9/a1;->i:Lp4/t;

    .line 797
    .line 798
    sget-object v6, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 799
    .line 800
    invoke-virtual {v4, v6}, Lp4/t;->F(Landroid/os/Bundle;)V

    .line 801
    .line 802
    .line 803
    iput-boolean v3, v13, Lc9/a1;->l:Z

    .line 804
    .line 805
    :cond_2e
    iget-object v4, v13, Lc9/a1;->h:Landroidx/lifecycle/s;

    .line 806
    .line 807
    const-string v6, "setCurrentState"

    .line 808
    .line 809
    invoke-virtual {v4, v6}, Landroidx/lifecycle/s;->c(Ljava/lang/String;)V

    .line 810
    .line 811
    .line 812
    sget-object v7, Landroidx/lifecycle/l;->i:Landroidx/lifecycle/l;

    .line 813
    .line 814
    invoke-virtual {v4, v7}, Landroidx/lifecycle/s;->e(Landroidx/lifecycle/l;)V

    .line 815
    .line 816
    .line 817
    invoke-virtual {v4, v6}, Landroidx/lifecycle/s;->c(Ljava/lang/String;)V

    .line 818
    .line 819
    .line 820
    sget-object v7, Landroidx/lifecycle/l;->j:Landroidx/lifecycle/l;

    .line 821
    .line 822
    invoke-virtual {v4, v7}, Landroidx/lifecycle/s;->e(Landroidx/lifecycle/l;)V

    .line 823
    .line 824
    .line 825
    invoke-virtual {v4, v6}, Landroidx/lifecycle/s;->c(Ljava/lang/String;)V

    .line 826
    .line 827
    .line 828
    sget-object v6, Landroidx/lifecycle/l;->k:Landroidx/lifecycle/l;

    .line 829
    .line 830
    invoke-virtual {v4, v6}, Landroidx/lifecycle/s;->e(Landroidx/lifecycle/l;)V

    .line 831
    .line 832
    .line 833
    new-instance v21, Lgg/u;

    .line 834
    .line 835
    invoke-direct/range {v21 .. v21}, Ljava/lang/Object;-><init>()V

    .line 836
    .line 837
    .line 838
    new-instance v16, Lc9/r0;

    .line 839
    .line 840
    const/16 v22, 0x6

    .line 841
    .line 842
    move-object/from16 v17, v1

    .line 843
    .line 844
    move-object/from16 v18, v2

    .line 845
    .line 846
    move-object/from16 v19, v10

    .line 847
    .line 848
    move-object/from16 v20, v13

    .line 849
    .line 850
    invoke-direct/range {v16 .. v22}, Lc9/r0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 851
    .line 852
    .line 853
    move-object/from16 v1, v18

    .line 854
    .line 855
    move-object/from16 v2, v21

    .line 856
    .line 857
    new-instance v4, Ly1/c1;

    .line 858
    .line 859
    invoke-direct {v4, v14}, Ly1/c1;-><init>(Landroid/app/Activity;)V

    .line 860
    .line 861
    .line 862
    invoke-static {v4, v13, v13, v13, v13}, Lx6/d;->H(Landroid/view/View;Landroidx/lifecycle/q;Lu3/c;Lc9/a1;Lc9/a1;)V

    .line 863
    .line 864
    .line 865
    sget-object v6, Ly1/r1;->h:Ly1/r1;

    .line 866
    .line 867
    invoke-virtual {v4, v6}, Ly1/a;->setViewCompositionStrategy(Ly1/k2;)V

    .line 868
    .line 869
    .line 870
    new-instance v12, Lc9/q0;

    .line 871
    .line 872
    const/16 v17, 0x4

    .line 873
    .line 874
    invoke-direct/range {v12 .. v17}, Lc9/q0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 875
    .line 876
    .line 877
    new-instance v6, Ls0/d;

    .line 878
    .line 879
    const v7, -0x6f21f7f8

    .line 880
    .line 881
    .line 882
    invoke-direct {v6, v7, v12, v3}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 883
    .line 884
    .line 885
    invoke-virtual {v4, v6}, Ly1/c1;->setContent(Lfg/p;)V

    .line 886
    .line 887
    .line 888
    iput-object v4, v2, Lgg/u;->g:Ljava/lang/Object;

    .line 889
    .line 890
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 891
    .line 892
    invoke-direct {v2, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 893
    .line 894
    .line 895
    invoke-virtual {v1, v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 896
    .line 897
    .line 898
    invoke-virtual {v10, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 899
    .line 900
    .line 901
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 902
    .line 903
    .line 904
    goto :goto_1e

    .line 905
    :cond_2f
    :goto_1d
    const-string v1, "\u6d88\u606f\u4e0d\u53ef\u4fee\u6539"

    .line 906
    .line 907
    invoke-static {v14, v1}, Lf9/e;->d(Landroid/app/Activity;Ljava/lang/String;)V

    .line 908
    .line 909
    .line 910
    :cond_30
    :goto_1e
    return-void

    .line 911
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
