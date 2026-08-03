.class public final Lg9/c;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lg9/d;


# direct methods
.method public synthetic constructor <init>(Lg9/d;I)V
    .locals 0

    .line 1
    iput p2, p0, Lg9/c;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lg9/c;->b:Lg9/d;

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
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lg9/c;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-super/range {p0 .. p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v1, v0, Lg9/c;->b:Lg9/d;

    .line 16
    .line 17
    iget-object v2, v1, Lg9/d;->c:Landroid/content/SharedPreferences;

    .line 18
    .line 19
    const-string v3, "emoji_save_enable"

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    goto/16 :goto_10

    .line 29
    .line 30
    :cond_0
    move-object/from16 v2, p1

    .line 31
    .line 32
    iget-object v2, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 33
    .line 34
    if-eqz v2, :cond_16

    .line 35
    .line 36
    invoke-static {v4, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    if-eqz v3, :cond_16

    .line 41
    .line 42
    const/4 v5, 0x1

    .line 43
    invoke-static {v5, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    instance-of v7, v6, Landroid/view/View;

    .line 48
    .line 49
    if-eqz v7, :cond_1

    .line 50
    .line 51
    check-cast v6, Landroid/view/View;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    const/4 v6, 0x0

    .line 55
    :goto_0
    if-eqz v6, :cond_16

    .line 56
    .line 57
    invoke-virtual {v6}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    new-instance v9, Ljava/util/IdentityHashMap;

    .line 62
    .line 63
    invoke-direct {v9}, Ljava/util/IdentityHashMap;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-static {v9}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {v4, v7, v9}, Lg9/d;->e(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    if-eqz v7, :cond_2

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    new-instance v7, Ljava/util/IdentityHashMap;

    .line 81
    .line 82
    invoke-direct {v7}, Ljava/util/IdentityHashMap;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-static {v7}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-static {v4, v2, v7}, Lg9/d;->e(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    if-eqz v7, :cond_16

    .line 97
    .line 98
    :goto_1
    const-string v2, "field_type"

    .line 99
    .line 100
    const-string v9, "type"

    .line 101
    .line 102
    const-string v10, "getType"

    .line 103
    .line 104
    invoke-static {v7, v10, v2, v9}, Lg9/d;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Number;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    if-eqz v2, :cond_16

    .line 109
    .line 110
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    const v9, 0xffff

    .line 115
    .line 116
    .line 117
    and-int/2addr v2, v9

    .line 118
    const/16 v9, 0x2f

    .line 119
    .line 120
    if-ne v2, v9, :cond_16

    .line 121
    .line 122
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    const v9, 0x48434553    # 199957.3f

    .line 127
    .line 128
    .line 129
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v10

    .line 137
    const-string v11, "findItem"

    .line 138
    .line 139
    invoke-static {v3, v11, v10}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v10

    .line 143
    instance-of v12, v10, Landroid/view/MenuItem;

    .line 144
    .line 145
    if-eqz v12, :cond_3

    .line 146
    .line 147
    check-cast v10, Landroid/view/MenuItem;

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_3
    const/4 v10, 0x0

    .line 151
    :goto_2
    if-eqz v10, :cond_4

    .line 152
    .line 153
    move-object v8, v10

    .line 154
    goto/16 :goto_f

    .line 155
    .line 156
    :cond_4
    const-string v10, "size"

    .line 157
    .line 158
    new-array v12, v4, [Ljava/lang/Object;

    .line 159
    .line 160
    invoke-static {v3, v10, v12}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    instance-of v12, v10, Ljava/lang/Number;

    .line 165
    .line 166
    if-eqz v12, :cond_5

    .line 167
    .line 168
    check-cast v10, Ljava/lang/Number;

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_5
    const/4 v10, 0x0

    .line 172
    :goto_3
    if-eqz v10, :cond_6

    .line 173
    .line 174
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result v10

    .line 178
    goto :goto_4

    .line 179
    :cond_6
    move v10, v4

    .line 180
    :goto_4
    move v12, v4

    .line 181
    :goto_5
    if-lt v12, v10, :cond_7

    .line 182
    .line 183
    move v13, v4

    .line 184
    goto :goto_7

    .line 185
    :cond_7
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object v13

    .line 189
    filled-new-array {v13}, [Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v13

    .line 193
    const-string v14, "getItem"

    .line 194
    .line 195
    invoke-static {v3, v14, v13}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v13

    .line 199
    instance-of v14, v13, Landroid/view/MenuItem;

    .line 200
    .line 201
    if-eqz v14, :cond_8

    .line 202
    .line 203
    check-cast v13, Landroid/view/MenuItem;

    .line 204
    .line 205
    goto :goto_6

    .line 206
    :cond_8
    const/4 v13, 0x0

    .line 207
    :goto_6
    if-eqz v13, :cond_15

    .line 208
    .line 209
    invoke-interface {v13}, Landroid/view/MenuItem;->getGroupId()I

    .line 210
    .line 211
    .line 212
    move-result v10

    .line 213
    move v13, v10

    .line 214
    :goto_7
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 215
    .line 216
    .line 217
    move-result-object v10

    .line 218
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 219
    .line 220
    .line 221
    move-result-object v14

    .line 222
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v15

    .line 230
    const-string v6, "raw"

    .line 231
    .line 232
    const-string v10, "drawable"

    .line 233
    .line 234
    filled-new-array {v6, v10}, [Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v16

    .line 238
    move v6, v4

    .line 239
    :goto_8
    const/4 v10, 0x2

    .line 240
    if-lt v6, v10, :cond_9

    .line 241
    .line 242
    move/from16 v17, v4

    .line 243
    .line 244
    goto :goto_9

    .line 245
    :cond_9
    aget-object v12, v16, v6

    .line 246
    .line 247
    move/from16 v17, v4

    .line 248
    .line 249
    const-string v4, "icons_filled_download"

    .line 250
    .line 251
    invoke-virtual {v14, v4, v12, v15}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    if-eqz v4, :cond_14

    .line 256
    .line 257
    :goto_9
    const-string v6, "\u4fdd\u5b58[H]"

    .line 258
    .line 259
    if-eqz v4, :cond_d

    .line 260
    .line 261
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    move-result-object v12

    .line 265
    invoke-static {v12}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 266
    .line 267
    .line 268
    move-result-object v12

    .line 269
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 270
    .line 271
    .line 272
    move-result-object v12

    .line 273
    :goto_a
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 274
    .line 275
    .line 276
    move-result v14

    .line 277
    if-eqz v14, :cond_b

    .line 278
    .line 279
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v14

    .line 283
    move-object v15, v14

    .line 284
    check-cast v15, Ljava/lang/reflect/Method;

    .line 285
    .line 286
    move/from16 p1, v5

    .line 287
    .line 288
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    move-result-object v5

    .line 292
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v15

    .line 296
    const-string v8, "c"

    .line 297
    .line 298
    invoke-static {v15, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v8

    .line 302
    if-eqz v8, :cond_a

    .line 303
    .line 304
    array-length v8, v5

    .line 305
    const/4 v15, 0x5

    .line 306
    if-ne v8, v15, :cond_a

    .line 307
    .line 308
    aget-object v8, v5, v17

    .line 309
    .line 310
    sget-object v15, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 311
    .line 312
    invoke-static {v8, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v8

    .line 316
    if-eqz v8, :cond_a

    .line 317
    .line 318
    aget-object v8, v5, p1

    .line 319
    .line 320
    invoke-static {v8, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v8

    .line 324
    if-eqz v8, :cond_a

    .line 325
    .line 326
    aget-object v8, v5, v10

    .line 327
    .line 328
    invoke-static {v8, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v8

    .line 332
    if-eqz v8, :cond_a

    .line 333
    .line 334
    const/4 v8, 0x3

    .line 335
    aget-object v8, v5, v8

    .line 336
    .line 337
    const-class v10, Ljava/lang/String;

    .line 338
    .line 339
    invoke-virtual {v8, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 340
    .line 341
    .line 342
    move-result v8

    .line 343
    if-eqz v8, :cond_a

    .line 344
    .line 345
    const/4 v8, 0x4

    .line 346
    aget-object v5, v5, v8

    .line 347
    .line 348
    invoke-static {v5, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result v5

    .line 352
    if-eqz v5, :cond_a

    .line 353
    .line 354
    goto :goto_b

    .line 355
    :cond_a
    move/from16 v5, p1

    .line 356
    .line 357
    const/4 v10, 0x2

    .line 358
    goto :goto_a

    .line 359
    :cond_b
    const/4 v14, 0x0

    .line 360
    :goto_b
    check-cast v14, Ljava/lang/reflect/Method;

    .line 361
    .line 362
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 363
    .line 364
    .line 365
    move-result-object v5

    .line 366
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 367
    .line 368
    .line 369
    move-result-object v8

    .line 370
    filled-new-array {v5, v9, v2, v6, v8}, [Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v5

    .line 374
    invoke-static {v14, v3, v5}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v5

    .line 378
    if-eqz v5, :cond_d

    .line 379
    .line 380
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    invoke-static {v3, v11, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    instance-of v3, v2, Landroid/view/MenuItem;

    .line 389
    .line 390
    if-eqz v3, :cond_c

    .line 391
    .line 392
    move-object v8, v2

    .line 393
    check-cast v8, Landroid/view/MenuItem;

    .line 394
    .line 395
    goto :goto_f

    .line 396
    :cond_c
    const/4 v8, 0x0

    .line 397
    goto :goto_f

    .line 398
    :cond_d
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 399
    .line 400
    .line 401
    move-result-object v5

    .line 402
    filled-new-array {v5, v9, v2, v6}, [Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v5

    .line 406
    const-string v8, "add"

    .line 407
    .line 408
    invoke-static {v3, v8, v5}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v5

    .line 412
    if-eqz v5, :cond_e

    .line 413
    .line 414
    goto :goto_c

    .line 415
    :cond_e
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 416
    .line 417
    .line 418
    move-result-object v5

    .line 419
    filled-new-array {v5, v9, v2, v6}, [Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    invoke-static {v3, v8, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v5

    .line 427
    :goto_c
    instance-of v2, v5, Landroid/view/MenuItem;

    .line 428
    .line 429
    if-eqz v2, :cond_10

    .line 430
    .line 431
    if-eqz v4, :cond_f

    .line 432
    .line 433
    :try_start_0
    move-object v2, v5

    .line 434
    check-cast v2, Landroid/view/MenuItem;

    .line 435
    .line 436
    invoke-interface {v2, v4}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 437
    .line 438
    .line 439
    :catchall_0
    :cond_f
    move-object v8, v5

    .line 440
    check-cast v8, Landroid/view/MenuItem;

    .line 441
    .line 442
    goto :goto_f

    .line 443
    :cond_10
    filled-new-array {v9, v6}, [Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    const-string v4, "f"

    .line 448
    .line 449
    invoke-static {v3, v4, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    if-eqz v2, :cond_11

    .line 454
    .line 455
    goto :goto_d

    .line 456
    :cond_11
    filled-new-array {v9, v6}, [Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    invoke-static {v3, v4, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v2

    .line 464
    :goto_d
    instance-of v4, v2, Landroid/view/MenuItem;

    .line 465
    .line 466
    if-eqz v4, :cond_12

    .line 467
    .line 468
    check-cast v2, Landroid/view/MenuItem;

    .line 469
    .line 470
    goto :goto_e

    .line 471
    :cond_12
    const/4 v2, 0x0

    .line 472
    :goto_e
    if-eqz v2, :cond_13

    .line 473
    .line 474
    move-object v8, v2

    .line 475
    goto :goto_f

    .line 476
    :cond_13
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v2

    .line 480
    invoke-static {v3, v11, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    instance-of v3, v2, Landroid/view/MenuItem;

    .line 485
    .line 486
    if-eqz v3, :cond_c

    .line 487
    .line 488
    move-object v8, v2

    .line 489
    check-cast v8, Landroid/view/MenuItem;

    .line 490
    .line 491
    :goto_f
    if-eqz v8, :cond_16

    .line 492
    .line 493
    iget-object v1, v1, Lg9/d;->f:Ljava/util/Map;

    .line 494
    .line 495
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    check-cast v1, Ljava/util/Map;

    .line 499
    .line 500
    invoke-interface {v1, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    goto :goto_10

    .line 504
    :cond_14
    move/from16 p1, v5

    .line 505
    .line 506
    add-int/lit8 v6, v6, 0x1

    .line 507
    .line 508
    move/from16 v4, v17

    .line 509
    .line 510
    goto/16 :goto_8

    .line 511
    .line 512
    :cond_15
    move/from16 v17, v4

    .line 513
    .line 514
    move/from16 p1, v5

    .line 515
    .line 516
    add-int/lit8 v12, v12, 0x1

    .line 517
    .line 518
    goto/16 :goto_5

    .line 519
    .line 520
    :cond_16
    :goto_10
    return-void

    .line 521
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 9

    .line 1
    iget v0, p0, Lg9/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lg9/c;->b:Lg9/d;

    .line 14
    .line 15
    iget-object v1, v0, Lg9/d;->c:Landroid/content/SharedPreferences;

    .line 16
    .line 17
    const-string v2, "emoji_save_enable"

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    goto/16 :goto_8

    .line 27
    .line 28
    :cond_0
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 29
    .line 30
    if-eqz v1, :cond_10

    .line 31
    .line 32
    array-length v2, v1

    .line 33
    move v4, v3

    .line 34
    :goto_0
    const/4 v5, 0x0

    .line 35
    if-ge v4, v2, :cond_3

    .line 36
    .line 37
    aget-object v6, v1, v4

    .line 38
    .line 39
    instance-of v7, v6, Landroid/view/MenuItem;

    .line 40
    .line 41
    if-eqz v7, :cond_1

    .line 42
    .line 43
    check-cast v6, Landroid/view/MenuItem;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move-object v6, v5

    .line 47
    :goto_1
    if-eqz v6, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    move-object v6, v5

    .line 54
    :goto_2
    if-eqz v6, :cond_10

    .line 55
    .line 56
    invoke-interface {v6}, Landroid/view/MenuItem;->getItemId()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    const v2, 0x48434553    # 199957.3f

    .line 61
    .line 62
    .line 63
    if-eq v1, v2, :cond_4

    .line 64
    .line 65
    goto/16 :goto_8

    .line 66
    .line 67
    :cond_4
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    if-eqz v1, :cond_5

    .line 72
    .line 73
    invoke-virtual {v1}, Lq8/o;->a()Landroid/app/Activity;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    goto :goto_3

    .line 78
    :cond_5
    move-object v1, v5

    .line 79
    :goto_3
    iget-object v2, v0, Lg9/d;->f:Ljava/util/Map;

    .line 80
    .line 81
    invoke-interface {v2, v6}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    if-eqz v2, :cond_6

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_6
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 89
    .line 90
    new-instance v2, Ljava/util/IdentityHashMap;

    .line 91
    .line 92
    invoke-direct {v2}, Ljava/util/IdentityHashMap;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-static {v2}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-static {v3, p1, v2}, Lg9/d;->e(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    :goto_4
    const-string p1, ""

    .line 107
    .line 108
    if-eqz v2, :cond_d

    .line 109
    .line 110
    const-string v3, "field_imgPath"

    .line 111
    .line 112
    const-string v4, "imgPath"

    .line 113
    .line 114
    const-string v6, "getImgPath"

    .line 115
    .line 116
    invoke-static {v2, v6, v3, v4}, Lg9/d;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    sget-object v4, Lg9/d;->g:Log/k;

    .line 129
    .line 130
    invoke-virtual {v4, v3}, Log/k;->d(Ljava/lang/String;)Z

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    if-eqz v6, :cond_7

    .line 135
    .line 136
    move-object v5, v3

    .line 137
    goto :goto_6

    .line 138
    :cond_7
    const-string v6, "field_content"

    .line 139
    .line 140
    const-string v7, "content"

    .line 141
    .line 142
    const-string v8, "getContent"

    .line 143
    .line 144
    invoke-static {v2, v8, v6, v7}, Lg9/d;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    sget-object v6, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 149
    .line 150
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    const-string v6, "md5"

    .line 154
    .line 155
    invoke-static {v2, v6}, Ll8/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 160
    .line 161
    .line 162
    move-result v8

    .line 163
    if-eqz v8, :cond_8

    .line 164
    .line 165
    invoke-static {v2, v6}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    :cond_8
    invoke-static {v7}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-virtual {v4, v2}, Log/k;->d(Ljava/lang/String;)Z

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    if-eqz v4, :cond_9

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_9
    move-object v2, v5

    .line 185
    :goto_5
    if-nez v2, :cond_a

    .line 186
    .line 187
    move-object v2, p1

    .line 188
    :cond_a
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    if-eqz v4, :cond_c

    .line 193
    .line 194
    invoke-static {v3}, Leh/a;->y(Ljava/lang/String;)Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-eqz v2, :cond_b

    .line 199
    .line 200
    move-object v5, v3

    .line 201
    :cond_b
    if-nez v5, :cond_d

    .line 202
    .line 203
    move-object v5, p1

    .line 204
    goto :goto_6

    .line 205
    :cond_c
    move-object v5, v2

    .line 206
    :cond_d
    :goto_6
    if-nez v5, :cond_e

    .line 207
    .line 208
    goto :goto_7

    .line 209
    :cond_e
    move-object p1, v5

    .line 210
    :goto_7
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    if-eqz v2, :cond_f

    .line 215
    .line 216
    iget-object p1, v0, Lg9/d;->d:Landroid/os/Handler;

    .line 217
    .line 218
    new-instance v0, Lc9/t;

    .line 219
    .line 220
    const/4 v2, 0x5

    .line 221
    const-string v3, "\u8868\u60c5\u6d88\u606f\u4e0d\u53ef\u7528"

    .line 222
    .line 223
    invoke-direct {v0, v1, v3, v2}, Lc9/t;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 227
    .line 228
    .line 229
    goto :goto_8

    .line 230
    :cond_f
    new-instance v2, Ljava/lang/Thread;

    .line 231
    .line 232
    new-instance v3, Lac/l;

    .line 233
    .line 234
    const/16 v4, 0xe

    .line 235
    .line 236
    invoke-direct {v3, v0, v1, p1, v4}, Lac/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 237
    .line 238
    .line 239
    const-string p1, "Hchat-EmojiSave"

    .line 240
    .line 241
    invoke-direct {v2, v3, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 245
    .line 246
    .line 247
    :cond_10
    :goto_8
    return-void

    .line 248
    nop

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
