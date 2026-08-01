.class public abstract Lv4;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# direct methods
.method public static A(Ljava/lang/ClassLoader;)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v0, Lxd;->a:[Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 8
    .line 9
    sget-object v4, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    const-string v0, "updateNum"

    .line 12
    .line 13
    const-string v5, "target.unread_full.qui_badge_class"

    .line 14
    .line 15
    const/4 v6, 0x1

    .line 16
    :try_start_0
    const-string v8, "com.tencent.mobileqq.quibadge.QUIBadge"

    .line 17
    .line 18
    invoke-static {v1, v5, v8}, Lt2;->i(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v8

    .line 22
    if-nez v8, :cond_0

    .line 23
    .line 24
    move-object/from16 v18, v2

    .line 25
    .line 26
    const/4 v12, 0x0

    .line 27
    :goto_0
    const/16 v16, 0x0

    .line 28
    .line 29
    goto/16 :goto_7

    .line 30
    .line 31
    :cond_0
    invoke-virtual {v8}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 32
    .line 33
    .line 34
    move-result-object v9

    .line 35
    array-length v10, v9

    .line 36
    const/4 v11, 0x0

    .line 37
    const/4 v12, 0x0

    .line 38
    :goto_1
    if-ge v11, v10, :cond_6

    .line 39
    .line 40
    aget-object v13, v9, v11

    .line 41
    .line 42
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v14

    .line 46
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 50
    const/16 v16, 0x0

    .line 51
    .line 52
    :try_start_1
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    if-ne v7, v4, :cond_4

    .line 57
    .line 58
    array-length v7, v14

    .line 59
    if-ne v7, v6, :cond_4

    .line 60
    .line 61
    aget-object v7, v14, v16

    .line 62
    .line 63
    if-ne v7, v3, :cond_4

    .line 64
    .line 65
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-nez v7, :cond_4

    .line 74
    .line 75
    if-nez v15, :cond_1

    .line 76
    .line 77
    move-object v7, v2

    .line 78
    goto :goto_2

    .line 79
    :cond_1
    invoke-virtual {v15}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    :goto_2
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 87
    const-string v6, "updatenum"

    .line 88
    .line 89
    move-object/from16 v18, v2

    .line 90
    .line 91
    const-string v2, "w"

    .line 92
    .line 93
    if-nez v14, :cond_2

    .line 94
    .line 95
    :try_start_2
    const-string v14, "setNum"

    .line 96
    .line 97
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v14

    .line 101
    if-nez v14, :cond_2

    .line 102
    .line 103
    const-string v14, "setGrayNum"

    .line 104
    .line 105
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v14

    .line 109
    if-nez v14, :cond_2

    .line 110
    .line 111
    invoke-virtual {v2, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v14

    .line 115
    if-nez v14, :cond_2

    .line 116
    .line 117
    invoke-virtual {v7, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 118
    .line 119
    .line 120
    move-result v14

    .line 121
    if-nez v14, :cond_2

    .line 122
    .line 123
    const-string v14, "setnum"

    .line 124
    .line 125
    invoke-virtual {v7, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 126
    .line 127
    .line 128
    move-result v14

    .line 129
    if-nez v14, :cond_2

    .line 130
    .line 131
    const-string v14, "setgraynum"

    .line 132
    .line 133
    invoke-virtual {v7, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 134
    .line 135
    .line 136
    move-result v14

    .line 137
    if-eqz v14, :cond_5

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :catchall_0
    move-exception v0

    .line 141
    goto :goto_6

    .line 142
    :cond_2
    :goto_3
    invoke-static {v13}, Lxd;->e(Ljava/lang/reflect/Method;)Z

    .line 143
    .line 144
    .line 145
    move-result v14

    .line 146
    if-eqz v14, :cond_5

    .line 147
    .line 148
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v14

    .line 152
    if-nez v14, :cond_3

    .line 153
    .line 154
    invoke-virtual {v2, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-nez v2, :cond_3

    .line 159
    .line 160
    invoke-virtual {v7, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-nez v2, :cond_3

    .line 165
    .line 166
    move/from16 v2, v16

    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_3
    const/4 v2, 0x1

    .line 170
    :goto_4
    new-instance v6, Lud;

    .line 171
    .line 172
    invoke-direct {v6, v2}, Lud;-><init>(Z)V

    .line 173
    .line 174
    .line 175
    invoke-static {v13, v6}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 176
    .line 177
    .line 178
    add-int/lit8 v12, v12, 0x1

    .line 179
    .line 180
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-static {v5, v2}, Lt2;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    new-instance v2, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 190
    .line 191
    .line 192
    const-string v6, "hooked QUIBadge full unread count: "

    .line 193
    .line 194
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-static {v13}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-static {v2}, Lv4;->C(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 209
    .line 210
    .line 211
    goto :goto_5

    .line 212
    :catchall_1
    move-exception v0

    .line 213
    move-object/from16 v18, v2

    .line 214
    .line 215
    goto :goto_6

    .line 216
    :cond_4
    move-object/from16 v18, v2

    .line 217
    .line 218
    :cond_5
    :goto_5
    add-int/lit8 v11, v11, 0x1

    .line 219
    .line 220
    move-object/from16 v2, v18

    .line 221
    .line 222
    const/4 v6, 0x1

    .line 223
    goto/16 :goto_1

    .line 224
    .line 225
    :catchall_2
    move-exception v0

    .line 226
    move-object/from16 v18, v2

    .line 227
    .line 228
    const/16 v16, 0x0

    .line 229
    .line 230
    goto :goto_6

    .line 231
    :cond_6
    move-object/from16 v18, v2

    .line 232
    .line 233
    goto/16 :goto_0

    .line 234
    .line 235
    :goto_6
    const-string v2, "hookQUIBadgeUnreadFull failed: "

    .line 236
    .line 237
    invoke-static {v2, v0}, La;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 238
    .line 239
    .line 240
    move/from16 v12, v16

    .line 241
    .line 242
    :goto_7
    sget-object v0, Lxd;->c:[Ljava/lang/String;

    .line 243
    .line 244
    const-string v2, "target.unread_full.rolling_text_classes"

    .line 245
    .line 246
    invoke-static {v2, v0, v1}, Lt2;->f(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/ClassLoader;)[Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    move/from16 v6, v16

    .line 251
    .line 252
    move v7, v6

    .line 253
    :goto_8
    array-length v0, v5

    .line 254
    const-string v8, ": "

    .line 255
    .line 256
    if-ge v6, v0, :cond_f

    .line 257
    .line 258
    aget-object v9, v5, v6

    .line 259
    .line 260
    :try_start_3
    invoke-static {v1, v9}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    if-eqz v0, :cond_e

    .line 265
    .line 266
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 267
    .line 268
    .line 269
    move-result-object v10

    .line 270
    array-length v11, v10
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_7

    .line 271
    move/from16 v13, v16

    .line 272
    .line 273
    :goto_9
    if-ge v13, v11, :cond_d

    .line 274
    .line 275
    :try_start_4
    aget-object v14, v10, v13

    .line 276
    .line 277
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 278
    .line 279
    .line 280
    move-result v15

    .line 281
    invoke-static {v15}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 282
    .line 283
    .line 284
    move-result v15

    .line 285
    if-nez v15, :cond_b

    .line 286
    .line 287
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    move-result-object v15

    .line 291
    if-ne v15, v4, :cond_b

    .line 292
    .line 293
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    move-result-object v15

    .line 297
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v19

    .line 301
    if-nez v19, :cond_7

    .line 302
    .line 303
    move-object/from16 v20, v5

    .line 304
    .line 305
    move-object/from16 v5, v18

    .line 306
    .line 307
    :goto_a
    move/from16 v19, v6

    .line 308
    .line 309
    goto :goto_b

    .line 310
    :cond_7
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v19

    .line 314
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v19
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    .line 318
    move-object/from16 v20, v5

    .line 319
    .line 320
    move-object/from16 v5, v19

    .line 321
    .line 322
    goto :goto_a

    .line 323
    :goto_b
    :try_start_5
    array-length v6, v15
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 324
    move/from16 v21, v7

    .line 325
    .line 326
    const/4 v7, 0x1

    .line 327
    if-ne v6, v7, :cond_a

    .line 328
    .line 329
    :try_start_6
    aget-object v6, v15, v16

    .line 330
    .line 331
    if-eq v6, v3, :cond_8

    .line 332
    .line 333
    const-class v7, Ljava/lang/Integer;

    .line 334
    .line 335
    if-ne v6, v7, :cond_a

    .line 336
    .line 337
    goto :goto_c

    .line 338
    :catchall_3
    move-exception v0

    .line 339
    move/from16 v7, v21

    .line 340
    .line 341
    goto/16 :goto_f

    .line 342
    .line 343
    :cond_8
    :goto_c
    const-string v6, "num"

    .line 344
    .line 345
    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 346
    .line 347
    .line 348
    move-result v6

    .line 349
    if-nez v6, :cond_9

    .line 350
    .line 351
    const-string v6, "count"

    .line 352
    .line 353
    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 354
    .line 355
    .line 356
    move-result v6

    .line 357
    if-nez v6, :cond_9

    .line 358
    .line 359
    const-string v6, "unread"

    .line 360
    .line 361
    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 362
    .line 363
    .line 364
    move-result v6

    .line 365
    if-nez v6, :cond_9

    .line 366
    .line 367
    const-string v6, "settext"

    .line 368
    .line 369
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v5

    .line 373
    if-eqz v5, :cond_a

    .line 374
    .line 375
    :cond_9
    invoke-static {v14}, Lxd;->e(Ljava/lang/reflect/Method;)Z

    .line 376
    .line 377
    .line 378
    move-result v5

    .line 379
    if-eqz v5, :cond_c

    .line 380
    .line 381
    new-instance v5, Lvd;

    .line 382
    .line 383
    const/16 v6, 0x37

    .line 384
    .line 385
    invoke-direct {v5, v6}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 386
    .line 387
    .line 388
    invoke-static {v14, v5}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 389
    .line 390
    .line 391
    add-int/lit8 v7, v21, 0x1

    .line 392
    .line 393
    :try_start_7
    invoke-static {v2, v0}, Lxd;->b(Ljava/lang/String;Ljava/lang/Class;)V

    .line 394
    .line 395
    .line 396
    new-instance v5, Ljava/lang/StringBuilder;

    .line 397
    .line 398
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 399
    .line 400
    .line 401
    const-string v6, "hooked RollingTextView full unread count int: "

    .line 402
    .line 403
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    invoke-static {v14}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v6

    .line 410
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v5

    .line 417
    invoke-static {v5}, Lv4;->C(Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 418
    .line 419
    .line 420
    goto :goto_e

    .line 421
    :catchall_4
    move-exception v0

    .line 422
    goto :goto_f

    .line 423
    :cond_a
    :try_start_8
    array-length v5, v15

    .line 424
    if-lez v5, :cond_c

    .line 425
    .line 426
    const-class v5, Ljava/lang/CharSequence;

    .line 427
    .line 428
    aget-object v6, v15, v16

    .line 429
    .line 430
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 431
    .line 432
    .line 433
    move-result v5

    .line 434
    if-eqz v5, :cond_c

    .line 435
    .line 436
    invoke-static {v14}, Lxd;->e(Ljava/lang/reflect/Method;)Z

    .line 437
    .line 438
    .line 439
    move-result v5

    .line 440
    if-eqz v5, :cond_c

    .line 441
    .line 442
    new-instance v5, Lwd;

    .line 443
    .line 444
    const/16 v6, 0x2d

    .line 445
    .line 446
    invoke-direct {v5, v6}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 447
    .line 448
    .line 449
    invoke-static {v14, v5}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 450
    .line 451
    .line 452
    add-int/lit8 v7, v21, 0x1

    .line 453
    .line 454
    :try_start_9
    invoke-static {v2, v0}, Lxd;->b(Ljava/lang/String;Ljava/lang/Class;)V

    .line 455
    .line 456
    .line 457
    new-instance v5, Ljava/lang/StringBuilder;

    .line 458
    .line 459
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 460
    .line 461
    .line 462
    const-string v6, "hooked RollingTextView full unread count text: "

    .line 463
    .line 464
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    .line 467
    invoke-static {v14}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v6

    .line 471
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v5

    .line 478
    invoke-static {v5}, Lv4;->C(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 479
    .line 480
    .line 481
    goto :goto_e

    .line 482
    :catchall_5
    move-exception v0

    .line 483
    :goto_d
    move/from16 v21, v7

    .line 484
    .line 485
    goto :goto_f

    .line 486
    :catchall_6
    move-exception v0

    .line 487
    move-object/from16 v20, v5

    .line 488
    .line 489
    move/from16 v19, v6

    .line 490
    .line 491
    goto :goto_d

    .line 492
    :cond_b
    move-object/from16 v20, v5

    .line 493
    .line 494
    move/from16 v19, v6

    .line 495
    .line 496
    move/from16 v21, v7

    .line 497
    .line 498
    :cond_c
    move/from16 v7, v21

    .line 499
    .line 500
    :goto_e
    add-int/lit8 v13, v13, 0x1

    .line 501
    .line 502
    move/from16 v6, v19

    .line 503
    .line 504
    move-object/from16 v5, v20

    .line 505
    .line 506
    goto/16 :goto_9

    .line 507
    .line 508
    :cond_d
    move/from16 v21, v7

    .line 509
    .line 510
    :cond_e
    move-object/from16 v20, v5

    .line 511
    .line 512
    move/from16 v19, v6

    .line 513
    .line 514
    goto :goto_10

    .line 515
    :catchall_7
    move-exception v0

    .line 516
    move-object/from16 v20, v5

    .line 517
    .line 518
    move/from16 v19, v6

    .line 519
    .line 520
    :goto_f
    new-instance v5, Ljava/lang/StringBuilder;

    .line 521
    .line 522
    const-string v6, "hookRollingTextViewUnreadFull failed "

    .line 523
    .line 524
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V

    .line 541
    .line 542
    .line 543
    :goto_10
    add-int/lit8 v6, v19, 0x1

    .line 544
    .line 545
    move-object/from16 v5, v20

    .line 546
    .line 547
    goto/16 :goto_8

    .line 548
    .line 549
    :cond_f
    add-int/2addr v12, v7

    .line 550
    sget-object v0, Lxd;->b:[Ljava/lang/String;

    .line 551
    .line 552
    const-string v2, "target.unread_full.mini_widget_classes"

    .line 553
    .line 554
    invoke-static {v2, v0, v1}, Lt2;->f(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/ClassLoader;)[Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object v5

    .line 558
    array-length v6, v5

    .line 559
    move/from16 v7, v16

    .line 560
    .line 561
    move v9, v7

    .line 562
    :goto_11
    if-ge v7, v6, :cond_14

    .line 563
    .line 564
    aget-object v10, v5, v7

    .line 565
    .line 566
    :try_start_a
    invoke-static {v1, v10}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    if-nez v0, :cond_10

    .line 571
    .line 572
    goto :goto_15

    .line 573
    :cond_10
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 574
    .line 575
    .line 576
    move-result-object v11

    .line 577
    array-length v13, v11

    .line 578
    move/from16 v14, v16

    .line 579
    .line 580
    :goto_12
    if-ge v14, v13, :cond_13

    .line 581
    .line 582
    aget-object v15, v11, v14

    .line 583
    .line 584
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 585
    .line 586
    .line 587
    move-result v18

    .line 588
    invoke-static/range {v18 .. v18}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 589
    .line 590
    .line 591
    move-result v18

    .line 592
    if-nez v18, :cond_12

    .line 593
    .line 594
    invoke-static {v10, v15}, Lxd;->d(Ljava/lang/String;Ljava/lang/reflect/Method;)I

    .line 595
    .line 596
    .line 597
    move-result v15

    .line 598
    if-lez v15, :cond_11

    .line 599
    .line 600
    invoke-static {v2, v0}, Lxd;->b(Ljava/lang/String;Ljava/lang/Class;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 601
    .line 602
    .line 603
    goto :goto_13

    .line 604
    :catchall_8
    move-exception v0

    .line 605
    goto :goto_14

    .line 606
    :cond_11
    :goto_13
    add-int/2addr v9, v15

    .line 607
    :cond_12
    add-int/lit8 v14, v14, 0x1

    .line 608
    .line 609
    goto :goto_12

    .line 610
    :goto_14
    new-instance v11, Ljava/lang/StringBuilder;

    .line 611
    .line 612
    const-string v13, "hookMiniWidgetUnreadFull failed "

    .line 613
    .line 614
    invoke-direct {v11, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 615
    .line 616
    .line 617
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 618
    .line 619
    .line 620
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 624
    .line 625
    .line 626
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V

    .line 631
    .line 632
    .line 633
    :cond_13
    :goto_15
    add-int/lit8 v7, v7, 0x1

    .line 634
    .line 635
    goto :goto_11

    .line 636
    :cond_14
    add-int/2addr v12, v9

    .line 637
    sget-object v0, Lxd;->a:[Ljava/lang/String;

    .line 638
    .line 639
    const-string v2, "target.unread_full.mini_aio_classes"

    .line 640
    .line 641
    invoke-static {v2, v0, v1}, Lt2;->f(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/ClassLoader;)[Ljava/lang/String;

    .line 642
    .line 643
    .line 644
    move-result-object v5

    .line 645
    move/from16 v6, v16

    .line 646
    .line 647
    move v7, v6

    .line 648
    :goto_16
    array-length v0, v5

    .line 649
    if-ge v6, v0, :cond_18

    .line 650
    .line 651
    aget-object v9, v5, v6

    .line 652
    .line 653
    :try_start_b
    invoke-static {v1, v9}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    if-eqz v0, :cond_17

    .line 658
    .line 659
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 660
    .line 661
    .line 662
    move-result-object v10

    .line 663
    array-length v11, v10

    .line 664
    move/from16 v13, v16

    .line 665
    .line 666
    :goto_17
    if-ge v13, v11, :cond_17

    .line 667
    .line 668
    aget-object v14, v10, v13

    .line 669
    .line 670
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 671
    .line 672
    .line 673
    move-result-object v15

    .line 674
    const-string v1, "updateUnreadCount"
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    .line 675
    .line 676
    move-object/from16 v18, v5

    .line 677
    .line 678
    :try_start_c
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v5

    .line 682
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 683
    .line 684
    .line 685
    move-result v1

    .line 686
    if-eqz v1, :cond_15

    .line 687
    .line 688
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 689
    .line 690
    .line 691
    move-result-object v1

    .line 692
    if-ne v1, v4, :cond_15

    .line 693
    .line 694
    array-length v1, v15

    .line 695
    const/4 v5, 0x2

    .line 696
    if-ne v1, v5, :cond_15

    .line 697
    .line 698
    aget-object v1, v15, v16
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_a

    .line 699
    .line 700
    if-ne v1, v3, :cond_15

    .line 701
    .line 702
    const/16 v17, 0x1

    .line 703
    .line 704
    :try_start_d
    aget-object v1, v15, v17

    .line 705
    .line 706
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 707
    .line 708
    if-ne v1, v5, :cond_16

    .line 709
    .line 710
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 711
    .line 712
    .line 713
    move-result v1

    .line 714
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 715
    .line 716
    .line 717
    move-result v1

    .line 718
    if-nez v1, :cond_16

    .line 719
    .line 720
    invoke-static {v14}, Lxd;->e(Ljava/lang/reflect/Method;)Z

    .line 721
    .line 722
    .line 723
    move-result v1

    .line 724
    if-eqz v1, :cond_16

    .line 725
    .line 726
    new-instance v1, Lrd;

    .line 727
    .line 728
    const/16 v5, 0x32

    .line 729
    .line 730
    invoke-direct {v1, v5}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 731
    .line 732
    .line 733
    invoke-static {v14, v1}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 734
    .line 735
    .line 736
    add-int/lit8 v7, v7, 0x1

    .line 737
    .line 738
    invoke-static {v2, v0}, Lxd;->b(Ljava/lang/String;Ljava/lang/Class;)V

    .line 739
    .line 740
    .line 741
    new-instance v1, Ljava/lang/StringBuilder;

    .line 742
    .line 743
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 744
    .line 745
    .line 746
    const-string v5, "hooked miniAIO full unread count: "

    .line 747
    .line 748
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 749
    .line 750
    .line 751
    invoke-static {v14}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 752
    .line 753
    .line 754
    move-result-object v5

    .line 755
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 756
    .line 757
    .line 758
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 759
    .line 760
    .line 761
    move-result-object v1

    .line 762
    invoke-static {v1}, Lv4;->C(Ljava/lang/String;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_9

    .line 763
    .line 764
    .line 765
    goto :goto_19

    .line 766
    :catchall_9
    move-exception v0

    .line 767
    goto :goto_1a

    .line 768
    :cond_15
    const/16 v17, 0x1

    .line 769
    .line 770
    goto :goto_19

    .line 771
    :catchall_a
    move-exception v0

    .line 772
    :goto_18
    const/16 v17, 0x1

    .line 773
    .line 774
    goto :goto_1a

    .line 775
    :cond_16
    :goto_19
    add-int/lit8 v13, v13, 0x1

    .line 776
    .line 777
    move-object/from16 v1, p0

    .line 778
    .line 779
    move-object/from16 v5, v18

    .line 780
    .line 781
    goto :goto_17

    .line 782
    :catchall_b
    move-exception v0

    .line 783
    move-object/from16 v18, v5

    .line 784
    .line 785
    goto :goto_18

    .line 786
    :cond_17
    move-object/from16 v18, v5

    .line 787
    .line 788
    const/16 v17, 0x1

    .line 789
    .line 790
    goto :goto_1b

    .line 791
    :goto_1a
    new-instance v1, Ljava/lang/StringBuilder;

    .line 792
    .line 793
    const-string v5, "hookMiniAioUnreadFull failed "

    .line 794
    .line 795
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 796
    .line 797
    .line 798
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 799
    .line 800
    .line 801
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 802
    .line 803
    .line 804
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 805
    .line 806
    .line 807
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 808
    .line 809
    .line 810
    move-result-object v0

    .line 811
    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V

    .line 812
    .line 813
    .line 814
    :goto_1b
    add-int/lit8 v6, v6, 0x1

    .line 815
    .line 816
    move-object/from16 v1, p0

    .line 817
    .line 818
    move-object/from16 v5, v18

    .line 819
    .line 820
    goto/16 :goto_16

    .line 821
    .line 822
    :cond_18
    add-int/2addr v12, v7

    .line 823
    new-instance v0, Ljava/lang/StringBuilder;

    .line 824
    .line 825
    const-string v1, "early full unread count hooks installed count="

    .line 826
    .line 827
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 828
    .line 829
    .line 830
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 831
    .line 832
    .line 833
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 834
    .line 835
    .line 836
    move-result-object v0

    .line 837
    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V

    .line 838
    .line 839
    .line 840
    return-void
.end method

.method public static B()V
    .locals 9

    .line 1
    const-string v0, "web redirect guards installed count="

    .line 2
    .line 3
    sget-boolean v1, Lxe;->a:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v1, 0x1

    .line 9
    sput-boolean v1, Lxe;->a:Z

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :try_start_0
    const-class v2, Landroid/app/Instrumentation;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    array-length v3, v2

    .line 19
    move v4, v1

    .line 20
    move v5, v4

    .line 21
    :goto_0
    if-ge v4, v3, :cond_2

    .line 22
    .line 23
    aget-object v6, v2, v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 24
    .line 25
    :try_start_1
    const-string v7, "execStartActivity"

    .line 26
    .line 27
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    if-eqz v7, :cond_1

    .line 36
    .line 37
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    if-nez v7, :cond_1

    .line 46
    .line 47
    const-class v7, Landroid/content/Intent;

    .line 48
    .line 49
    invoke-static {v6, v7}, Lv4;->m(Ljava/lang/reflect/Method;Ljava/lang/Class;)I

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-ltz v7, :cond_1

    .line 54
    .line 55
    new-instance v7, Lwe;

    .line 56
    .line 57
    const/16 v8, 0x3c

    .line 58
    .line 59
    invoke-direct {v7, v8}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-static {v6, v7}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 63
    .line 64
    .line 65
    add-int/lit8 v5, v5, 0x1

    .line 66
    .line 67
    new-instance v7, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    const-string v8, "hooked web redirect guards: "

    .line 73
    .line 74
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-static {v6}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    invoke-static {v6}, Lv4;->C(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :catchall_0
    move-exception v6

    .line 93
    :try_start_2
    new-instance v7, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    const-string v8, "hookWebRedirectGuards instrumentation failed: "

    .line 99
    .line 100
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    invoke-static {v6}, Lv4;->C(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    new-instance v6, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    invoke-static {v6}, Lv4;->C(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 129
    .line 130
    .line 131
    :cond_1
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_2
    move v1, v5

    .line 135
    :catchall_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    return-void
.end method

.method public static C(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->shouldLogMessage(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "Elaris: "

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Lcom/mr/elaris/xposedcompat/XposedBridge;->log(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public static D(Ljava/lang/String;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, ".apk"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    const-string v0, ".apk.1"

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    const-string v0, ".apk?"

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 36
    return p0

    .line 37
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 38
    return p0
.end method

.method public static E(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, "."

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method

.method public static F(Landroid/view/View;II)V
    .locals 4

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    if-lez p1, :cond_3

    .line 4
    .line 5
    if-gez p2, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    instance-of v0, p0, Landroid/widget/TextView;

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    move-object v0, p0

    .line 13
    check-cast v0, Landroid/widget/TextView;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v1}, Li5;->E0(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    invoke-static {v0}, Li5;->y0(Landroid/view/View;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    :cond_1
    invoke-static {v0, p1}, Lxd;->f(Landroid/widget/TextView;I)V

    .line 32
    .line 33
    .line 34
    :cond_2
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 35
    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    check-cast p0, Landroid/view/ViewGroup;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/16 v1, 0x18

    .line 45
    .line 46
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    const/4 v1, 0x0

    .line 51
    :goto_0
    if-ge v1, v0, :cond_3

    .line 52
    .line 53
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    add-int/lit8 v3, p2, -0x1

    .line 58
    .line 59
    invoke-static {v2, p1, v3}, Lv4;->F(Landroid/view/View;II)V

    .line 60
    .line 61
    .line 62
    add-int/lit8 v1, v1, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    :goto_1
    return-void
.end method

.method public static G(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;Ljava/lang/Class;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_9

    .line 3
    .line 4
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 5
    .line 6
    if-ne p1, v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    if-ne p1, v1, :cond_1

    .line 12
    .line 13
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    if-ne p1, v1, :cond_2

    .line 23
    .line 24
    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 33
    .line 34
    if-ne p1, v1, :cond_3

    .line 35
    .line 36
    invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_3
    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 45
    .line 46
    if-ne p1, v1, :cond_4

    .line 47
    .line 48
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_4
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 57
    .line 58
    if-ne p1, v1, :cond_5

    .line 59
    .line 60
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_5
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 69
    .line 70
    if-ne p1, v1, :cond_6

    .line 71
    .line 72
    const-wide/16 v0, 0x0

    .line 73
    .line 74
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_6
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 83
    .line 84
    if-ne p1, v1, :cond_7

    .line 85
    .line 86
    const/4 p1, 0x0

    .line 87
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_7
    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 96
    .line 97
    if-ne p1, v1, :cond_8

    .line 98
    .line 99
    const-wide/16 v0, 0x0

    .line 100
    .line 101
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_8
    invoke-virtual {p0, v0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_9
    :goto_0
    invoke-virtual {p0, v0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    return-void
.end method

.method public static H(Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string p1, ""

    .line 4
    .line 5
    :cond_0
    const-string v0, "aio"

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_2

    .line 12
    .line 13
    const-string v1, "contact"

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_2

    .line 20
    .line 21
    const-string v2, "peer"

    .line 22
    .line 23
    invoke-virtual {p1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_2

    .line 28
    .line 29
    const-string v2, "uin"

    .line 30
    .line 31
    invoke-virtual {p1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_2

    .line 36
    .line 37
    const-string v2, "uid"

    .line 38
    .line 39
    invoke-virtual {p1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-nez v2, :cond_2

    .line 44
    .line 45
    const-string v2, "troop"

    .line 46
    .line 47
    invoke-virtual {p1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-nez v3, :cond_2

    .line 52
    .line 53
    const-string v3, "group"

    .line 54
    .line 55
    invoke-virtual {p1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-nez v4, :cond_2

    .line 60
    .line 61
    const-string v4, "guild"

    .line 62
    .line 63
    invoke-virtual {p1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-nez p1, :cond_2

    .line 68
    .line 69
    const/4 p1, 0x0

    .line 70
    if-nez p0, :cond_1

    .line 71
    .line 72
    return p1

    .line 73
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_2

    .line 90
    .line 91
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_2

    .line 96
    .line 97
    invoke-virtual {p0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_2

    .line 102
    .line 103
    invoke-virtual {p0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-nez v0, :cond_2

    .line 108
    .line 109
    invoke-virtual {p0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    if-nez p0, :cond_2

    .line 114
    .line 115
    return p1

    .line 116
    :cond_2
    const/4 p0, 0x1

    .line 117
    return p0
.end method

.method public static a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    .line 3
    .line 4
    const-string p1, " trace"

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p1, "\nprocess="

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p1, "unknown"

    .line 15
    .line 16
    :try_start_0
    invoke-static {}, Landroid/app/Application;->getProcessName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    if-lez v1, :cond_0

    .line 27
    .line 28
    move-object p1, v0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    :cond_0
    :try_start_1
    const-string v0, "android.app.ActivityThread"

    .line 31
    .line 32
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "currentProcessName"

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const/4 v1, 0x1

    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 57
    :catchall_1
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string p1, "\nthread="

    .line 61
    .line 62
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string p1, "\nhook="

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 v0, 0x3f

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-ltz v0, :cond_1

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :cond_1
    const/16 v0, 0x2f

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/16 v1, 0x5c

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-ltz v0, :cond_2

    .line 36
    .line 37
    add-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :cond_2
    return-object p0
.end method

.method public static c(Ljava/lang/Object;ILjava/util/Set;[I)Ljava/lang/String;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    const-string v4, ""

    .line 10
    .line 11
    if-eqz v0, :cond_10

    .line 12
    .line 13
    const/4 v5, 0x3

    .line 14
    if-gt v1, v5, :cond_10

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    aget v6, v3, v5

    .line 18
    .line 19
    const/16 v7, 0xc

    .line 20
    .line 21
    if-lt v6, v7, :cond_0

    .line 22
    .line 23
    goto/16 :goto_8

    .line 24
    .line 25
    :cond_0
    instance-of v8, v0, Ljava/lang/CharSequence;

    .line 26
    .line 27
    const/4 v9, 0x1

    .line 28
    if-nez v8, :cond_1

    .line 29
    .line 30
    instance-of v8, v0, Ljava/lang/Number;

    .line 31
    .line 32
    if-nez v8, :cond_1

    .line 33
    .line 34
    instance-of v8, v0, Ljava/lang/Boolean;

    .line 35
    .line 36
    if-nez v8, :cond_1

    .line 37
    .line 38
    instance-of v8, v0, Ljava/lang/Enum;

    .line 39
    .line 40
    if-eqz v8, :cond_2

    .line 41
    .line 42
    :cond_1
    move/from16 v16, v9

    .line 43
    .line 44
    goto/16 :goto_7

    .line 45
    .line 46
    :cond_2
    if-eqz v2, :cond_3

    .line 47
    .line 48
    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-nez v6, :cond_3

    .line 53
    .line 54
    goto/16 :goto_8

    .line 55
    .line 56
    :cond_3
    new-instance v6, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    const-string v11, "aio"

    .line 74
    .line 75
    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 76
    .line 77
    .line 78
    move-result v10

    .line 79
    if-nez v10, :cond_4

    .line 80
    .line 81
    invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v10

    .line 85
    const-string v11, "contact"

    .line 86
    .line 87
    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 88
    .line 89
    .line 90
    move-result v10

    .line 91
    if-nez v10, :cond_4

    .line 92
    .line 93
    invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    const-string v11, "troop"

    .line 98
    .line 99
    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 100
    .line 101
    .line 102
    move-result v10

    .line 103
    if-nez v10, :cond_4

    .line 104
    .line 105
    invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    const-string v11, "group"

    .line 110
    .line 111
    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 112
    .line 113
    .line 114
    move-result v10

    .line 115
    if-eqz v10, :cond_5

    .line 116
    .line 117
    :cond_4
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const/16 v8, 0x7b

    .line 121
    .line 122
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-static {v0}, Li5;->R1(Ljava/lang/Object;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const/16 v8, 0x7d

    .line 133
    .line 134
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    aget v8, v3, v5

    .line 138
    .line 139
    add-int/2addr v8, v9

    .line 140
    aput v8, v3, v5

    .line 141
    .line 142
    :cond_5
    instance-of v8, v0, Landroid/view/View;

    .line 143
    .line 144
    if-eqz v8, :cond_6

    .line 145
    .line 146
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    return-object v0

    .line 151
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    move-result-object v8

    .line 155
    :goto_0
    if-eqz v8, :cond_f

    .line 156
    .line 157
    const-class v10, Ljava/lang/Object;

    .line 158
    .line 159
    if-eq v8, v10, :cond_f

    .line 160
    .line 161
    aget v10, v3, v5

    .line 162
    .line 163
    if-ge v10, v7, :cond_f

    .line 164
    .line 165
    invoke-virtual {v8}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    array-length v11, v10

    .line 170
    move v12, v5

    .line 171
    :goto_1
    if-lt v12, v11, :cond_7

    .line 172
    .line 173
    move/from16 v16, v9

    .line 174
    .line 175
    goto/16 :goto_5

    .line 176
    .line 177
    :cond_7
    aget-object v13, v10, v12

    .line 178
    .line 179
    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 180
    .line 181
    .line 182
    move-result v14

    .line 183
    invoke-static {v14}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 184
    .line 185
    .line 186
    move-result v14

    .line 187
    if-eqz v14, :cond_9

    .line 188
    .line 189
    :catchall_0
    :cond_8
    move/from16 v16, v9

    .line 190
    .line 191
    goto/16 :goto_6

    .line 192
    .line 193
    :cond_9
    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v14

    .line 197
    if-nez v14, :cond_a

    .line 198
    .line 199
    move-object v14, v4

    .line 200
    goto :goto_2

    .line 201
    :cond_a
    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v14

    .line 205
    invoke-virtual {v14}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v14

    .line 209
    :goto_2
    const/4 v15, 0x0

    .line 210
    invoke-static {v15, v14}, Lv4;->H(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 211
    .line 212
    .line 213
    move-result v15

    .line 214
    if-nez v15, :cond_b

    .line 215
    .line 216
    const-string v15, "type"

    .line 217
    .line 218
    invoke-virtual {v14, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 219
    .line 220
    .line 221
    move-result v14

    .line 222
    if-eqz v14, :cond_8

    .line 223
    .line 224
    :cond_b
    :try_start_0
    invoke-virtual {v13, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v13, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 231
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->length()I

    .line 232
    .line 233
    .line 234
    move-result v15

    .line 235
    move/from16 v16, v9

    .line 236
    .line 237
    const-string v9, "; "

    .line 238
    .line 239
    if-lez v15, :cond_c

    .line 240
    .line 241
    :try_start_1
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 242
    .line 243
    .line 244
    goto :goto_4

    .line 245
    :catchall_1
    :goto_3
    move/from16 v9, v16

    .line 246
    .line 247
    goto :goto_1

    .line 248
    :cond_c
    :goto_4
    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v13

    .line 252
    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    const/16 v13, 0x3d

    .line 256
    .line 257
    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-static {}, Li5;->i1()Ljava/util/Set;

    .line 261
    .line 262
    .line 263
    move-result-object v13

    .line 264
    invoke-static {v14, v5, v13}, Li5;->V(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v13

    .line 268
    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    aget v13, v3, v5

    .line 272
    .line 273
    add-int/lit8 v13, v13, 0x1

    .line 274
    .line 275
    aput v13, v3, v5

    .line 276
    .line 277
    add-int/lit8 v13, v1, 0x1

    .line 278
    .line 279
    invoke-static {v14, v13, v2, v3}, Lv4;->c(Ljava/lang/Object;ILjava/util/Set;[I)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v13

    .line 283
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 284
    .line 285
    .line 286
    move-result v14

    .line 287
    if-lez v14, :cond_d

    .line 288
    .line 289
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    :cond_d
    aget v9, v3, v5

    .line 296
    .line 297
    if-lt v9, v7, :cond_e

    .line 298
    .line 299
    :goto_5
    invoke-virtual {v8}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    move-result-object v8

    .line 303
    move/from16 v9, v16

    .line 304
    .line 305
    goto/16 :goto_0

    .line 306
    .line 307
    :cond_e
    :goto_6
    add-int/lit8 v12, v12, 0x1

    .line 308
    .line 309
    goto :goto_3

    .line 310
    :cond_f
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    return-object v0

    .line 315
    :goto_7
    add-int/lit8 v6, v6, 0x1

    .line 316
    .line 317
    aput v6, v3, v5

    .line 318
    .line 319
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    return-object v0

    .line 324
    :cond_10
    :goto_8
    return-object v4
.end method

.method public static d(Landroid/view/View;Ljava/lang/StringBuilder;I[I)V
    .locals 5

    .line 1
    if-eqz p0, :cond_7

    .line 2
    .line 3
    const/4 v0, 0x7

    .line 4
    if-le p2, v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_2

    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    aget v1, p3, v0

    .line 10
    .line 11
    const/16 v2, 0xa

    .line 12
    .line 13
    if-lt v1, v2, :cond_1

    .line 14
    .line 15
    goto/16 :goto_2

    .line 16
    .line 17
    :cond_1
    instance-of v1, p0, Landroid/widget/TextView;

    .line 18
    .line 19
    if-eqz v1, :cond_6

    .line 20
    .line 21
    move-object v1, p0

    .line 22
    check-cast v1, Landroid/widget/TextView;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_6

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-nez v4, :cond_2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const-string v4, "\\d+"

    .line 46
    .line 47
    invoke-virtual {v3, v4}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-nez v4, :cond_3

    .line 52
    .line 53
    invoke-static {v3}, Li5;->E0(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_6

    .line 58
    .line 59
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-static {v1}, Li5;->y0(Landroid/view/View;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-nez v1, :cond_4

    .line 76
    .line 77
    const-string v1, "badge"

    .line 78
    .line 79
    invoke-virtual {v3, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_4

    .line 84
    .line 85
    const-string v1, "unread"

    .line 86
    .line 87
    invoke-virtual {v3, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_6

    .line 92
    .line 93
    :cond_4
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-lez v1, :cond_5

    .line 98
    .line 99
    const-string v1, " | "

    .line 100
    .line 101
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    :cond_5
    const/16 v1, 0x50

    .line 105
    .line 106
    invoke-static {v2, v1}, Li5;->H1(Ljava/lang/CharSequence;I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    aget v1, p3, v0

    .line 114
    .line 115
    add-int/lit8 v1, v1, 0x1

    .line 116
    .line 117
    aput v1, p3, v0

    .line 118
    .line 119
    :cond_6
    :goto_0
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 120
    .line 121
    if-eqz v1, :cond_7

    .line 122
    .line 123
    check-cast p0, Landroid/view/ViewGroup;

    .line 124
    .line 125
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    const/16 v2, 0x28

    .line 130
    .line 131
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    :goto_1
    if-ge v0, v1, :cond_7

    .line 136
    .line 137
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    add-int/lit8 v3, p2, 0x1

    .line 142
    .line 143
    invoke-static {v2, p1, v3, p3}, Lv4;->d(Landroid/view/View;Ljava/lang/StringBuilder;I[I)V

    .line 144
    .line 145
    .line 146
    add-int/lit8 v0, v0, 0x1

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_7
    :goto_2
    return-void
.end method

.method public static e(Ljava/lang/String;[Ljava/lang/String;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    array-length v1, p1

    .line 7
    move v2, v0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_1

    .line 9
    .line 10
    aget-object v3, p1, v2

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    if-lez v4, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return v0
.end method

.method public static f(Landroid/view/ViewGroup;)Z
    .locals 12

    .line 1
    const-string v10, "\u8bbe\u7f6e"

    .line 2
    .line 3
    const-string v11, "\u591c\u95f4"

    .line 4
    .line 5
    const-string v0, "\u6dfb\u52a0\u6807\u7b7e"

    .line 6
    .line 7
    const-string v1, "\u7f16\u8f91\u4e2a\u7b7e"

    .line 8
    .line 9
    const-string v2, "\u901a\u77e5"

    .line 10
    .line 11
    const-string v3, "\u76f8\u518c"

    .line 12
    .line 13
    const-string v4, "\u6536\u85cf"

    .line 14
    .line 15
    const-string v5, "\u6587\u4ef6"

    .line 16
    .line 17
    const-string v6, "\u94b1\u5305"

    .line 18
    .line 19
    const-string v7, "\u4f1a\u5458\u4e2d\u5fc3"

    .line 20
    .line 21
    const-string v8, "\u4e2a\u6027\u88c5\u626e"

    .line 22
    .line 23
    const-string v9, "\u514d\u6d41\u91cf"

    .line 24
    .line 25
    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v1, 0x0

    .line 30
    move v2, v1

    .line 31
    :goto_0
    const/16 v3, 0xc

    .line 32
    .line 33
    if-ge v2, v3, :cond_1

    .line 34
    .line 35
    aget-object v3, v0, v2

    .line 36
    .line 37
    invoke-static {p0, v3, v1}, Li5;->Q(Landroid/view/View;Ljava/lang/String;I)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    const/4 p0, 0x1

    .line 44
    return p0

    .line 45
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return v1
.end method

.method public static g(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Li5;->b(Landroid/content/Context;)Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    :try_start_0
    invoke-static {}, Lcom/mr/elaris/HookEntry;->topActivity()Landroid/app/Activity;

    .line 8
    .line 9
    .line 10
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    :catchall_0
    :cond_0
    if-nez p0, :cond_1

    .line 12
    .line 13
    const-string p0, "unknown"

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :goto_0
    return-object p0
.end method

.method public static h(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    :catchall_0
    :goto_0
    const/4 v1, 0x3

    .line 7
    if-ge v0, v1, :cond_2

    .line 8
    .line 9
    :try_start_0
    const-string v1, "UTF-8"

    .line 10
    .line 11
    invoke-static {p0, v1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    move-object p0, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_2
    :goto_1
    return-object p0
.end method

.method public static i(Landroid/view/View;F)I
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {v0, p1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 11
    .line 12
    .line 13
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    float-to-int p0, p0

    .line 15
    return p0

    .line 16
    :catchall_0
    float-to-int p0, p1

    .line 17
    return p0
.end method

.method public static j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;
    .locals 1

    .line 1
    sget-object v0, Lw4;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    :try_start_0
    invoke-static {p1, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    return-object p0

    .line 8
    :catchall_0
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method

.method public static varargs k(Ljava/lang/Object;Ljava/util/Set;I[Ljava/lang/String;)I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    const/high16 v4, -0x80000000

    .line 10
    .line 11
    if-eqz v0, :cond_8

    .line 12
    .line 13
    const/4 v5, 0x4

    .line 14
    if-gt v2, v5, :cond_8

    .line 15
    .line 16
    if-eqz v1, :cond_8

    .line 17
    .line 18
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    if-eqz v6, :cond_8

    .line 23
    .line 24
    instance-of v6, v0, Ljava/lang/CharSequence;

    .line 25
    .line 26
    if-nez v6, :cond_8

    .line 27
    .line 28
    instance-of v6, v0, Ljava/lang/Number;

    .line 29
    .line 30
    if-nez v6, :cond_8

    .line 31
    .line 32
    instance-of v6, v0, Ljava/lang/Boolean;

    .line 33
    .line 34
    if-nez v6, :cond_8

    .line 35
    .line 36
    instance-of v6, v0, Ljava/lang/Enum;

    .line 37
    .line 38
    if-nez v6, :cond_8

    .line 39
    .line 40
    instance-of v6, v0, Landroid/view/View;

    .line 41
    .line 42
    if-eqz v6, :cond_1

    .line 43
    .line 44
    :try_start_0
    move-object v7, v0

    .line 45
    check-cast v7, Landroid/view/View;

    .line 46
    .line 47
    invoke-virtual {v7}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    const/4 v7, 0x0

    .line 53
    :goto_0
    add-int/lit8 v8, v2, 0x1

    .line 54
    .line 55
    invoke-static {v7, v1, v8, v3}, Lv4;->k(Ljava/lang/Object;Ljava/util/Set;I[Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    if-eq v7, v4, :cond_0

    .line 60
    .line 61
    return v7

    .line 62
    :cond_0
    move-object v7, v0

    .line 63
    check-cast v7, Landroid/view/View;

    .line 64
    .line 65
    :try_start_1
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 74
    .line 75
    invoke-virtual {v7, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    const-string v8, "com.tencent.aio"

    .line 80
    .line 81
    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    if-nez v8, :cond_1

    .line 86
    .line 87
    const-string v8, "com.tencent.mobileqq.aio"

    .line 88
    .line 89
    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    if-nez v8, :cond_1

    .line 94
    .line 95
    const-string v8, "drawerframeviewgroup"

    .line 96
    .line 97
    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 98
    .line 99
    .line 100
    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 101
    if-eqz v7, :cond_8

    .line 102
    .line 103
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    :goto_1
    if-eqz v7, :cond_8

    .line 108
    .line 109
    const-class v8, Ljava/lang/Object;

    .line 110
    .line 111
    if-eq v7, v8, :cond_8

    .line 112
    .line 113
    if-eqz v6, :cond_2

    .line 114
    .line 115
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    const-string v9, "android.view."

    .line 120
    .line 121
    invoke-virtual {v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    if-eqz v8, :cond_2

    .line 126
    .line 127
    goto :goto_5

    .line 128
    :cond_2
    invoke-virtual {v7}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    array-length v9, v8

    .line 133
    const/4 v11, 0x0

    .line 134
    :goto_2
    if-ge v11, v9, :cond_7

    .line 135
    .line 136
    aget-object v12, v8, v11

    .line 137
    .line 138
    :try_start_2
    invoke-virtual {v12}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 139
    .line 140
    .line 141
    move-result v13

    .line 142
    invoke-static {v13}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 143
    .line 144
    .line 145
    move-result v13

    .line 146
    if-nez v13, :cond_6

    .line 147
    .line 148
    invoke-virtual {v12}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v13

    .line 152
    if-nez v13, :cond_3

    .line 153
    .line 154
    const-string v13, ""

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_3
    invoke-virtual {v12}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v13

    .line 161
    invoke-virtual {v13}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v13

    .line 165
    :goto_3
    const/4 v14, 0x1

    .line 166
    invoke-virtual {v12, v14}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v12, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v12

    .line 173
    if-eqz v13, :cond_5

    .line 174
    .line 175
    array-length v14, v3

    .line 176
    const/4 v15, 0x0

    .line 177
    :goto_4
    if-ge v15, v14, :cond_5

    .line 178
    .line 179
    aget-object v16, v3, v15

    .line 180
    .line 181
    if-eqz v16, :cond_4

    .line 182
    .line 183
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v10

    .line 191
    if-eqz v10, :cond_4

    .line 192
    .line 193
    instance-of v10, v12, Ljava/lang/Number;

    .line 194
    .line 195
    if-eqz v10, :cond_5

    .line 196
    .line 197
    check-cast v12, Ljava/lang/Number;

    .line 198
    .line 199
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    return v0

    .line 204
    :cond_4
    add-int/lit8 v15, v15, 0x1

    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_5
    if-ge v2, v5, :cond_6

    .line 208
    .line 209
    invoke-static {v12, v13}, Lv4;->H(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 210
    .line 211
    .line 212
    move-result v10

    .line 213
    if-eqz v10, :cond_6

    .line 214
    .line 215
    add-int/lit8 v10, v2, 0x1

    .line 216
    .line 217
    invoke-static {v12, v1, v10, v3}, Lv4;->k(Ljava/lang/Object;Ljava/util/Set;I[Ljava/lang/String;)I

    .line 218
    .line 219
    .line 220
    move-result v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 221
    if-eq v10, v4, :cond_6

    .line 222
    .line 223
    return v10

    .line 224
    :catchall_1
    :cond_6
    add-int/lit8 v11, v11, 0x1

    .line 225
    .line 226
    goto :goto_2

    .line 227
    :cond_7
    invoke-virtual {v7}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    move-result-object v7

    .line 231
    goto :goto_1

    .line 232
    :catchall_2
    :cond_8
    :goto_5
    return v4
.end method

.method public static l(Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/Object;
    .locals 6

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    if-ltz p2, :cond_3

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    instance-of v0, p0, Ljava/lang/CharSequence;

    .line 21
    .line 22
    if-nez v0, :cond_3

    .line 23
    .line 24
    instance-of v0, p0, Ljava/lang/Number;

    .line 25
    .line 26
    if-nez v0, :cond_3

    .line 27
    .line 28
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 29
    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :goto_0
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    array-length v2, v1

    .line 43
    const/4 v3, 0x0

    .line 44
    :goto_1
    if-ge v3, v2, :cond_2

    .line 45
    .line 46
    aget-object v4, v1, v3

    .line 47
    .line 48
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-nez v5, :cond_1

    .line 57
    .line 58
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-virtual {v5}, Ljava/lang/Class;->isPrimitive()Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-nez v5, :cond_1

    .line 67
    .line 68
    const/4 v5, 0x1

    .line 69
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    add-int/lit8 v5, p2, -0x1

    .line 77
    .line 78
    invoke-static {v4, p1, v5}, Lv4;->l(Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    if-eqz v4, :cond_1

    .line 83
    .line 84
    return-object v4

    .line 85
    :catchall_0
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    goto :goto_0

    .line 93
    :cond_3
    const/4 p0, 0x0

    .line 94
    return-object p0
.end method

.method public static m(Ljava/lang/reflect/Method;Ljava/lang/Class;)I
    .locals 2

    .line 1
    sget-object v0, Lw4;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v0, 0x0

    .line 8
    :goto_0
    array-length v1, p0

    .line 9
    if-ge v0, v1, :cond_1

    .line 10
    .line 11
    aget-object v1, p0, v0

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    return v0

    .line 20
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 p0, -0x1

    .line 24
    return p0
.end method

.method public static n(Landroid/view/View;I[I)Landroid/view/View;
    .locals 4

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    const/16 v0, 0xc

    .line 4
    .line 5
    if-gt p1, v0, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    aget v1, p2, v0

    .line 9
    .line 10
    const/16 v2, 0x104

    .line 11
    .line 12
    if-gt v1, v2, :cond_3

    .line 13
    .line 14
    add-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    aput v1, p2, v0

    .line 17
    .line 18
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    const-string v2, "\u7f16\u8f91\u4e2a\u7b7e"

    .line 23
    .line 24
    invoke-static {p0, v2, v0}, Li5;->Q(Landroid/view/View;Ljava/lang/String;I)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    const-string v2, "\u6dfb\u52a0\u6807\u7b7e"

    .line 31
    .line 32
    invoke-static {p0, v2, v0}, Li5;->Q(Landroid/view/View;Ljava/lang/String;I)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_0

    .line 37
    .line 38
    invoke-static {p0, v0}, Li5;->O(Landroid/view/View;I)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    const/high16 v3, 0x43700000    # 240.0f

    .line 49
    .line 50
    invoke-static {p0, v3}, Lv4;->i(Landroid/view/View;F)I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-le v2, v3, :cond_1

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    const/high16 v3, 0x43200000    # 160.0f

    .line 61
    .line 62
    invoke-static {p0, v3}, Lv4;->i(Landroid/view/View;F)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-le v2, v3, :cond_1

    .line 67
    .line 68
    return-object p0

    .line 69
    :cond_1
    if-eqz v1, :cond_3

    .line 70
    .line 71
    check-cast p0, Landroid/view/ViewGroup;

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    const/16 v2, 0x50

    .line 78
    .line 79
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    :goto_0
    if-ge v0, v1, :cond_3

    .line 84
    .line 85
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    add-int/lit8 v3, p1, 0x1

    .line 90
    .line 91
    invoke-static {v2, v3, p2}, Lv4;->n(Landroid/view/View;I[I)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    if-eqz v2, :cond_2

    .line 96
    .line 97
    return-object v2

    .line 98
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_3
    const/4 p0, 0x0

    .line 102
    return-object p0
.end method

.method public static o(ILjava/lang/Object;)Landroid/widget/TextView;
    .locals 7

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    if-ltz p0, :cond_5

    .line 4
    .line 5
    instance-of v0, p1, Landroid/widget/TextView;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p1, Landroid/widget/TextView;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    move-object v0, p1

    .line 18
    check-cast v0, Landroid/view/ViewGroup;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/16 v3, 0x18

    .line 25
    .line 26
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    move v3, v1

    .line 31
    :goto_0
    if-ge v3, v2, :cond_2

    .line 32
    .line 33
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    add-int/lit8 v5, p0, -0x1

    .line 38
    .line 39
    invoke-static {v5, v4}, Lv4;->o(ILjava/lang/Object;)Landroid/widget/TextView;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    if-eqz v4, :cond_1

    .line 44
    .line 45
    return-object v4

    .line 46
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    instance-of v0, p1, Landroid/view/View;

    .line 50
    .line 51
    if-nez v0, :cond_5

    .line 52
    .line 53
    instance-of v0, p1, Ljava/lang/CharSequence;

    .line 54
    .line 55
    if-nez v0, :cond_5

    .line 56
    .line 57
    instance-of v0, p1, Ljava/lang/Number;

    .line 58
    .line 59
    if-nez v0, :cond_5

    .line 60
    .line 61
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 62
    .line 63
    if-nez v0, :cond_5

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    :goto_1
    if-eqz v0, :cond_5

    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    array-length v3, v2

    .line 76
    move v4, v1

    .line 77
    :goto_2
    if-ge v4, v3, :cond_4

    .line 78
    .line 79
    aget-object v5, v2, v4

    .line 80
    .line 81
    :try_start_0
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    if-nez v6, :cond_3

    .line 90
    .line 91
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    invoke-virtual {v6}, Ljava/lang/Class;->isPrimitive()Z

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    if-nez v6, :cond_3

    .line 100
    .line 101
    const/4 v6, 0x1

    .line 102
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    add-int/lit8 v6, p0, -0x1

    .line 110
    .line 111
    invoke-static {v6, v5}, Lv4;->o(ILjava/lang/Object;)Landroid/widget/TextView;

    .line 112
    .line 113
    .line 114
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    if-eqz v5, :cond_3

    .line 116
    .line 117
    return-object v5

    .line 118
    :catchall_0
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    goto :goto_1

    .line 126
    :cond_5
    const/4 p0, 0x0

    .line 127
    return-object p0
.end method

.method public static p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    const-string v1, "msgRecord"

    .line 6
    .line 7
    invoke-static {p0, v1}, Lw4;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_1
    const/4 v1, 0x0

    .line 15
    :try_start_0
    const-string v2, "getMsgRecord"

    .line 16
    .line 17
    new-array v3, v1, [Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {p0, v2, v3}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    return-object p0

    .line 24
    :catchall_0
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    array-length v3, v2

    .line 33
    move v4, v1

    .line 34
    :goto_0
    if-ge v4, v3, :cond_8

    .line 35
    .line 36
    aget-object v5, v2, v4

    .line 37
    .line 38
    if-eqz v5, :cond_7

    .line 39
    .line 40
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    array-length v6, v6

    .line 45
    if-nez v6, :cond_7

    .line 46
    .line 47
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eqz v6, :cond_2

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 62
    const/4 v7, 0x1

    .line 63
    if-nez v6, :cond_4

    .line 64
    .line 65
    :catchall_1
    :cond_3
    move v6, v1

    .line 66
    goto :goto_1

    .line 67
    :cond_4
    :try_start_2
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 71
    :try_start_3
    const-string v8, "com.tencent.qqnt.kernel.nativeinterface.MsgRecord"

    .line 72
    .line 73
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-nez v8, :cond_5

    .line 78
    .line 79
    const-string v8, "com.tencent.qqnt.kernelpublic.nativeinterface.MsgRecord"

    .line 80
    .line 81
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    if-nez v8, :cond_5

    .line 86
    .line 87
    const-string v8, ".MsgRecord"

    .line 88
    .line 89
    invoke-virtual {v6, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-eqz v6, :cond_3

    .line 94
    .line 95
    :cond_5
    move v6, v7

    .line 96
    :goto_1
    if-nez v6, :cond_6

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_6
    invoke-virtual {v5, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 106
    if-eqz v5, :cond_7

    .line 107
    .line 108
    return-object v5

    .line 109
    :cond_7
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :catchall_2
    :cond_8
    return-object v0
.end method

.method public static q(Ljava/lang/Object;)V
    .locals 4

    .line 1
    :try_start_0
    instance-of v0, p0, Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    check-cast p0, Landroid/view/View;

    .line 6
    .line 7
    const/16 v0, 0x8

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {p0, v1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v1}, Landroid/view/View;->setMinimumWidth(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v1, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 33
    .line 34
    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 35
    .line 36
    instance-of v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 37
    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    move-object v3, v2

    .line 41
    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 42
    .line 43
    invoke-virtual {v3, v1, v1, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 44
    .line 45
    .line 46
    :cond_0
    instance-of v1, v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 47
    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    move-object v1, v2

    .line 51
    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 52
    .line 53
    iput v0, v1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 54
    .line 55
    :cond_1
    invoke-virtual {p0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    :catchall_0
    :cond_2
    return-void
.end method

.method public static r(Ljava/lang/ClassLoader;)V
    .locals 2

    .line 1
    const-string v0, "allow forbid card hooks installed count="

    .line 2
    .line 3
    :try_start_0
    sget-boolean v1, Lg5;->a:Z

    .line 4
    .line 5
    invoke-static {p0}, Lg5;->a(Ljava/lang/ClassLoader;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-nez p0, :cond_1

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const-string p0, "allow forbid card hooks already installed"

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string p0, "allow forbid card targets not found"

    .line 17
    .line 18
    :goto_0
    invoke-static {p0}, Lv4;->C(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0}, Lv4;->C(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    const-string v0, "hookAllowViewingCard failed: "

    .line 40
    .line 41
    invoke-static {v0, p0}, La;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public static s(Ljava/lang/ClassLoader;)V
    .locals 13

    .line 1
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "annoying popup hooks installed count="

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    :try_start_0
    const-string v3, "com.tencent.mobileqq.upgrade.ui.dialog.UpgradeActivity"

    .line 12
    .line 13
    invoke-static {p0, v3}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    :goto_0
    move v7, v2

    .line 20
    goto :goto_4

    .line 21
    :cond_0
    new-instance v4, Lwa;

    .line 22
    .line 23
    const/16 v5, 0x50

    .line 24
    .line 25
    invoke-direct {v4, v5}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    array-length v5, v3

    .line 33
    move v6, v2

    .line 34
    move v7, v6

    .line 35
    :goto_1
    if-ge v6, v5, :cond_3

    .line 36
    .line 37
    aget-object v8, v3, v6

    .line 38
    .line 39
    const-string v9, "doOnCreate"

    .line 40
    .line 41
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v10

    .line 45
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    if-nez v9, :cond_1

    .line 50
    .line 51
    const-string v9, "onCreate"

    .line 52
    .line 53
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    if-eqz v9, :cond_2

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :catchall_0
    move-exception v3

    .line 65
    goto :goto_3

    .line 66
    :cond_1
    :goto_2
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    if-ne v9, v0, :cond_2

    .line 71
    .line 72
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    if-nez v9, :cond_2

    .line 81
    .line 82
    invoke-static {v8, v4}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 83
    .line 84
    .line 85
    add-int/lit8 v7, v7, 0x1

    .line 86
    .line 87
    new-instance v9, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const-string v10, "hooked upgrade activity finish: "

    .line 93
    .line 94
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-static {v8}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    invoke-static {v8}, Lv4;->C(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    .line 111
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :goto_3
    const-string v4, "hookUpgradeActivity failed: "

    .line 115
    .line 116
    invoke-static {v4, v3}, La;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_3
    :goto_4
    :try_start_1
    const-string v3, "com.tencent.mobileqq.haoliyou.JefsClass"

    .line 121
    .line 122
    invoke-static {p0, v3}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    const-string v4, "com.tencent.mobileqq.utils.QQCustomDialog"

    .line 127
    .line 128
    invoke-static {p0, v4}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    if-eqz v3, :cond_8

    .line 133
    .line 134
    if-nez v4, :cond_4

    .line 135
    .line 136
    goto/16 :goto_8

    .line 137
    .line 138
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    array-length v5, v3

    .line 143
    move v6, v2

    .line 144
    move v8, v6

    .line 145
    :goto_5
    if-ge v6, v5, :cond_7

    .line 146
    .line 147
    aget-object v9, v3, v6

    .line 148
    .line 149
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    move-result-object v10

    .line 153
    const-string v11, "showDialog"

    .line 154
    .line 155
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v12

    .line 159
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v11

    .line 163
    if-eqz v11, :cond_6

    .line 164
    .line 165
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    move-result-object v11

    .line 169
    if-ne v11, v0, :cond_6

    .line 170
    .line 171
    array-length v11, v10

    .line 172
    const/4 v12, 0x2

    .line 173
    if-ne v11, v12, :cond_6

    .line 174
    .line 175
    const-class v11, Landroid/app/Activity;

    .line 176
    .line 177
    aget-object v12, v10, v2

    .line 178
    .line 179
    invoke-virtual {v11, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 180
    .line 181
    .line 182
    move-result v11

    .line 183
    if-eqz v11, :cond_6

    .line 184
    .line 185
    const/4 v11, 0x1

    .line 186
    aget-object v10, v10, v11

    .line 187
    .line 188
    invoke-virtual {v4, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 189
    .line 190
    .line 191
    move-result v10

    .line 192
    if-nez v10, :cond_5

    .line 193
    .line 194
    goto :goto_6

    .line 195
    :cond_5
    invoke-virtual {v9, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 196
    .line 197
    .line 198
    new-instance v10, Lua;

    .line 199
    .line 200
    const/16 v11, 0x5a

    .line 201
    .line 202
    invoke-direct {v10, v11}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 203
    .line 204
    .line 205
    invoke-static {v9, v10}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 206
    .line 207
    .line 208
    add-int/lit8 v8, v8, 0x1

    .line 209
    .line 210
    new-instance v10, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 213
    .line 214
    .line 215
    const-string v11, "hooked external app dialog precise: "

    .line 216
    .line 217
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-static {v9}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v9

    .line 224
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v9

    .line 231
    invoke-static {v9}, Lv4;->C(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 232
    .line 233
    .line 234
    goto :goto_6

    .line 235
    :catchall_1
    move-exception v0

    .line 236
    goto :goto_7

    .line 237
    :cond_6
    :goto_6
    add-int/lit8 v6, v6, 0x1

    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_7
    move v2, v8

    .line 241
    goto :goto_8

    .line 242
    :goto_7
    const-string v3, "hookExternalAppLeaveDialog failed: "

    .line 243
    .line 244
    invoke-static {v3, v0}, La;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 245
    .line 246
    .line 247
    :cond_8
    :goto_8
    add-int/2addr v7, v2

    .line 248
    const-string v0, "VasADBannerProcessor"

    .line 249
    .line 250
    const-string v2, "com.tencent.mobileqq.activity.recent.bannerprocessor.VasADBannerProcessor"

    .line 251
    .line 252
    invoke-static {p0, v2, v0}, Lxa;->a(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)I

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    add-int/2addr v0, v7

    .line 257
    const-string v3, "com.tencent.mobileqq.activity.recent.bannerprocessor.VasADBannerView"

    .line 258
    .line 259
    const-string v4, "VasADBannerView"

    .line 260
    .line 261
    invoke-static {p0, v3, v4}, Lxa;->a(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)I

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    add-int/2addr v3, v0

    .line 266
    const-string v0, "com.tencent.mobileqq.activity.recent.bannerprocessor.VasADBannerLayout"

    .line 267
    .line 268
    const-string v4, "VasADBannerLayout"

    .line 269
    .line 270
    invoke-static {p0, v0, v4}, Lxa;->a(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)I

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    add-int/2addr v0, v3

    .line 275
    const-string v3, "com.tencent.mobileqq.activity.recent.bannerprocessor.VasADBannerContainer"

    .line 276
    .line 277
    const-string v4, "VasADBannerContainer"

    .line 278
    .line 279
    invoke-static {p0, v3, v4}, Lxa;->a(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)I

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    add-int/2addr v3, v0

    .line 284
    const-string v0, "GameMsgBoxBannerProcessor"

    .line 285
    .line 286
    const-string v4, "com.tencent.mobileqq.activity.recent.bannerprocessor.GameMsgBoxBannerProcessor"

    .line 287
    .line 288
    invoke-static {p0, v4, v0}, Lxa;->a(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)I

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    add-int/2addr v0, v3

    .line 293
    const-string v3, "MiniGameBannerProcessor"

    .line 294
    .line 295
    const-string v5, "com.tencent.mobileqq.activity.recent.bannerprocessor.MiniGameBannerProcessor"

    .line 296
    .line 297
    invoke-static {p0, v5, v3}, Lxa;->a(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)I

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    add-int/2addr v3, v0

    .line 302
    const-string v0, "updateBanner"

    .line 303
    .line 304
    invoke-static {p0, v2, v0}, Lv4;->z(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)I

    .line 305
    .line 306
    .line 307
    move-result v6

    .line 308
    add-int/2addr v6, v3

    .line 309
    const-string v3, "showBanner"

    .line 310
    .line 311
    invoke-static {p0, v2, v3}, Lv4;->z(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)I

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    add-int/2addr v3, v6

    .line 316
    const-string v6, "initBanner"

    .line 317
    .line 318
    invoke-static {p0, v2, v6}, Lv4;->z(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)I

    .line 319
    .line 320
    .line 321
    move-result v2

    .line 322
    add-int/2addr v2, v3

    .line 323
    invoke-static {p0, v4, v0}, Lv4;->z(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)I

    .line 324
    .line 325
    .line 326
    move-result v3

    .line 327
    add-int/2addr v3, v2

    .line 328
    invoke-static {p0, v5, v0}, Lv4;->z(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)I

    .line 329
    .line 330
    .line 331
    move-result p0

    .line 332
    add-int/2addr p0, v3

    .line 333
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object p0

    .line 340
    invoke-static {p0}, Lv4;->C(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    return-void
.end method

.method public static t(Ljava/lang/ClassLoader;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Ly4;->a:Ljava/lang/ThreadLocal;

    .line 4
    .line 5
    const-string v1, "rename_apk_file"

    .line 6
    .line 7
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-boolean v1, Lw0;->a:Z

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    :goto_0
    return-void

    .line 19
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v1

    .line 23
    const/4 v3, 0x1

    .line 24
    sput-boolean v3, Lw0;->a:Z

    .line 25
    .line 26
    const-string v4, "apk Bundle/Intent name guard disabled on hot file/download paths"

    .line 27
    .line 28
    invoke-static {v4}, Lv4;->C(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    sget-boolean v5, Lw0;->b:Z

    .line 34
    .line 35
    if-eqz v5, :cond_3

    .line 36
    .line 37
    :cond_2
    const/16 v16, 0x0

    .line 38
    .line 39
    goto/16 :goto_7

    .line 40
    .line 41
    :cond_3
    sput-boolean v3, Lw0;->b:Z

    .line 42
    .line 43
    const-string v12, "com.tencent.qqnt.kernelpublic.nativeinterface.FileMsgInfo"

    .line 44
    .line 45
    const-string v13, "com.tencent.qqnt.kernelpublic.nativeinterface.MsgElement"

    .line 46
    .line 47
    const-string v6, "com.tencent.qqnt.kernel.nativeinterface.FileElement"

    .line 48
    .line 49
    const-string v7, "com.tencent.qqnt.kernel.nativeinterface.FileInfo"

    .line 50
    .line 51
    const-string v8, "com.tencent.qqnt.kernel.nativeinterface.FileMsgInfo"

    .line 52
    .line 53
    const-string v9, "com.tencent.qqnt.kernel.nativeinterface.MsgElement"

    .line 54
    .line 55
    const-string v10, "com.tencent.qqnt.kernelpublic.nativeinterface.FileElement"

    .line 56
    .line 57
    const-string v11, "com.tencent.qqnt.kernelpublic.nativeinterface.FileInfo"

    .line 58
    .line 59
    filled-new-array/range {v6 .. v13}, [Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    const/4 v6, 0x0

    .line 64
    const/4 v7, 0x0

    .line 65
    :goto_1
    const/16 v8, 0x8

    .line 66
    .line 67
    if-ge v6, v8, :cond_e

    .line 68
    .line 69
    aget-object v8, v5, v6

    .line 70
    .line 71
    invoke-static {v0, v8}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    if-eqz v8, :cond_d

    .line 76
    .line 77
    const/16 v9, 0x12

    .line 78
    .line 79
    :try_start_0
    new-instance v10, Lu0;

    .line 80
    .line 81
    invoke-direct {v10, v9}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-static {v8, v10}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookAllConstructors(Ljava/lang/Class;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Ljava/util/Set;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    invoke-interface {v10}, Ljava/util/Set;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    xor-int/2addr v10, v3

    .line 93
    goto :goto_2

    .line 94
    :catchall_0
    const/4 v10, 0x0

    .line 95
    :goto_2
    invoke-virtual {v8}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 96
    .line 97
    .line 98
    move-result-object v11

    .line 99
    array-length v12, v11

    .line 100
    const/4 v13, 0x0

    .line 101
    :goto_3
    if-ge v13, v12, :cond_b

    .line 102
    .line 103
    aget-object v14, v11, v13

    .line 104
    .line 105
    if-eqz v14, :cond_4

    .line 106
    .line 107
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 108
    .line 109
    .line 110
    move-result v15

    .line 111
    invoke-static {v15}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 112
    .line 113
    .line 114
    move-result v15

    .line 115
    if-nez v15, :cond_4

    .line 116
    .line 117
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 118
    .line 119
    .line 120
    move-result v15

    .line 121
    invoke-static {v15}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 122
    .line 123
    .line 124
    move-result v15

    .line 125
    if-eqz v15, :cond_5

    .line 126
    .line 127
    :cond_4
    const/16 v16, 0x0

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_5
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    move-result-object v15

    .line 134
    const/16 v16, 0x0

    .line 135
    .line 136
    array-length v4, v15

    .line 137
    if-eq v4, v3, :cond_6

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_6
    aget-object v4, v15, v16

    .line 141
    .line 142
    const-class v15, Ljava/lang/String;

    .line 143
    .line 144
    if-eq v4, v15, :cond_7

    .line 145
    .line 146
    const-class v15, Ljava/lang/CharSequence;

    .line 147
    .line 148
    if-eq v4, v15, :cond_7

    .line 149
    .line 150
    const-class v15, Ljava/io/File;

    .line 151
    .line 152
    if-eq v4, v15, :cond_7

    .line 153
    .line 154
    const-class v15, Landroid/net/Uri;

    .line 155
    .line 156
    if-eq v4, v15, :cond_7

    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_7
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    if-nez v4, :cond_8

    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_8
    sget-object v15, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 167
    .line 168
    invoke-virtual {v4, v15}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    const-string v15, "set"

    .line 173
    .line 174
    invoke-virtual {v4, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 175
    .line 176
    .line 177
    move-result v15

    .line 178
    if-nez v15, :cond_9

    .line 179
    .line 180
    const-string v15, "file"

    .line 181
    .line 182
    invoke-virtual {v4, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 183
    .line 184
    .line 185
    move-result v15

    .line 186
    if-nez v15, :cond_9

    .line 187
    .line 188
    const-string v15, "path"

    .line 189
    .line 190
    invoke-virtual {v4, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 191
    .line 192
    .line 193
    move-result v15

    .line 194
    if-nez v15, :cond_9

    .line 195
    .line 196
    const-string v15, "name"

    .line 197
    .line 198
    invoke-virtual {v4, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 199
    .line 200
    .line 201
    move-result v15

    .line 202
    if-nez v15, :cond_9

    .line 203
    .line 204
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    const/4 v15, 0x3

    .line 209
    if-gt v4, v15, :cond_a

    .line 210
    .line 211
    :cond_9
    :try_start_1
    invoke-virtual {v14, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 212
    .line 213
    .line 214
    new-instance v4, Lv0;

    .line 215
    .line 216
    invoke-direct {v4, v9}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 217
    .line 218
    .line 219
    invoke-static {v14, v4}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 220
    .line 221
    .line 222
    add-int/lit8 v10, v10, 0x1

    .line 223
    .line 224
    :catchall_1
    :cond_a
    :goto_4
    add-int/lit8 v13, v13, 0x1

    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_b
    const/16 v16, 0x0

    .line 228
    .line 229
    if-lez v10, :cond_c

    .line 230
    .line 231
    new-instance v4, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    const-string v9, "hooked apk risk file model: "

    .line 234
    .line 235
    invoke-direct {v4, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v8

    .line 242
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    const-string v8, " count="

    .line 246
    .line 247
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    invoke-static {v4}, Lv4;->C(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    :cond_c
    add-int/2addr v7, v10

    .line 261
    goto :goto_5

    .line 262
    :cond_d
    const/16 v16, 0x0

    .line 263
    .line 264
    :goto_5
    add-int/lit8 v6, v6, 0x1

    .line 265
    .line 266
    goto/16 :goto_1

    .line 267
    .line 268
    :cond_e
    if-nez v7, :cond_f

    .line 269
    .line 270
    const-string v0, "apk file model sanitizer targets not found"

    .line 271
    .line 272
    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    goto :goto_6

    .line 276
    :cond_f
    new-instance v0, Ljava/lang/StringBuilder;

    .line 277
    .line 278
    const-string v3, "apk file model sanitizer installed count="

    .line 279
    .line 280
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    :goto_6
    move v4, v7

    .line 294
    goto :goto_8

    .line 295
    :goto_7
    move/from16 v4, v16

    .line 296
    .line 297
    :goto_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 298
    .line 299
    const-string v3, "apk file name guards installed count="

    .line 300
    .line 301
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    const-string v3, ", apk dot one hook cost="

    .line 308
    .line 309
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 313
    .line 314
    .line 315
    move-result-wide v3

    .line 316
    sub-long/2addr v3, v1

    .line 317
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    const-string v1, "ms"

    .line 321
    .line 322
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    return-void
.end method

.method public static u(Ljava/lang/ClassLoader;)V
    .locals 13

    .line 1
    sget-boolean v0, Lcb;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    sget-boolean v0, Lcb;->b:Z

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    goto/16 :goto_6

    .line 13
    .line 14
    :cond_1
    :try_start_0
    const-string v0, "com.tencent.qqnt.kernel.nativeinterface.VASMsgAvatarPendant"

    .line 15
    .line 16
    invoke-static {p0, v0}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    goto/16 :goto_5

    .line 23
    .line 24
    :cond_2
    new-instance v3, Lza;

    .line 25
    .line 26
    const/16 v4, 0x50

    .line 27
    .line 28
    invoke-direct {v3, v4}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v3}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookAllConstructors(Ljava/lang/Class;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    array-length v5, v3

    .line 39
    move v7, v1

    .line 40
    move v6, v2

    .line 41
    :goto_0
    if-ge v6, v5, :cond_a

    .line 42
    .line 43
    aget-object v8, v3, v6

    .line 44
    .line 45
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    if-nez v9, :cond_9

    .line 54
    .line 55
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    array-length v9, v9

    .line 60
    if-nez v9, :cond_9

    .line 61
    .line 62
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    const-string v11, "getPendantId"

    .line 71
    .line 72
    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v11

    .line 76
    if-nez v11, :cond_3

    .line 77
    .line 78
    invoke-virtual {v9}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v11

    .line 82
    const-string v12, "pendantid"

    .line 83
    .line 84
    invoke-virtual {v11, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 85
    .line 86
    .line 87
    move-result v11

    .line 88
    if-eqz v11, :cond_4

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :catchall_0
    move-exception v0

    .line 92
    goto :goto_4

    .line 93
    :cond_3
    :goto_1
    sget-object v11, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 94
    .line 95
    if-eq v10, v11, :cond_7

    .line 96
    .line 97
    const-class v11, Ljava/lang/Long;

    .line 98
    .line 99
    if-ne v10, v11, :cond_4

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_4
    const-string v11, "getPendantDiyInfoId"

    .line 103
    .line 104
    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v11

    .line 108
    if-nez v11, :cond_5

    .line 109
    .line 110
    invoke-virtual {v9}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v9

    .line 114
    const-string v11, "diyinfo"

    .line 115
    .line 116
    invoke-virtual {v9, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    if-eqz v9, :cond_8

    .line 121
    .line 122
    :cond_5
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 123
    .line 124
    if-eq v10, v9, :cond_6

    .line 125
    .line 126
    const-class v9, Ljava/lang/Integer;

    .line 127
    .line 128
    if-ne v10, v9, :cond_8

    .line 129
    .line 130
    :cond_6
    new-instance v9, Lbb;

    .line 131
    .line 132
    invoke-direct {v9, v4}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 133
    .line 134
    .line 135
    invoke-static {v8, v9}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 136
    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_7
    :goto_2
    new-instance v9, Lab;

    .line 140
    .line 141
    invoke-direct {v9, v4}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 142
    .line 143
    .line 144
    invoke-static {v8, v9}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 145
    .line 146
    .line 147
    :cond_8
    :goto_3
    add-int/lit8 v7, v7, 0x1

    .line 148
    .line 149
    :cond_9
    add-int/lit8 v6, v6, 0x1

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_a
    new-instance v3, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 155
    .line 156
    .line 157
    const-string v4, "hooked avatar pendant data: "

    .line 158
    .line 159
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    const-string v0, " count="

    .line 170
    .line 171
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 182
    .line 183
    .line 184
    move v2, v7

    .line 185
    goto :goto_5

    .line 186
    :goto_4
    const-string v3, "hookVASMsgAvatarPendant failed: "

    .line 187
    .line 188
    invoke-static {v3, v0}, La;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 189
    .line 190
    .line 191
    :goto_5
    const-string v0, "com.tencent.mobileqq.vas.PendantInfo"

    .line 192
    .line 193
    invoke-static {p0, v0}, Lcb;->a(Ljava/lang/ClassLoader;Ljava/lang/String;)I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    add-int/2addr v0, v2

    .line 198
    const-string v2, "com.tencent.mobileqq.vas.pendant.drawable.PendantInfo"

    .line 199
    .line 200
    invoke-static {p0, v2}, Lcb;->a(Ljava/lang/ClassLoader;Ljava/lang/String;)I

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    add-int/2addr v2, v0

    .line 205
    const-string v0, "com.tencent.mobileqq.vas.pendant.drawable.interfaces.IPendantInfo"

    .line 206
    .line 207
    invoke-static {p0, v0}, Lcb;->a(Ljava/lang/ClassLoader;Ljava/lang/String;)I

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    add-int/2addr v0, v2

    .line 212
    const-string v2, "com.tencent.mobileqq.vas.api.IVipDataUpdateApi$AvatarPendantInfo"

    .line 213
    .line 214
    invoke-static {p0, v2}, Lcb;->a(Ljava/lang/ClassLoader;Ljava/lang/String;)I

    .line 215
    .line 216
    .line 217
    move-result p0

    .line 218
    add-int v2, p0, v0

    .line 219
    .line 220
    if-lez v2, :cond_b

    .line 221
    .line 222
    sput-boolean v1, Lcb;->b:Z

    .line 223
    .line 224
    :cond_b
    :goto_6
    new-instance p0, Ljava/lang/StringBuilder;

    .line 225
    .line 226
    const-string v0, "avatar pendant AIO UI hooks skipped for profile stability, dataHooks="

    .line 227
    .line 228
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    invoke-static {p0}, Lv4;->C(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    if-lez v2, :cond_c

    .line 242
    .line 243
    sput-boolean v1, Lcb;->a:Z

    .line 244
    .line 245
    :cond_c
    new-instance p0, Ljava/lang/StringBuilder;

    .line 246
    .line 247
    const-string v0, "avatar pendant hooks installed count="

    .line 248
    .line 249
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    invoke-static {p0}, Lv4;->C(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    return-void
.end method

.method public static v(Ljava/lang/ClassLoader;)V
    .locals 14

    .line 1
    sget-boolean v0, Li1;->a:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_4

    .line 7
    .line 8
    :cond_0
    const-string v0, "target.chat_right_swipe.drawer_class"

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    :try_start_0
    const-string v3, "com.tencent.aio.frame.drawer.DrawerFrameViewGroup"

    .line 12
    .line 13
    invoke-static {p0, v0, v3}, Lt2;->i(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-nez p0, :cond_1

    .line 18
    .line 19
    const-string p0, "DrawerFrameViewGroup not found for right swipe"

    .line 20
    .line 21
    invoke-static {p0}, Lv4;->C(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    goto/16 :goto_3

    .line 25
    .line 26
    :catchall_0
    move-exception p0

    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    :cond_1
    new-instance v3, Ljava/util/HashSet;

    .line 30
    .line 31
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    array-length v5, v4

    .line 39
    move v6, v1

    .line 40
    move v7, v6

    .line 41
    :goto_0
    if-ge v6, v5, :cond_7

    .line 42
    .line 43
    aget-object v8, v4, v6

    .line 44
    .line 45
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    if-eqz v9, :cond_2

    .line 54
    .line 55
    goto/16 :goto_1

    .line 56
    .line 57
    :cond_2
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    invoke-static {v8}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v11

    .line 69
    invoke-virtual {v3, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v12

    .line 73
    if-nez v12, :cond_3

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v12

    .line 80
    sget-object v13, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 81
    .line 82
    if-ne v12, v13, :cond_4

    .line 83
    .line 84
    array-length v12, v9

    .line 85
    const/4 v13, 0x2

    .line 86
    if-ne v12, v13, :cond_4

    .line 87
    .line 88
    aget-object v12, v9, v1

    .line 89
    .line 90
    sget-object v13, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 91
    .line 92
    if-ne v12, v13, :cond_4

    .line 93
    .line 94
    aget-object v12, v9, v2

    .line 95
    .line 96
    const-class v13, Ljava/lang/String;

    .line 97
    .line 98
    if-ne v12, v13, :cond_4

    .line 99
    .line 100
    new-instance v9, Lh1;

    .line 101
    .line 102
    const/16 v10, 0x50

    .line 103
    .line 104
    invoke-direct {v9, v10}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 105
    .line 106
    .line 107
    invoke-static {v8, v9}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 108
    .line 109
    .line 110
    add-int/lit8 v7, v7, 0x1

    .line 111
    .line 112
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    invoke-static {v0, v8}, Lt2;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    new-instance v8, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 122
    .line 123
    .line 124
    const-string v9, "hooked drawer swipe judge: "

    .line 125
    .line 126
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    invoke-static {v8}, Lv4;->C(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_4
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-result-object v8

    .line 144
    sget-object v11, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 145
    .line 146
    if-ne v8, v11, :cond_5

    .line 147
    .line 148
    array-length v8, v9

    .line 149
    if-ne v8, v2, :cond_5

    .line 150
    .line 151
    aget-object v8, v9, v1

    .line 152
    .line 153
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 154
    .line 155
    if-eq v8, v9, :cond_6

    .line 156
    .line 157
    :cond_5
    const-string v8, "onTouchEvent"

    .line 158
    .line 159
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v8

    .line 163
    if-nez v8, :cond_6

    .line 164
    .line 165
    const-string v8, "onInterceptTouchEvent"

    .line 166
    .line 167
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    if-nez v8, :cond_6

    .line 172
    .line 173
    const-string v8, "onScrollChanged"

    .line 174
    .line 175
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    :cond_6
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 179
    .line 180
    goto/16 :goto_0

    .line 181
    .line 182
    :cond_7
    if-nez v7, :cond_8

    .line 183
    .line 184
    const-string p0, "DrawerFrameViewGroup right-swipe targets not found"

    .line 185
    .line 186
    invoke-static {p0}, Lv4;->C(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 187
    .line 188
    .line 189
    :cond_8
    move v1, v7

    .line 190
    goto :goto_3

    .line 191
    :goto_2
    const-string v0, "hookDrawerFrameRightSwipe failed: "

    .line 192
    .line 193
    invoke-static {v0, p0}, La;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 194
    .line 195
    .line 196
    :goto_3
    if-lez v1, :cond_9

    .line 197
    .line 198
    sput-boolean v2, Li1;->a:Z

    .line 199
    .line 200
    :cond_9
    :goto_4
    if-lez v1, :cond_a

    .line 201
    .line 202
    new-instance p0, Ljava/lang/StringBuilder;

    .line 203
    .line 204
    const-string v0, "chat right-swipe hooks installed count="

    .line 205
    .line 206
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    const-string v0, ", includeTroopGuild=false"

    .line 213
    .line 214
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    invoke-static {p0}, Lv4;->C(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    goto :goto_5

    .line 225
    :cond_a
    sget-boolean p0, Li1;->a:Z

    .line 226
    .line 227
    if-eqz p0, :cond_b

    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_b
    const-string p0, "chat right-swipe targets not found"

    .line 231
    .line 232
    invoke-static {p0}, Lv4;->C(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    :goto_5
    return-void
.end method

.method public static w(Ljava/lang/ClassLoader;)V
    .locals 32

    move-object/from16 v1, p0

    .line 1
    sget-boolean v0, Lkb;->a:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v2, 0x1

    .line 2
    sput-boolean v2, Lkb;->a:Z

    .line 3
    const-string v3, "com.tencent.mobileqq.data.Card"

    const-string v4, ".Card"

    const-string v5, "ProfileCardInfo"

    sget-boolean v0, Lkb;->b:Z

    const/4 v6, 0x0

    const-string v7, ": "

    if-eqz v0, :cond_1

    move v11, v6

    move/from16 v16, v11

    goto/16 :goto_1f

    .line 4
    :cond_1
    sput-boolean v2, Lkb;->b:Z

    const/16 v8, 0x50

    .line 5
    :try_start_0
    const-string v0, "com.tencent.mobileqq.profilecard.vas.VasProfileTemplateController"

    invoke-static {v1, v0}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_2

    :goto_0
    move v11, v6

    goto :goto_5

    .line 6
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    array-length v9, v0

    move v10, v6

    move v11, v10

    :goto_1
    if-ge v10, v9, :cond_6

    aget-object v12, v0, v10

    .line 7
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v13

    invoke-static {v13}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v13

    if-nez v13, :cond_5

    .line 8
    const-string v13, "onCardUpdate"

    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    .line 9
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v14

    array-length v15, v14

    if-lez v15, :cond_3

    aget-object v14, v14, v6

    .line 10
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v14

    .line 11
    invoke-virtual {v14, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v15

    if-nez v15, :cond_3

    invoke-virtual {v14, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_3
    :goto_2
    if-nez v13, :cond_4

    goto :goto_3

    .line 12
    :cond_4
    new-instance v13, Ljb;

    .line 13
    invoke-direct {v13, v8}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 14
    invoke-static {v12, v13}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    add-int/lit8 v11, v11, 0x1

    :cond_5
    :goto_3
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_6
    if-lez v11, :cond_7

    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "hooked DIY card controller: count="

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    .line 16
    :goto_4
    const-string v9, "hookVasProfileTemplateController failed: "

    .line 17
    invoke-static {v9, v0}, La;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 18
    :cond_7
    :goto_5
    const-string v0, "com.tencent.mobileqq.profilecard.activity.FriendProfileCardActivity"

    const-string v9, "com.tencent.mobileqq.activity.FriendProfileCardActivity"

    filled-new-array {v0, v9}, [Ljava/lang/String;

    move-result-object v9

    move v10, v6

    move v12, v10

    :goto_6
    const/4 v13, 0x2

    if-ge v10, v13, :cond_d

    .line 19
    aget-object v14, v9, v10

    .line 20
    :try_start_1
    invoke-static {v1, v14}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 21
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    array-length v15, v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move/from16 v16, v6

    :goto_7
    if-ge v6, v15, :cond_c

    :try_start_2
    aget-object v8, v0, v6

    .line 22
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v18

    invoke-static/range {v18 .. v18}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v18

    if-nez v18, :cond_9

    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v18

    invoke-static/range {v18 .. v18}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v18

    if-nez v18, :cond_9

    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v13

    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-ne v13, v2, :cond_9

    .line 23
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v2

    .line 24
    array-length v13, v2

    move/from16 v20, v6

    const/4 v6, 0x1

    if-lt v13, v6, :cond_a

    array-length v6, v2

    const/4 v13, 0x2

    if-gt v6, v13, :cond_a

    .line 25
    aget-object v6, v2, v16

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    .line 26
    invoke-virtual {v6, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_8

    invoke-virtual {v6, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_8

    aget-object v2, v2, v16

    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v2

    const-class v6, Ljava/lang/Object;

    if-ne v2, v6, :cond_a

    goto :goto_8

    :catchall_1
    move-exception v0

    goto :goto_a

    .line 27
    :cond_8
    :goto_8
    new-instance v2, Ldb;

    const/16 v6, 0x4b

    .line 28
    invoke-direct {v2, v6}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 29
    invoke-static {v8, v2}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    add-int/lit8 v12, v12, 0x1

    goto :goto_9

    :cond_9
    move/from16 v20, v6

    :cond_a
    :goto_9
    add-int/lit8 v6, v20, 0x1

    const/4 v2, 0x1

    const/16 v8, 0x50

    const/4 v13, 0x2

    goto :goto_7

    :catchall_2
    move-exception v0

    move/from16 v16, v6

    goto :goto_a

    :cond_b
    move/from16 v16, v6

    goto :goto_b

    .line 30
    :goto_a
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v6, "hookFriendProfileCardActivityCardUpdate failed "

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V

    :cond_c
    :goto_b
    add-int/lit8 v10, v10, 0x1

    move/from16 v6, v16

    const/4 v2, 0x1

    const/16 v8, 0x50

    goto/16 :goto_6

    :cond_d
    move/from16 v16, v6

    if-lez v12, :cond_e

    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "hooked profile card activity updater count="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V

    :cond_e
    add-int/2addr v11, v12

    .line 32
    :try_start_3
    const-string v0, "com.tencent.mobileqq.profilecard.processor.TempProfileBusinessProcessor"

    invoke-static {v1, v0}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_f

    :goto_c
    move/from16 v8, v16

    goto :goto_10

    .line 33
    :cond_f
    invoke-static {v1, v3}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 34
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    array-length v4, v0

    move/from16 v6, v16

    move v8, v6

    :goto_d
    if-ge v6, v4, :cond_12

    aget-object v9, v0, v6

    .line 35
    const-string v10, "updateCardTemplate"

    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_11

    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v10

    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v10

    if-nez v10, :cond_11

    .line 36
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v10

    .line 37
    array-length v12, v10

    const/4 v13, 0x1

    if-lt v12, v13, :cond_11

    if-eqz v2, :cond_10

    aget-object v10, v10, v16

    if-ne v10, v2, :cond_11

    goto :goto_e

    :catchall_3
    move-exception v0

    goto :goto_f

    .line 38
    :cond_10
    :goto_e
    new-instance v10, Lib;

    const/16 v12, 0x50

    .line 39
    invoke-direct {v10, v12}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 40
    invoke-static {v9, v10}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    add-int/lit8 v8, v8, 0x1

    :cond_11
    add-int/lit8 v6, v6, 0x1

    goto :goto_d

    :cond_12
    if-lez v8, :cond_13

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "hooked temp profile template count="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_10

    .line 42
    :goto_f
    const-string v2, "hookTempProfileBusinessProcessor failed: "

    .line 43
    invoke-static {v2, v0}, La;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_c

    :cond_13
    :goto_10
    add-int/2addr v11, v8

    .line 44
    const-string v0, "com.tencent.mobileqq.profilecard.api.impl.ProfileDataServiceImpl"

    const-string v2, "com.tencent.mobileqq.profilecard.api.impl.ProfileProtocolServiceImpl"

    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v2

    move/from16 v4, v16

    move v6, v4

    :goto_11
    const/4 v13, 0x2

    if-ge v4, v13, :cond_17

    .line 45
    aget-object v8, v2, v4

    .line 46
    :try_start_4
    invoke-static {v1, v8}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_16

    .line 47
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    array-length v9, v0

    move/from16 v10, v16

    :goto_12
    if-ge v10, v9, :cond_16

    aget-object v12, v0, v10

    .line 48
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v13

    invoke-static {v13}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v13

    if-nez v13, :cond_15

    .line 49
    invoke-static {v12}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v13

    .line 50
    invoke-virtual {v13, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_14

    invoke-virtual {v13, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v13

    if-eqz v13, :cond_15

    goto :goto_13

    :catchall_4
    move-exception v0

    goto :goto_14

    .line 51
    :cond_14
    :goto_13
    new-instance v13, Lhb;

    const/16 v14, 0x46

    .line 52
    invoke-direct {v13, v14}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 53
    invoke-static {v12, v13}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    add-int/lit8 v6, v6, 0x1

    :cond_15
    add-int/lit8 v10, v10, 0x1

    goto :goto_12

    .line 54
    :goto_14
    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "hookProfileDataServiceCard failed "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V

    :cond_16
    add-int/lit8 v4, v4, 0x1

    goto :goto_11

    :cond_17
    if-lez v6, :cond_18

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "hooked profile data card sanitizer count="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V

    :cond_18
    add-int/2addr v11, v6

    .line 56
    const-string v0, "com.tencent.mobileqq.profilecard.data.ProfileCardInfo"

    const-string v2, "com.tencent.mobileqq.profilecard.entity.ProfileCardInfo"

    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v2

    move/from16 v3, v16

    move v4, v3

    const/4 v13, 0x2

    :goto_15
    if-ge v3, v13, :cond_1a

    .line 57
    aget-object v6, v2, v3

    .line 58
    :try_start_5
    invoke-static {v1, v6}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_19

    .line 59
    new-instance v8, Lfb;

    const/16 v9, 0x37

    .line 60
    invoke-direct {v8, v9}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 61
    invoke-static {v0, v8}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookAllConstructors(Ljava/lang/Class;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Ljava/util/Set;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    add-int/lit8 v4, v4, 0x1

    goto :goto_16

    :catchall_5
    move-exception v0

    .line 62
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "hookProfileCardInfoConstructors failed "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V

    :cond_19
    :goto_16
    add-int/lit8 v3, v3, 0x1

    goto :goto_15

    :cond_1a
    if-lez v4, :cond_1b

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "hooked profile card info constructors count="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V

    :cond_1b
    add-int/2addr v11, v4

    .line 64
    :try_start_6
    const-string v0, "com.tencent.mobileqq.profilecard.api.impl.ProfileCardApiImpl"

    invoke-static {v1, v0}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_1c

    :goto_17
    move/from16 v4, v16

    goto/16 :goto_1e

    .line 65
    :cond_1c
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    array-length v2, v0

    move/from16 v3, v16

    move v4, v3

    :goto_18
    if-ge v3, v2, :cond_22

    aget-object v6, v0, v3

    .line 66
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v8

    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v8

    if-nez v8, :cond_21

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v8

    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v8, v9, :cond_21

    .line 67
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v8

    .line 68
    invoke-static {v6}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v9

    .line 69
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v10

    .line 70
    array-length v12, v10

    const/4 v13, 0x1

    if-ne v12, v13, :cond_1e

    aget-object v10, v10, v16

    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_1d

    goto :goto_19

    :cond_1d
    move v10, v13

    goto :goto_1a

    :catchall_6
    move-exception v0

    goto :goto_1d

    :cond_1e
    :goto_19
    move/from16 v10, v16

    .line 71
    :goto_1a
    const-string v12, "zplan"

    invoke-virtual {v8, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_20

    const-string v8, "isprofilecardshowzplancover"

    invoke-virtual {v9, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_20

    const-string v8, "zplancover"

    invoke-virtual {v9, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_20

    if-eqz v10, :cond_1f

    goto :goto_1b

    :cond_1f
    const/16 v12, 0x50

    goto :goto_1c

    .line 72
    :cond_20
    :goto_1b
    new-instance v8, Lgb;

    const/16 v12, 0x50

    .line 73
    invoke-direct {v8, v12}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 74
    invoke-static {v6, v8}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    add-int/lit8 v4, v4, 0x1

    goto :goto_1c

    :cond_21
    const/16 v12, 0x50

    const/4 v13, 0x1

    :goto_1c
    add-int/lit8 v3, v3, 0x1

    goto :goto_18

    :cond_22
    if-lez v4, :cond_23

    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "hooked profile card ZPlan cover count="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    goto :goto_1e

    .line 76
    :goto_1d
    const-string v2, "hookProfileCardZplanCover failed: "

    .line 77
    invoke-static {v2, v0}, La;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_17

    :cond_23
    :goto_1e
    add-int/2addr v11, v4

    .line 78
    :goto_1f
    const-string v30, "com.tencent.mobileqq.profilecard.component.ProfileCardBackgroundComponent"

    const-string v31, "com.tencent.mobileqq.profilecard.component.ProfileCardTemplateComponent"

    const-string v17, "com.tencent.mobileqq.profilecard.vas.view.VasProfileTemplateView"

    const-string v18, "com.tencent.mobileqq.profilecard.vas.view.ProfileCardTemplateView"

    const-string v19, "com.tencent.mobileqq.profilecard.vas.view.ProfileCardDecorView"

    const-string v20, "com.tencent.mobileqq.profilecard.vas.view.ProfileCardBackgroundView"

    const-string v21, "com.tencent.mobileqq.profilecard.template.ProfileTemplateView"

    const-string v22, "com.tencent.mobileqq.profilecard.diy.DiyCardView"

    const-string v23, "com.tencent.mobileqq.profilecard.diy.ProfileDiyView"

    const-string v24, "com.tencent.mobileqq.profilecard.vas.ProfileCardPagView"

    const-string v25, "com.tencent.mobileqq.profilecard.vas.VasProfileCardBackground"

    const-string v26, "com.tencent.mobileqq.profilecard.vas.view.ProfileCardVideoView"

    const-string v27, "com.tencent.mobileqq.profilecard.vas.view.ProfileCardVasView"

    const-string v28, "com.tencent.mobileqq.profilecard.vas.view.ProfileCardDressView"

    const-string v29, "com.tencent.mobileqq.profilecard.vas.view.ProfileCardNamePlateView"

    filled-new-array/range {v17 .. v31}, [Ljava/lang/String;

    move-result-object v2

    move/from16 v6, v16

    :goto_20
    const/16 v0, 0xf

    if-ge v6, v0, :cond_25

    .line 79
    aget-object v3, v2, v6

    .line 80
    :try_start_7
    invoke-static {v1, v3}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_24

    .line 81
    const-class v4, Landroid/view/View;

    invoke-virtual {v4, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_24

    .line 82
    new-instance v4, Leb;

    const/16 v5, 0x23

    .line 83
    invoke-direct {v4, v5}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 84
    invoke-static {v0, v4}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookAllConstructors(Ljava/lang/Class;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Ljava/util/Set;

    add-int/lit8 v16, v16, 0x1

    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "hooked profile decor exact view: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    goto :goto_21

    :catchall_7
    move-exception v0

    .line 86
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "hook profile decor exact view failed "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V

    :cond_24
    :goto_21
    add-int/lit8 v6, v6, 0x1

    goto :goto_20

    :cond_25
    add-int v11, v11, v16

    .line 87
    const-string v0, "profile decor installed data/bounded hooks only"

    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V

    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "profile card decor hooks installed count="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V

    return-void
.end method

.method public static x(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    sget-boolean v0, Lrb;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    sput-boolean v0, Lrb;->d:Z

    .line 8
    .line 9
    const-string v0, "parts.anim"

    .line 10
    .line 11
    const-string v1, "AnimView"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lrb;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p0, v0}, Lrb;->e(Ljava/lang/ClassLoader;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const-string v1, "CapsuleTabBar"

    .line 22
    .line 23
    const-string v2, "mobile.root"

    .line 24
    .line 25
    invoke-static {v2, v1}, Lrb;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {p0, v1}, Lrb;->e(Ljava/lang/ClassLoader;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v1, v0

    .line 34
    const-string v0, "KuiklyPagePart"

    .line 35
    .line 36
    invoke-static {v2, v0}, Lrb;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {p0, v0}, Lrb;->e(Ljava/lang/ClassLoader;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    add-int/2addr v0, v1

    .line 45
    const-string v1, "parts.anim.plain"

    .line 46
    .line 47
    const-string v2, "AnimationSequenceController"

    .line 48
    .line 49
    invoke-static {v1, v2}, Lrb;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {p0, v1}, Lrb;->d(Ljava/lang/ClassLoader;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    add-int/2addr v1, v0

    .line 58
    const-string v0, "parts.base.plain"

    .line 59
    .line 60
    invoke-static {v0, v2}, Lrb;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {p0, v0}, Lrb;->d(Ljava/lang/ClassLoader;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    add-int/2addr v0, v1

    .line 69
    const-string v1, "SwitchApiImpl"

    .line 70
    .line 71
    const-string v2, "mobile.api"

    .line 72
    .line 73
    invoke-static {v2, v1}, Lrb;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-static {p0, v1}, Lrb;->c(Ljava/lang/ClassLoader;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    add-int/2addr v1, v0

    .line 82
    const-string v0, "ConfigApiImpl"

    .line 83
    .line 84
    invoke-static {v2, v0}, Lrb;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-static {p0, v0}, Lrb;->c(Ljava/lang/ClassLoader;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    add-int/2addr v0, v1

    .line 93
    const-string v1, "avatar.api"

    .line 94
    .line 95
    const-string v2, "InfoApiImpl"

    .line 96
    .line 97
    invoke-static {v1, v2}, Lrb;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-static {p0, v1}, Lrb;->c(Ljava/lang/ClassLoader;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    add-int/2addr v1, v0

    .line 106
    const-string v0, "mobile.manager"

    .line 107
    .line 108
    const-string v2, "Manager"

    .line 109
    .line 110
    invoke-static {v0, v2}, Lrb;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {p0, v0}, Lrb;->c(Ljava/lang/ClassLoader;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    add-int/2addr v0, v1

    .line 119
    const-string v1, "parts.base"

    .line 120
    .line 121
    const-string v2, "DrawerEntryExpManager"

    .line 122
    .line 123
    invoke-static {v1, v2}, Lrb;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-static {p0, v1}, Lrb;->c(Ljava/lang/ClassLoader;Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    add-int/2addr p0, v0

    .line 132
    const-string v0, "QQShow sidebar installed bounded hooks only"

    .line 133
    .line 134
    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    new-instance v0, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    const-string v1, "QQShow sidebar hooks installed count="

    .line 140
    .line 141
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-static {p0}, Lv4;->C(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    return-void
.end method

.method public static y(Ljava/lang/ClassLoader;)V
    .locals 15

    .line 1
    const-string v0, "com.tencent.mobileqq.aio.input.reply.d"

    .line 2
    .line 3
    sget-boolean v1, Loc;->c:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    :try_start_0
    const-string v1, "reply no-at hard hooks enabled"

    .line 10
    .line 11
    invoke-static {v1}, Lv4;->C(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v1, "com.tencent.mvi.base.route.MsgIntent"

    .line 15
    .line 16
    invoke-static {p0, v1}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    const-string p0, "MsgIntent not found for reply no-at"

    .line 23
    .line 24
    invoke-static {p0}, Lv4;->C(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    const-string v2, "com.tencent.mobileqq.aio.input.reply.i"

    .line 29
    .line 30
    const-string v3, "com.tencent.mobileqq.aio.input.reply.h"

    .line 31
    .line 32
    filled-new-array {v2, v3, v0}, [Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const/4 v3, 0x0

    .line 37
    move v4, v3

    .line 38
    move v5, v4

    .line 39
    :goto_0
    const/4 v6, 0x1

    .line 40
    const/4 v7, 0x3

    .line 41
    if-ge v4, v7, :cond_4

    .line 42
    .line 43
    aget-object v7, v2, v4

    .line 44
    .line 45
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    invoke-static {p0, v7}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    if-eqz v7, :cond_3

    .line 54
    .line 55
    invoke-virtual {v7}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    array-length v9, v7

    .line 60
    move v10, v3

    .line 61
    :goto_1
    if-ge v10, v9, :cond_3

    .line 62
    .line 63
    aget-object v11, v7, v10

    .line 64
    .line 65
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v12

    .line 69
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v13

    .line 73
    sget-object v14, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 74
    .line 75
    if-ne v13, v14, :cond_2

    .line 76
    .line 77
    array-length v13, v12

    .line 78
    if-ne v13, v6, :cond_2

    .line 79
    .line 80
    aget-object v12, v12, v3

    .line 81
    .line 82
    invoke-virtual {v1, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    if-eqz v12, :cond_2

    .line 87
    .line 88
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 89
    .line 90
    .line 91
    move-result v12

    .line 92
    invoke-static {v12}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 93
    .line 94
    .line 95
    move-result v12

    .line 96
    if-nez v12, :cond_2

    .line 97
    .line 98
    new-instance v12, Llc;

    .line 99
    .line 100
    invoke-direct {v12, v8}, Llc;-><init>(Z)V

    .line 101
    .line 102
    .line 103
    invoke-static {v11, v12}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 104
    .line 105
    .line 106
    add-int/lit8 v5, v5, 0x1

    .line 107
    .line 108
    new-instance v12, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    const-string v13, "hooked reply no auto-at: "

    .line 114
    .line 115
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-static {v11}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v11

    .line 122
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v11

    .line 129
    invoke-static {v11}, Lv4;->C(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    :cond_2
    add-int/lit8 v10, v10, 0x1

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_4
    if-nez v5, :cond_5

    .line 139
    .line 140
    const-string p0, "reply no auto-at target not found"

    .line 141
    .line 142
    invoke-static {p0}, Lv4;->C(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    :cond_5
    if-lez v5, :cond_6

    .line 146
    .line 147
    sput-boolean v6, Loc;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 148
    .line 149
    :cond_6
    :goto_2
    return-void

    .line 150
    :catchall_0
    move-exception p0

    .line 151
    const-string v0, "hookDisableReplyAutoAt failed: "

    .line 152
    .line 153
    invoke-static {v0, p0}, La;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 154
    .line 155
    .line 156
    return-void
.end method

.method public static z(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)I
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {p0, p1}, Lv4;->j(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    array-length v1, p0

    .line 14
    move v2, v0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-ge v2, v1, :cond_2

    .line 17
    .line 18
    aget-object v4, p0, v2

    .line 19
    .line 20
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-eqz v5, :cond_1

    .line 29
    .line 30
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    sget-object v6, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 35
    .line 36
    if-ne v5, v6, :cond_1

    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-nez v5, :cond_1

    .line 47
    .line 48
    new-instance v5, Lu4;

    .line 49
    .line 50
    const/16 v6, 0x46

    .line 51
    .line 52
    invoke-direct {v5, v6}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-static {v4, v5}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 56
    .line 57
    .line 58
    add-int/lit8 v3, v3, 0x1

    .line 59
    .line 60
    new-instance v5, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v6, "hooked noop: "

    .line 66
    .line 67
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-static {v4}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-static {v4}, Lv4;->C(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :catchall_0
    move-exception p0

    .line 86
    goto :goto_2

    .line 87
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    return v3

    .line 91
    :goto_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    const-string v2, "hookNamedMethodsNoop failed "

    .line 94
    .line 95
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string p1, "."

    .line 102
    .line 103
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string p1, ": "

    .line 110
    .line 111
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-static {p0}, Lv4;->C(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    return v0
.end method
