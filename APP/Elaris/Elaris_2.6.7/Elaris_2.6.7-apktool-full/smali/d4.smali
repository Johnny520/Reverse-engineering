.class public final Ld4;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# virtual methods
.method public final afterHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final beforeHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 13

    .line 1
    const-string p0, "favorite_emoticon_batch_send"

    .line 2
    .line 3
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_26

    .line 8
    .line 9
    if-eqz p1, :cond_26

    .line 10
    .line 11
    iget-object p0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 12
    .line 13
    if-eqz p0, :cond_26

    .line 14
    .line 15
    array-length v0, p0

    .line 16
    if-eqz v0, :cond_26

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    aget-object p0, p0, v0

    .line 20
    .line 21
    instance-of v1, p0, Landroid/view/View;

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    goto/16 :goto_18

    .line 26
    .line 27
    :cond_0
    check-cast p0, Landroid/view/View;

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const/4 v2, 0x0

    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const-string v4, "com.tencent.mobileqq.emoticonview.FavoriteEmoticonInfo"

    .line 46
    .line 47
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    const-string v4, ".FavoriteEmoticonInfo"

    .line 55
    .line 56
    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-nez v4, :cond_4

    .line 61
    .line 62
    const-string v4, "FavoriteEmoticonInfo"

    .line 63
    .line 64
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 65
    .line 66
    .line 67
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    if-eqz v3, :cond_3

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :catchall_0
    :cond_3
    :goto_0
    move-object v1, v2

    .line 72
    :cond_4
    :goto_1
    if-nez v1, :cond_5

    .line 73
    .line 74
    const-string v0, "favorite emoticon batch click blocked without favorite info"

    .line 75
    .line 76
    invoke-static {v0}, Lj4;->u(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const-string v0, "\u672a\u8bc6\u522b\u6536\u85cf\u8868\u60c5\u6570\u636e\uff0c\u5df2\u62e6\u622a\u5355\u72ec\u53d1\u9001"

    .line 80
    .line 81
    invoke-static {p0, v0}, Lj4;->B(Landroid/view/View;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v2}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_5
    iget-object v3, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 89
    .line 90
    if-eqz v3, :cond_25

    .line 91
    .line 92
    sget-boolean v3, Lj4;->i:Z

    .line 93
    .line 94
    if-nez v3, :cond_6

    .line 95
    .line 96
    invoke-static {v1}, Lj4;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    const-string v1, "favorite emoticon batch click blocked without send hook object="

    .line 101
    .line 102
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-static {v0}, Lj4;->u(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    const-string v0, "\u6536\u85cf\u8868\u60c5\u53d1\u9001\u5165\u53e3\u672a\u5c31\u7eea\uff0c\u5df2\u62e6\u622a\u5355\u72ec\u53d1\u9001"

    .line 110
    .line 111
    invoke-static {p0, v0}, Lj4;->B(Landroid/view/View;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto/16 :goto_17

    .line 115
    .line 116
    :cond_6
    invoke-static {p0}, Lj4;->k(Landroid/view/View;)Landroid/widget/EditText;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    if-nez v3, :cond_7

    .line 121
    .line 122
    invoke-static {v1}, Lj4;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    const-string v1, "favorite emoticon batch input not found object="

    .line 127
    .line 128
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-static {v0}, Lj4;->u(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const-string v0, "\u672a\u627e\u5230\u804a\u5929\u8f93\u5165\u6846\uff0c\u5df2\u62e6\u622a\u6536\u85cf\u8868\u60c5\u5355\u72ec\u53d1\u9001"

    .line 136
    .line 137
    invoke-static {p0, v0}, Lj4;->B(Landroid/view/View;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    goto/16 :goto_17

    .line 141
    .line 142
    :cond_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 143
    .line 144
    .line 145
    move-result-wide v4

    .line 146
    sget-wide v6, Lj4;->j:J

    .line 147
    .line 148
    sub-long v6, v4, v6

    .line 149
    .line 150
    const-wide/16 v8, 0x3a98

    .line 151
    .line 152
    cmp-long v6, v6, v8

    .line 153
    .line 154
    if-gez v6, :cond_8

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_8
    sput-wide v4, Lj4;->j:J

    .line 158
    .line 159
    sget-object v6, Lj4;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 160
    .line 161
    invoke-virtual {v6}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    :cond_9
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v7

    .line 173
    if-eqz v7, :cond_b

    .line 174
    .line 175
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    check-cast v7, Ljava/util/Map$Entry;

    .line 180
    .line 181
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v8

    .line 185
    check-cast v8, Li4;

    .line 186
    .line 187
    if-eqz v8, :cond_a

    .line 188
    .line 189
    iget-wide v8, v8, Li4;->e:J

    .line 190
    .line 191
    sub-long v8, v4, v8

    .line 192
    .line 193
    const-wide/32 v10, 0x493e0

    .line 194
    .line 195
    .line 196
    cmp-long v8, v8, v10

    .line 197
    .line 198
    if-lez v8, :cond_9

    .line 199
    .line 200
    :cond_a
    sget-object v8, Lj4;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 201
    .line 202
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    invoke-virtual {v8, v7}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_b
    :goto_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 211
    .line 212
    .line 213
    move-result-wide v4

    .line 214
    const-wide/16 v6, 0x3e8

    .line 215
    .line 216
    mul-long/2addr v4, v6

    .line 217
    sget-wide v8, Lj4;->k:J

    .line 218
    .line 219
    const-wide/16 v10, 0x1

    .line 220
    .line 221
    add-long/2addr v8, v10

    .line 222
    sput-wide v8, Lj4;->k:J

    .line 223
    .line 224
    rem-long/2addr v8, v6

    .line 225
    add-long/2addr v8, v4

    .line 226
    new-instance v4, Ljava/lang/StringBuilder;

    .line 227
    .line 228
    const-string v5, "[ELARIS_FAV:"

    .line 229
    .line 230
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v4, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    const-string v5, "]"

    .line 237
    .line 238
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    const/4 v5, 0x1

    .line 246
    :try_start_1
    invoke-virtual {v3}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    invoke-static {v6}, Li5;->c1(Ljava/lang/CharSequence;)Z

    .line 251
    .line 252
    .line 253
    move-result v6

    .line 254
    if-eqz v6, :cond_c

    .line 255
    .line 256
    goto :goto_5

    .line 257
    :cond_c
    move v6, v0

    .line 258
    move-object v7, v3

    .line 259
    :goto_4
    const/4 v8, 0x3

    .line 260
    if-ge v6, v8, :cond_10

    .line 261
    .line 262
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 263
    .line 264
    .line 265
    move-result-object v7

    .line 266
    instance-of v8, v7, Landroid/view/View;

    .line 267
    .line 268
    if-nez v8, :cond_d

    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_d
    check-cast v7, Landroid/view/View;

    .line 272
    .line 273
    invoke-static {v7, v0}, Li5;->e2(Landroid/view/View;Z)I

    .line 274
    .line 275
    .line 276
    move-result v8

    .line 277
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 278
    .line 279
    .line 280
    move-result-object v9

    .line 281
    const/16 v10, 0x140

    .line 282
    .line 283
    invoke-static {v9, v10}, Li5;->b0(Landroid/content/Context;I)I

    .line 284
    .line 285
    .line 286
    move-result v9

    .line 287
    if-le v8, v9, :cond_e

    .line 288
    .line 289
    goto :goto_6

    .line 290
    :cond_e
    filled-new-array {v0}, [I

    .line 291
    .line 292
    .line 293
    move-result-object v8

    .line 294
    invoke-static {v7, v3, v0, v8}, Li5;->P(Landroid/view/View;Landroid/widget/EditText;I[I)Z

    .line 295
    .line 296
    .line 297
    move-result v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 298
    if-eqz v8, :cond_f

    .line 299
    .line 300
    :goto_5
    move v6, v0

    .line 301
    goto :goto_7

    .line 302
    :cond_f
    add-int/lit8 v6, v6, 0x1

    .line 303
    .line 304
    goto :goto_4

    .line 305
    :catchall_1
    :cond_10
    :goto_6
    move v6, v5

    .line 306
    :goto_7
    if-eqz v6, :cond_1e

    .line 307
    .line 308
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 309
    .line 310
    .line 311
    move-result-object v7

    .line 312
    if-eqz v7, :cond_1e

    .line 313
    .line 314
    const/16 v8, 0x22

    .line 315
    .line 316
    invoke-static {v7, v8}, Li5;->b0(Landroid/content/Context;I)I

    .line 317
    .line 318
    .line 319
    move-result v8

    .line 320
    if-gtz v8, :cond_12

    .line 321
    .line 322
    :cond_11
    :goto_8
    move-object v9, v2

    .line 323
    goto/16 :goto_e

    .line 324
    .line 325
    :cond_12
    invoke-static {p0, v8}, Li5;->q1(Landroid/view/View;I)Landroid/graphics/Bitmap;

    .line 326
    .line 327
    .line 328
    move-result-object v9

    .line 329
    if-eqz v9, :cond_13

    .line 330
    .line 331
    goto/16 :goto_e

    .line 332
    .line 333
    :cond_13
    move-object v9, p0

    .line 334
    :goto_9
    const/4 v10, 0x5

    .line 335
    if-ge v0, v10, :cond_11

    .line 336
    .line 337
    if-eqz v9, :cond_11

    .line 338
    .line 339
    invoke-virtual {v9}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 340
    .line 341
    .line 342
    move-result-object v9

    .line 343
    instance-of v10, v9, Landroid/view/View;

    .line 344
    .line 345
    if-nez v10, :cond_14

    .line 346
    .line 347
    goto :goto_8

    .line 348
    :cond_14
    check-cast v9, Landroid/view/View;

    .line 349
    .line 350
    invoke-static {v9, v8}, Li5;->J0(Landroid/view/View;I)Z

    .line 351
    .line 352
    .line 353
    move-result v10

    .line 354
    if-nez v10, :cond_15

    .line 355
    .line 356
    goto :goto_d

    .line 357
    :cond_15
    if-nez v9, :cond_16

    .line 358
    .line 359
    move-object v10, v2

    .line 360
    goto :goto_a

    .line 361
    :cond_16
    invoke-virtual {v9}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v10

    .line 365
    :goto_a
    if-nez v10, :cond_17

    .line 366
    .line 367
    goto :goto_b

    .line 368
    :cond_17
    :try_start_2
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    move-result-object v11

    .line 372
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v11

    .line 376
    const-string v12, "com.tencent.mobileqq.emoticonview.FavoriteEmoticonInfo"

    .line 377
    .line 378
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v12

    .line 382
    if-eqz v12, :cond_18

    .line 383
    .line 384
    goto :goto_c

    .line 385
    :cond_18
    const-string v12, ".FavoriteEmoticonInfo"

    .line 386
    .line 387
    invoke-virtual {v11, v12}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 388
    .line 389
    .line 390
    move-result v12

    .line 391
    if-nez v12, :cond_1a

    .line 392
    .line 393
    const-string v12, "FavoriteEmoticonInfo"

    .line 394
    .line 395
    invoke-virtual {v11, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 396
    .line 397
    .line 398
    move-result v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 399
    if-eqz v11, :cond_19

    .line 400
    .line 401
    goto :goto_c

    .line 402
    :catchall_2
    :cond_19
    :goto_b
    move-object v10, v2

    .line 403
    :cond_1a
    :goto_c
    if-eqz v10, :cond_1b

    .line 404
    .line 405
    if-eq v10, v1, :cond_1b

    .line 406
    .line 407
    invoke-static {v10}, Li5;->j0(Ljava/lang/Object;)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v10

    .line 411
    invoke-static {v1}, Li5;->j0(Ljava/lang/Object;)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v11

    .line 415
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v10

    .line 419
    if-eqz v10, :cond_1c

    .line 420
    .line 421
    :cond_1b
    invoke-static {v9, v8}, Li5;->q1(Landroid/view/View;I)Landroid/graphics/Bitmap;

    .line 422
    .line 423
    .line 424
    move-result-object v10

    .line 425
    if-eqz v10, :cond_1c

    .line 426
    .line 427
    move-object v9, v10

    .line 428
    goto :goto_e

    .line 429
    :cond_1c
    :goto_d
    add-int/lit8 v0, v0, 0x1

    .line 430
    .line 431
    goto :goto_9

    .line 432
    :goto_e
    if-nez v9, :cond_1d

    .line 433
    .line 434
    goto :goto_f

    .line 435
    :cond_1d
    new-instance v0, Lt4;

    .line 436
    .line 437
    const/4 v10, 0x2

    .line 438
    invoke-static {v7, v10}, Li5;->b0(Landroid/content/Context;I)I

    .line 439
    .line 440
    .line 441
    move-result v7

    .line 442
    invoke-direct {v0, v9, v7, v8}, Lt4;-><init>(Landroid/graphics/Bitmap;II)V

    .line 443
    .line 444
    .line 445
    goto :goto_10

    .line 446
    :cond_1e
    :goto_f
    move-object v0, v2

    .line 447
    :goto_10
    new-instance v7, Li4;

    .line 448
    .line 449
    invoke-direct {v7, v4, v1, v3, v6}, Li4;-><init>(Ljava/lang/String;Ljava/lang/Object;Landroid/widget/EditText;Z)V

    .line 450
    .line 451
    .line 452
    :try_start_3
    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 453
    .line 454
    .line 455
    move-result-object v8

    .line 456
    if-nez v8, :cond_1f

    .line 457
    .line 458
    goto/16 :goto_16

    .line 459
    .line 460
    :cond_1f
    invoke-virtual {v3}, Landroid/widget/TextView;->getSelectionStart()I

    .line 461
    .line 462
    .line 463
    move-result v9

    .line 464
    invoke-virtual {v3}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 465
    .line 466
    .line 467
    move-result v10

    .line 468
    if-ltz v9, :cond_20

    .line 469
    .line 470
    if-gez v10, :cond_21

    .line 471
    .line 472
    :cond_20
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 473
    .line 474
    .line 475
    move-result v9

    .line 476
    move v10, v9

    .line 477
    :cond_21
    invoke-static {v9, v10}, Ljava/lang/Math;->min(II)I

    .line 478
    .line 479
    .line 480
    move-result v11

    .line 481
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    .line 482
    .line 483
    .line 484
    move-result v9

    .line 485
    invoke-static {v3, v4, v1, v6, v0}, Li5;->Y1(Landroid/widget/EditText;Ljava/lang/String;Ljava/lang/Object;ZLt4;)Ljava/lang/CharSequence;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    invoke-interface {v8, v11, v9, v0}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 490
    .line 491
    .line 492
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 497
    .line 498
    .line 499
    move-result v8

    .line 500
    add-int/2addr v11, v8

    .line 501
    invoke-static {v0, v11}, Ljava/lang/Math;->min(II)I

    .line 502
    .line 503
    .line 504
    move-result v0

    .line 505
    invoke-virtual {v3, v0}, Landroid/widget/EditText;->setSelection(I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 506
    .line 507
    .line 508
    sget-object p0, Lj4;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 509
    .line 510
    invoke-virtual {p0, v4, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    const-class v0, Lj4;

    .line 514
    .line 515
    monitor-enter v0

    .line 516
    :try_start_4
    invoke-static {v2}, Lj4;->d(Lg4;)V

    .line 517
    .line 518
    .line 519
    new-instance p0, Lg4;

    .line 520
    .line 521
    invoke-direct {p0, v4, v7}, Lg4;-><init>(Ljava/lang/String;Li4;)V

    .line 522
    .line 523
    .line 524
    sput-object p0, Lj4;->e:Lg4;

    .line 525
    .line 526
    new-instance p1, Lc2;

    .line 527
    .line 528
    invoke-direct {p1, p0, v7, v4, v5}, Lc2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 529
    .line 530
    .line 531
    sput-object p1, Lj4;->g:Lc2;

    .line 532
    .line 533
    sget-object p0, Lj4;->f:Landroid/os/Handler;

    .line 534
    .line 535
    if-eqz p0, :cond_22

    .line 536
    .line 537
    goto :goto_12

    .line 538
    :cond_22
    const-class p0, Lj4;

    .line 539
    .line 540
    monitor-enter p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 541
    :try_start_5
    sget-object v2, Lj4;->f:Landroid/os/Handler;

    .line 542
    .line 543
    if-nez v2, :cond_23

    .line 544
    .line 545
    new-instance v2, Landroid/os/Handler;

    .line 546
    .line 547
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 548
    .line 549
    .line 550
    move-result-object v3

    .line 551
    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 552
    .line 553
    .line 554
    sput-object v2, Lj4;->f:Landroid/os/Handler;

    .line 555
    .line 556
    goto :goto_11

    .line 557
    :catchall_3
    move-exception p1

    .line 558
    goto :goto_14

    .line 559
    :cond_23
    :goto_11
    sget-object v2, Lj4;->f:Landroid/os/Handler;

    .line 560
    .line 561
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 562
    move-object p0, v2

    .line 563
    :goto_12
    const-wide/16 v2, 0x708

    .line 564
    .line 565
    :try_start_6
    invoke-virtual {p0, p1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 566
    .line 567
    .line 568
    monitor-exit v0

    .line 569
    const-string p0, "favorite emoticon batch queued token="

    .line 570
    .line 571
    const-string p1, " preview="

    .line 572
    .line 573
    invoke-static {p0, v4, p1}, La;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    move-result-object p0

    .line 577
    if-eqz v6, :cond_24

    .line 578
    .line 579
    const-string p1, "on"

    .line 580
    .line 581
    goto :goto_13

    .line 582
    :cond_24
    const-string p1, "off"

    .line 583
    .line 584
    :goto_13
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 585
    .line 586
    .line 587
    const-string p1, " object="

    .line 588
    .line 589
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 590
    .line 591
    .line 592
    invoke-static {v1}, Lj4;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object p1

    .line 596
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object p0

    .line 603
    invoke-static {p0}, Lj4;->u(Ljava/lang/String;)V

    .line 604
    .line 605
    .line 606
    goto :goto_18

    .line 607
    :catchall_4
    move-exception p0

    .line 608
    goto :goto_15

    .line 609
    :goto_14
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 610
    :try_start_8
    throw p1

    .line 611
    :goto_15
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 612
    throw p0

    .line 613
    :catchall_5
    move-exception v0

    .line 614
    new-instance v1, Ljava/lang/StringBuilder;

    .line 615
    .line 616
    const-string v3, "favorite emoticon batch insert token failed: "

    .line 617
    .line 618
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 622
    .line 623
    .line 624
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    invoke-static {v0}, Lj4;->u(Ljava/lang/String;)V

    .line 629
    .line 630
    .line 631
    :goto_16
    const-string v0, "\u6536\u85cf\u8868\u60c5\u5360\u4f4d\u5931\u8d25\uff0c\u5df2\u62e6\u622a\u5355\u72ec\u53d1\u9001"

    .line 632
    .line 633
    invoke-static {p0, v0}, Lj4;->B(Landroid/view/View;Ljava/lang/String;)V

    .line 634
    .line 635
    .line 636
    goto :goto_17

    .line 637
    :cond_25
    const-string v0, "favorite emoticon batch click blocked invalid state"

    .line 638
    .line 639
    invoke-static {v0}, Lj4;->u(Ljava/lang/String;)V

    .line 640
    .line 641
    .line 642
    const-string v0, "\u6536\u85cf\u8868\u60c5\u6279\u91cf\u53d1\u9001\u672a\u5c31\u7eea\uff0c\u5df2\u62e6\u622a\u5355\u72ec\u53d1\u9001"

    .line 643
    .line 644
    invoke-static {p0, v0}, Lj4;->B(Landroid/view/View;Ljava/lang/String;)V

    .line 645
    .line 646
    .line 647
    :goto_17
    invoke-virtual {p1, v2}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 648
    .line 649
    .line 650
    :cond_26
    :goto_18
    return-void
.end method
