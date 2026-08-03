.class public final Lwb/yo;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwb/yo;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/yo;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 30

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v2, v1, Lwb/yo;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-super/range {p0 .. p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v2, v1, Lwb/yo;->b:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v4, v2

    .line 20
    check-cast v4, Ly9/e;

    .line 21
    .line 22
    const-string v2, ""

    .line 23
    .line 24
    iget-object v3, v4, Ly9/e;->b:Lib/b;

    .line 25
    .line 26
    iget-object v5, v4, Ly9/e;->e:Ljava/util/Map;

    .line 27
    .line 28
    iget-object v3, v3, Lib/b;->a:Landroid/content/SharedPreferences;

    .line 29
    .line 30
    const-string v6, "enable"

    .line 31
    .line 32
    const/4 v7, 0x0

    .line 33
    invoke-interface {v3, v6, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-nez v3, :cond_0

    .line 38
    .line 39
    goto/16 :goto_12

    .line 40
    .line 41
    :cond_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->chatPage()Lq8/m;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const/4 v6, 0x0

    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    invoke-virtual {v3}, Lq8/m;->a()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move-object v3, v6

    .line 54
    :goto_0
    if-nez v3, :cond_2

    .line 55
    .line 56
    move-object v3, v2

    .line 57
    :cond_2
    invoke-static {v3}, Ly9/e;->g(Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    if-nez v8, :cond_3

    .line 62
    .line 63
    goto/16 :goto_12

    .line 64
    .line 65
    :cond_3
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 66
    .line 67
    if-eqz v0, :cond_29

    .line 68
    .line 69
    invoke-static {v0}, Ltf/l;->z0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    if-eqz v8, :cond_29

    .line 74
    .line 75
    iget-object v9, v4, Ly9/e;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 76
    .line 77
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v10

    .line 81
    invoke-virtual {v9, v10}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v10

    .line 85
    check-cast v10, Ljava/lang/reflect/Field;

    .line 86
    .line 87
    if-eqz v10, :cond_5

    .line 88
    .line 89
    invoke-static {v10, v8}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    instance-of v9, v8, Landroid/widget/TextView;

    .line 94
    .line 95
    if-eqz v9, :cond_4

    .line 96
    .line 97
    check-cast v8, Landroid/widget/TextView;

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    move-object v8, v6

    .line 101
    goto :goto_1

    .line 102
    :cond_5
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v10

    .line 106
    invoke-virtual {v4, v10}, Ly9/e;->d(Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object v11

    .line 114
    invoke-virtual {v9, v11, v10}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    invoke-static {v10, v8}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    instance-of v9, v8, Landroid/widget/TextView;

    .line 122
    .line 123
    if-eqz v9, :cond_4

    .line 124
    .line 125
    check-cast v8, Landroid/widget/TextView;

    .line 126
    .line 127
    :goto_1
    if-eqz v8, :cond_29

    .line 128
    .line 129
    new-instance v9, Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 132
    .line 133
    .line 134
    array-length v10, v0

    .line 135
    move-object v13, v2

    .line 136
    move-object v12, v6

    .line 137
    move v11, v7

    .line 138
    :goto_2
    if-ge v11, v10, :cond_9

    .line 139
    .line 140
    aget-object v14, v0, v11

    .line 141
    .line 142
    instance-of v15, v14, Ljava/lang/String;

    .line 143
    .line 144
    if-eqz v15, :cond_7

    .line 145
    .line 146
    move-object v15, v13

    .line 147
    check-cast v15, Ljava/lang/CharSequence;

    .line 148
    .line 149
    invoke-interface {v15}, Ljava/lang/CharSequence;->length()I

    .line 150
    .line 151
    .line 152
    move-result v15

    .line 153
    if-nez v15, :cond_6

    .line 154
    .line 155
    move-object v13, v14

    .line 156
    :cond_6
    move-object v15, v14

    .line 157
    check-cast v15, Ljava/lang/String;

    .line 158
    .line 159
    invoke-static {v15}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 160
    .line 161
    .line 162
    move-result-object v15

    .line 163
    invoke-virtual {v15}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v15

    .line 167
    invoke-static {v15}, Lzb/c;->b(Ljava/lang/String;)Z

    .line 168
    .line 169
    .line 170
    move-result v16

    .line 171
    if-eqz v16, :cond_7

    .line 172
    .line 173
    invoke-virtual {v9, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    :cond_7
    if-eqz v14, :cond_8

    .line 177
    .line 178
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    move-result-object v15

    .line 182
    invoke-virtual {v4, v15}, Ly9/e;->f(Ljava/lang/Class;)Z

    .line 183
    .line 184
    .line 185
    move-result v15

    .line 186
    if-eqz v15, :cond_8

    .line 187
    .line 188
    move-object v12, v14

    .line 189
    :cond_8
    add-int/lit8 v11, v11, 0x1

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_9
    if-nez v12, :cond_b

    .line 193
    .line 194
    :cond_a
    :goto_3
    move v10, v7

    .line 195
    goto :goto_5

    .line 196
    :cond_b
    const-string v0, "field_isSend"

    .line 197
    .line 198
    const-string v10, "isSend"

    .line 199
    .line 200
    filled-new-array {v0, v10}, [Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    move v10, v7

    .line 205
    :goto_4
    const/4 v11, 0x2

    .line 206
    if-lt v10, v11, :cond_c

    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_c
    aget-object v11, v0, v10

    .line 210
    .line 211
    invoke-static {v12, v11}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v11

    .line 215
    instance-of v14, v11, Ljava/lang/Number;

    .line 216
    .line 217
    if-eqz v14, :cond_d

    .line 218
    .line 219
    check-cast v11, Ljava/lang/Number;

    .line 220
    .line 221
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    const/4 v10, 0x1

    .line 226
    if-ne v0, v10, :cond_a

    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_d
    instance-of v14, v11, Ljava/lang/Boolean;

    .line 230
    .line 231
    if-eqz v14, :cond_28

    .line 232
    .line 233
    check-cast v11, Ljava/lang/Boolean;

    .line 234
    .line 235
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 236
    .line 237
    .line 238
    move-result v10

    .line 239
    :goto_5
    if-eqz v10, :cond_e

    .line 240
    .line 241
    invoke-interface {v5, v8}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v4, v8}, Ly9/e;->l(Landroid/widget/TextView;)V

    .line 245
    .line 246
    .line 247
    goto/16 :goto_12

    .line 248
    .line 249
    :cond_e
    move-object v11, v13

    .line 250
    check-cast v11, Ljava/lang/String;

    .line 251
    .line 252
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    :cond_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 257
    .line 258
    .line 259
    move-result v9

    .line 260
    if-eqz v9, :cond_10

    .line 261
    .line 262
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v9

    .line 266
    move-object v10, v9

    .line 267
    check-cast v10, Ljava/lang/String;

    .line 268
    .line 269
    invoke-static {v10}, Ly9/e;->h(Ljava/lang/String;)Z

    .line 270
    .line 271
    .line 272
    move-result v10

    .line 273
    if-nez v10, :cond_f

    .line 274
    .line 275
    goto :goto_6

    .line 276
    :cond_10
    move-object v9, v6

    .line 277
    :goto_6
    check-cast v9, Ljava/lang/String;

    .line 278
    .line 279
    if-eqz v9, :cond_11

    .line 280
    .line 281
    move-object v2, v9

    .line 282
    goto/16 :goto_10

    .line 283
    .line 284
    :cond_11
    invoke-static {v12}, Ly9/e;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    if-eqz v0, :cond_13

    .line 289
    .line 290
    invoke-static {v0}, Ly9/e;->h(Ljava/lang/String;)Z

    .line 291
    .line 292
    .line 293
    move-result v9

    .line 294
    if-nez v9, :cond_12

    .line 295
    .line 296
    goto :goto_7

    .line 297
    :cond_12
    move-object v0, v6

    .line 298
    :goto_7
    if-eqz v0, :cond_13

    .line 299
    .line 300
    :goto_8
    move-object v2, v0

    .line 301
    goto/16 :goto_10

    .line 302
    .line 303
    :cond_13
    iget-object v14, v4, Ly9/e;->d:Ljava/util/Map;

    .line 304
    .line 305
    if-nez v12, :cond_16

    .line 306
    .line 307
    invoke-static {v11}, Lzb/c;->b(Ljava/lang/String;)Z

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    if-eqz v0, :cond_14

    .line 312
    .line 313
    move-object v6, v11

    .line 314
    :cond_14
    if-nez v6, :cond_15

    .line 315
    .line 316
    goto/16 :goto_10

    .line 317
    .line 318
    :cond_15
    move-object v2, v6

    .line 319
    goto/16 :goto_10

    .line 320
    .line 321
    :cond_16
    invoke-interface {v14, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    check-cast v0, Ljava/lang/String;

    .line 326
    .line 327
    if-eqz v0, :cond_17

    .line 328
    .line 329
    goto :goto_8

    .line 330
    :cond_17
    const-string v15, "A0"

    .line 331
    .line 332
    const-string v16, "B0"

    .line 333
    .line 334
    const-string v17, "C0"

    .line 335
    .line 336
    const-string v18, "D0"

    .line 337
    .line 338
    const-string v19, "E0"

    .line 339
    .line 340
    const-string v20, "F0"

    .line 341
    .line 342
    const-string v21, "getSender"

    .line 343
    .line 344
    const-string v22, "getSendTalker"

    .line 345
    .line 346
    const-string v23, "getTalker"

    .line 347
    .line 348
    const-string v24, "j"

    .line 349
    .line 350
    const-string v25, "R1"

    .line 351
    .line 352
    const-string v26, "P1"

    .line 353
    .line 354
    const-string v27, "o0"

    .line 355
    .line 356
    const-string v28, "x0"

    .line 357
    .line 358
    const-string v29, "j0"

    .line 359
    .line 360
    filled-new-array/range {v15 .. v29}, [Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v15

    .line 364
    move v0, v7

    .line 365
    :goto_9
    const/16 v9, 0xf

    .line 366
    .line 367
    if-lt v0, v9, :cond_20

    .line 368
    .line 369
    const-string v16, "field_talker"

    .line 370
    .line 371
    const-string v17, "talker"

    .line 372
    .line 373
    const-string v18, "field_sender"

    .line 374
    .line 375
    const-string v19, "sender"

    .line 376
    .line 377
    const-string v20, "sendTalker"

    .line 378
    .line 379
    const-string v21, "field_talkerUsername"

    .line 380
    .line 381
    const-string v22, "P"

    .line 382
    .line 383
    filled-new-array/range {v16 .. v22}, [Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v9

    .line 387
    :goto_a
    const/4 v0, 0x7

    .line 388
    if-lt v7, v0, :cond_1b

    .line 389
    .line 390
    invoke-static {v12}, Ly9/e;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    if-eqz v0, :cond_18

    .line 395
    .line 396
    check-cast v14, Ljava/util/Map;

    .line 397
    .line 398
    invoke-interface {v14, v12, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    goto :goto_8

    .line 402
    :cond_18
    invoke-static {v11}, Lzb/c;->b(Ljava/lang/String;)Z

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    if-eqz v0, :cond_19

    .line 407
    .line 408
    move-object v6, v11

    .line 409
    :cond_19
    if-nez v6, :cond_1a

    .line 410
    .line 411
    goto :goto_b

    .line 412
    :cond_1a
    move-object v2, v6

    .line 413
    :goto_b
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    if-lez v0, :cond_24

    .line 418
    .line 419
    check-cast v14, Ljava/util/Map;

    .line 420
    .line 421
    invoke-interface {v14, v12, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    goto :goto_10

    .line 425
    :cond_1b
    aget-object v0, v9, v7

    .line 426
    .line 427
    invoke-static {v12, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    instance-of v10, v0, Ljava/lang/String;

    .line 432
    .line 433
    if-eqz v10, :cond_1c

    .line 434
    .line 435
    check-cast v0, Ljava/lang/String;

    .line 436
    .line 437
    goto :goto_c

    .line 438
    :cond_1c
    move-object v0, v6

    .line 439
    :goto_c
    invoke-static {v0}, Lzb/c;->b(Ljava/lang/String;)Z

    .line 440
    .line 441
    .line 442
    move-result v10

    .line 443
    if-eqz v10, :cond_1f

    .line 444
    .line 445
    if-eqz v0, :cond_1d

    .line 446
    .line 447
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v6

    .line 455
    :cond_1d
    if-nez v6, :cond_1e

    .line 456
    .line 457
    goto :goto_d

    .line 458
    :cond_1e
    move-object v2, v6

    .line 459
    :goto_d
    check-cast v14, Ljava/util/Map;

    .line 460
    .line 461
    invoke-interface {v14, v12, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    goto :goto_10

    .line 465
    :cond_1f
    add-int/lit8 v7, v7, 0x1

    .line 466
    .line 467
    goto :goto_a

    .line 468
    :cond_20
    aget-object v9, v15, v0

    .line 469
    .line 470
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 471
    .line 472
    .line 473
    move-result-object v10

    .line 474
    new-array v13, v7, [Ljava/lang/Class;

    .line 475
    .line 476
    invoke-static {v10, v9, v13}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 477
    .line 478
    .line 479
    move-result-object v9

    .line 480
    new-array v10, v7, [Ljava/lang/Object;

    .line 481
    .line 482
    invoke-static {v9, v12, v10}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v9

    .line 486
    instance-of v10, v9, Ljava/lang/String;

    .line 487
    .line 488
    if-eqz v10, :cond_21

    .line 489
    .line 490
    check-cast v9, Ljava/lang/String;

    .line 491
    .line 492
    goto :goto_e

    .line 493
    :cond_21
    move-object v9, v6

    .line 494
    :goto_e
    invoke-static {v9}, Lzb/c;->b(Ljava/lang/String;)Z

    .line 495
    .line 496
    .line 497
    move-result v10

    .line 498
    if-eqz v10, :cond_27

    .line 499
    .line 500
    if-eqz v9, :cond_22

    .line 501
    .line 502
    invoke-static {v9}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v6

    .line 510
    :cond_22
    if-nez v6, :cond_23

    .line 511
    .line 512
    goto :goto_f

    .line 513
    :cond_23
    move-object v2, v6

    .line 514
    :goto_f
    check-cast v14, Ljava/util/Map;

    .line 515
    .line 516
    invoke-interface {v14, v12, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    :cond_24
    :goto_10
    invoke-static {v2}, Lzb/c;->b(Ljava/lang/String;)Z

    .line 520
    .line 521
    .line 522
    move-result v0

    .line 523
    if-eqz v0, :cond_26

    .line 524
    .line 525
    invoke-static {v2}, Ly9/e;->h(Ljava/lang/String;)Z

    .line 526
    .line 527
    .line 528
    move-result v0

    .line 529
    if-eqz v0, :cond_25

    .line 530
    .line 531
    goto :goto_11

    .line 532
    :cond_25
    invoke-virtual {v4, v8, v3, v2}, Ly9/e;->a(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)Z

    .line 533
    .line 534
    .line 535
    move-result v0

    .line 536
    if-nez v0, :cond_29

    .line 537
    .line 538
    new-instance v6, Ly9/d;

    .line 539
    .line 540
    invoke-direct {v6, v3, v2}, Ly9/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 541
    .line 542
    .line 543
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    check-cast v5, Ljava/util/Map;

    .line 547
    .line 548
    invoke-interface {v5, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->tasks()Lo8/j;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    if-eqz v0, :cond_29

    .line 556
    .line 557
    invoke-static {v8}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 558
    .line 559
    .line 560
    move-result v5

    .line 561
    const-string v7, "member_title_apply_"

    .line 562
    .line 563
    invoke-static {v5, v7}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v10

    .line 567
    move-object v7, v3

    .line 568
    new-instance v3, Lca/x;

    .line 569
    .line 570
    const/16 v9, 0x15

    .line 571
    .line 572
    move-object v5, v8

    .line 573
    move-object v8, v2

    .line 574
    invoke-direct/range {v3 .. v9}, Lca/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 575
    .line 576
    .line 577
    const-wide/16 v4, 0x78

    .line 578
    .line 579
    invoke-virtual {v0, v10, v4, v5, v3}, Lo8/j;->f(Ljava/lang/String;JLjava/lang/Runnable;)V

    .line 580
    .line 581
    .line 582
    goto :goto_12

    .line 583
    :cond_26
    :goto_11
    invoke-interface {v5, v8}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v4, v8}, Ly9/e;->l(Landroid/widget/TextView;)V

    .line 587
    .line 588
    .line 589
    goto :goto_12

    .line 590
    :cond_27
    add-int/lit8 v0, v0, 0x1

    .line 591
    .line 592
    goto/16 :goto_9

    .line 593
    .line 594
    :cond_28
    add-int/lit8 v10, v10, 0x1

    .line 595
    .line 596
    goto/16 :goto_4

    .line 597
    .line 598
    :cond_29
    :goto_12
    return-void

    .line 599
    :pswitch_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    .line 601
    .line 602
    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 603
    .line 604
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 605
    .line 606
    .line 607
    const/4 v3, 0x0

    .line 608
    invoke-static {v3, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v2

    .line 612
    instance-of v4, v2, Ljava/lang/Integer;

    .line 613
    .line 614
    const/4 v5, 0x0

    .line 615
    if-eqz v4, :cond_2a

    .line 616
    .line 617
    check-cast v2, Ljava/lang/Integer;

    .line 618
    .line 619
    goto :goto_13

    .line 620
    :cond_2a
    move-object v2, v5

    .line 621
    :goto_13
    if-eqz v2, :cond_36

    .line 622
    .line 623
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 624
    .line 625
    .line 626
    move-result v2

    .line 627
    const v4, 0x4843525f    # 200009.48f

    .line 628
    .line 629
    .line 630
    if-eq v2, v4, :cond_2b

    .line 631
    .line 632
    goto/16 :goto_1a

    .line 633
    .line 634
    :cond_2b
    iget-object v2, v1, Lwb/yo;->b:Ljava/lang/Object;

    .line 635
    .line 636
    check-cast v2, Lwb/ep;

    .line 637
    .line 638
    monitor-enter v2

    .line 639
    :try_start_0
    sget-object v4, Lwb/ep;->c:Lwb/dp;

    .line 640
    .line 641
    sput-object v5, Lwb/ep;->c:Lwb/dp;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 642
    .line 643
    monitor-exit v2

    .line 644
    if-eqz v4, :cond_36

    .line 645
    .line 646
    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 647
    .line 648
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 649
    .line 650
    .line 651
    const/4 v6, 0x1

    .line 652
    invoke-static {v6, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v2

    .line 656
    instance-of v6, v2, Ljava/lang/Integer;

    .line 657
    .line 658
    if-eqz v6, :cond_2c

    .line 659
    .line 660
    check-cast v2, Ljava/lang/Integer;

    .line 661
    .line 662
    goto :goto_14

    .line 663
    :cond_2c
    move-object v2, v5

    .line 664
    :goto_14
    if-eqz v2, :cond_36

    .line 665
    .line 666
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 667
    .line 668
    .line 669
    move-result v2

    .line 670
    const/4 v6, -0x1

    .line 671
    if-eq v2, v6, :cond_2d

    .line 672
    .line 673
    goto/16 :goto_1a

    .line 674
    .line 675
    :cond_2d
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 676
    .line 677
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 678
    .line 679
    .line 680
    const/4 v2, 0x2

    .line 681
    invoke-static {v2, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    instance-of v2, v0, Landroid/content/Intent;

    .line 686
    .line 687
    if-eqz v2, :cond_2e

    .line 688
    .line 689
    check-cast v0, Landroid/content/Intent;

    .line 690
    .line 691
    goto :goto_15

    .line 692
    :cond_2e
    move-object v0, v5

    .line 693
    :goto_15
    if-eqz v0, :cond_36

    .line 694
    .line 695
    new-instance v2, Ljava/util/ArrayList;

    .line 696
    .line 697
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 701
    .line 702
    .line 703
    move-result-object v6

    .line 704
    if-eqz v6, :cond_2f

    .line 705
    .line 706
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 707
    .line 708
    .line 709
    :cond_2f
    invoke-virtual {v0}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    .line 710
    .line 711
    .line 712
    move-result-object v6

    .line 713
    if-eqz v6, :cond_34

    .line 714
    .line 715
    invoke-virtual {v6}, Landroid/content/ClipData;->getItemCount()I

    .line 716
    .line 717
    .line 718
    move-result v7

    .line 719
    :goto_16
    if-lt v3, v7, :cond_30

    .line 720
    .line 721
    goto :goto_19

    .line 722
    :cond_30
    :try_start_1
    invoke-virtual {v6, v3}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    if-eqz v0, :cond_31

    .line 727
    .line 728
    invoke-virtual {v0}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    .line 729
    .line 730
    .line 731
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 732
    goto :goto_18

    .line 733
    :catchall_0
    move-exception v0

    .line 734
    goto :goto_17

    .line 735
    :cond_31
    move-object v0, v5

    .line 736
    goto :goto_18

    .line 737
    :goto_17
    new-instance v8, Lsf/f;

    .line 738
    .line 739
    invoke-direct {v8, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 740
    .line 741
    .line 742
    move-object v0, v8

    .line 743
    :goto_18
    nop

    .line 744
    instance-of v8, v0, Lsf/f;

    .line 745
    .line 746
    if-eqz v8, :cond_32

    .line 747
    .line 748
    move-object v0, v5

    .line 749
    :cond_32
    check-cast v0, Landroid/net/Uri;

    .line 750
    .line 751
    if-eqz v0, :cond_33

    .line 752
    .line 753
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 754
    .line 755
    .line 756
    :cond_33
    add-int/lit8 v3, v3, 0x1

    .line 757
    .line 758
    goto :goto_16

    .line 759
    :cond_34
    :goto_19
    invoke-static {v2}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 764
    .line 765
    .line 766
    move-result-object v0

    .line 767
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 768
    .line 769
    .line 770
    move-result v2

    .line 771
    if-eqz v2, :cond_35

    .line 772
    .line 773
    goto :goto_1a

    .line 774
    :cond_35
    new-instance v2, Ljava/lang/Thread;

    .line 775
    .line 776
    iget-object v3, v1, Lwb/yo;->b:Ljava/lang/Object;

    .line 777
    .line 778
    check-cast v3, Lwb/ep;

    .line 779
    .line 780
    new-instance v5, Lrb/g;

    .line 781
    .line 782
    invoke-direct {v5, v0, v3, v4}, Lrb/g;-><init>(Ljava/util/List;Lwb/ep;Lwb/dp;)V

    .line 783
    .line 784
    .line 785
    const-string v0, "Hchat-Plugin-Market-Files"

    .line 786
    .line 787
    invoke-direct {v2, v5, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 788
    .line 789
    .line 790
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 791
    .line 792
    .line 793
    goto :goto_1a

    .line 794
    :catchall_1
    move-exception v0

    .line 795
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 796
    throw v0

    .line 797
    :cond_36
    :goto_1a
    return-void

    .line 798
    :pswitch_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 799
    .line 800
    .line 801
    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 802
    .line 803
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 804
    .line 805
    .line 806
    const/4 v3, 0x0

    .line 807
    invoke-static {v3, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 808
    .line 809
    .line 810
    move-result-object v2

    .line 811
    instance-of v4, v2, Ljava/lang/Integer;

    .line 812
    .line 813
    const/4 v5, 0x0

    .line 814
    if-eqz v4, :cond_37

    .line 815
    .line 816
    check-cast v2, Ljava/lang/Integer;

    .line 817
    .line 818
    goto :goto_1b

    .line 819
    :cond_37
    move-object v2, v5

    .line 820
    :goto_1b
    if-eqz v2, :cond_4a

    .line 821
    .line 822
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 823
    .line 824
    .line 825
    move-result v2

    .line 826
    const v4, 0x4843525d    # 200009.45f

    .line 827
    .line 828
    .line 829
    if-eq v2, v4, :cond_38

    .line 830
    .line 831
    goto/16 :goto_28

    .line 832
    .line 833
    :cond_38
    iget-object v2, v1, Lwb/yo;->b:Ljava/lang/Object;

    .line 834
    .line 835
    check-cast v2, Lwb/zo;

    .line 836
    .line 837
    monitor-enter v2

    .line 838
    :try_start_3
    sget-object v4, Lwb/zo;->c:Lwb/xo;

    .line 839
    .line 840
    sput-object v5, Lwb/zo;->c:Lwb/xo;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 841
    .line 842
    monitor-exit v2

    .line 843
    if-eqz v4, :cond_4a

    .line 844
    .line 845
    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 846
    .line 847
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 848
    .line 849
    .line 850
    const/4 v6, 0x1

    .line 851
    invoke-static {v6, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v2

    .line 855
    instance-of v7, v2, Ljava/lang/Integer;

    .line 856
    .line 857
    if-eqz v7, :cond_39

    .line 858
    .line 859
    check-cast v2, Ljava/lang/Integer;

    .line 860
    .line 861
    goto :goto_1c

    .line 862
    :cond_39
    move-object v2, v5

    .line 863
    :goto_1c
    if-eqz v2, :cond_4a

    .line 864
    .line 865
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 866
    .line 867
    .line 868
    move-result v2

    .line 869
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 870
    .line 871
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 872
    .line 873
    .line 874
    const/4 v7, 0x2

    .line 875
    invoke-static {v7, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 876
    .line 877
    .line 878
    move-result-object v0

    .line 879
    instance-of v7, v0, Landroid/content/Intent;

    .line 880
    .line 881
    if-eqz v7, :cond_3a

    .line 882
    .line 883
    check-cast v0, Landroid/content/Intent;

    .line 884
    .line 885
    goto :goto_1d

    .line 886
    :cond_3a
    move-object v0, v5

    .line 887
    :goto_1d
    const/4 v7, -0x1

    .line 888
    if-ne v2, v7, :cond_4a

    .line 889
    .line 890
    if-nez v0, :cond_3b

    .line 891
    .line 892
    goto/16 :goto_28

    .line 893
    .line 894
    :cond_3b
    const-string v2, "kwebmap_slat"

    .line 895
    .line 896
    const-wide/high16 v7, 0x7ff8000000000000L    # Double.NaN

    .line 897
    .line 898
    invoke-virtual {v0, v2, v7, v8}, Landroid/content/Intent;->getDoubleExtra(Ljava/lang/String;D)D

    .line 899
    .line 900
    .line 901
    move-result-wide v9

    .line 902
    const-string v2, "kwebmap_lng"

    .line 903
    .line 904
    invoke-virtual {v0, v2, v7, v8}, Landroid/content/Intent;->getDoubleExtra(Ljava/lang/String;D)D

    .line 905
    .line 906
    .line 907
    move-result-wide v7

    .line 908
    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 909
    .line 910
    .line 911
    move-result-object v2

    .line 912
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 913
    .line 914
    .line 915
    move-result-object v7

    .line 916
    invoke-static {v2, v7}, Lwb/ho;->v7(Ljava/lang/Double;Ljava/lang/Double;)Lsf/e;

    .line 917
    .line 918
    .line 919
    move-result-object v2

    .line 920
    if-eqz v2, :cond_3c

    .line 921
    .line 922
    goto/16 :goto_27

    .line 923
    .line 924
    :cond_3c
    :try_start_4
    const-string v2, "KLocationIntent"

    .line 925
    .line 926
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 927
    .line 928
    .line 929
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 930
    goto :goto_1e

    .line 931
    :catchall_2
    move-exception v0

    .line 932
    new-instance v2, Lsf/f;

    .line 933
    .line 934
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 935
    .line 936
    .line 937
    move-object v0, v2

    .line 938
    :goto_1e
    nop

    .line 939
    instance-of v2, v0, Lsf/f;

    .line 940
    .line 941
    if-eqz v2, :cond_3d

    .line 942
    .line 943
    move-object v0, v5

    .line 944
    :cond_3d
    check-cast v0, Landroid/os/Parcelable;

    .line 945
    .line 946
    if-eqz v0, :cond_48

    .line 947
    .line 948
    const-string v2, "d"

    .line 949
    .line 950
    invoke-static {v0, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 951
    .line 952
    .line 953
    move-result-object v2

    .line 954
    instance-of v7, v2, Ljava/lang/Number;

    .line 955
    .line 956
    if-eqz v7, :cond_3e

    .line 957
    .line 958
    check-cast v2, Ljava/lang/Number;

    .line 959
    .line 960
    goto :goto_1f

    .line 961
    :cond_3e
    move-object v2, v5

    .line 962
    :goto_1f
    if-eqz v2, :cond_3f

    .line 963
    .line 964
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 965
    .line 966
    .line 967
    move-result-wide v7

    .line 968
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 969
    .line 970
    .line 971
    move-result-object v2

    .line 972
    goto :goto_20

    .line 973
    :cond_3f
    move-object v2, v5

    .line 974
    :goto_20
    const-string v7, "e"

    .line 975
    .line 976
    invoke-static {v0, v7}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 977
    .line 978
    .line 979
    move-result-object v7

    .line 980
    instance-of v8, v7, Ljava/lang/Number;

    .line 981
    .line 982
    if-eqz v8, :cond_40

    .line 983
    .line 984
    check-cast v7, Ljava/lang/Number;

    .line 985
    .line 986
    goto :goto_21

    .line 987
    :cond_40
    move-object v7, v5

    .line 988
    :goto_21
    if-eqz v7, :cond_41

    .line 989
    .line 990
    invoke-virtual {v7}, Ljava/lang/Number;->doubleValue()D

    .line 991
    .line 992
    .line 993
    move-result-wide v7

    .line 994
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 995
    .line 996
    .line 997
    move-result-object v7

    .line 998
    goto :goto_22

    .line 999
    :cond_41
    move-object v7, v5

    .line 1000
    :goto_22
    if-eqz v2, :cond_42

    .line 1001
    .line 1002
    if-eqz v7, :cond_42

    .line 1003
    .line 1004
    invoke-static {v2, v7}, Lwb/ho;->v7(Ljava/lang/Double;Ljava/lang/Double;)Lsf/e;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v2

    .line 1008
    if-eqz v2, :cond_42

    .line 1009
    .line 1010
    move-object v5, v2

    .line 1011
    goto/16 :goto_26

    .line 1012
    .line 1013
    :cond_42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v2

    .line 1017
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v2

    .line 1021
    invoke-static {v2}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v2

    .line 1025
    new-instance v7, Lwb/jk;

    .line 1026
    .line 1027
    const/16 v8, 0x1b

    .line 1028
    .line 1029
    invoke-direct {v7, v8}, Lwb/jk;-><init>(I)V

    .line 1030
    .line 1031
    .line 1032
    new-instance v8, Lng/i;

    .line 1033
    .line 1034
    invoke-direct {v8, v2, v6, v7}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 1035
    .line 1036
    .line 1037
    new-instance v2, Lnb/a;

    .line 1038
    .line 1039
    const/16 v7, 0x1a

    .line 1040
    .line 1041
    invoke-direct {v2, v0, v7}, Lnb/a;-><init>(Ljava/lang/Object;I)V

    .line 1042
    .line 1043
    .line 1044
    invoke-static {v8, v2}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v2

    .line 1048
    new-instance v7, Lng/h;

    .line 1049
    .line 1050
    invoke-direct {v7, v2}, Lng/h;-><init>(Lng/i;)V

    .line 1051
    .line 1052
    .line 1053
    :cond_43
    invoke-virtual {v7}, Lng/h;->hasNext()Z

    .line 1054
    .line 1055
    .line 1056
    move-result v2

    .line 1057
    if-eqz v2, :cond_44

    .line 1058
    .line 1059
    invoke-virtual {v7}, Lng/h;->next()Ljava/lang/Object;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v2

    .line 1063
    move-object v8, v2

    .line 1064
    check-cast v8, Ljava/lang/String;

    .line 1065
    .line 1066
    const-string v9, "lat"

    .line 1067
    .line 1068
    invoke-static {v8, v9, v6}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1069
    .line 1070
    .line 1071
    move-result v9

    .line 1072
    if-eqz v9, :cond_43

    .line 1073
    .line 1074
    const-string v9, "lng"

    .line 1075
    .line 1076
    invoke-static {v8, v9, v6}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1077
    .line 1078
    .line 1079
    move-result v8

    .line 1080
    if-eqz v8, :cond_43

    .line 1081
    .line 1082
    goto :goto_23

    .line 1083
    :cond_44
    move-object v2, v5

    .line 1084
    :goto_23
    check-cast v2, Ljava/lang/String;

    .line 1085
    .line 1086
    if-eqz v2, :cond_45

    .line 1087
    .line 1088
    goto :goto_24

    .line 1089
    :cond_45
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v2

    .line 1093
    :goto_24
    const-string v0, "(?:lat|latitude)\\s*[:= ]\\s*([-+]?[0-9]*\\.?[0-9]+)"

    .line 1094
    .line 1095
    const/16 v7, 0x42

    .line 1096
    .line 1097
    invoke-static {v0, v7}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v0

    .line 1101
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1102
    .line 1103
    .line 1104
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1105
    .line 1106
    .line 1107
    invoke-virtual {v0, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v0

    .line 1111
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1112
    .line 1113
    .line 1114
    invoke-static {v0, v3, v2}, La7/a;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v0

    .line 1118
    if-eqz v0, :cond_46

    .line 1119
    .line 1120
    invoke-virtual {v0}, Log/i;->a()Ljava/util/List;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v0

    .line 1124
    invoke-static {v6, v0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v0

    .line 1128
    check-cast v0, Ljava/lang/String;

    .line 1129
    .line 1130
    if-eqz v0, :cond_46

    .line 1131
    .line 1132
    invoke-static {v0}, Log/s;->U(Ljava/lang/String;)Ljava/lang/Double;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v0

    .line 1136
    goto :goto_25

    .line 1137
    :cond_46
    move-object v0, v5

    .line 1138
    :goto_25
    const-string v8, "(?:lng|lon|longitude)\\s*[:= ]\\s*([-+]?[0-9]*\\.?[0-9]+)"

    .line 1139
    .line 1140
    invoke-static {v8, v7}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v7

    .line 1144
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1145
    .line 1146
    .line 1147
    invoke-virtual {v7, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v7

    .line 1151
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1152
    .line 1153
    .line 1154
    invoke-static {v7, v3, v2}, La7/a;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v2

    .line 1158
    if-eqz v2, :cond_47

    .line 1159
    .line 1160
    invoke-virtual {v2}, Log/i;->a()Ljava/util/List;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v2

    .line 1164
    invoke-static {v6, v2}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v2

    .line 1168
    check-cast v2, Ljava/lang/String;

    .line 1169
    .line 1170
    if-eqz v2, :cond_47

    .line 1171
    .line 1172
    invoke-static {v2}, Log/s;->U(Ljava/lang/String;)Ljava/lang/Double;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v5

    .line 1176
    :cond_47
    invoke-static {v0, v5}, Lwb/ho;->v7(Ljava/lang/Double;Ljava/lang/Double;)Lsf/e;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v5

    .line 1180
    :cond_48
    :goto_26
    move-object v2, v5

    .line 1181
    :goto_27
    if-nez v2, :cond_49

    .line 1182
    .line 1183
    iget-object v0, v4, Lwb/xo;->a:Landroid/app/Activity;

    .line 1184
    .line 1185
    const-string v2, "\u89e3\u6790\u5fae\u4fe1\u5730\u56fe\u9009\u70b9\u5931\u8d25"

    .line 1186
    .line 1187
    invoke-static {v0, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v0

    .line 1191
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1192
    .line 1193
    .line 1194
    goto :goto_28

    .line 1195
    :cond_49
    iget-object v0, v4, Lwb/xo;->b:Lwb/sc;

    .line 1196
    .line 1197
    iget-object v3, v2, Lsf/e;->g:Ljava/lang/Object;

    .line 1198
    .line 1199
    iget-object v2, v2, Lsf/e;->h:Ljava/lang/Object;

    .line 1200
    .line 1201
    invoke-virtual {v0, v3, v2}, Lwb/sc;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1202
    .line 1203
    .line 1204
    goto :goto_28

    .line 1205
    :catchall_3
    move-exception v0

    .line 1206
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 1207
    throw v0

    .line 1208
    :cond_4a
    :goto_28
    return-void

    .line 1209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 37

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget v0, v1, Lwb/yo;->a:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, v1, Lwb/yo;->b:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-super/range {p0 .. p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-static {v5, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v0, v6

    .line 32
    :goto_0
    instance-of v5, v0, Ljava/lang/Boolean;

    .line 33
    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    check-cast v0, Ljava/lang/Boolean;

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move-object v0, v6

    .line 40
    :goto_1
    if-eqz v0, :cond_3

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    check-cast v4, Lz8/g;

    .line 47
    .line 48
    iget-object v4, v4, Lz8/g;->c:Landroid/content/SharedPreferences;

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    const-string v0, "call_block_outgoing_ringtone"

    .line 53
    .line 54
    invoke-interface {v4, v0, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    const-string v0, "call_block_incoming_ringtone"

    .line 60
    .line 61
    invoke-interface {v4, v0, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    :goto_2
    if-eqz v0, :cond_3

    .line 66
    .line 67
    invoke-virtual {v2, v6}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_3
    return-void

    .line 71
    :pswitch_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 75
    .line 76
    instance-of v7, v0, Landroid/app/Activity;

    .line 77
    .line 78
    if-eqz v7, :cond_4

    .line 79
    .line 80
    check-cast v0, Landroid/app/Activity;

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_4
    move-object v0, v6

    .line 84
    :goto_3
    if-eqz v0, :cond_2e

    .line 85
    .line 86
    iget-object v7, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 87
    .line 88
    if-eqz v7, :cond_5

    .line 89
    .line 90
    invoke-static {v3, v7}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    goto :goto_4

    .line 95
    :cond_5
    move-object v7, v6

    .line 96
    :goto_4
    instance-of v8, v7, Landroid/view/MotionEvent;

    .line 97
    .line 98
    if-eqz v8, :cond_6

    .line 99
    .line 100
    check-cast v7, Landroid/view/MotionEvent;

    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_6
    move-object v7, v6

    .line 104
    :goto_5
    if-eqz v7, :cond_2e

    .line 105
    .line 106
    check-cast v4, Lya/g;

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    const-string v9, "com.tencent.mm.ui.LauncherUI"

    .line 117
    .line 118
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    if-nez v8, :cond_7

    .line 123
    .line 124
    invoke-virtual {v4}, Lya/g;->a()V

    .line 125
    .line 126
    .line 127
    goto/16 :goto_22

    .line 128
    .line 129
    :cond_7
    sget-object v8, Lya/i;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 130
    .line 131
    const-string v8, "Hchat_quick_mark_read_config"

    .line 132
    .line 133
    invoke-static {v0, v8}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    const-string v9, "drag_read_enable"

    .line 138
    .line 139
    invoke-interface {v8, v9, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 140
    .line 141
    .line 142
    move-result v8

    .line 143
    if-nez v8, :cond_8

    .line 144
    .line 145
    invoke-virtual {v4}, Lya/g;->a()V

    .line 146
    .line 147
    .line 148
    goto/16 :goto_22

    .line 149
    .line 150
    :cond_8
    invoke-virtual {v7}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 151
    .line 152
    .line 153
    move-result v8

    .line 154
    const/4 v9, 0x1

    .line 155
    if-eqz v8, :cond_15

    .line 156
    .line 157
    if-eq v8, v9, :cond_e

    .line 158
    .line 159
    if-eq v8, v5, :cond_a

    .line 160
    .line 161
    const/4 v0, 0x3

    .line 162
    if-eq v8, v0, :cond_9

    .line 163
    .line 164
    iget-object v0, v4, Lya/g;->d:Lya/a;

    .line 165
    .line 166
    if-eqz v0, :cond_2e

    .line 167
    .line 168
    goto/16 :goto_c

    .line 169
    .line 170
    :cond_9
    iput-object v6, v4, Lya/g;->c:Lya/c;

    .line 171
    .line 172
    iget-object v0, v4, Lya/g;->d:Lya/a;

    .line 173
    .line 174
    if-eqz v0, :cond_2e

    .line 175
    .line 176
    invoke-virtual {v0}, Lya/a;->c()V

    .line 177
    .line 178
    .line 179
    iput-object v6, v4, Lya/g;->d:Lya/a;

    .line 180
    .line 181
    goto/16 :goto_c

    .line 182
    .line 183
    :cond_a
    iget-object v0, v4, Lya/g;->d:Lya/a;

    .line 184
    .line 185
    if-nez v0, :cond_d

    .line 186
    .line 187
    iget-object v0, v4, Lya/g;->c:Lya/c;

    .line 188
    .line 189
    if-eqz v0, :cond_2e

    .line 190
    .line 191
    iget v3, v0, Lya/c;->d:F

    .line 192
    .line 193
    iget v5, v0, Lya/c;->c:F

    .line 194
    .line 195
    iget-object v8, v0, Lya/c;->b:Lya/b;

    .line 196
    .line 197
    invoke-virtual {v7}, Landroid/view/MotionEvent;->getRawX()F

    .line 198
    .line 199
    .line 200
    move-result v10

    .line 201
    invoke-virtual {v7}, Landroid/view/MotionEvent;->getRawY()F

    .line 202
    .line 203
    .line 204
    move-result v11

    .line 205
    sub-float/2addr v10, v5

    .line 206
    sub-float/2addr v11, v3

    .line 207
    iget-object v12, v8, Lya/b;->a:Landroid/view/View;

    .line 208
    .line 209
    iget-object v13, v8, Lya/b;->b:Landroid/view/View;

    .line 210
    .line 211
    invoke-virtual {v12}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 212
    .line 213
    .line 214
    move-result-object v12

    .line 215
    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 216
    .line 217
    .line 218
    move-result-object v12

    .line 219
    const/high16 v14, 0x41900000    # 18.0f

    .line 220
    .line 221
    invoke-static {v9, v14, v12}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 222
    .line 223
    .line 224
    move-result v12

    .line 225
    float-to-int v12, v12

    .line 226
    neg-int v12, v12

    .line 227
    int-to-float v12, v12

    .line 228
    cmpg-float v12, v11, v12

    .line 229
    .line 230
    if-gtz v12, :cond_2e

    .line 231
    .line 232
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 233
    .line 234
    .line 235
    move-result v11

    .line 236
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 237
    .line 238
    .line 239
    move-result v10

    .line 240
    const v12, 0x3f4ccccd    # 0.8f

    .line 241
    .line 242
    .line 243
    mul-float/2addr v10, v12

    .line 244
    cmpl-float v10, v11, v10

    .line 245
    .line 246
    if-lez v10, :cond_2e

    .line 247
    .line 248
    iput-object v6, v4, Lya/g;->c:Lya/c;

    .line 249
    .line 250
    new-instance v6, Lya/a;

    .line 251
    .line 252
    iget-object v0, v0, Lya/c;->a:Landroid/view/ViewGroup;

    .line 253
    .line 254
    invoke-direct {v6, v0, v8, v5, v3}, Lya/a;-><init>(Landroid/view/ViewGroup;Lya/b;FF)V

    .line 255
    .line 256
    .line 257
    iput-object v6, v4, Lya/g;->d:Lya/a;

    .line 258
    .line 259
    if-eqz v13, :cond_b

    .line 260
    .line 261
    invoke-virtual {v13}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    if-eqz v0, :cond_b

    .line 266
    .line 267
    invoke-interface {v0, v9}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 268
    .line 269
    .line 270
    :cond_b
    if-eqz v13, :cond_c

    .line 271
    .line 272
    invoke-virtual {v13}, Landroid/view/View;->bringToFront()V

    .line 273
    .line 274
    .line 275
    :cond_c
    invoke-virtual {v7}, Landroid/view/MotionEvent;->getRawX()F

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    invoke-virtual {v7}, Landroid/view/MotionEvent;->getRawY()F

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    invoke-virtual {v6, v0, v3}, Lya/a;->b(FF)V

    .line 284
    .line 285
    .line 286
    goto/16 :goto_c

    .line 287
    .line 288
    :cond_d
    invoke-virtual {v7}, Landroid/view/MotionEvent;->getRawX()F

    .line 289
    .line 290
    .line 291
    move-result v3

    .line 292
    invoke-virtual {v7}, Landroid/view/MotionEvent;->getRawY()F

    .line 293
    .line 294
    .line 295
    move-result v4

    .line 296
    invoke-virtual {v0, v3, v4}, Lya/a;->b(FF)V

    .line 297
    .line 298
    .line 299
    goto/16 :goto_c

    .line 300
    .line 301
    :cond_e
    iget-object v5, v4, Lya/g;->d:Lya/a;

    .line 302
    .line 303
    if-nez v5, :cond_f

    .line 304
    .line 305
    iput-object v6, v4, Lya/g;->c:Lya/c;

    .line 306
    .line 307
    goto/16 :goto_22

    .line 308
    .line 309
    :cond_f
    iget-object v0, v5, Lya/a;->b:Lya/b;

    .line 310
    .line 311
    invoke-virtual {v7}, Landroid/view/MotionEvent;->getRawX()F

    .line 312
    .line 313
    .line 314
    move-result v8

    .line 315
    invoke-virtual {v7}, Landroid/view/MotionEvent;->getRawY()F

    .line 316
    .line 317
    .line 318
    move-result v7

    .line 319
    invoke-virtual {v5, v8, v7}, Lya/a;->b(FF)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v5}, Lya/a;->d()Z

    .line 323
    .line 324
    .line 325
    move-result v7

    .line 326
    if-eqz v7, :cond_13

    .line 327
    .line 328
    :try_start_0
    iget-object v7, v0, Lya/b;->a:Landroid/view/View;

    .line 329
    .line 330
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 331
    .line 332
    .line 333
    move-result-object v7

    .line 334
    invoke-static {v7, v9}, Lya/i;->e(Landroid/content/Context;Z)I

    .line 335
    .line 336
    .line 337
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 338
    if-ltz v7, :cond_10

    .line 339
    .line 340
    goto :goto_6

    .line 341
    :cond_10
    move v9, v3

    .line 342
    :goto_6
    if-eqz v9, :cond_11

    .line 343
    .line 344
    :try_start_1
    iget-object v7, v5, Lya/a;->e:Landroid/view/View;

    .line 345
    .line 346
    invoke-virtual {v7}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 347
    .line 348
    .line 349
    move-result-object v7

    .line 350
    invoke-virtual {v7}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v5}, Lya/a;->a()V

    .line 354
    .line 355
    .line 356
    iget-object v0, v0, Lya/b;->b:Landroid/view/View;

    .line 357
    .line 358
    if-eqz v0, :cond_11

    .line 359
    .line 360
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    if-eqz v0, :cond_11

    .line 365
    .line 366
    invoke-interface {v0, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 367
    .line 368
    .line 369
    goto :goto_8

    .line 370
    :goto_7
    move v3, v9

    .line 371
    goto :goto_9

    .line 372
    :cond_11
    :goto_8
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 373
    .line 374
    goto :goto_a

    .line 375
    :catchall_0
    move-exception v0

    .line 376
    goto :goto_7

    .line 377
    :catchall_1
    move-exception v0

    .line 378
    :goto_9
    new-instance v7, Lsf/f;

    .line 379
    .line 380
    invoke-direct {v7, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 381
    .line 382
    .line 383
    move v9, v3

    .line 384
    move-object v0, v7

    .line 385
    :goto_a
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    if-eqz v0, :cond_12

    .line 390
    .line 391
    iget-object v3, v4, Lya/g;->a:Ly9/b;

    .line 392
    .line 393
    const-string v7, "\u5feb\u6377\u5df2\u8bfb\u89e6\u53d1\u5931\u8d25"

    .line 394
    .line 395
    invoke-virtual {v3, v7, v0}, Ly9/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    :cond_12
    if-nez v9, :cond_14

    .line 399
    .line 400
    invoke-virtual {v5}, Lya/a;->c()V

    .line 401
    .line 402
    .line 403
    goto :goto_b

    .line 404
    :cond_13
    invoke-virtual {v5}, Lya/a;->c()V

    .line 405
    .line 406
    .line 407
    :cond_14
    :goto_b
    iput-object v6, v4, Lya/g;->d:Lya/a;

    .line 408
    .line 409
    :goto_c
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 410
    .line 411
    invoke-virtual {v2, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    goto/16 :goto_22

    .line 415
    .line 416
    :cond_15
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    if-eqz v0, :cond_16

    .line 421
    .line 422
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    goto :goto_d

    .line 427
    :cond_16
    move-object v0, v6

    .line 428
    :goto_d
    instance-of v2, v0, Landroid/view/ViewGroup;

    .line 429
    .line 430
    if-eqz v2, :cond_17

    .line 431
    .line 432
    check-cast v0, Landroid/view/ViewGroup;

    .line 433
    .line 434
    move-object v11, v0

    .line 435
    goto :goto_e

    .line 436
    :cond_17
    move-object v11, v6

    .line 437
    :goto_e
    if-eqz v11, :cond_2e

    .line 438
    .line 439
    const-string v0, "Hchat:MiuixSettingsPage"

    .line 440
    .line 441
    invoke-virtual {v11, v0}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    if-eqz v0, :cond_18

    .line 446
    .line 447
    invoke-virtual {v4}, Lya/g;->a()V

    .line 448
    .line 449
    .line 450
    goto/16 :goto_22

    .line 451
    .line 452
    :cond_18
    invoke-virtual {v7}, Landroid/view/MotionEvent;->getRawX()F

    .line 453
    .line 454
    .line 455
    move-result v0

    .line 456
    invoke-virtual {v7}, Landroid/view/MotionEvent;->getRawY()F

    .line 457
    .line 458
    .line 459
    move-result v2

    .line 460
    invoke-virtual {v11}, Landroid/view/View;->getHeight()I

    .line 461
    .line 462
    .line 463
    move-result v8

    .line 464
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 465
    .line 466
    .line 467
    move-result-object v10

    .line 468
    if-lez v8, :cond_19

    .line 469
    .line 470
    goto :goto_f

    .line 471
    :cond_19
    move-object v10, v6

    .line 472
    :goto_f
    if-eqz v10, :cond_1a

    .line 473
    .line 474
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 475
    .line 476
    .line 477
    move-result v8

    .line 478
    goto :goto_10

    .line 479
    :cond_1a
    invoke-virtual {v11}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 480
    .line 481
    .line 482
    move-result-object v8

    .line 483
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 484
    .line 485
    .line 486
    move-result-object v8

    .line 487
    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 488
    .line 489
    :goto_10
    new-instance v10, Ljava/util/ArrayList;

    .line 490
    .line 491
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 492
    .line 493
    .line 494
    new-instance v12, Lth/d;

    .line 495
    .line 496
    invoke-direct {v12, v4, v8, v10}, Lth/d;-><init>(Lya/g;ILjava/util/ArrayList;)V

    .line 497
    .line 498
    .line 499
    invoke-static {v11, v12}, Lya/g;->d(Landroid/view/View;Lfg/l;)V

    .line 500
    .line 501
    .line 502
    new-instance v8, Lr4/m;

    .line 503
    .line 504
    const/4 v12, 0x6

    .line 505
    invoke-direct {v8, v12}, Lr4/m;-><init>(I)V

    .line 506
    .line 507
    .line 508
    new-instance v12, Lwb/kn;

    .line 509
    .line 510
    const/16 v13, 0xc

    .line 511
    .line 512
    invoke-direct {v12, v8, v13}, Lwb/kn;-><init>(Ljava/lang/Object;I)V

    .line 513
    .line 514
    .line 515
    invoke-static {v10, v12}, Ltf/m;->E1(Ljava/util/ArrayList;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v8

    .line 519
    check-cast v8, Landroid/view/ViewGroup;

    .line 520
    .line 521
    if-eqz v8, :cond_1f

    .line 522
    .line 523
    new-array v10, v5, [I

    .line 524
    .line 525
    invoke-virtual {v8, v10}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 526
    .line 527
    .line 528
    aget v12, v10, v3

    .line 529
    .line 530
    aget v10, v10, v9

    .line 531
    .line 532
    invoke-static {v8}, Luf/d;->e(Landroid/view/View;)I

    .line 533
    .line 534
    .line 535
    move-result v13

    .line 536
    invoke-static {v8}, Luf/d;->d(Landroid/view/View;)I

    .line 537
    .line 538
    .line 539
    move-result v14

    .line 540
    const/high16 v15, 0x40000000    # 2.0f

    .line 541
    .line 542
    if-lez v13, :cond_1b

    .line 543
    .line 544
    if-gtz v14, :cond_1c

    .line 545
    .line 546
    :cond_1b
    move/from16 v16, v3

    .line 547
    .line 548
    goto :goto_11

    .line 549
    :cond_1c
    move/from16 v16, v3

    .line 550
    .line 551
    invoke-static {v8}, Lya/g;->c(Landroid/view/View;)Landroid/widget/TextView;

    .line 552
    .line 553
    .line 554
    move-result-object v3

    .line 555
    if-eqz v3, :cond_1e

    .line 556
    .line 557
    new-array v6, v5, [I

    .line 558
    .line 559
    invoke-virtual {v3, v6}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 560
    .line 561
    .line 562
    aget v6, v6, v16

    .line 563
    .line 564
    int-to-float v6, v6

    .line 565
    invoke-static {v3}, Luf/d;->e(Landroid/view/View;)I

    .line 566
    .line 567
    .line 568
    move-result v3

    .line 569
    int-to-float v3, v3

    .line 570
    div-float/2addr v3, v15

    .line 571
    add-float/2addr v3, v6

    .line 572
    int-to-float v6, v13

    .line 573
    sget-object v13, Lya/g;->f:Ljava/util/Set;

    .line 574
    .line 575
    invoke-interface {v13}, Ljava/util/Set;->size()I

    .line 576
    .line 577
    .line 578
    move-result v13

    .line 579
    int-to-float v13, v13

    .line 580
    div-float v13, v6, v13

    .line 581
    .line 582
    move/from16 p1, v15

    .line 583
    .line 584
    const/high16 v15, 0x42400000    # 48.0f

    .line 585
    .line 586
    invoke-static {v8, v15}, Luf/d;->b(Landroid/view/View;F)I

    .line 587
    .line 588
    .line 589
    move-result v15

    .line 590
    int-to-float v15, v15

    .line 591
    cmpg-float v18, v13, v15

    .line 592
    .line 593
    if-gez v18, :cond_1d

    .line 594
    .line 595
    move v13, v15

    .line 596
    :cond_1d
    div-float v13, v13, p1

    .line 597
    .line 598
    sub-float v15, v3, v13

    .line 599
    .line 600
    int-to-float v10, v10

    .line 601
    add-float/2addr v3, v13

    .line 602
    int-to-float v13, v14

    .line 603
    const v14, 0x3f3851ec    # 0.72f

    .line 604
    .line 605
    .line 606
    mul-float/2addr v14, v13

    .line 607
    add-float/2addr v14, v10

    .line 608
    int-to-float v12, v12

    .line 609
    add-float/2addr v6, v12

    .line 610
    add-float/2addr v13, v10

    .line 611
    move/from16 v18, v9

    .line 612
    .line 613
    new-instance v9, Lya/f;

    .line 614
    .line 615
    invoke-static {v15, v12}, Ljava/lang/Math;->max(FF)F

    .line 616
    .line 617
    .line 618
    move-result v12

    .line 619
    invoke-static {v10, v10}, Ljava/lang/Math;->max(FF)F

    .line 620
    .line 621
    .line 622
    move-result v10

    .line 623
    invoke-static {v3, v6}, Ljava/lang/Math;->min(FF)F

    .line 624
    .line 625
    .line 626
    move-result v3

    .line 627
    invoke-static {v14, v13}, Ljava/lang/Math;->min(FF)F

    .line 628
    .line 629
    .line 630
    move-result v6

    .line 631
    invoke-direct {v9, v12, v10, v3, v6}, Lya/f;-><init>(FFFF)V

    .line 632
    .line 633
    .line 634
    goto :goto_12

    .line 635
    :cond_1e
    :goto_11
    move/from16 v18, v9

    .line 636
    .line 637
    move/from16 p1, v15

    .line 638
    .line 639
    const/4 v9, 0x0

    .line 640
    :goto_12
    if-eqz v9, :cond_1f

    .line 641
    .line 642
    invoke-virtual {v9, v0, v2}, Lya/f;->a(FF)Z

    .line 643
    .line 644
    .line 645
    move-result v3

    .line 646
    if-nez v3, :cond_20

    .line 647
    .line 648
    :cond_1f
    :goto_13
    const/4 v6, 0x0

    .line 649
    goto/16 :goto_21

    .line 650
    .line 651
    :cond_20
    new-instance v3, Ljava/util/ArrayList;

    .line 652
    .line 653
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 654
    .line 655
    .line 656
    new-instance v6, Lya/d;

    .line 657
    .line 658
    invoke-direct {v6, v4, v0, v2, v3}, Lya/d;-><init>(Lya/g;FFLjava/util/ArrayList;)V

    .line 659
    .line 660
    .line 661
    invoke-static {v8, v6}, Lya/g;->d(Landroid/view/View;Lfg/l;)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 665
    .line 666
    .line 667
    move-result v6

    .line 668
    if-nez v6, :cond_2b

    .line 669
    .line 670
    new-instance v0, Lr4/m;

    .line 671
    .line 672
    const/4 v2, 0x7

    .line 673
    invoke-direct {v0, v2}, Lr4/m;-><init>(I)V

    .line 674
    .line 675
    .line 676
    new-instance v2, Lwb/kn;

    .line 677
    .line 678
    const/16 v6, 0xd

    .line 679
    .line 680
    invoke-direct {v2, v0, v6}, Lwb/kn;-><init>(Ljava/lang/Object;I)V

    .line 681
    .line 682
    .line 683
    invoke-static {v3, v2}, Ltf/m;->E1(Ljava/util/ArrayList;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    check-cast v0, Lya/e;

    .line 688
    .line 689
    if-eqz v0, :cond_1f

    .line 690
    .line 691
    iget-object v0, v0, Lya/e;->a:Landroid/view/View;

    .line 692
    .line 693
    if-eqz v0, :cond_1f

    .line 694
    .line 695
    new-array v2, v5, [I

    .line 696
    .line 697
    invoke-virtual {v0, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 698
    .line 699
    .line 700
    instance-of v3, v0, Landroid/widget/TextView;

    .line 701
    .line 702
    if-eqz v3, :cond_21

    .line 703
    .line 704
    move-object v3, v0

    .line 705
    check-cast v3, Landroid/widget/TextView;

    .line 706
    .line 707
    goto :goto_14

    .line 708
    :cond_21
    const/4 v3, 0x0

    .line 709
    :goto_14
    new-instance v19, Lya/b;

    .line 710
    .line 711
    aget v22, v2, v16

    .line 712
    .line 713
    aget v23, v2, v18

    .line 714
    .line 715
    invoke-static {v0}, Luf/d;->e(Landroid/view/View;)I

    .line 716
    .line 717
    .line 718
    move-result v2

    .line 719
    move/from16 v5, v18

    .line 720
    .line 721
    if-ge v2, v5, :cond_22

    .line 722
    .line 723
    move/from16 v24, v5

    .line 724
    .line 725
    goto :goto_15

    .line 726
    :cond_22
    move/from16 v24, v2

    .line 727
    .line 728
    :goto_15
    invoke-static {v0}, Luf/d;->d(Landroid/view/View;)I

    .line 729
    .line 730
    .line 731
    move-result v2

    .line 732
    if-ge v2, v5, :cond_23

    .line 733
    .line 734
    const/16 v25, 0x1

    .line 735
    .line 736
    goto :goto_16

    .line 737
    :cond_23
    move/from16 v25, v2

    .line 738
    .line 739
    :goto_16
    if-eqz v3, :cond_24

    .line 740
    .line 741
    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 742
    .line 743
    .line 744
    move-result-object v2

    .line 745
    move-object/from16 v26, v2

    .line 746
    .line 747
    goto :goto_17

    .line 748
    :cond_24
    const/16 v26, 0x0

    .line 749
    .line 750
    :goto_17
    if-eqz v3, :cond_25

    .line 751
    .line 752
    invoke-virtual {v3}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 753
    .line 754
    .line 755
    move-result v2

    .line 756
    :goto_18
    move/from16 v27, v2

    .line 757
    .line 758
    goto :goto_19

    .line 759
    :cond_25
    const/4 v2, -0x1

    .line 760
    goto :goto_18

    .line 761
    :goto_19
    if-eqz v3, :cond_26

    .line 762
    .line 763
    invoke-virtual {v3}, Landroid/widget/TextView;->getTextSize()F

    .line 764
    .line 765
    .line 766
    move-result v2

    .line 767
    :goto_1a
    move/from16 v28, v2

    .line 768
    .line 769
    goto :goto_1b

    .line 770
    :cond_26
    const/4 v2, 0x0

    .line 771
    goto :goto_1a

    .line 772
    :goto_1b
    if-eqz v3, :cond_27

    .line 773
    .line 774
    invoke-virtual {v3}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    .line 775
    .line 776
    .line 777
    move-result-object v2

    .line 778
    move-object/from16 v29, v2

    .line 779
    .line 780
    goto :goto_1c

    .line 781
    :cond_27
    const/16 v29, 0x0

    .line 782
    .line 783
    :goto_1c
    if-eqz v3, :cond_28

    .line 784
    .line 785
    invoke-virtual {v3}, Landroid/widget/TextView;->getGravity()I

    .line 786
    .line 787
    .line 788
    move-result v2

    .line 789
    move/from16 v30, v2

    .line 790
    .line 791
    goto :goto_1d

    .line 792
    :cond_28
    move/from16 v30, v16

    .line 793
    .line 794
    :goto_1d
    if-eqz v3, :cond_29

    .line 795
    .line 796
    invoke-virtual {v3}, Landroid/widget/TextView;->getIncludeFontPadding()Z

    .line 797
    .line 798
    .line 799
    move-result v3

    .line 800
    move/from16 v31, v3

    .line 801
    .line 802
    goto :goto_1e

    .line 803
    :cond_29
    move/from16 v31, v16

    .line 804
    .line 805
    :goto_1e
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 806
    .line 807
    .line 808
    move-result v32

    .line 809
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 810
    .line 811
    .line 812
    move-result v33

    .line 813
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 814
    .line 815
    .line 816
    move-result v34

    .line 817
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 818
    .line 819
    .line 820
    move-result v35

    .line 821
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 822
    .line 823
    .line 824
    move-result-object v2

    .line 825
    if-eqz v2, :cond_2a

    .line 826
    .line 827
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 828
    .line 829
    .line 830
    move-result-object v2

    .line 831
    if-eqz v2, :cond_2a

    .line 832
    .line 833
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    .line 834
    .line 835
    .line 836
    move-result-object v2

    .line 837
    if-eqz v2, :cond_2a

    .line 838
    .line 839
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 840
    .line 841
    .line 842
    move-result-object v6

    .line 843
    move-object/from16 v36, v6

    .line 844
    .line 845
    goto :goto_1f

    .line 846
    :cond_2a
    const/16 v36, 0x0

    .line 847
    .line 848
    :goto_1f
    move-object/from16 v21, v0

    .line 849
    .line 850
    move-object/from16 v20, v0

    .line 851
    .line 852
    invoke-direct/range {v19 .. v36}, Lya/b;-><init>(Landroid/view/View;Landroid/view/View;IIIILjava/lang/CharSequence;IFLandroid/graphics/Typeface;IZIIIILandroid/graphics/drawable/Drawable;)V

    .line 853
    .line 854
    .line 855
    move-object/from16 v6, v19

    .line 856
    .line 857
    goto :goto_21

    .line 858
    :cond_2b
    invoke-virtual {v9, v0, v2}, Lya/f;->a(FF)Z

    .line 859
    .line 860
    .line 861
    move-result v3

    .line 862
    if-nez v3, :cond_2c

    .line 863
    .line 864
    goto/16 :goto_13

    .line 865
    .line 866
    :cond_2c
    const/high16 v3, 0x41200000    # 10.0f

    .line 867
    .line 868
    invoke-static {v11, v3}, Luf/d;->b(Landroid/view/View;F)I

    .line 869
    .line 870
    .line 871
    move-result v5

    .line 872
    const/4 v3, 0x1

    .line 873
    if-ge v5, v3, :cond_2d

    .line 874
    .line 875
    const/4 v15, 0x1

    .line 876
    goto :goto_20

    .line 877
    :cond_2d
    move v15, v5

    .line 878
    :goto_20
    new-instance v10, Lya/b;

    .line 879
    .line 880
    int-to-float v3, v15

    .line 881
    div-float v3, v3, p1

    .line 882
    .line 883
    sub-float/2addr v0, v3

    .line 884
    float-to-int v13, v0

    .line 885
    sub-float/2addr v2, v3

    .line 886
    float-to-int v14, v2

    .line 887
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 888
    .line 889
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 890
    .line 891
    .line 892
    const/4 v3, 0x1

    .line 893
    invoke-virtual {v0, v3}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 894
    .line 895
    .line 896
    const/16 v2, 0xfa

    .line 897
    .line 898
    const/16 v3, 0x51

    .line 899
    .line 900
    invoke-static {v2, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 901
    .line 902
    .line 903
    move-result v2

    .line 904
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 905
    .line 906
    .line 907
    const/4 v12, 0x0

    .line 908
    const/16 v17, 0x0

    .line 909
    .line 910
    const/16 v18, -0x1

    .line 911
    .line 912
    const/16 v19, 0x0

    .line 913
    .line 914
    const/16 v20, 0x0

    .line 915
    .line 916
    const/16 v21, 0x0

    .line 917
    .line 918
    const/16 v22, 0x0

    .line 919
    .line 920
    const/16 v23, 0x0

    .line 921
    .line 922
    const/16 v24, 0x0

    .line 923
    .line 924
    const/16 v25, 0x0

    .line 925
    .line 926
    const/16 v26, 0x0

    .line 927
    .line 928
    move/from16 v16, v15

    .line 929
    .line 930
    move-object/from16 v27, v0

    .line 931
    .line 932
    invoke-direct/range {v10 .. v27}, Lya/b;-><init>(Landroid/view/View;Landroid/view/View;IIIILjava/lang/CharSequence;IFLandroid/graphics/Typeface;IZIIIILandroid/graphics/drawable/Drawable;)V

    .line 933
    .line 934
    .line 935
    move-object v6, v10

    .line 936
    :goto_21
    if-eqz v6, :cond_2e

    .line 937
    .line 938
    invoke-virtual {v4}, Lya/g;->a()V

    .line 939
    .line 940
    .line 941
    new-instance v0, Lya/c;

    .line 942
    .line 943
    invoke-virtual {v7}, Landroid/view/MotionEvent;->getRawX()F

    .line 944
    .line 945
    .line 946
    move-result v2

    .line 947
    invoke-virtual {v7}, Landroid/view/MotionEvent;->getRawY()F

    .line 948
    .line 949
    .line 950
    move-result v3

    .line 951
    invoke-direct {v0, v11, v6, v2, v3}, Lya/c;-><init>(Landroid/view/ViewGroup;Lya/b;FF)V

    .line 952
    .line 953
    .line 954
    iput-object v0, v4, Lya/g;->c:Lya/c;

    .line 955
    .line 956
    :cond_2e
    :goto_22
    return-void

    .line 957
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
