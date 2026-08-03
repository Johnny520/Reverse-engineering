.class public final Lob/m;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lob/n;


# direct methods
.method public synthetic constructor <init>(Lob/n;I)V
    .locals 0

    .line 1
    iput p2, p0, Lob/m;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lob/m;->b:Lob/n;

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
    iget v1, v0, Lob/m;->a:I

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
    iget-object v1, v0, Lob/m;->b:Lob/n;

    .line 16
    .line 17
    invoke-virtual {v1}, Lob/n;->d()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    goto/16 :goto_15

    .line 24
    .line 25
    :cond_0
    move-object/from16 v2, p1

    .line 26
    .line 27
    iget-object v2, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 28
    .line 29
    if-eqz v2, :cond_1d

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-static {v3, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    if-eqz v4, :cond_1d

    .line 37
    .line 38
    const/4 v5, 0x1

    .line 39
    invoke-static {v5, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    instance-of v7, v6, Landroid/view/View;

    .line 44
    .line 45
    if-eqz v7, :cond_1

    .line 46
    .line 47
    check-cast v6, Landroid/view/View;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const/4 v6, 0x0

    .line 51
    :goto_0
    if-eqz v6, :cond_1d

    .line 52
    .line 53
    invoke-virtual {v6}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    new-instance v9, Ljava/util/IdentityHashMap;

    .line 58
    .line 59
    invoke-direct {v9}, Ljava/util/IdentityHashMap;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-static {v9}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-static {v3, v7, v9}, Lob/n;->h(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    if-eqz v7, :cond_2

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    new-instance v7, Ljava/util/IdentityHashMap;

    .line 77
    .line 78
    invoke-direct {v7}, Ljava/util/IdentityHashMap;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-static {v7}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-static {v3, v2, v7}, Lob/n;->h(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    if-eqz v7, :cond_1d

    .line 93
    .line 94
    :goto_1
    const-string v2, "field_type"

    .line 95
    .line 96
    const-string v9, "type"

    .line 97
    .line 98
    const-string v10, "getType"

    .line 99
    .line 100
    invoke-static {v7, v10, v2, v9}, Lob/n;->e(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Number;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    const/4 v9, 0x2

    .line 105
    if-eqz v2, :cond_3

    .line 106
    .line 107
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    const v10, 0xffff

    .line 112
    .line 113
    .line 114
    and-int/2addr v2, v10

    .line 115
    if-eq v2, v5, :cond_4

    .line 116
    .line 117
    :cond_3
    const/4 v7, 0x0

    .line 118
    goto :goto_3

    .line 119
    :cond_4
    const-string v2, "field_talker"

    .line 120
    .line 121
    const-string v10, "talker"

    .line 122
    .line 123
    const-string v11, "getTalker"

    .line 124
    .line 125
    invoke-static {v7, v11, v2, v10}, Lob/n;->f(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    const-string v10, "field_content"

    .line 130
    .line 131
    const-string v11, "content"

    .line 132
    .line 133
    const-string v12, "getContent"

    .line 134
    .line 135
    invoke-static {v7, v12, v10, v11}, Lob/n;->f(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    const-string v10, "@chatroom"

    .line 140
    .line 141
    invoke-static {v2, v10, v3}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 142
    .line 143
    .line 144
    move-result v10

    .line 145
    if-nez v10, :cond_5

    .line 146
    .line 147
    const-string v10, "@im.chatroom"

    .line 148
    .line 149
    invoke-static {v2, v10, v3}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    if-eqz v2, :cond_6

    .line 154
    .line 155
    :cond_5
    const-string v2, ":\n"

    .line 156
    .line 157
    const/4 v10, 0x6

    .line 158
    invoke-static {v7, v2, v3, v3, v10}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    if-lez v2, :cond_6

    .line 163
    .line 164
    add-int/2addr v2, v9

    .line 165
    invoke-virtual {v7, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    :cond_6
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
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    if-lez v7, :cond_7

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_7
    const/4 v2, 0x0

    .line 185
    :goto_2
    if-eqz v2, :cond_3

    .line 186
    .line 187
    new-instance v7, Lob/l;

    .line 188
    .line 189
    invoke-direct {v7, v2}, Lob/l;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    :goto_3
    if-eqz v7, :cond_1d

    .line 193
    .line 194
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    const v10, 0x48435456    # 200017.34f

    .line 199
    .line 200
    .line 201
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 202
    .line 203
    .line 204
    move-result-object v10

    .line 205
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v11

    .line 209
    const-string v12, "findItem"

    .line 210
    .line 211
    invoke-static {v4, v12, v11}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v11

    .line 215
    instance-of v13, v11, Landroid/view/MenuItem;

    .line 216
    .line 217
    if-eqz v13, :cond_8

    .line 218
    .line 219
    check-cast v11, Landroid/view/MenuItem;

    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_8
    const/4 v11, 0x0

    .line 223
    :goto_4
    if-eqz v11, :cond_9

    .line 224
    .line 225
    invoke-static {v4, v11}, Lob/n;->b(Ljava/lang/Object;Landroid/view/MenuItem;)V

    .line 226
    .line 227
    .line 228
    move-object v8, v11

    .line 229
    goto/16 :goto_14

    .line 230
    .line 231
    :cond_9
    const-string v11, "size"

    .line 232
    .line 233
    new-array v13, v3, [Ljava/lang/Object;

    .line 234
    .line 235
    invoke-static {v4, v11, v13}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v11

    .line 239
    instance-of v13, v11, Ljava/lang/Number;

    .line 240
    .line 241
    if-eqz v13, :cond_a

    .line 242
    .line 243
    check-cast v11, Ljava/lang/Number;

    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_a
    const/4 v11, 0x0

    .line 247
    :goto_5
    if-eqz v11, :cond_b

    .line 248
    .line 249
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 250
    .line 251
    .line 252
    move-result v11

    .line 253
    goto :goto_6

    .line 254
    :cond_b
    move v11, v3

    .line 255
    :goto_6
    move v13, v3

    .line 256
    :goto_7
    if-lt v13, v11, :cond_c

    .line 257
    .line 258
    move v14, v3

    .line 259
    goto :goto_9

    .line 260
    :cond_c
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 261
    .line 262
    .line 263
    move-result-object v14

    .line 264
    filled-new-array {v14}, [Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v14

    .line 268
    const-string v15, "getItem"

    .line 269
    .line 270
    invoke-static {v4, v15, v14}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v14

    .line 274
    instance-of v15, v14, Landroid/view/MenuItem;

    .line 275
    .line 276
    if-eqz v15, :cond_d

    .line 277
    .line 278
    check-cast v14, Landroid/view/MenuItem;

    .line 279
    .line 280
    goto :goto_8

    .line 281
    :cond_d
    const/4 v14, 0x0

    .line 282
    :goto_8
    if-eqz v14, :cond_1c

    .line 283
    .line 284
    invoke-interface {v14}, Landroid/view/MenuItem;->getGroupId()I

    .line 285
    .line 286
    .line 287
    move-result v11

    .line 288
    move v14, v11

    .line 289
    :goto_9
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 290
    .line 291
    .line 292
    move-result-object v11

    .line 293
    invoke-virtual {v11}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 294
    .line 295
    .line 296
    move-result-object v15

    .line 297
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 298
    .line 299
    .line 300
    move-result-object v6

    .line 301
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v6

    .line 305
    const-string v11, "raw"

    .line 306
    .line 307
    const-string v13, "drawable"

    .line 308
    .line 309
    filled-new-array {v11, v13}, [Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v16

    .line 313
    move v11, v3

    .line 314
    :goto_a
    if-lt v11, v9, :cond_e

    .line 315
    .line 316
    move/from16 p1, v3

    .line 317
    .line 318
    goto :goto_b

    .line 319
    :cond_e
    aget-object v13, v16, v11

    .line 320
    .line 321
    move/from16 p1, v3

    .line 322
    .line 323
    const-string v3, "icons_filled_volume_up"

    .line 324
    .line 325
    invoke-virtual {v15, v3, v13, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    if-eqz v3, :cond_1b

    .line 330
    .line 331
    :goto_b
    const-string v6, "\u8f6c\u8bed\u97f3\u64ad\u653e[H]"

    .line 332
    .line 333
    if-eqz v3, :cond_13

    .line 334
    .line 335
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    move-result-object v11

    .line 339
    invoke-static {v11}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 340
    .line 341
    .line 342
    move-result-object v11

    .line 343
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 344
    .line 345
    .line 346
    move-result-object v11

    .line 347
    :goto_c
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 348
    .line 349
    .line 350
    move-result v13

    .line 351
    if-eqz v13, :cond_10

    .line 352
    .line 353
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v13

    .line 357
    move-object v15, v13

    .line 358
    check-cast v15, Ljava/lang/reflect/Method;

    .line 359
    .line 360
    move/from16 v17, v5

    .line 361
    .line 362
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    move-result-object v5

    .line 366
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v15

    .line 370
    const-string v8, "c"

    .line 371
    .line 372
    invoke-static {v15, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result v8

    .line 376
    if-eqz v8, :cond_f

    .line 377
    .line 378
    array-length v8, v5

    .line 379
    const/4 v15, 0x5

    .line 380
    if-ne v8, v15, :cond_f

    .line 381
    .line 382
    aget-object v8, v5, p1

    .line 383
    .line 384
    sget-object v15, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 385
    .line 386
    invoke-static {v8, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-result v8

    .line 390
    if-eqz v8, :cond_f

    .line 391
    .line 392
    aget-object v8, v5, v17

    .line 393
    .line 394
    invoke-static {v8, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    move-result v8

    .line 398
    if-eqz v8, :cond_f

    .line 399
    .line 400
    aget-object v8, v5, v9

    .line 401
    .line 402
    invoke-static {v8, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    move-result v8

    .line 406
    if-eqz v8, :cond_f

    .line 407
    .line 408
    const/4 v8, 0x3

    .line 409
    aget-object v8, v5, v8

    .line 410
    .line 411
    const-class v9, Ljava/lang/String;

    .line 412
    .line 413
    invoke-virtual {v8, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 414
    .line 415
    .line 416
    move-result v8

    .line 417
    if-eqz v8, :cond_f

    .line 418
    .line 419
    const/4 v8, 0x4

    .line 420
    aget-object v5, v5, v8

    .line 421
    .line 422
    invoke-static {v5, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result v5

    .line 426
    if-eqz v5, :cond_f

    .line 427
    .line 428
    goto :goto_d

    .line 429
    :cond_f
    move/from16 v5, v17

    .line 430
    .line 431
    const/4 v9, 0x2

    .line 432
    goto :goto_c

    .line 433
    :cond_10
    const/4 v13, 0x0

    .line 434
    :goto_d
    check-cast v13, Ljava/lang/reflect/Method;

    .line 435
    .line 436
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 437
    .line 438
    .line 439
    move-result-object v5

    .line 440
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 441
    .line 442
    .line 443
    move-result-object v8

    .line 444
    filled-new-array {v5, v10, v2, v6, v8}, [Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v5

    .line 448
    invoke-static {v13, v4, v5}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    move-result v5

    .line 452
    if-eqz v5, :cond_13

    .line 453
    .line 454
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    invoke-static {v4, v12, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    instance-of v3, v2, Landroid/view/MenuItem;

    .line 463
    .line 464
    if-eqz v3, :cond_11

    .line 465
    .line 466
    check-cast v2, Landroid/view/MenuItem;

    .line 467
    .line 468
    goto :goto_e

    .line 469
    :cond_11
    const/4 v2, 0x0

    .line 470
    :goto_e
    if-eqz v2, :cond_12

    .line 471
    .line 472
    invoke-static {v4, v2}, Lob/n;->b(Ljava/lang/Object;Landroid/view/MenuItem;)V

    .line 473
    .line 474
    .line 475
    :goto_f
    move-object v8, v2

    .line 476
    goto/16 :goto_14

    .line 477
    .line 478
    :cond_12
    const/4 v8, 0x0

    .line 479
    goto :goto_14

    .line 480
    :cond_13
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 481
    .line 482
    .line 483
    move-result-object v5

    .line 484
    filled-new-array {v5, v10, v2, v6}, [Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v5

    .line 488
    const-string v8, "add"

    .line 489
    .line 490
    invoke-static {v4, v8, v5}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v5

    .line 494
    if-eqz v5, :cond_14

    .line 495
    .line 496
    goto :goto_10

    .line 497
    :cond_14
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 498
    .line 499
    .line 500
    move-result-object v5

    .line 501
    filled-new-array {v5, v10, v2, v6}, [Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v2

    .line 505
    invoke-static {v4, v8, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v5

    .line 509
    :goto_10
    instance-of v2, v5, Landroid/view/MenuItem;

    .line 510
    .line 511
    if-eqz v2, :cond_16

    .line 512
    .line 513
    if-eqz v3, :cond_15

    .line 514
    .line 515
    :try_start_0
    move-object v2, v5

    .line 516
    check-cast v2, Landroid/view/MenuItem;

    .line 517
    .line 518
    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 519
    .line 520
    .line 521
    :catchall_0
    :cond_15
    move-object v8, v5

    .line 522
    check-cast v8, Landroid/view/MenuItem;

    .line 523
    .line 524
    invoke-static {v4, v8}, Lob/n;->b(Ljava/lang/Object;Landroid/view/MenuItem;)V

    .line 525
    .line 526
    .line 527
    goto :goto_14

    .line 528
    :cond_16
    filled-new-array {v10, v6}, [Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v2

    .line 532
    const-string v3, "f"

    .line 533
    .line 534
    invoke-static {v4, v3, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    if-eqz v2, :cond_17

    .line 539
    .line 540
    goto :goto_11

    .line 541
    :cond_17
    filled-new-array {v10, v6}, [Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v2

    .line 545
    invoke-static {v4, v3, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v2

    .line 549
    :goto_11
    instance-of v3, v2, Landroid/view/MenuItem;

    .line 550
    .line 551
    if-eqz v3, :cond_18

    .line 552
    .line 553
    check-cast v2, Landroid/view/MenuItem;

    .line 554
    .line 555
    goto :goto_12

    .line 556
    :cond_18
    const/4 v2, 0x0

    .line 557
    :goto_12
    if-eqz v2, :cond_19

    .line 558
    .line 559
    goto :goto_13

    .line 560
    :cond_19
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v2

    .line 564
    invoke-static {v4, v12, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v2

    .line 568
    instance-of v3, v2, Landroid/view/MenuItem;

    .line 569
    .line 570
    if-eqz v3, :cond_1a

    .line 571
    .line 572
    check-cast v2, Landroid/view/MenuItem;

    .line 573
    .line 574
    goto :goto_13

    .line 575
    :cond_1a
    const/4 v2, 0x0

    .line 576
    :goto_13
    if-eqz v2, :cond_12

    .line 577
    .line 578
    invoke-static {v4, v2}, Lob/n;->b(Ljava/lang/Object;Landroid/view/MenuItem;)V

    .line 579
    .line 580
    .line 581
    goto :goto_f

    .line 582
    :goto_14
    if-eqz v8, :cond_1d

    .line 583
    .line 584
    iget-object v1, v1, Lob/n;->j:Ljava/util/Map;

    .line 585
    .line 586
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 587
    .line 588
    .line 589
    check-cast v1, Ljava/util/Map;

    .line 590
    .line 591
    invoke-interface {v1, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    goto :goto_15

    .line 595
    :cond_1b
    move/from16 v17, v5

    .line 596
    .line 597
    add-int/lit8 v11, v11, 0x1

    .line 598
    .line 599
    move/from16 v3, p1

    .line 600
    .line 601
    const/4 v9, 0x2

    .line 602
    goto/16 :goto_a

    .line 603
    .line 604
    :cond_1c
    move/from16 p1, v3

    .line 605
    .line 606
    move/from16 v17, v5

    .line 607
    .line 608
    add-int/lit8 v13, v13, 0x1

    .line 609
    .line 610
    const/4 v9, 0x2

    .line 611
    goto/16 :goto_7

    .line 612
    .line 613
    :cond_1d
    :goto_15
    return-void

    .line 614
    nop

    .line 615
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 6

    .line 1
    iget v0, p0, Lob/m;->a:I

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
    iget-object v0, p0, Lob/m;->b:Lob/n;

    .line 14
    .line 15
    invoke-virtual {v0}, Lob/n;->d()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 23
    .line 24
    if-eqz p1, :cond_6

    .line 25
    .line 26
    array-length v1, p1

    .line 27
    const/4 v2, 0x0

    .line 28
    :goto_0
    const/4 v3, 0x0

    .line 29
    if-ge v2, v1, :cond_3

    .line 30
    .line 31
    aget-object v4, p1, v2

    .line 32
    .line 33
    instance-of v5, v4, Landroid/view/MenuItem;

    .line 34
    .line 35
    if-eqz v5, :cond_1

    .line 36
    .line 37
    move-object v3, v4

    .line 38
    check-cast v3, Landroid/view/MenuItem;

    .line 39
    .line 40
    :cond_1
    if-eqz v3, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    :goto_1
    if-eqz v3, :cond_6

    .line 47
    .line 48
    invoke-interface {v3}, Landroid/view/MenuItem;->getItemId()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    const v1, 0x48435456    # 200017.34f

    .line 53
    .line 54
    .line 55
    if-eq p1, v1, :cond_4

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_4
    iget-object p1, v0, Lob/n;->j:Ljava/util/Map;

    .line 59
    .line 60
    invoke-interface {p1, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, Lob/l;

    .line 65
    .line 66
    if-nez p1, :cond_5

    .line 67
    .line 68
    const-string p1, "\u6587\u5b57\u6d88\u606f\u4e0d\u53ef\u7528"

    .line 69
    .line 70
    invoke-virtual {v0, p1}, Lob/n;->l(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_5
    const-string v1, "\u6b63\u5728\u751f\u6210\u8bed\u97f3"

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Lob/n;->l(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget-object p1, p1, Lob/l;->a:Ljava/lang/String;

    .line 80
    .line 81
    :try_start_0
    iget-object v1, v0, Lob/n;->k:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 82
    .line 83
    new-instance v2, La1/d;

    .line 84
    .line 85
    const/16 v3, 0x19

    .line 86
    .line 87
    invoke-direct {v2, v0, v3, p1}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :catch_0
    const-string p1, "\u5f85\u5904\u7406\u8bed\u97f3\u8fc7\u591a\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5"

    .line 95
    .line 96
    invoke-virtual {v0, p1}, Lob/n;->l(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_6
    :goto_2
    return-void

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
