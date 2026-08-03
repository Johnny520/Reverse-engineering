.class public final Lb9/e;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb5/c;)V
    .locals 1

    .line 1
    const/16 v0, 0x1b

    .line 2
    .line 3
    iput v0, p0, Lb9/e;->a:I

    .line 4
    .line 5
    iput-object p1, p0, Lb9/e;->b:Ljava/lang/Object;

    .line 6
    .line 7
    const/16 p1, 0x2710

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;-><init>(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 13
    iput p2, p0, Lb9/e;->a:I

    iput-object p1, p0, Lb9/e;->b:Ljava/lang/Object;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private final a(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 32

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-object/from16 v1, p0

    .line 5
    .line 6
    iget-object v0, v1, Lb9/e;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lbb/g;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-object/from16 v2, p1

    .line 14
    .line 15
    iget-object v2, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 16
    .line 17
    if-eqz v2, :cond_39

    .line 18
    .line 19
    invoke-static {v2}, Ltf/l;->z0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    if-eqz v3, :cond_39

    .line 24
    .line 25
    iget-object v4, v0, Lbb/g;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    check-cast v5, Ljava/lang/reflect/Field;

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    if-eqz v5, :cond_1

    .line 39
    .line 40
    invoke-static {v5, v3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    instance-of v4, v3, Landroid/widget/TextView;

    .line 45
    .line 46
    if-eqz v4, :cond_0

    .line 47
    .line 48
    check-cast v3, Landroid/widget/TextView;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move-object v3, v6

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-virtual {v0, v5}, Lbb/g;->h(Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-virtual {v4, v7, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    invoke-static {v5, v3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    instance-of v4, v3, Landroid/widget/TextView;

    .line 73
    .line 74
    if-eqz v4, :cond_0

    .line 75
    .line 76
    check-cast v3, Landroid/widget/TextView;

    .line 77
    .line 78
    :goto_0
    if-eqz v3, :cond_39

    .line 79
    .line 80
    iget-object v4, v0, Lbb/g;->b:Lbb/l;

    .line 81
    .line 82
    iget-object v4, v4, Lbb/l;->a:Landroid/content/SharedPreferences;

    .line 83
    .line 84
    const-string v5, "enable"

    .line 85
    .line 86
    const/4 v7, 0x0

    .line 87
    invoke-interface {v4, v5, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    iget-object v5, v0, Lbb/g;->c:Lib/b;

    .line 92
    .line 93
    iget-object v5, v5, Lib/b;->a:Landroid/content/SharedPreferences;

    .line 94
    .line 95
    const-string v8, "enable"

    .line 96
    .line 97
    invoke-interface {v5, v8, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-nez v4, :cond_2

    .line 102
    .line 103
    if-nez v5, :cond_2

    .line 104
    .line 105
    iget-object v0, v0, Lbb/g;->g:Ljava/util/Map;

    .line 106
    .line 107
    invoke-interface {v0, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    invoke-static {v3}, Lbb/g;->j(Landroid/widget/TextView;)V

    .line 111
    .line 112
    .line 113
    invoke-static {v3}, Lbb/g;->i(Landroid/widget/TextView;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_2
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->chatPage()Lq8/m;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    if-eqz v8, :cond_3

    .line 122
    .line 123
    invoke-virtual {v8}, Lq8/m;->a()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    goto :goto_1

    .line 128
    :cond_3
    move-object v8, v6

    .line 129
    :goto_1
    if-nez v8, :cond_4

    .line 130
    .line 131
    const-string v8, ""

    .line 132
    .line 133
    :cond_4
    const-string v9, "@chatroom"

    .line 134
    .line 135
    invoke-static {v8, v9, v7}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    if-nez v9, :cond_6

    .line 140
    .line 141
    const-string v9, "@im.chatroom"

    .line 142
    .line 143
    invoke-static {v8, v9, v7}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 144
    .line 145
    .line 146
    move-result v9

    .line 147
    if-eqz v9, :cond_5

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_5
    iget-object v0, v0, Lbb/g;->g:Ljava/util/Map;

    .line 151
    .line 152
    invoke-interface {v0, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    invoke-static {v3}, Lbb/g;->j(Landroid/widget/TextView;)V

    .line 156
    .line 157
    .line 158
    invoke-static {v3}, Lbb/g;->i(Landroid/widget/TextView;)V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :cond_6
    :goto_2
    const-string v9, ""

    .line 163
    .line 164
    new-instance v10, Ljava/util/ArrayList;

    .line 165
    .line 166
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 167
    .line 168
    .line 169
    array-length v11, v2

    .line 170
    move-object v13, v6

    .line 171
    move v12, v7

    .line 172
    :goto_3
    if-ge v12, v11, :cond_a

    .line 173
    .line 174
    aget-object v14, v2, v12

    .line 175
    .line 176
    instance-of v15, v14, Ljava/lang/String;

    .line 177
    .line 178
    if-eqz v15, :cond_8

    .line 179
    .line 180
    move-object v15, v9

    .line 181
    check-cast v15, Ljava/lang/CharSequence;

    .line 182
    .line 183
    invoke-interface {v15}, Ljava/lang/CharSequence;->length()I

    .line 184
    .line 185
    .line 186
    move-result v15

    .line 187
    if-nez v15, :cond_7

    .line 188
    .line 189
    move-object v9, v14

    .line 190
    :cond_7
    move-object v15, v14

    .line 191
    check-cast v15, Ljava/lang/String;

    .line 192
    .line 193
    invoke-static {v15}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 194
    .line 195
    .line 196
    move-result-object v15

    .line 197
    invoke-virtual {v15}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v15

    .line 201
    sget-object v16, Lbb/l;->c:Log/k;

    .line 202
    .line 203
    invoke-static {v15}, Lzb/c;->b(Ljava/lang/String;)Z

    .line 204
    .line 205
    .line 206
    move-result v16

    .line 207
    if-eqz v16, :cond_8

    .line 208
    .line 209
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    :cond_8
    if-eqz v14, :cond_9

    .line 213
    .line 214
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    move-result-object v15

    .line 218
    invoke-virtual {v0, v15}, Lbb/g;->k(Ljava/lang/Class;)Z

    .line 219
    .line 220
    .line 221
    move-result v15

    .line 222
    if-eqz v15, :cond_9

    .line 223
    .line 224
    move-object v13, v14

    .line 225
    :cond_9
    add-int/lit8 v12, v12, 0x1

    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_a
    const/4 v2, 0x1

    .line 229
    if-nez v13, :cond_c

    .line 230
    .line 231
    :cond_b
    :goto_4
    move v11, v7

    .line 232
    goto :goto_6

    .line 233
    :cond_c
    const-string v11, "field_isSend"

    .line 234
    .line 235
    const-string v12, "isSend"

    .line 236
    .line 237
    filled-new-array {v11, v12}, [Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v11

    .line 241
    move v12, v7

    .line 242
    :goto_5
    const/4 v14, 0x2

    .line 243
    if-lt v12, v14, :cond_d

    .line 244
    .line 245
    goto :goto_4

    .line 246
    :cond_d
    aget-object v14, v11, v12

    .line 247
    .line 248
    invoke-static {v13, v14}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v14

    .line 252
    instance-of v15, v14, Ljava/lang/Number;

    .line 253
    .line 254
    if-eqz v15, :cond_e

    .line 255
    .line 256
    check-cast v14, Ljava/lang/Number;

    .line 257
    .line 258
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 259
    .line 260
    .line 261
    move-result v11

    .line 262
    if-ne v11, v2, :cond_b

    .line 263
    .line 264
    move v11, v2

    .line 265
    goto :goto_6

    .line 266
    :cond_e
    instance-of v15, v14, Ljava/lang/Boolean;

    .line 267
    .line 268
    if-eqz v15, :cond_38

    .line 269
    .line 270
    check-cast v14, Ljava/lang/Boolean;

    .line 271
    .line 272
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 273
    .line 274
    .line 275
    move-result v11

    .line 276
    :goto_6
    if-eqz v11, :cond_f

    .line 277
    .line 278
    iget-object v0, v0, Lbb/g;->g:Ljava/util/Map;

    .line 279
    .line 280
    invoke-interface {v0, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    invoke-static {v3}, Lbb/g;->j(Landroid/widget/TextView;)V

    .line 284
    .line 285
    .line 286
    invoke-static {v3}, Lbb/g;->i(Landroid/widget/TextView;)V

    .line 287
    .line 288
    .line 289
    return-void

    .line 290
    :cond_f
    move-object v14, v9

    .line 291
    check-cast v14, Ljava/lang/String;

    .line 292
    .line 293
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 294
    .line 295
    .line 296
    move-result-object v9

    .line 297
    :cond_10
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 298
    .line 299
    .line 300
    move-result v10

    .line 301
    if-eqz v10, :cond_11

    .line 302
    .line 303
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v10

    .line 307
    move-object v11, v10

    .line 308
    check-cast v11, Ljava/lang/String;

    .line 309
    .line 310
    invoke-static {v11}, Lbb/g;->l(Ljava/lang/String;)Z

    .line 311
    .line 312
    .line 313
    move-result v11

    .line 314
    if-nez v11, :cond_10

    .line 315
    .line 316
    goto :goto_7

    .line 317
    :cond_11
    move-object v10, v6

    .line 318
    :goto_7
    check-cast v10, Ljava/lang/String;

    .line 319
    .line 320
    if-eqz v10, :cond_12

    .line 321
    .line 322
    goto/16 :goto_10

    .line 323
    .line 324
    :cond_12
    invoke-static {v13}, Lbb/g;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v9

    .line 328
    if-eqz v9, :cond_14

    .line 329
    .line 330
    invoke-static {v9}, Lbb/g;->l(Ljava/lang/String;)Z

    .line 331
    .line 332
    .line 333
    move-result v10

    .line 334
    if-nez v10, :cond_13

    .line 335
    .line 336
    move-object v10, v9

    .line 337
    goto :goto_8

    .line 338
    :cond_13
    move-object v10, v6

    .line 339
    :goto_8
    if-eqz v10, :cond_14

    .line 340
    .line 341
    goto/16 :goto_10

    .line 342
    .line 343
    :cond_14
    iget-object v15, v0, Lbb/g;->f:Ljava/util/Map;

    .line 344
    .line 345
    const-string v16, ""

    .line 346
    .line 347
    if-nez v13, :cond_17

    .line 348
    .line 349
    sget-object v9, Lbb/l;->c:Log/k;

    .line 350
    .line 351
    invoke-static {v14}, Lzb/c;->b(Ljava/lang/String;)Z

    .line 352
    .line 353
    .line 354
    move-result v9

    .line 355
    if-eqz v9, :cond_15

    .line 356
    .line 357
    move-object v6, v14

    .line 358
    :cond_15
    if-nez v6, :cond_16

    .line 359
    .line 360
    goto :goto_b

    .line 361
    :cond_16
    move-object v10, v6

    .line 362
    goto/16 :goto_10

    .line 363
    .line 364
    :cond_17
    invoke-interface {v15, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v9

    .line 368
    move-object v10, v9

    .line 369
    check-cast v10, Ljava/lang/String;

    .line 370
    .line 371
    if-eqz v10, :cond_18

    .line 372
    .line 373
    goto/16 :goto_10

    .line 374
    .line 375
    :cond_18
    const-string v17, "A0"

    .line 376
    .line 377
    const-string v18, "B0"

    .line 378
    .line 379
    const-string v19, "C0"

    .line 380
    .line 381
    const-string v20, "D0"

    .line 382
    .line 383
    const-string v21, "E0"

    .line 384
    .line 385
    const-string v22, "F0"

    .line 386
    .line 387
    const-string v23, "getSender"

    .line 388
    .line 389
    const-string v24, "getSendTalker"

    .line 390
    .line 391
    const-string v25, "getTalker"

    .line 392
    .line 393
    const-string v26, "j"

    .line 394
    .line 395
    const-string v27, "R1"

    .line 396
    .line 397
    const-string v28, "P1"

    .line 398
    .line 399
    const-string v29, "o0"

    .line 400
    .line 401
    const-string v30, "x0"

    .line 402
    .line 403
    const-string v31, "j0"

    .line 404
    .line 405
    filled-new-array/range {v17 .. v31}, [Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v17

    .line 409
    move v9, v7

    .line 410
    :goto_9
    const/16 v10, 0xf

    .line 411
    .line 412
    if-lt v9, v10, :cond_20

    .line 413
    .line 414
    const-string v18, "field_talker"

    .line 415
    .line 416
    const-string v19, "talker"

    .line 417
    .line 418
    const-string v20, "field_sender"

    .line 419
    .line 420
    const-string v21, "sender"

    .line 421
    .line 422
    const-string v22, "sendTalker"

    .line 423
    .line 424
    const-string v23, "field_talkerUsername"

    .line 425
    .line 426
    const-string v24, "P"

    .line 427
    .line 428
    filled-new-array/range {v18 .. v24}, [Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v10

    .line 432
    move v9, v7

    .line 433
    :goto_a
    const/4 v11, 0x7

    .line 434
    if-lt v9, v11, :cond_1b

    .line 435
    .line 436
    invoke-static {v13}, Lbb/g;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v10

    .line 440
    if-eqz v10, :cond_19

    .line 441
    .line 442
    check-cast v15, Ljava/util/Map;

    .line 443
    .line 444
    invoke-interface {v15, v13, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    goto/16 :goto_10

    .line 448
    .line 449
    :cond_19
    sget-object v9, Lbb/l;->c:Log/k;

    .line 450
    .line 451
    invoke-static {v14}, Lzb/c;->b(Ljava/lang/String;)Z

    .line 452
    .line 453
    .line 454
    move-result v9

    .line 455
    if-eqz v9, :cond_1a

    .line 456
    .line 457
    move-object v6, v14

    .line 458
    :cond_1a
    if-nez v6, :cond_16

    .line 459
    .line 460
    :goto_b
    move-object/from16 v10, v16

    .line 461
    .line 462
    goto/16 :goto_10

    .line 463
    .line 464
    :cond_1b
    aget-object v11, v10, v9

    .line 465
    .line 466
    invoke-static {v13, v11}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v11

    .line 470
    instance-of v12, v11, Ljava/lang/String;

    .line 471
    .line 472
    if-eqz v12, :cond_1c

    .line 473
    .line 474
    check-cast v11, Ljava/lang/String;

    .line 475
    .line 476
    goto :goto_c

    .line 477
    :cond_1c
    move-object v11, v6

    .line 478
    :goto_c
    sget-object v12, Lbb/l;->c:Log/k;

    .line 479
    .line 480
    invoke-static {v11}, Lzb/c;->b(Ljava/lang/String;)Z

    .line 481
    .line 482
    .line 483
    move-result v12

    .line 484
    if-eqz v12, :cond_1f

    .line 485
    .line 486
    if-eqz v11, :cond_1d

    .line 487
    .line 488
    invoke-static {v11}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 489
    .line 490
    .line 491
    move-result-object v6

    .line 492
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v6

    .line 496
    :cond_1d
    if-nez v6, :cond_1e

    .line 497
    .line 498
    move-object/from16 v10, v16

    .line 499
    .line 500
    goto :goto_d

    .line 501
    :cond_1e
    move-object v10, v6

    .line 502
    :goto_d
    check-cast v15, Ljava/util/Map;

    .line 503
    .line 504
    invoke-interface {v15, v13, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    goto :goto_10

    .line 508
    :cond_1f
    add-int/lit8 v9, v9, 0x1

    .line 509
    .line 510
    goto :goto_a

    .line 511
    :cond_20
    aget-object v10, v17, v9

    .line 512
    .line 513
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 514
    .line 515
    .line 516
    move-result-object v11

    .line 517
    new-array v12, v7, [Ljava/lang/Class;

    .line 518
    .line 519
    invoke-static {v11, v10, v12}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 520
    .line 521
    .line 522
    move-result-object v10

    .line 523
    new-array v11, v7, [Ljava/lang/Object;

    .line 524
    .line 525
    invoke-static {v10, v13, v11}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v10

    .line 529
    instance-of v11, v10, Ljava/lang/String;

    .line 530
    .line 531
    if-eqz v11, :cond_21

    .line 532
    .line 533
    check-cast v10, Ljava/lang/String;

    .line 534
    .line 535
    goto :goto_e

    .line 536
    :cond_21
    move-object v10, v6

    .line 537
    :goto_e
    sget-object v11, Lbb/l;->c:Log/k;

    .line 538
    .line 539
    invoke-static {v10}, Lzb/c;->b(Ljava/lang/String;)Z

    .line 540
    .line 541
    .line 542
    move-result v11

    .line 543
    if-eqz v11, :cond_37

    .line 544
    .line 545
    if-eqz v10, :cond_22

    .line 546
    .line 547
    invoke-static {v10}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 548
    .line 549
    .line 550
    move-result-object v6

    .line 551
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v6

    .line 555
    :cond_22
    if-nez v6, :cond_23

    .line 556
    .line 557
    move-object/from16 v10, v16

    .line 558
    .line 559
    goto :goto_f

    .line 560
    :cond_23
    move-object v10, v6

    .line 561
    :goto_f
    check-cast v15, Ljava/util/Map;

    .line 562
    .line 563
    invoke-interface {v15, v13, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    :goto_10
    sget-object v6, Lbb/l;->c:Log/k;

    .line 567
    .line 568
    invoke-static {v10}, Lzb/c;->b(Ljava/lang/String;)Z

    .line 569
    .line 570
    .line 571
    move-result v6

    .line 572
    if-eqz v6, :cond_36

    .line 573
    .line 574
    invoke-static {v10}, Lbb/g;->l(Ljava/lang/String;)Z

    .line 575
    .line 576
    .line 577
    move-result v6

    .line 578
    if-eqz v6, :cond_24

    .line 579
    .line 580
    goto/16 :goto_13

    .line 581
    .line 582
    :cond_24
    iget-object v6, v0, Lbb/g;->g:Ljava/util/Map;

    .line 583
    .line 584
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 585
    .line 586
    .line 587
    check-cast v6, Ljava/util/Map;

    .line 588
    .line 589
    invoke-interface {v6, v3, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    if-eqz v4, :cond_33

    .line 593
    .line 594
    iget-object v4, v0, Lbb/g;->b:Lbb/l;

    .line 595
    .line 596
    invoke-virtual {v4, v10}, Lbb/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v4

    .line 600
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 601
    .line 602
    .line 603
    move-result v6

    .line 604
    if-lez v6, :cond_25

    .line 605
    .line 606
    move v6, v2

    .line 607
    goto :goto_11

    .line 608
    :cond_25
    move v6, v7

    .line 609
    :goto_11
    if-eqz v6, :cond_26

    .line 610
    .line 611
    invoke-virtual {v0, v3, v10, v4}, Lbb/g;->c(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)Z

    .line 612
    .line 613
    .line 614
    move-result v2

    .line 615
    if-nez v2, :cond_34

    .line 616
    .line 617
    iget-object v2, v0, Lbb/g;->g:Ljava/util/Map;

    .line 618
    .line 619
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 620
    .line 621
    .line 622
    check-cast v2, Ljava/util/Map;

    .line 623
    .line 624
    invoke-interface {v2, v3, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->tasks()Lo8/j;

    .line 628
    .line 629
    .line 630
    move-result-object v2

    .line 631
    if-eqz v2, :cond_34

    .line 632
    .line 633
    invoke-static {v3}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 634
    .line 635
    .line 636
    move-result v6

    .line 637
    const-string v7, "real_tail_apply_"

    .line 638
    .line 639
    invoke-static {v6, v7}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v6

    .line 643
    new-instance v7, Lb9/c;

    .line 644
    .line 645
    invoke-direct {v7, v0, v3, v10, v4}, Lb9/c;-><init>(Lbb/g;Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    .line 646
    .line 647
    .line 648
    const-wide/16 v8, 0x78

    .line 649
    .line 650
    invoke-virtual {v2, v6, v8, v9, v7}, Lo8/j;->f(Ljava/lang/String;JLjava/lang/Runnable;)V

    .line 651
    .line 652
    .line 653
    goto/16 :goto_12

    .line 654
    .line 655
    :cond_26
    invoke-static {v3}, Lbb/g;->j(Landroid/widget/TextView;)V

    .line 656
    .line 657
    .line 658
    iget-object v4, v0, Lbb/g;->b:Lbb/l;

    .line 659
    .line 660
    iget-object v4, v4, Lbb/l;->a:Landroid/content/SharedPreferences;

    .line 661
    .line 662
    const-string v6, "visible_query"

    .line 663
    .line 664
    invoke-interface {v4, v6, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 665
    .line 666
    .line 667
    move-result v4

    .line 668
    if-eqz v4, :cond_34

    .line 669
    .line 670
    iget-object v4, v0, Lbb/g;->d:Lbb/k;

    .line 671
    .line 672
    invoke-virtual {v4}, Lbb/k;->i()V

    .line 673
    .line 674
    .line 675
    invoke-static {v8}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 676
    .line 677
    .line 678
    move-result-object v6

    .line 679
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 680
    .line 681
    .line 682
    move-result-object v6

    .line 683
    if-nez v6, :cond_27

    .line 684
    .line 685
    const-string v6, ""

    .line 686
    .line 687
    :cond_27
    invoke-static {v10}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 688
    .line 689
    .line 690
    move-result-object v8

    .line 691
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object v8

    .line 695
    if-nez v8, :cond_28

    .line 696
    .line 697
    const-string v8, ""

    .line 698
    .line 699
    :cond_28
    invoke-static {v6}, Lbb/k;->g(Ljava/lang/String;)Z

    .line 700
    .line 701
    .line 702
    move-result v9

    .line 703
    if-eqz v9, :cond_34

    .line 704
    .line 705
    invoke-static {v8}, Lfb/v0;->A(Ljava/lang/String;)Z

    .line 706
    .line 707
    .line 708
    move-result v9

    .line 709
    if-nez v9, :cond_29

    .line 710
    .line 711
    goto/16 :goto_12

    .line 712
    .line 713
    :cond_29
    invoke-static {v8}, Lbb/k;->h(Ljava/lang/String;)Z

    .line 714
    .line 715
    .line 716
    move-result v9

    .line 717
    if-nez v9, :cond_34

    .line 718
    .line 719
    iget-object v9, v4, Lbb/k;->a:Lbb/l;

    .line 720
    .line 721
    invoke-virtual {v9, v8}, Lbb/l;->e(Ljava/lang/String;)Z

    .line 722
    .line 723
    .line 724
    move-result v9

    .line 725
    if-nez v9, :cond_34

    .line 726
    .line 727
    iget-object v9, v4, Lbb/k;->h:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 728
    .line 729
    invoke-virtual {v9, v8}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 730
    .line 731
    .line 732
    move-result v9

    .line 733
    if-eqz v9, :cond_2a

    .line 734
    .line 735
    goto/16 :goto_12

    .line 736
    .line 737
    :cond_2a
    iget-object v9, v4, Lbb/k;->e:Ljava/lang/Object;

    .line 738
    .line 739
    monitor-enter v9

    .line 740
    :try_start_0
    iget-object v10, v4, Lbb/k;->f:Ljava/util/ArrayDeque;

    .line 741
    .line 742
    invoke-virtual {v10}, Ljava/util/ArrayDeque;->size()I

    .line 743
    .line 744
    .line 745
    move-result v10

    .line 746
    iget-object v11, v4, Lbb/k;->l:Ljava/util/concurrent/ConcurrentHashMap;

    .line 747
    .line 748
    invoke-virtual {v11}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 749
    .line 750
    .line 751
    move-result v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 752
    add-int/2addr v10, v11

    .line 753
    const/16 v11, 0x50

    .line 754
    .line 755
    if-lt v10, v11, :cond_2b

    .line 756
    .line 757
    move v7, v2

    .line 758
    :cond_2b
    monitor-exit v9

    .line 759
    if-nez v7, :cond_2c

    .line 760
    .line 761
    invoke-virtual {v4, v6, v8}, Lbb/k;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 762
    .line 763
    .line 764
    :cond_2c
    invoke-virtual {v4, v6, v8}, Lbb/k;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 765
    .line 766
    .line 767
    move-result v7

    .line 768
    if-eqz v7, :cond_2d

    .line 769
    .line 770
    goto/16 :goto_12

    .line 771
    .line 772
    :cond_2d
    invoke-static {v6, v8}, Lbb/k;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 773
    .line 774
    .line 775
    move-result-object v7

    .line 776
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 777
    .line 778
    .line 779
    move-result-wide v9

    .line 780
    iget-object v11, v4, Lbb/k;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 781
    .line 782
    invoke-virtual {v11, v7}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 783
    .line 784
    .line 785
    move-result-object v11

    .line 786
    check-cast v11, Ljava/lang/Long;

    .line 787
    .line 788
    if-eqz v11, :cond_2e

    .line 789
    .line 790
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 791
    .line 792
    .line 793
    move-result-wide v11

    .line 794
    sub-long v11, v9, v11

    .line 795
    .line 796
    const-wide/16 v13, 0x1388

    .line 797
    .line 798
    cmp-long v11, v11, v13

    .line 799
    .line 800
    if-ltz v11, :cond_34

    .line 801
    .line 802
    :cond_2e
    iget-object v11, v4, Lbb/k;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 803
    .line 804
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 805
    .line 806
    .line 807
    move-result-object v9

    .line 808
    invoke-virtual {v11, v7, v9}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 809
    .line 810
    .line 811
    invoke-virtual {v4}, Lbb/k;->i()V

    .line 812
    .line 813
    .line 814
    invoke-static {v6}, Lbb/k;->g(Ljava/lang/String;)Z

    .line 815
    .line 816
    .line 817
    move-result v7

    .line 818
    if-eqz v7, :cond_34

    .line 819
    .line 820
    invoke-static {v8}, Lfb/v0;->A(Ljava/lang/String;)Z

    .line 821
    .line 822
    .line 823
    move-result v7

    .line 824
    if-nez v7, :cond_2f

    .line 825
    .line 826
    goto :goto_12

    .line 827
    :cond_2f
    iget-object v7, v4, Lbb/k;->a:Lbb/l;

    .line 828
    .line 829
    invoke-virtual {v7, v8}, Lbb/l;->e(Ljava/lang/String;)Z

    .line 830
    .line 831
    .line 832
    move-result v7

    .line 833
    if-nez v7, :cond_34

    .line 834
    .line 835
    iget-object v7, v4, Lbb/k;->h:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 836
    .line 837
    invoke-virtual {v7, v8}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 838
    .line 839
    .line 840
    move-result v7

    .line 841
    if-nez v7, :cond_34

    .line 842
    .line 843
    invoke-virtual {v4, v6, v8}, Lbb/k;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 844
    .line 845
    .line 846
    move-result v7

    .line 847
    if-eqz v7, :cond_30

    .line 848
    .line 849
    goto :goto_12

    .line 850
    :cond_30
    iget-object v7, v4, Lbb/k;->b:Lb9/f;

    .line 851
    .line 852
    invoke-virtual {v7}, Lb9/f;->c()Z

    .line 853
    .line 854
    .line 855
    move-result v7

    .line 856
    if-nez v7, :cond_31

    .line 857
    .line 858
    invoke-virtual {v4, v6, v8}, Lbb/k;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 859
    .line 860
    .line 861
    goto :goto_12

    .line 862
    :cond_31
    invoke-virtual {v4}, Lbb/k;->a()Z

    .line 863
    .line 864
    .line 865
    move-result v7

    .line 866
    if-nez v7, :cond_32

    .line 867
    .line 868
    invoke-virtual {v4, v6, v8}, Lbb/k;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 869
    .line 870
    .line 871
    goto :goto_12

    .line 872
    :cond_32
    invoke-virtual {v4, v6, v8, v2}, Lbb/k;->m(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 873
    .line 874
    .line 875
    goto :goto_12

    .line 876
    :catchall_0
    move-exception v0

    .line 877
    monitor-exit v9

    .line 878
    throw v0

    .line 879
    :cond_33
    invoke-static {v3}, Lbb/g;->j(Landroid/widget/TextView;)V

    .line 880
    .line 881
    .line 882
    :cond_34
    :goto_12
    if-eqz v5, :cond_35

    .line 883
    .line 884
    invoke-virtual {v0, v3}, Lbb/g;->b(Landroid/widget/TextView;)V

    .line 885
    .line 886
    .line 887
    return-void

    .line 888
    :cond_35
    invoke-static {v3}, Lbb/g;->i(Landroid/widget/TextView;)V

    .line 889
    .line 890
    .line 891
    return-void

    .line 892
    :cond_36
    :goto_13
    iget-object v0, v0, Lbb/g;->g:Ljava/util/Map;

    .line 893
    .line 894
    invoke-interface {v0, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 895
    .line 896
    .line 897
    invoke-static {v3}, Lbb/g;->j(Landroid/widget/TextView;)V

    .line 898
    .line 899
    .line 900
    invoke-static {v3}, Lbb/g;->i(Landroid/widget/TextView;)V

    .line 901
    .line 902
    .line 903
    return-void

    .line 904
    :cond_37
    add-int/lit8 v9, v9, 0x1

    .line 905
    .line 906
    goto/16 :goto_9

    .line 907
    .line 908
    :cond_38
    add-int/lit8 v12, v12, 0x1

    .line 909
    .line 910
    goto/16 :goto_5

    .line 911
    .line 912
    :cond_39
    return-void
.end method

.method private final b(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 35

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p0

    .line 7
    .line 8
    iget-object v2, v1, Lb9/e;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Lda/h;

    .line 11
    .line 12
    iget-object v3, v2, Lda/h;->b:Landroid/content/SharedPreferences;

    .line 13
    .line 14
    iget-object v4, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 15
    .line 16
    if-eqz v4, :cond_6b

    .line 17
    .line 18
    array-length v5, v4

    .line 19
    const/4 v6, 0x2

    .line 20
    if-ge v5, v6, :cond_0

    .line 21
    .line 22
    goto/16 :goto_41

    .line 23
    .line 24
    :cond_0
    const/4 v5, 0x0

    .line 25
    aget-object v7, v4, v5

    .line 26
    .line 27
    if-eqz v7, :cond_6b

    .line 28
    .line 29
    const/4 v8, 0x1

    .line 30
    aget-object v4, v4, v8

    .line 31
    .line 32
    instance-of v9, v4, Ljava/lang/Integer;

    .line 33
    .line 34
    if-eqz v9, :cond_1

    .line 35
    .line 36
    check-cast v4, Ljava/lang/Integer;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v4, 0x0

    .line 40
    :goto_0
    if-eqz v4, :cond_6b

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    const-string v11, "itemView"

    .line 47
    .line 48
    invoke-static {v7, v11}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v11

    .line 52
    instance-of v12, v11, Landroid/view/View;

    .line 53
    .line 54
    if-eqz v12, :cond_2

    .line 55
    .line 56
    check-cast v11, Landroid/view/View;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    const/4 v11, 0x0

    .line 60
    :goto_1
    if-eqz v11, :cond_3

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v11

    .line 67
    invoke-virtual {v2, v11}, Lda/h;->k(Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 68
    .line 69
    .line 70
    move-result-object v11

    .line 71
    invoke-static {v11, v7}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    instance-of v11, v7, Landroid/view/View;

    .line 76
    .line 77
    if-eqz v11, :cond_4

    .line 78
    .line 79
    move-object v11, v7

    .line 80
    check-cast v11, Landroid/view/View;

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    const/4 v11, 0x0

    .line 84
    :goto_2
    if-eqz v11, :cond_6b

    .line 85
    .line 86
    invoke-static {v11}, Lda/h;->d(Landroid/view/View;)V

    .line 87
    .line 88
    .line 89
    const-string v7, "message_text_color_enable"

    .line 90
    .line 91
    invoke-interface {v3, v7, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-nez v7, :cond_5

    .line 96
    .line 97
    goto/16 :goto_41

    .line 98
    .line 99
    :cond_5
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 100
    .line 101
    if-eqz v0, :cond_6b

    .line 102
    .line 103
    iget-object v7, v2, Lda/h;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 104
    .line 105
    if-gez v9, :cond_6

    .line 106
    .line 107
    move/from16 v16, v6

    .line 108
    .line 109
    const/4 v0, 0x0

    .line 110
    goto/16 :goto_9

    .line 111
    .line 112
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-result-object v12

    .line 116
    invoke-virtual {v7, v12}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v12

    .line 120
    check-cast v12, Ljava/lang/reflect/Method;

    .line 121
    .line 122
    if-eqz v12, :cond_7

    .line 123
    .line 124
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-static {v12, v0, v4}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    move/from16 v16, v6

    .line 133
    .line 134
    goto/16 :goto_9

    .line 135
    .line 136
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    move-result-object v12

    .line 140
    :goto_3
    const-class v13, Ljava/lang/Object;

    .line 141
    .line 142
    if-eqz v12, :cond_e

    .line 143
    .line 144
    invoke-virtual {v12, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v14

    .line 148
    if-nez v14, :cond_e

    .line 149
    .line 150
    invoke-static {v12}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 151
    .line 152
    .line 153
    move-result-object v13

    .line 154
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object v13

    .line 158
    :goto_4
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result v14

    .line 162
    if-eqz v14, :cond_b

    .line 163
    .line 164
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v14

    .line 168
    move-object v15, v14

    .line 169
    check-cast v15, Ljava/lang/reflect/Method;

    .line 170
    .line 171
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    array-length v10, v10

    .line 176
    if-ne v10, v8, :cond_9

    .line 177
    .line 178
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    aget-object v10, v10, v5

    .line 183
    .line 184
    move/from16 v16, v6

    .line 185
    .line 186
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 187
    .line 188
    invoke-static {v10, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v10

    .line 192
    if-nez v10, :cond_8

    .line 193
    .line 194
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    move-result-object v10

    .line 198
    aget-object v10, v10, v5

    .line 199
    .line 200
    invoke-static {v10, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v6

    .line 204
    if-eqz v6, :cond_a

    .line 205
    .line 206
    :cond_8
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    const-string v10, "J0"

    .line 211
    .line 212
    invoke-static {v6, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v6

    .line 216
    if-nez v6, :cond_c

    .line 217
    .line 218
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    const-string v10, "getItem"

    .line 223
    .line 224
    invoke-static {v6, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v6

    .line 228
    if-nez v6, :cond_c

    .line 229
    .line 230
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v6

    .line 234
    const-string v10, "get"

    .line 235
    .line 236
    invoke-static {v6, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v6

    .line 240
    if-eqz v6, :cond_a

    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_9
    move/from16 v16, v6

    .line 244
    .line 245
    :cond_a
    move/from16 v6, v16

    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_b
    move/from16 v16, v6

    .line 249
    .line 250
    const/4 v14, 0x0

    .line 251
    :cond_c
    :goto_5
    check-cast v14, Ljava/lang/reflect/Method;

    .line 252
    .line 253
    if-eqz v14, :cond_d

    .line 254
    .line 255
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    move-result-object v6

    .line 259
    invoke-virtual {v7, v6, v14}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    invoke-static {v14, v0, v6}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    if-eqz v6, :cond_d

    .line 271
    .line 272
    :goto_6
    move-object v0, v6

    .line 273
    goto/16 :goto_9

    .line 274
    .line 275
    :cond_d
    invoke-virtual {v12}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    move-result-object v12

    .line 279
    move/from16 v6, v16

    .line 280
    .line 281
    goto/16 :goto_3

    .line 282
    .line 283
    :cond_e
    move/from16 v16, v6

    .line 284
    .line 285
    iget-object v4, v2, Lda/h;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 286
    .line 287
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    move-result-object v6

    .line 291
    invoke-virtual {v4, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    check-cast v6, Ljava/lang/reflect/Field;

    .line 296
    .line 297
    if-eqz v6, :cond_f

    .line 298
    .line 299
    invoke-static {v6, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v6

    .line 303
    invoke-static {v9, v6}, Lda/h;->o(ILjava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v6

    .line 307
    if-eqz v6, :cond_f

    .line 308
    .line 309
    goto :goto_6

    .line 310
    :cond_f
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    move-result-object v6

    .line 314
    :goto_7
    if-eqz v6, :cond_14

    .line 315
    .line 316
    invoke-virtual {v6, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v7

    .line 320
    if-nez v7, :cond_14

    .line 321
    .line 322
    invoke-static {v6}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 323
    .line 324
    .line 325
    move-result-object v7

    .line 326
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 327
    .line 328
    .line 329
    move-result-object v7

    .line 330
    :cond_10
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 331
    .line 332
    .line 333
    move-result v10

    .line 334
    if-eqz v10, :cond_11

    .line 335
    .line 336
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v10

    .line 340
    move-object v12, v10

    .line 341
    check-cast v12, Ljava/lang/reflect/Field;

    .line 342
    .line 343
    invoke-virtual {v12}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v14

    .line 347
    const-string v15, "K"

    .line 348
    .line 349
    invoke-static {v14, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move-result v14

    .line 353
    if-nez v14, :cond_12

    .line 354
    .line 355
    invoke-virtual {v12}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v14

    .line 359
    const-string v15, "items"

    .line 360
    .line 361
    invoke-static {v14, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move-result v14

    .line 365
    if-nez v14, :cond_12

    .line 366
    .line 367
    invoke-virtual {v12}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v14

    .line 371
    const-string v15, "data"

    .line 372
    .line 373
    invoke-static {v14, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-result v14

    .line 377
    if-nez v14, :cond_12

    .line 378
    .line 379
    invoke-virtual {v12}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v12

    .line 383
    const-string v14, "list"

    .line 384
    .line 385
    invoke-static {v12, v14}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v12

    .line 389
    if-eqz v12, :cond_10

    .line 390
    .line 391
    goto :goto_8

    .line 392
    :cond_11
    const/4 v10, 0x0

    .line 393
    :cond_12
    :goto_8
    check-cast v10, Ljava/lang/reflect/Field;

    .line 394
    .line 395
    if-eqz v10, :cond_13

    .line 396
    .line 397
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    move-result-object v6

    .line 401
    invoke-virtual {v4, v6, v10}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    invoke-static {v10, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    invoke-static {v9, v0}, Lda/h;->o(ILjava/lang/Object;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    goto :goto_9

    .line 413
    :cond_13
    invoke-virtual {v6}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    move-result-object v6

    .line 417
    goto :goto_7

    .line 418
    :cond_14
    new-instance v4, Ljava/util/WeakHashMap;

    .line 419
    .line 420
    invoke-direct {v4}, Ljava/util/WeakHashMap;-><init>()V

    .line 421
    .line 422
    .line 423
    invoke-static {v4}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 424
    .line 425
    .line 426
    move-result-object v4

    .line 427
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 428
    .line 429
    .line 430
    check-cast v4, Ljava/util/Set;

    .line 431
    .line 432
    invoke-static {v0, v9, v4, v5}, Lda/h;->j(Ljava/lang/Object;ILjava/util/Set;I)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    :goto_9
    if-eqz v0, :cond_6b

    .line 437
    .line 438
    new-instance v4, Ljava/util/WeakHashMap;

    .line 439
    .line 440
    invoke-direct {v4}, Ljava/util/WeakHashMap;-><init>()V

    .line 441
    .line 442
    .line 443
    invoke-static {v4}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 444
    .line 445
    .line 446
    move-result-object v4

    .line 447
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    check-cast v4, Ljava/util/Set;

    .line 451
    .line 452
    invoke-static {v5, v0, v4}, Lda/h;->z(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    if-eqz v0, :cond_6b

    .line 457
    .line 458
    invoke-static {v0}, Lda/h;->q(Ljava/lang/Object;)J

    .line 459
    .line 460
    .line 461
    move-result-wide v18

    .line 462
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->chatPage()Lq8/m;

    .line 463
    .line 464
    .line 465
    move-result-object v4

    .line 466
    if-eqz v4, :cond_15

    .line 467
    .line 468
    invoke-virtual {v4}, Lq8/m;->a()Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v4

    .line 472
    goto :goto_a

    .line 473
    :cond_15
    const/4 v4, 0x0

    .line 474
    :goto_a
    const-string v6, ""

    .line 475
    .line 476
    if-nez v4, :cond_16

    .line 477
    .line 478
    move-object v4, v6

    .line 479
    :cond_16
    const-string v7, "field_content"

    .line 480
    .line 481
    invoke-static {v0, v7}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v7

    .line 485
    instance-of v9, v7, Ljava/lang/String;

    .line 486
    .line 487
    if-eqz v9, :cond_17

    .line 488
    .line 489
    check-cast v7, Ljava/lang/String;

    .line 490
    .line 491
    goto :goto_b

    .line 492
    :cond_17
    const/4 v7, 0x0

    .line 493
    :goto_b
    if-eqz v7, :cond_1a

    .line 494
    .line 495
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 496
    .line 497
    .line 498
    move-result v9

    .line 499
    if-nez v9, :cond_18

    .line 500
    .line 501
    goto :goto_c

    .line 502
    :cond_18
    const/4 v7, 0x0

    .line 503
    :goto_c
    if-eqz v7, :cond_1a

    .line 504
    .line 505
    :cond_19
    :goto_d
    move-object/from16 v28, v7

    .line 506
    .line 507
    goto :goto_11

    .line 508
    :cond_1a
    const-string v7, "content"

    .line 509
    .line 510
    invoke-static {v0, v7}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v7

    .line 514
    instance-of v9, v7, Ljava/lang/String;

    .line 515
    .line 516
    if-eqz v9, :cond_1b

    .line 517
    .line 518
    check-cast v7, Ljava/lang/String;

    .line 519
    .line 520
    goto :goto_e

    .line 521
    :cond_1b
    const/4 v7, 0x0

    .line 522
    :goto_e
    if-eqz v7, :cond_1d

    .line 523
    .line 524
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 525
    .line 526
    .line 527
    move-result v9

    .line 528
    if-nez v9, :cond_1c

    .line 529
    .line 530
    goto :goto_f

    .line 531
    :cond_1c
    const/4 v7, 0x0

    .line 532
    :goto_f
    if-eqz v7, :cond_1d

    .line 533
    .line 534
    goto :goto_d

    .line 535
    :cond_1d
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 536
    .line 537
    .line 538
    move-result-object v7

    .line 539
    const-string v9, "getContent"

    .line 540
    .line 541
    new-array v10, v5, [Ljava/lang/Class;

    .line 542
    .line 543
    invoke-static {v7, v9, v10}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 544
    .line 545
    .line 546
    move-result-object v7

    .line 547
    new-array v9, v5, [Ljava/lang/Object;

    .line 548
    .line 549
    invoke-static {v7, v0, v9}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v7

    .line 553
    instance-of v9, v7, Ljava/lang/String;

    .line 554
    .line 555
    if-eqz v9, :cond_1e

    .line 556
    .line 557
    check-cast v7, Ljava/lang/String;

    .line 558
    .line 559
    goto :goto_10

    .line 560
    :cond_1e
    const/4 v7, 0x0

    .line 561
    :goto_10
    if-nez v7, :cond_19

    .line 562
    .line 563
    move-object/from16 v28, v6

    .line 564
    .line 565
    :goto_11
    const-string v7, "field_type"

    .line 566
    .line 567
    const-string v9, "type"

    .line 568
    .line 569
    const-string v10, "getType"

    .line 570
    .line 571
    invoke-static {v0, v10, v7, v9}, Lda/h;->x(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v7

    .line 575
    invoke-static {v7}, Lda/h;->v(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 576
    .line 577
    .line 578
    move-result-object v7

    .line 579
    if-eqz v7, :cond_20

    .line 580
    .line 581
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 582
    .line 583
    .line 584
    move-result v9

    .line 585
    if-lez v9, :cond_1f

    .line 586
    .line 587
    goto :goto_12

    .line 588
    :cond_1f
    const/4 v7, 0x0

    .line 589
    :goto_12
    if-eqz v7, :cond_20

    .line 590
    .line 591
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 592
    .line 593
    .line 594
    move-result v7

    .line 595
    :goto_13
    move/from16 v22, v7

    .line 596
    .line 597
    goto :goto_14

    .line 598
    :cond_20
    sget-object v7, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 599
    .line 600
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 601
    .line 602
    .line 603
    invoke-static/range {v28 .. v28}, Ll8/d;->f(Ljava/lang/String;)I

    .line 604
    .line 605
    .line 606
    move-result v7

    .line 607
    goto :goto_13

    .line 608
    :goto_14
    if-gtz v22, :cond_21

    .line 609
    .line 610
    const/16 v17, 0x0

    .line 611
    .line 612
    goto :goto_18

    .line 613
    :cond_21
    const-string v7, "field_talker"

    .line 614
    .line 615
    const-string v9, "talker"

    .line 616
    .line 617
    const-string v10, "getTalker"

    .line 618
    .line 619
    invoke-static {v0, v10, v7, v9}, Lda/h;->x(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v7

    .line 623
    instance-of v9, v7, Ljava/lang/String;

    .line 624
    .line 625
    if-eqz v9, :cond_22

    .line 626
    .line 627
    check-cast v7, Ljava/lang/String;

    .line 628
    .line 629
    goto :goto_15

    .line 630
    :cond_22
    const/4 v7, 0x0

    .line 631
    :goto_15
    if-eqz v7, :cond_23

    .line 632
    .line 633
    move-object/from16 v27, v7

    .line 634
    .line 635
    goto :goto_16

    .line 636
    :cond_23
    move-object/from16 v27, v4

    .line 637
    .line 638
    :goto_16
    const-string v4, "field_isSend"

    .line 639
    .line 640
    const-string v7, "isSend"

    .line 641
    .line 642
    const-string v9, "getIsSend"

    .line 643
    .line 644
    invoke-static {v0, v9, v4, v7}, Lda/h;->x(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    invoke-static {v0}, Lda/h;->v(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    if-eqz v0, :cond_24

    .line 653
    .line 654
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 655
    .line 656
    .line 657
    move-result v0

    .line 658
    move/from16 v24, v0

    .line 659
    .line 660
    goto :goto_17

    .line 661
    :cond_24
    move/from16 v24, v5

    .line 662
    .line 663
    :goto_17
    new-instance v17, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 664
    .line 665
    const-string v33, ""

    .line 666
    .line 667
    const-string v34, ""

    .line 668
    .line 669
    const-wide/16 v20, 0x0

    .line 670
    .line 671
    const/16 v23, 0x0

    .line 672
    .line 673
    const-wide/16 v25, 0x0

    .line 674
    .line 675
    const-string v29, ""

    .line 676
    .line 677
    const-string v30, ""

    .line 678
    .line 679
    const-string v31, ""

    .line 680
    .line 681
    const/16 v32, 0x0

    .line 682
    .line 683
    invoke-direct/range {v17 .. v34}, Lh/Hchat/hooks/api/model/WeChatMessage;-><init>(JJIIIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 684
    .line 685
    .line 686
    :goto_18
    if-eqz v17, :cond_6b

    .line 687
    .line 688
    invoke-virtual/range {v17 .. v17}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVoip()Z

    .line 689
    .line 690
    .line 691
    move-result v0

    .line 692
    sget-object v4, Ltf/t;->g:Ltf/t;

    .line 693
    .line 694
    if-eqz v0, :cond_28

    .line 695
    .line 696
    iget-object v0, v2, Lda/h;->h:Lsf/i;

    .line 697
    .line 698
    invoke-virtual {v0}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v0

    .line 702
    check-cast v0, Ljava/lang/Number;

    .line 703
    .line 704
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 705
    .line 706
    .line 707
    move-result v0

    .line 708
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 709
    .line 710
    .line 711
    move-result-object v6

    .line 712
    if-eqz v0, :cond_25

    .line 713
    .line 714
    goto :goto_19

    .line 715
    :cond_25
    const/4 v6, 0x0

    .line 716
    :goto_19
    if-eqz v6, :cond_54

    .line 717
    .line 718
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 719
    .line 720
    .line 721
    move-result v0

    .line 722
    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    if-eqz v0, :cond_54

    .line 727
    .line 728
    new-instance v4, Ljava/util/ArrayList;

    .line 729
    .line 730
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 731
    .line 732
    .line 733
    invoke-static {v0, v4}, Lda/h;->h(Landroid/view/View;Ljava/util/ArrayList;)V

    .line 734
    .line 735
    .line 736
    new-instance v0, Ljava/util/HashSet;

    .line 737
    .line 738
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 739
    .line 740
    .line 741
    new-instance v6, Ljava/util/ArrayList;

    .line 742
    .line 743
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 744
    .line 745
    .line 746
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 747
    .line 748
    .line 749
    move-result-object v4

    .line 750
    :cond_26
    :goto_1a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 751
    .line 752
    .line 753
    move-result v7

    .line 754
    if-eqz v7, :cond_27

    .line 755
    .line 756
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    move-result-object v7

    .line 760
    move-object v9, v7

    .line 761
    check-cast v9, Lda/f;

    .line 762
    .line 763
    iget-object v9, v9, Lda/f;->b:Landroid/widget/TextView;

    .line 764
    .line 765
    invoke-virtual {v0, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 766
    .line 767
    .line 768
    move-result v9

    .line 769
    if-eqz v9, :cond_26

    .line 770
    .line 771
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 772
    .line 773
    .line 774
    goto :goto_1a

    .line 775
    :cond_27
    move-object v4, v6

    .line 776
    goto/16 :goto_32

    .line 777
    .line 778
    :cond_28
    invoke-virtual/range {v17 .. v17}, Lh/Hchat/hooks/api/model/WeChatMessage;->isApp()Z

    .line 779
    .line 780
    .line 781
    move-result v0

    .line 782
    if-eqz v0, :cond_2e

    .line 783
    .line 784
    invoke-virtual/range {v17 .. v17}, Lh/Hchat/hooks/api/model/WeChatMessage;->appMsgType()I

    .line 785
    .line 786
    .line 787
    move-result v0

    .line 788
    const/16 v7, 0x13

    .line 789
    .line 790
    if-ne v0, v7, :cond_2e

    .line 791
    .line 792
    iget-object v0, v2, Lda/h;->i:Lsf/i;

    .line 793
    .line 794
    invoke-virtual {v0}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v0

    .line 798
    check-cast v0, Ljava/util/List;

    .line 799
    .line 800
    new-instance v4, Ljava/util/ArrayList;

    .line 801
    .line 802
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 803
    .line 804
    .line 805
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 806
    .line 807
    .line 808
    move-result-object v0

    .line 809
    :cond_29
    :goto_1b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 810
    .line 811
    .line 812
    move-result v6

    .line 813
    if-eqz v6, :cond_2c

    .line 814
    .line 815
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 816
    .line 817
    .line 818
    move-result-object v6

    .line 819
    check-cast v6, Ljava/lang/Number;

    .line 820
    .line 821
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 822
    .line 823
    .line 824
    move-result v6

    .line 825
    invoke-virtual {v11, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 826
    .line 827
    .line 828
    move-result-object v6

    .line 829
    if-eqz v6, :cond_2a

    .line 830
    .line 831
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 832
    .line 833
    .line 834
    move-result v7

    .line 835
    if-eqz v7, :cond_2b

    .line 836
    .line 837
    :cond_2a
    const/4 v9, 0x0

    .line 838
    goto :goto_1c

    .line 839
    :cond_2b
    invoke-static {v6}, Lda/h;->A(Landroid/view/View;)Landroid/widget/TextView;

    .line 840
    .line 841
    .line 842
    move-result-object v7

    .line 843
    if-eqz v7, :cond_2a

    .line 844
    .line 845
    new-instance v9, Lda/f;

    .line 846
    .line 847
    invoke-direct {v9, v6, v7}, Lda/f;-><init>(Landroid/view/View;Landroid/widget/TextView;)V

    .line 848
    .line 849
    .line 850
    :goto_1c
    if-eqz v9, :cond_29

    .line 851
    .line 852
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 853
    .line 854
    .line 855
    goto :goto_1b

    .line 856
    :cond_2c
    new-instance v0, Ljava/util/HashSet;

    .line 857
    .line 858
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 859
    .line 860
    .line 861
    new-instance v6, Ljava/util/ArrayList;

    .line 862
    .line 863
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 864
    .line 865
    .line 866
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 867
    .line 868
    .line 869
    move-result-object v4

    .line 870
    :cond_2d
    :goto_1d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 871
    .line 872
    .line 873
    move-result v7

    .line 874
    if-eqz v7, :cond_27

    .line 875
    .line 876
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 877
    .line 878
    .line 879
    move-result-object v7

    .line 880
    move-object v9, v7

    .line 881
    check-cast v9, Lda/f;

    .line 882
    .line 883
    iget-object v9, v9, Lda/f;->a:Landroid/view/View;

    .line 884
    .line 885
    invoke-virtual {v0, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 886
    .line 887
    .line 888
    move-result v9

    .line 889
    if-eqz v9, :cond_2d

    .line 890
    .line 891
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 892
    .line 893
    .line 894
    goto :goto_1d

    .line 895
    :cond_2e
    invoke-virtual/range {v17 .. v17}, Lh/Hchat/hooks/api/model/WeChatMessage;->isText()Z

    .line 896
    .line 897
    .line 898
    move-result v0

    .line 899
    if-nez v0, :cond_30

    .line 900
    .line 901
    invoke-virtual/range {v17 .. v17}, Lh/Hchat/hooks/api/model/WeChatMessage;->isQuote()Z

    .line 902
    .line 903
    .line 904
    move-result v0

    .line 905
    if-nez v0, :cond_30

    .line 906
    .line 907
    invoke-virtual/range {v17 .. v17}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVoice()Z

    .line 908
    .line 909
    .line 910
    move-result v0

    .line 911
    if-nez v0, :cond_30

    .line 912
    .line 913
    :cond_2f
    const/4 v9, 0x0

    .line 914
    goto :goto_1f

    .line 915
    :cond_30
    iget-object v0, v2, Lda/h;->g:Lsf/i;

    .line 916
    .line 917
    invoke-virtual {v0}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 918
    .line 919
    .line 920
    move-result-object v0

    .line 921
    check-cast v0, Ljava/lang/Number;

    .line 922
    .line 923
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 924
    .line 925
    .line 926
    move-result v0

    .line 927
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 928
    .line 929
    .line 930
    move-result-object v7

    .line 931
    if-eqz v0, :cond_31

    .line 932
    .line 933
    goto :goto_1e

    .line 934
    :cond_31
    const/4 v7, 0x0

    .line 935
    :goto_1e
    if-eqz v7, :cond_2f

    .line 936
    .line 937
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 938
    .line 939
    .line 940
    move-result v0

    .line 941
    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 942
    .line 943
    .line 944
    move-result-object v0

    .line 945
    if-eqz v0, :cond_2f

    .line 946
    .line 947
    invoke-static {v0}, Lda/h;->A(Landroid/view/View;)Landroid/widget/TextView;

    .line 948
    .line 949
    .line 950
    move-result-object v7

    .line 951
    if-eqz v7, :cond_2f

    .line 952
    .line 953
    new-instance v9, Lda/f;

    .line 954
    .line 955
    invoke-direct {v9, v0, v7}, Lda/f;-><init>(Landroid/view/View;Landroid/widget/TextView;)V

    .line 956
    .line 957
    .line 958
    :goto_1f
    if-eqz v9, :cond_32

    .line 959
    .line 960
    goto/16 :goto_30

    .line 961
    .line 962
    :cond_32
    invoke-virtual/range {v17 .. v17}, Lh/Hchat/hooks/api/model/WeChatMessage;->isText()Z

    .line 963
    .line 964
    .line 965
    move-result v0

    .line 966
    if-nez v0, :cond_34

    .line 967
    .line 968
    :cond_33
    :goto_20
    const/4 v9, 0x0

    .line 969
    goto/16 :goto_24

    .line 970
    .line 971
    :cond_34
    invoke-virtual/range {v17 .. v17}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 972
    .line 973
    .line 974
    move-result-object v0

    .line 975
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 976
    .line 977
    .line 978
    move-result v7

    .line 979
    if-nez v7, :cond_35

    .line 980
    .line 981
    goto :goto_21

    .line 982
    :cond_35
    const/4 v0, 0x0

    .line 983
    :goto_21
    if-eqz v0, :cond_33

    .line 984
    .line 985
    invoke-static {v0}, Lda/h;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 986
    .line 987
    .line 988
    move-result-object v0

    .line 989
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 990
    .line 991
    .line 992
    move-result v7

    .line 993
    const/4 v9, 0x6

    .line 994
    if-nez v7, :cond_36

    .line 995
    .line 996
    move-object v0, v4

    .line 997
    goto :goto_23

    .line 998
    :cond_36
    new-instance v7, Ljava/util/LinkedHashSet;

    .line 999
    .line 1000
    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1001
    .line 1002
    .line 1003
    invoke-interface {v7, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1004
    .line 1005
    .line 1006
    const-string v10, ":\n"

    .line 1007
    .line 1008
    invoke-static {v0, v10, v5, v5, v9}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 1009
    .line 1010
    .line 1011
    move-result v10

    .line 1012
    if-lez v10, :cond_37

    .line 1013
    .line 1014
    add-int/lit8 v10, v10, 0x2

    .line 1015
    .line 1016
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1017
    .line 1018
    .line 1019
    move-result v12

    .line 1020
    if-ge v10, v12, :cond_37

    .line 1021
    .line 1022
    invoke-virtual {v0, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v0

    .line 1026
    invoke-static {v0}, Lda/h;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v0

    .line 1030
    invoke-interface {v7, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1031
    .line 1032
    .line 1033
    :cond_37
    new-instance v0, Ljava/util/ArrayList;

    .line 1034
    .line 1035
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1036
    .line 1037
    .line 1038
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v7

    .line 1042
    :cond_38
    :goto_22
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1043
    .line 1044
    .line 1045
    move-result v10

    .line 1046
    if-eqz v10, :cond_39

    .line 1047
    .line 1048
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v10

    .line 1052
    move-object v12, v10

    .line 1053
    check-cast v12, Ljava/lang/String;

    .line 1054
    .line 1055
    invoke-static {v12}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1056
    .line 1057
    .line 1058
    move-result v12

    .line 1059
    if-nez v12, :cond_38

    .line 1060
    .line 1061
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1062
    .line 1063
    .line 1064
    goto :goto_22

    .line 1065
    :cond_39
    :goto_23
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 1066
    .line 1067
    .line 1068
    move-result v7

    .line 1069
    if-eqz v7, :cond_3a

    .line 1070
    .line 1071
    goto :goto_20

    .line 1072
    :cond_3a
    new-instance v7, Ljava/util/ArrayList;

    .line 1073
    .line 1074
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1075
    .line 1076
    .line 1077
    invoke-static {v11, v0, v8, v7}, Lda/h;->f(Landroid/view/View;Ljava/util/List;ZLjava/util/ArrayList;)V

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1081
    .line 1082
    .line 1083
    move-result v10

    .line 1084
    if-eqz v10, :cond_3b

    .line 1085
    .line 1086
    invoke-static {v11, v0, v5, v7}, Lda/h;->f(Landroid/view/View;Ljava/util/List;ZLjava/util/ArrayList;)V

    .line 1087
    .line 1088
    .line 1089
    :cond_3b
    new-instance v0, Lc9/a0;

    .line 1090
    .line 1091
    const/4 v10, 0x5

    .line 1092
    invoke-direct {v0, v2, v10}, Lc9/a0;-><init>(Ljava/lang/Object;I)V

    .line 1093
    .line 1094
    .line 1095
    new-instance v10, Lc9/a0;

    .line 1096
    .line 1097
    invoke-direct {v10, v0, v9}, Lc9/a0;-><init>(Ljava/lang/Object;I)V

    .line 1098
    .line 1099
    .line 1100
    invoke-static {v7, v10}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v0

    .line 1104
    invoke-static {v0}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v0

    .line 1108
    check-cast v0, Lda/f;

    .line 1109
    .line 1110
    move-object v9, v0

    .line 1111
    :goto_24
    if-eqz v9, :cond_3c

    .line 1112
    .line 1113
    goto/16 :goto_30

    .line 1114
    .line 1115
    :cond_3c
    invoke-virtual/range {v17 .. v17}, Lh/Hchat/hooks/api/model/WeChatMessage;->isText()Z

    .line 1116
    .line 1117
    .line 1118
    move-result v0

    .line 1119
    const/4 v7, 0x7

    .line 1120
    if-nez v0, :cond_3d

    .line 1121
    .line 1122
    invoke-virtual/range {v17 .. v17}, Lh/Hchat/hooks/api/model/WeChatMessage;->isQuote()Z

    .line 1123
    .line 1124
    .line 1125
    move-result v0

    .line 1126
    if-nez v0, :cond_3d

    .line 1127
    .line 1128
    move-object v5, v4

    .line 1129
    goto/16 :goto_2d

    .line 1130
    .line 1131
    :cond_3d
    new-instance v0, Ljava/util/ArrayList;

    .line 1132
    .line 1133
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1134
    .line 1135
    .line 1136
    invoke-virtual/range {v17 .. v17}, Lh/Hchat/hooks/api/model/WeChatMessage;->isText()Z

    .line 1137
    .line 1138
    .line 1139
    move-result v9

    .line 1140
    if-eqz v9, :cond_3e

    .line 1141
    .line 1142
    invoke-virtual/range {v17 .. v17}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v9

    .line 1146
    invoke-static {v9, v0}, Lda/h;->c(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1147
    .line 1148
    .line 1149
    :cond_3e
    invoke-virtual/range {v17 .. v17}, Lh/Hchat/hooks/api/model/WeChatMessage;->isQuote()Z

    .line 1150
    .line 1151
    .line 1152
    move-result v9

    .line 1153
    if-eqz v9, :cond_40

    .line 1154
    .line 1155
    invoke-virtual/range {v17 .. v17}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v9

    .line 1159
    invoke-virtual/range {v17 .. v17}, Lh/Hchat/hooks/api/model/WeChatMessage;->getQuoteMsg()Lh/Hchat/hooks/api/model/WeChatQuoteMsg;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v10

    .line 1163
    if-eqz v10, :cond_3f

    .line 1164
    .line 1165
    iget-object v10, v10, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->title:Ljava/lang/String;

    .line 1166
    .line 1167
    goto :goto_25

    .line 1168
    :cond_3f
    const/4 v10, 0x0

    .line 1169
    :goto_25
    invoke-static {v10, v0}, Lda/h;->c(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1170
    .line 1171
    .line 1172
    sget-object v10, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 1173
    .line 1174
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1175
    .line 1176
    .line 1177
    const-string v10, "title"

    .line 1178
    .line 1179
    invoke-static {v9, v10}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v9

    .line 1183
    invoke-static {v9, v0}, Lda/h;->c(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1184
    .line 1185
    .line 1186
    :cond_40
    new-instance v9, Ljava/util/LinkedHashMap;

    .line 1187
    .line 1188
    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1189
    .line 1190
    .line 1191
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v0

    .line 1195
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1196
    .line 1197
    .line 1198
    :goto_26
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1199
    .line 1200
    .line 1201
    move-result v10

    .line 1202
    if-eqz v10, :cond_4b

    .line 1203
    .line 1204
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v10

    .line 1208
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1209
    .line 1210
    .line 1211
    check-cast v10, Lsf/e;

    .line 1212
    .line 1213
    iget-object v12, v10, Lsf/e;->g:Ljava/lang/Object;

    .line 1214
    .line 1215
    check-cast v12, Ljava/lang/Number;

    .line 1216
    .line 1217
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 1218
    .line 1219
    .line 1220
    move-result v12

    .line 1221
    iget-object v10, v10, Lsf/e;->h:Ljava/lang/Object;

    .line 1222
    .line 1223
    check-cast v10, Ljava/lang/String;

    .line 1224
    .line 1225
    if-eqz v10, :cond_46

    .line 1226
    .line 1227
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1228
    .line 1229
    .line 1230
    move-result v13

    .line 1231
    if-eqz v13, :cond_41

    .line 1232
    .line 1233
    goto/16 :goto_2a

    .line 1234
    .line 1235
    :cond_41
    new-instance v13, Ljava/util/LinkedHashSet;

    .line 1236
    .line 1237
    invoke-direct {v13}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1238
    .line 1239
    .line 1240
    move v14, v5

    .line 1241
    move/from16 v15, v16

    .line 1242
    .line 1243
    :goto_27
    if-ge v14, v15, :cond_42

    .line 1244
    .line 1245
    const-string v15, "&lt;"

    .line 1246
    .line 1247
    const-string v8, "<"

    .line 1248
    .line 1249
    invoke-static {v10, v15, v8, v5}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v8

    .line 1253
    const-string v10, "&gt;"

    .line 1254
    .line 1255
    const-string v15, ">"

    .line 1256
    .line 1257
    invoke-static {v8, v10, v15, v5}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v8

    .line 1261
    const-string v10, "&quot;"

    .line 1262
    .line 1263
    const-string v15, "\""

    .line 1264
    .line 1265
    invoke-static {v8, v10, v15, v5}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v8

    .line 1269
    const-string v10, "&apos;"

    .line 1270
    .line 1271
    const-string v15, "\'"

    .line 1272
    .line 1273
    invoke-static {v8, v10, v15, v5}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v8

    .line 1277
    const-string v10, "&amp;"

    .line 1278
    .line 1279
    const-string v15, "&"

    .line 1280
    .line 1281
    invoke-static {v8, v10, v15, v5}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v8

    .line 1285
    new-instance v10, Log/k;

    .line 1286
    .line 1287
    const-string v15, "&#(x[0-9a-fA-F]+|[0-9]+);"

    .line 1288
    .line 1289
    invoke-direct {v10, v15}, Log/k;-><init>(Ljava/lang/String;)V

    .line 1290
    .line 1291
    .line 1292
    new-instance v15, Lb4/b;

    .line 1293
    .line 1294
    const/16 v5, 0x17

    .line 1295
    .line 1296
    invoke-direct {v15, v5}, Lb4/b;-><init>(I)V

    .line 1297
    .line 1298
    .line 1299
    invoke-virtual {v10, v8, v15}, Log/k;->e(Ljava/lang/CharSequence;Lfg/l;)Ljava/lang/String;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v10

    .line 1303
    add-int/lit8 v14, v14, 0x1

    .line 1304
    .line 1305
    const/4 v5, 0x0

    .line 1306
    const/4 v8, 0x1

    .line 1307
    const/4 v15, 0x2

    .line 1308
    goto :goto_27

    .line 1309
    :cond_42
    invoke-static {v10}, Lda/h;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v5

    .line 1313
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1314
    .line 1315
    .line 1316
    move-result v8

    .line 1317
    if-nez v8, :cond_43

    .line 1318
    .line 1319
    goto :goto_28

    .line 1320
    :cond_43
    invoke-static {v5, v13}, Lda/h;->b(Ljava/lang/String;Ljava/util/LinkedHashSet;)V

    .line 1321
    .line 1322
    .line 1323
    const-string v8, "<[^>]+>"

    .line 1324
    .line 1325
    invoke-static {v8}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v8

    .line 1329
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1330
    .line 1331
    .line 1332
    invoke-virtual {v8, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v8

    .line 1336
    invoke-virtual {v8, v6}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v8

    .line 1340
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1341
    .line 1342
    .line 1343
    const-string v10, "\\{\\{[^}]+}}"

    .line 1344
    .line 1345
    invoke-static {v10}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v10

    .line 1349
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1350
    .line 1351
    .line 1352
    invoke-virtual {v10, v8}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v8

    .line 1356
    invoke-virtual {v8, v6}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v8

    .line 1360
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1361
    .line 1362
    .line 1363
    invoke-static {v8}, Lda/h;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v8

    .line 1367
    invoke-static {v8, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1368
    .line 1369
    .line 1370
    move-result v5

    .line 1371
    if-nez v5, :cond_44

    .line 1372
    .line 1373
    invoke-static {v8, v13}, Lda/h;->b(Ljava/lang/String;Ljava/util/LinkedHashSet;)V

    .line 1374
    .line 1375
    .line 1376
    :cond_44
    :goto_28
    new-instance v5, Ljava/util/ArrayList;

    .line 1377
    .line 1378
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1379
    .line 1380
    .line 1381
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v8

    .line 1385
    :cond_45
    :goto_29
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1386
    .line 1387
    .line 1388
    move-result v10

    .line 1389
    if-eqz v10, :cond_47

    .line 1390
    .line 1391
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1392
    .line 1393
    .line 1394
    move-result-object v10

    .line 1395
    move-object v13, v10

    .line 1396
    check-cast v13, Ljava/lang/String;

    .line 1397
    .line 1398
    invoke-static {v13}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1399
    .line 1400
    .line 1401
    move-result v13

    .line 1402
    if-nez v13, :cond_45

    .line 1403
    .line 1404
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1405
    .line 1406
    .line 1407
    goto :goto_29

    .line 1408
    :cond_46
    :goto_2a
    move-object v5, v4

    .line 1409
    :cond_47
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v5

    .line 1413
    :cond_48
    :goto_2b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1414
    .line 1415
    .line 1416
    move-result v8

    .line 1417
    if-eqz v8, :cond_4a

    .line 1418
    .line 1419
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v8

    .line 1423
    check-cast v8, Ljava/lang/String;

    .line 1424
    .line 1425
    invoke-virtual {v9, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v10

    .line 1429
    check-cast v10, Ljava/lang/Integer;

    .line 1430
    .line 1431
    if-eqz v10, :cond_49

    .line 1432
    .line 1433
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 1434
    .line 1435
    .line 1436
    move-result v10

    .line 1437
    if-ge v12, v10, :cond_48

    .line 1438
    .line 1439
    :cond_49
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v10

    .line 1443
    invoke-interface {v9, v8, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1444
    .line 1445
    .line 1446
    goto :goto_2b

    .line 1447
    :cond_4a
    const/4 v5, 0x0

    .line 1448
    const/4 v8, 0x1

    .line 1449
    const/16 v16, 0x2

    .line 1450
    .line 1451
    goto/16 :goto_26

    .line 1452
    .line 1453
    :cond_4b
    invoke-virtual {v9}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v0

    .line 1457
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1458
    .line 1459
    .line 1460
    check-cast v0, Ljava/lang/Iterable;

    .line 1461
    .line 1462
    new-instance v5, La9/h;

    .line 1463
    .line 1464
    const/16 v6, 0x8

    .line 1465
    .line 1466
    invoke-direct {v5, v6}, La9/h;-><init>(I)V

    .line 1467
    .line 1468
    .line 1469
    new-instance v6, Lc9/a0;

    .line 1470
    .line 1471
    invoke-direct {v6, v5, v7}, Lc9/a0;-><init>(Ljava/lang/Object;I)V

    .line 1472
    .line 1473
    .line 1474
    invoke-static {v0, v6}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v0

    .line 1478
    new-instance v5, Ljava/util/ArrayList;

    .line 1479
    .line 1480
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 1481
    .line 1482
    .line 1483
    move-result v6

    .line 1484
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 1485
    .line 1486
    .line 1487
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v0

    .line 1491
    :goto_2c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1492
    .line 1493
    .line 1494
    move-result v6

    .line 1495
    if-eqz v6, :cond_4c

    .line 1496
    .line 1497
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v6

    .line 1501
    check-cast v6, Ljava/util/Map$Entry;

    .line 1502
    .line 1503
    new-instance v8, Lda/d;

    .line 1504
    .line 1505
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v9

    .line 1509
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1510
    .line 1511
    .line 1512
    check-cast v9, Ljava/lang/String;

    .line 1513
    .line 1514
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v6

    .line 1518
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1519
    .line 1520
    .line 1521
    check-cast v6, Ljava/lang/Number;

    .line 1522
    .line 1523
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 1524
    .line 1525
    .line 1526
    move-result v6

    .line 1527
    invoke-direct {v8, v9, v6}, Lda/d;-><init>(Ljava/lang/String;I)V

    .line 1528
    .line 1529
    .line 1530
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1531
    .line 1532
    .line 1533
    goto :goto_2c

    .line 1534
    :cond_4c
    :goto_2d
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 1535
    .line 1536
    .line 1537
    move-result v0

    .line 1538
    if-eqz v0, :cond_4e

    .line 1539
    .line 1540
    :cond_4d
    const/4 v9, 0x0

    .line 1541
    goto :goto_2f

    .line 1542
    :cond_4e
    new-instance v0, Ljava/util/ArrayList;

    .line 1543
    .line 1544
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1545
    .line 1546
    .line 1547
    const/4 v6, 0x1

    .line 1548
    invoke-static {v11, v5, v6, v0}, Lda/h;->e(Landroid/view/View;Ljava/util/List;ZLjava/util/ArrayList;)V

    .line 1549
    .line 1550
    .line 1551
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1552
    .line 1553
    .line 1554
    move-result v6

    .line 1555
    if-eqz v6, :cond_4f

    .line 1556
    .line 1557
    const/4 v6, 0x0

    .line 1558
    invoke-static {v11, v5, v6, v0}, Lda/h;->e(Landroid/view/View;Ljava/util/List;ZLjava/util/ArrayList;)V

    .line 1559
    .line 1560
    .line 1561
    goto :goto_2e

    .line 1562
    :cond_4f
    const/4 v6, 0x0

    .line 1563
    :goto_2e
    new-instance v5, La9/h;

    .line 1564
    .line 1565
    invoke-direct {v5, v7}, La9/h;-><init>(I)V

    .line 1566
    .line 1567
    .line 1568
    new-instance v7, Lc9/a0;

    .line 1569
    .line 1570
    const/4 v8, 0x3

    .line 1571
    invoke-direct {v7, v5, v8}, Lc9/a0;-><init>(Ljava/lang/Object;I)V

    .line 1572
    .line 1573
    .line 1574
    new-instance v5, Lda/g;

    .line 1575
    .line 1576
    invoke-direct {v5, v7, v2, v6}, Lda/g;-><init>(Ljava/util/Comparator;Ljava/lang/Object;I)V

    .line 1577
    .line 1578
    .line 1579
    new-instance v6, Lc9/a0;

    .line 1580
    .line 1581
    const/4 v7, 0x4

    .line 1582
    invoke-direct {v6, v5, v7}, Lc9/a0;-><init>(Ljava/lang/Object;I)V

    .line 1583
    .line 1584
    .line 1585
    invoke-static {v0, v6}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 1586
    .line 1587
    .line 1588
    move-result-object v0

    .line 1589
    invoke-static {v0}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 1590
    .line 1591
    .line 1592
    move-result-object v0

    .line 1593
    check-cast v0, Lda/e;

    .line 1594
    .line 1595
    if-eqz v0, :cond_4d

    .line 1596
    .line 1597
    iget-object v0, v0, Lda/e;->a:Lda/f;

    .line 1598
    .line 1599
    move-object v9, v0

    .line 1600
    :goto_2f
    if-eqz v9, :cond_50

    .line 1601
    .line 1602
    goto :goto_30

    .line 1603
    :cond_50
    invoke-virtual/range {v17 .. v17}, Lh/Hchat/hooks/api/model/WeChatMessage;->isText()Z

    .line 1604
    .line 1605
    .line 1606
    move-result v0

    .line 1607
    if-nez v0, :cond_51

    .line 1608
    .line 1609
    const/4 v9, 0x0

    .line 1610
    goto :goto_30

    .line 1611
    :cond_51
    new-instance v0, Ljava/util/ArrayList;

    .line 1612
    .line 1613
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1614
    .line 1615
    .line 1616
    invoke-static {v11, v0}, Lda/h;->g(Landroid/view/View;Ljava/util/ArrayList;)V

    .line 1617
    .line 1618
    .line 1619
    new-instance v5, Lda/g;

    .line 1620
    .line 1621
    invoke-direct {v5, v2, v11}, Lda/g;-><init>(Lda/h;Landroid/view/View;)V

    .line 1622
    .line 1623
    .line 1624
    new-instance v6, Lda/g;

    .line 1625
    .line 1626
    const/4 v15, 0x2

    .line 1627
    invoke-direct {v6, v5, v2, v15}, Lda/g;-><init>(Ljava/util/Comparator;Ljava/lang/Object;I)V

    .line 1628
    .line 1629
    .line 1630
    invoke-static {v0, v6}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v0

    .line 1634
    invoke-static {v0}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v0

    .line 1638
    check-cast v0, Lda/f;

    .line 1639
    .line 1640
    move-object v9, v0

    .line 1641
    :goto_30
    if-eqz v9, :cond_52

    .line 1642
    .line 1643
    invoke-static {v9}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 1644
    .line 1645
    .line 1646
    move-result-object v0

    .line 1647
    goto :goto_31

    .line 1648
    :cond_52
    const/4 v0, 0x0

    .line 1649
    :goto_31
    if-nez v0, :cond_53

    .line 1650
    .line 1651
    goto :goto_32

    .line 1652
    :cond_53
    move-object v4, v0

    .line 1653
    :cond_54
    :goto_32
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 1654
    .line 1655
    .line 1656
    move-result v0

    .line 1657
    if-eqz v0, :cond_55

    .line 1658
    .line 1659
    goto/16 :goto_41

    .line 1660
    .line 1661
    :cond_55
    invoke-virtual/range {v17 .. v17}, Lh/Hchat/hooks/api/model/WeChatMessage;->isOutgoing()Z

    .line 1662
    .line 1663
    .line 1664
    move-result v0

    .line 1665
    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1666
    .line 1667
    .line 1668
    move-result-object v5

    .line 1669
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1670
    .line 1671
    .line 1672
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v5

    .line 1676
    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v5

    .line 1680
    iget v5, v5, Landroid/content/res/Configuration;->uiMode:I

    .line 1681
    .line 1682
    and-int/lit8 v5, v5, 0x30

    .line 1683
    .line 1684
    const/16 v6, 0x20

    .line 1685
    .line 1686
    if-ne v5, v6, :cond_56

    .line 1687
    .line 1688
    const/4 v6, 0x1

    .line 1689
    goto :goto_33

    .line 1690
    :cond_56
    const/4 v6, 0x0

    .line 1691
    :goto_33
    if-eqz v0, :cond_57

    .line 1692
    .line 1693
    if-eqz v6, :cond_57

    .line 1694
    .line 1695
    const-string v5, "message_text_color_right_dark"

    .line 1696
    .line 1697
    goto :goto_34

    .line 1698
    :cond_57
    if-eqz v0, :cond_58

    .line 1699
    .line 1700
    const-string v5, "message_text_color_right_light"

    .line 1701
    .line 1702
    goto :goto_34

    .line 1703
    :cond_58
    if-eqz v6, :cond_59

    .line 1704
    .line 1705
    const-string v5, "message_text_color_left_dark"

    .line 1706
    .line 1707
    goto :goto_34

    .line 1708
    :cond_59
    const-string v5, "message_text_color_left_light"

    .line 1709
    .line 1710
    :goto_34
    const-string v7, "#FF000000"

    .line 1711
    .line 1712
    if-eqz v0, :cond_5a

    .line 1713
    .line 1714
    if-eqz v6, :cond_5a

    .line 1715
    .line 1716
    goto :goto_35

    .line 1717
    :cond_5a
    if-eqz v0, :cond_5b

    .line 1718
    .line 1719
    goto :goto_35

    .line 1720
    :cond_5b
    if-eqz v6, :cond_5c

    .line 1721
    .line 1722
    const-string v7, "#FFFFFFFF"

    .line 1723
    .line 1724
    :cond_5c
    :goto_35
    invoke-interface {v3, v5, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1725
    .line 1726
    .line 1727
    move-result-object v0

    .line 1728
    if-eqz v0, :cond_5d

    .line 1729
    .line 1730
    goto :goto_36

    .line 1731
    :cond_5d
    move-object v0, v7

    .line 1732
    :goto_36
    invoke-static {v0}, Lda/h;->u(Ljava/lang/String;)Lda/c;

    .line 1733
    .line 1734
    .line 1735
    move-result-object v0

    .line 1736
    if-eqz v0, :cond_5e

    .line 1737
    .line 1738
    goto :goto_37

    .line 1739
    :cond_5e
    invoke-static {v7}, Lda/h;->u(Ljava/lang/String;)Lda/c;

    .line 1740
    .line 1741
    .line 1742
    move-result-object v0

    .line 1743
    :goto_37
    if-eqz v0, :cond_6b

    .line 1744
    .line 1745
    invoke-virtual/range {v17 .. v17}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 1746
    .line 1747
    .line 1748
    move-result-object v3

    .line 1749
    invoke-virtual/range {v17 .. v17}, Lh/Hchat/hooks/api/model/WeChatMessage;->isQuote()Z

    .line 1750
    .line 1751
    .line 1752
    move-result v5

    .line 1753
    if-nez v5, :cond_60

    .line 1754
    .line 1755
    invoke-virtual/range {v17 .. v17}, Lh/Hchat/hooks/api/model/WeChatMessage;->isText()Z

    .line 1756
    .line 1757
    .line 1758
    move-result v5

    .line 1759
    if-eqz v5, :cond_5f

    .line 1760
    .line 1761
    const/16 v5, 0x23

    .line 1762
    .line 1763
    invoke-static {v3, v5}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 1764
    .line 1765
    .line 1766
    move-result v5

    .line 1767
    if-nez v5, :cond_60

    .line 1768
    .line 1769
    const v5, 0xff03

    .line 1770
    .line 1771
    .line 1772
    invoke-static {v3, v5}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 1773
    .line 1774
    .line 1775
    move-result v3

    .line 1776
    if-eqz v3, :cond_5f

    .line 1777
    .line 1778
    goto :goto_38

    .line 1779
    :cond_5f
    const/4 v6, 0x0

    .line 1780
    goto :goto_39

    .line 1781
    :cond_60
    :goto_38
    const/4 v6, 0x1

    .line 1782
    :goto_39
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1783
    .line 1784
    .line 1785
    move-result-object v3

    .line 1786
    :cond_61
    :goto_3a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1787
    .line 1788
    .line 1789
    move-result v4

    .line 1790
    if-eqz v4, :cond_6b

    .line 1791
    .line 1792
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v4

    .line 1796
    check-cast v4, Lda/f;

    .line 1797
    .line 1798
    if-nez v6, :cond_67

    .line 1799
    .line 1800
    iget-object v5, v4, Lda/f;->a:Landroid/view/View;

    .line 1801
    .line 1802
    iget-object v7, v4, Lda/f;->b:Landroid/widget/TextView;

    .line 1803
    .line 1804
    invoke-static {v5, v7}, Lda/h;->y(Landroid/view/View;Landroid/widget/TextView;)Ljava/lang/CharSequence;

    .line 1805
    .line 1806
    .line 1807
    move-result-object v5

    .line 1808
    instance-of v7, v5, Landroid/text/Spanned;

    .line 1809
    .line 1810
    if-eqz v7, :cond_62

    .line 1811
    .line 1812
    check-cast v5, Landroid/text/Spanned;

    .line 1813
    .line 1814
    goto :goto_3b

    .line 1815
    :cond_62
    const/4 v5, 0x0

    .line 1816
    :goto_3b
    if-eqz v5, :cond_65

    .line 1817
    .line 1818
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 1819
    .line 1820
    .line 1821
    move-result v7

    .line 1822
    if-nez v7, :cond_63

    .line 1823
    .line 1824
    const/4 v5, 0x1

    .line 1825
    const/4 v9, 0x0

    .line 1826
    const/16 v19, 0x0

    .line 1827
    .line 1828
    goto :goto_3e

    .line 1829
    :cond_63
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 1830
    .line 1831
    .line 1832
    move-result v7

    .line 1833
    const-class v8, Landroid/text/style/ClickableSpan;

    .line 1834
    .line 1835
    const/4 v9, 0x0

    .line 1836
    invoke-interface {v5, v9, v7, v8}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 1837
    .line 1838
    .line 1839
    move-result-object v5

    .line 1840
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1841
    .line 1842
    .line 1843
    array-length v5, v5

    .line 1844
    if-nez v5, :cond_64

    .line 1845
    .line 1846
    const/16 v18, 0x1

    .line 1847
    .line 1848
    :goto_3c
    const/4 v5, 0x1

    .line 1849
    goto :goto_3d

    .line 1850
    :cond_64
    move/from16 v18, v9

    .line 1851
    .line 1852
    goto :goto_3c

    .line 1853
    :goto_3d
    xor-int/lit8 v7, v18, 0x1

    .line 1854
    .line 1855
    move/from16 v19, v7

    .line 1856
    .line 1857
    goto :goto_3e

    .line 1858
    :cond_65
    const/4 v5, 0x1

    .line 1859
    const/4 v9, 0x0

    .line 1860
    move/from16 v19, v9

    .line 1861
    .line 1862
    :goto_3e
    if-eqz v19, :cond_66

    .line 1863
    .line 1864
    goto :goto_3f

    .line 1865
    :cond_66
    move v7, v9

    .line 1866
    goto :goto_40

    .line 1867
    :cond_67
    const/4 v5, 0x1

    .line 1868
    const/4 v9, 0x0

    .line 1869
    :goto_3f
    move v7, v5

    .line 1870
    :goto_40
    iget-object v8, v4, Lda/f;->a:Landroid/view/View;

    .line 1871
    .line 1872
    iget-object v4, v4, Lda/f;->b:Landroid/widget/TextView;

    .line 1873
    .line 1874
    invoke-static {v8}, Lda/h;->d(Landroid/view/View;)V

    .line 1875
    .line 1876
    .line 1877
    new-instance v10, Lda/b;

    .line 1878
    .line 1879
    invoke-virtual {v4}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    .line 1880
    .line 1881
    .line 1882
    move-result-object v11

    .line 1883
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1884
    .line 1885
    .line 1886
    invoke-virtual {v4}, Landroid/widget/TextView;->getLinkTextColors()Landroid/content/res/ColorStateList;

    .line 1887
    .line 1888
    .line 1889
    move-result-object v12

    .line 1890
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1891
    .line 1892
    .line 1893
    invoke-virtual {v4}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 1894
    .line 1895
    .line 1896
    move-result-object v13

    .line 1897
    iget v13, v13, Landroid/text/TextPaint;->linkColor:I

    .line 1898
    .line 1899
    invoke-virtual {v4}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 1900
    .line 1901
    .line 1902
    move-result-object v14

    .line 1903
    invoke-virtual {v14}, Landroid/graphics/Paint;->getShader()Landroid/graphics/Shader;

    .line 1904
    .line 1905
    .line 1906
    move-result-object v14

    .line 1907
    iget v15, v0, Lda/c;->a:I

    .line 1908
    .line 1909
    invoke-direct/range {v10 .. v15}, Lda/b;-><init>(Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;ILandroid/graphics/Shader;I)V

    .line 1910
    .line 1911
    .line 1912
    const v11, 0x7f06003f

    .line 1913
    .line 1914
    .line 1915
    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1916
    .line 1917
    invoke-virtual {v8, v11, v12}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 1918
    .line 1919
    .line 1920
    const v11, 0x7f060040

    .line 1921
    .line 1922
    .line 1923
    invoke-virtual {v8, v11, v10}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 1924
    .line 1925
    .line 1926
    iget v11, v0, Lda/c;->a:I

    .line 1927
    .line 1928
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1929
    .line 1930
    .line 1931
    move-result-object v12

    .line 1932
    const v13, 0x7f060041

    .line 1933
    .line 1934
    .line 1935
    invoke-virtual {v8, v13, v12}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 1936
    .line 1937
    .line 1938
    invoke-static {v8}, Lda/h;->m(Landroid/view/View;)Z

    .line 1939
    .line 1940
    .line 1941
    move-result v12

    .line 1942
    if-eqz v12, :cond_68

    .line 1943
    .line 1944
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1945
    .line 1946
    .line 1947
    move-result-object v12

    .line 1948
    filled-new-array {v12}, [Ljava/lang/Object;

    .line 1949
    .line 1950
    .line 1951
    move-result-object v12

    .line 1952
    const-string v13, "setTextColor"

    .line 1953
    .line 1954
    invoke-static {v8, v13, v12}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1955
    .line 1956
    .line 1957
    :cond_68
    invoke-virtual {v4, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1958
    .line 1959
    .line 1960
    invoke-virtual {v4}, Landroid/view/View;->invalidate()V

    .line 1961
    .line 1962
    .line 1963
    invoke-virtual {v8}, Landroid/view/View;->invalidate()V

    .line 1964
    .line 1965
    .line 1966
    invoke-virtual {v4, v11}, Landroid/widget/TextView;->setLinkTextColor(I)V

    .line 1967
    .line 1968
    .line 1969
    invoke-static {v8}, Lda/h;->m(Landroid/view/View;)Z

    .line 1970
    .line 1971
    .line 1972
    move-result v12

    .line 1973
    if-eqz v12, :cond_69

    .line 1974
    .line 1975
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1976
    .line 1977
    .line 1978
    move-result-object v11

    .line 1979
    filled-new-array {v11}, [Ljava/lang/Object;

    .line 1980
    .line 1981
    .line 1982
    move-result-object v11

    .line 1983
    const-string v12, "setLinkTextColor"

    .line 1984
    .line 1985
    invoke-static {v8, v12, v11}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1986
    .line 1987
    .line 1988
    :cond_69
    iget-boolean v11, v0, Lda/c;->c:Z

    .line 1989
    .line 1990
    if-nez v11, :cond_6a

    .line 1991
    .line 1992
    if-eqz v7, :cond_61

    .line 1993
    .line 1994
    :cond_6a
    invoke-virtual {v2, v8, v4, v0, v10}, Lda/h;->B(Landroid/view/View;Landroid/widget/TextView;Lda/c;Lda/b;)V

    .line 1995
    .line 1996
    .line 1997
    goto/16 :goto_3a

    .line 1998
    .line 1999
    :cond_6b
    :goto_41
    return-void
.end method

.method private final c(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    instance-of v1, v0, Landroid/app/Notification;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Landroid/app/Notification;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v0, v2

    .line 17
    :goto_0
    if-eqz v0, :cond_10

    .line 18
    .line 19
    sget-object v1, Le9/q;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 20
    .line 21
    iget-object v1, p0, Lb9/e;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Ljava/lang/reflect/Method;

    .line 24
    .line 25
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const/4 p1, 0x0

    .line 31
    new-array p1, p1, [Ljava/lang/Object;

    .line 32
    .line 33
    :goto_1
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {v1}, Le9/q;->l([Ljava/lang/Class;)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_a

    .line 45
    .line 46
    new-instance v1, Le9/k;

    .line 47
    .line 48
    const/4 v3, 0x4

    .line 49
    invoke-static {v3, p1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    move-object v3, v2

    .line 61
    :goto_2
    const-string v4, ""

    .line 62
    .line 63
    if-nez v3, :cond_3

    .line 64
    .line 65
    move-object v3, v4

    .line 66
    :cond_3
    const/4 v5, 0x5

    .line 67
    invoke-static {v5, p1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    if-eqz v5, :cond_4

    .line 72
    .line 73
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    goto :goto_3

    .line 78
    :cond_4
    move-object v5, v2

    .line 79
    :goto_3
    if-nez v5, :cond_5

    .line 80
    .line 81
    move-object v5, v4

    .line 82
    :cond_5
    const/4 v6, 0x6

    .line 83
    invoke-static {v6, p1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    if-eqz v6, :cond_6

    .line 88
    .line 89
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    goto :goto_4

    .line 94
    :cond_6
    move-object v6, v2

    .line 95
    :goto_4
    if-nez v6, :cond_7

    .line 96
    .line 97
    move-object v6, v4

    .line 98
    :cond_7
    const/16 v7, 0xe

    .line 99
    .line 100
    invoke-static {v7, p1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    if-eqz p1, :cond_8

    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    :cond_8
    if-nez v2, :cond_9

    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_9
    move-object v4, v2

    .line 114
    :goto_5
    invoke-direct {v1, v3, v5, v6, v4}, Le9/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    move-object v2, v1

    .line 118
    goto :goto_6

    .line 119
    :cond_a
    invoke-static {v1}, Le9/q;->o([Ljava/lang/Class;)Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-eqz v1, :cond_b

    .line 124
    .line 125
    invoke-static {p1}, Ltf/l;->z0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    if-eqz p1, :cond_b

    .line 130
    .line 131
    new-instance v2, Le9/k;

    .line 132
    .line 133
    const-string v1, "e"

    .line 134
    .line 135
    invoke-static {p1, v1}, Le9/q;->x(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    const-string v3, "f"

    .line 140
    .line 141
    invoke-static {p1, v3}, Le9/q;->x(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    const-string v4, "g"

    .line 146
    .line 147
    invoke-static {p1, v4}, Le9/q;->x(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    const-string v5, "o"

    .line 152
    .line 153
    invoke-static {p1, v5}, Le9/q;->x(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-direct {v2, v1, v3, v4, p1}, Le9/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    :cond_b
    :goto_6
    if-eqz v2, :cond_10

    .line 161
    .line 162
    iget-object p1, v2, Le9/k;->a:Ljava/lang/String;

    .line 163
    .line 164
    iget-object v1, v0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 165
    .line 166
    if-nez v1, :cond_c

    .line 167
    .line 168
    new-instance v1, Landroid/os/Bundle;

    .line 169
    .line 170
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 171
    .line 172
    .line 173
    iput-object v1, v0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 174
    .line 175
    :cond_c
    iget-object v1, v2, Le9/k;->d:Ljava/lang/String;

    .line 176
    .line 177
    iget-object v3, v2, Le9/k;->c:Ljava/lang/String;

    .line 178
    .line 179
    iget-object v2, v2, Le9/k;->b:Ljava/lang/String;

    .line 180
    .line 181
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    if-nez v4, :cond_d

    .line 186
    .line 187
    iget-object v4, v0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 188
    .line 189
    const-string v5, "hchat_custom_notification_native_title"

    .line 190
    .line 191
    invoke-virtual {v4, v5, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    :cond_d
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    if-nez p1, :cond_e

    .line 199
    .line 200
    iget-object p1, v0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 201
    .line 202
    const-string v4, "hchat_custom_notification_native_text"

    .line 203
    .line 204
    invoke-virtual {p1, v4, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    :cond_e
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 208
    .line 209
    .line 210
    move-result p1

    .line 211
    if-nez p1, :cond_f

    .line 212
    .line 213
    iget-object p1, v0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 214
    .line 215
    const-string v2, "hchat_custom_notification_native_summary"

    .line 216
    .line 217
    invoke-virtual {p1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    :cond_f
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 221
    .line 222
    .line 223
    move-result p1

    .line 224
    if-nez p1, :cond_10

    .line 225
    .line 226
    iget-object p1, v0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 227
    .line 228
    const-string v0, "hchat_custom_notification_talker"

    .line 229
    .line 230
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    :cond_10
    return-void
.end method

.method private final d(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lb9/e;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lhb/k;

    .line 7
    .line 8
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const/4 v2, 0x0

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-static {v3, p1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-object v3, v2

    .line 28
    :goto_0
    instance-of v4, v3, Ljava/lang/Number;

    .line 29
    .line 30
    if-eqz v4, :cond_2

    .line 31
    .line 32
    check-cast v3, Ljava/lang/Number;

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    move-object v3, v2

    .line 36
    :goto_1
    const/4 v4, -0x1

    .line 37
    if-eqz v3, :cond_3

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    goto :goto_2

    .line 44
    :cond_3
    move v3, v4

    .line 45
    :goto_2
    if-eqz p1, :cond_4

    .line 46
    .line 47
    const/4 v5, 0x2

    .line 48
    invoke-static {v5, p1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    goto :goto_3

    .line 53
    :cond_4
    move-object p1, v2

    .line 54
    :goto_3
    instance-of v5, p1, Ljava/lang/Number;

    .line 55
    .line 56
    if-eqz v5, :cond_5

    .line 57
    .line 58
    move-object v2, p1

    .line 59
    check-cast v2, Ljava/lang/Number;

    .line 60
    .line 61
    :cond_5
    if-eqz v2, :cond_6

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    :cond_6
    iget-object p1, v0, Lhb/k;->c:Landroid/os/Handler;

    .line 68
    .line 69
    new-instance v2, Lhb/d;

    .line 70
    .line 71
    invoke-direct {v2, v1, v0, v3, v4}, Lhb/d;-><init>(Ljava/lang/Object;Lhb/k;II)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method private final e(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lb9/e;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lhb/c;

    .line 7
    .line 8
    iget-object v0, v0, Lhb/c;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroid/content/SharedPreferences;

    .line 11
    .line 12
    const-string v1, "multi_recall_enable"

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-static {v0}, Lk8/b;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lhb/c;->t(Ljava/util/List;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 36
    .line 37
    if-eqz p1, :cond_6

    .line 38
    .line 39
    invoke-static {v2, p1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-eqz p1, :cond_6

    .line 44
    .line 45
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const v1, 0x48435243    # 200009.05f

    .line 50
    .line 51
    .line 52
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const-string v3, "findItem"

    .line 61
    .line 62
    invoke-static {p1, v3, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    if-eqz v2, :cond_2

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    const-string v2, "\u6279\u91cf\u64a4\u56de[H]"

    .line 70
    .line 71
    filled-new-array {v0, v1, v0, v2}, [Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    const-string v4, "add"

    .line 76
    .line 77
    invoke-static {p1, v4, v3}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    if-eqz v3, :cond_3

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    filled-new-array {v0, v1, v0, v2}, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-static {p1, v4, v0}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    :goto_0
    if-eqz v3, :cond_4

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    const-string v3, "f"

    .line 100
    .line 101
    invoke-static {p1, v3, v0}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    if-eqz v0, :cond_5

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_5
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {p1, v3, v0}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    :cond_6
    :goto_1
    return-void
.end method

.method private final f(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lb9/e;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ln8/c;

    .line 7
    .line 8
    iget-object v0, v0, Ln8/c;->d:Ljava/util/Map;

    .line 9
    .line 10
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lfg/l;

    .line 17
    .line 18
    if-eqz v0, :cond_5

    .line 19
    .line 20
    new-instance v1, Ln8/b;

    .line 21
    .line 22
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-static {v3, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    instance-of v3, v2, Ljava/lang/Number;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    check-cast v2, Ljava/lang/Number;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object v2, v4

    .line 41
    :goto_0
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const/4 v2, -0x1

    .line 49
    :goto_1
    iget-object v3, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    const/4 v5, 0x1

    .line 55
    invoke-static {v5, v3}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    instance-of v5, v3, Ljava/lang/String;

    .line 60
    .line 61
    if-eqz v5, :cond_2

    .line 62
    .line 63
    check-cast v3, Ljava/lang/String;

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    move-object v3, v4

    .line 67
    :goto_2
    if-eqz v3, :cond_3

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_3
    const-string v3, ""

    .line 71
    .line 72
    :goto_3
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    const/4 v5, 0x2

    .line 78
    invoke-static {v5, p1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    instance-of v5, p1, Lorg/json/JSONObject;

    .line 83
    .line 84
    if-eqz v5, :cond_4

    .line 85
    .line 86
    move-object v4, p1

    .line 87
    check-cast v4, Lorg/json/JSONObject;

    .line 88
    .line 89
    :cond_4
    invoke-direct {v1, v2, v3, v4}, Ln8/b;-><init>(ILjava/lang/String;Lorg/json/JSONObject;)V

    .line 90
    .line 91
    .line 92
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    :cond_5
    return-void
.end method

.method private final g(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lb9/e;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lp8/e0;

    .line 7
    .line 8
    iget-object v1, v0, Lp8/e0;->g:Ljava/lang/ThreadLocal;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    goto/16 :goto_4

    .line 23
    .line 24
    :cond_0
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    goto/16 :goto_4

    .line 35
    .line 36
    :cond_1
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 37
    .line 38
    if-eqz p1, :cond_7

    .line 39
    .line 40
    array-length v1, p1

    .line 41
    const/4 v2, 0x0

    .line 42
    move v3, v2

    .line 43
    :goto_0
    const/4 v4, 0x0

    .line 44
    if-ge v3, v1, :cond_4

    .line 45
    .line 46
    aget-object v5, p1, v3

    .line 47
    .line 48
    if-eqz v5, :cond_2

    .line 49
    .line 50
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    :cond_2
    const-string v6, "com.tencent.mm.plugin.sns.storage.SnsInfo"

    .line 59
    .line 60
    invoke-static {v4, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-eqz v4, :cond_3

    .line 65
    .line 66
    move-object v4, v5

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_4
    :goto_1
    if-eqz v4, :cond_7

    .line 72
    .line 73
    const-string p1, "isAd"

    .line 74
    .line 75
    new-array v1, v2, [Ljava/lang/Object;

    .line 76
    .line 77
    invoke-static {v4, p1, v1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 82
    .line 83
    invoke-static {p1, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_5

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_5
    iget-object p1, v0, Lp8/e0;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    :cond_6
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_7

    .line 101
    .line 102
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    check-cast v1, Lha/c;

    .line 107
    .line 108
    :try_start_0
    invoke-virtual {v1, v4}, Lha/c;->b(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    sget-object v1, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :catchall_0
    move-exception v1

    .line 115
    new-instance v2, Lsf/f;

    .line 116
    .line 117
    invoke-direct {v2, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 118
    .line 119
    .line 120
    move-object v1, v2

    .line 121
    :goto_3
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    if-eqz v1, :cond_6

    .line 126
    .line 127
    iget-object v2, v0, Lp8/e0;->d:Lp8/p;

    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    new-instance v3, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    const-string v5, "\u670b\u53cb\u5708\u5165\u5e93\u89c2\u5bdf\u56de\u8c03\u5931\u8d25: "

    .line 136
    .line 137
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-virtual {v2, v1}, Lp8/p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_7
    :goto_4
    return-void
.end method

.method private final h(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lb9/e;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lr9/d0;

    .line 7
    .line 8
    iget-object v0, v0, Lr9/d0;->A:Ljava/lang/ThreadLocal;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/util/ArrayDeque;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollLast()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lr9/x;

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance v1, Lr9/x;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-direct {v1, v2}, Lr9/x;-><init>(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/4 v2, 0x1

    .line 40
    if-ne v0, v2, :cond_1

    .line 41
    .line 42
    iget-object v0, p0, Lb9/e;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Lr9/d0;

    .line 45
    .line 46
    iget-object v0, v0, Lr9/d0;->A:Ljava/lang/ThreadLocal;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 49
    .line 50
    .line 51
    :cond_1
    iget-object v0, p0, Lb9/e;->b:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lr9/d0;

    .line 54
    .line 55
    iget-object v0, v0, Lr9/d0;->B:Lr9/z;

    .line 56
    .line 57
    iget-boolean v0, v0, Lr9/z;->a:Z

    .line 58
    .line 59
    if-nez v0, :cond_2

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    iget-object v0, p0, Lb9/e;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Lr9/d0;

    .line 65
    .line 66
    :try_start_0
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 67
    .line 68
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 69
    .line 70
    iget-object v1, v1, Lr9/x;->a:Ljava/lang/Object;

    .line 71
    .line 72
    const/4 v3, 0x0

    .line 73
    invoke-virtual {v0, v3, v2, v1, p1}, Lr9/d0;->g(ILjava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 78
    .line 79
    .line 80
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    goto :goto_1

    .line 82
    :catchall_0
    move-exception p1

    .line 83
    new-instance v0, Lsf/f;

    .line 84
    .line 85
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    move-object p1, v0

    .line 89
    :goto_1
    iget-object v0, p0, Lb9/e;->b:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v0, Lr9/d0;

    .line 92
    .line 93
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    if-eqz p1, :cond_3

    .line 98
    .line 99
    iget-object v0, v0, Lr9/d0;->b:Lia/t;

    .line 100
    .line 101
    const-string v1, "\u6d88\u606f\u663e\u793a\u65f6\u95f4\u7ed1\u5b9a\u5931\u8d25"

    .line 102
    .line 103
    invoke-virtual {v0, v1, p1}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    :cond_3
    :goto_2
    return-void
.end method

.method private final i(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lb9/e;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ls9/b;

    .line 7
    .line 8
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    if-eqz p1, :cond_18

    .line 14
    .line 15
    array-length v1, p1

    .line 16
    const/4 v2, 0x4

    .line 17
    if-eq v1, v2, :cond_0

    .line 18
    .line 19
    goto/16 :goto_10

    .line 20
    .line 21
    :cond_0
    array-length v1, p1

    .line 22
    const/4 v2, 0x0

    .line 23
    move v3, v2

    .line 24
    :goto_0
    const/4 v4, 0x0

    .line 25
    if-ge v3, v1, :cond_2

    .line 26
    .line 27
    aget-object v5, p1, v3

    .line 28
    .line 29
    if-eqz v5, :cond_1

    .line 30
    .line 31
    const-string v6, "com.tencent.mm.storage."

    .line 32
    .line 33
    invoke-static {v6, v5, v2}, Leh/a;->z(Ljava/lang/String;Ljava/lang/Object;Z)Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-eqz v6, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move-object v5, v4

    .line 44
    :goto_1
    if-eqz v5, :cond_18

    .line 45
    .line 46
    const/4 v1, 0x2

    .line 47
    aget-object v3, p1, v1

    .line 48
    .line 49
    instance-of v6, v3, Ljava/lang/String;

    .line 50
    .line 51
    if-eqz v6, :cond_3

    .line 52
    .line 53
    check-cast v3, Ljava/lang/String;

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    move-object v3, v4

    .line 57
    :goto_2
    const-string v6, "isSend"

    .line 58
    .line 59
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->account()Lg8/a;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    if-eqz v7, :cond_4

    .line 64
    .line 65
    invoke-virtual {v7}, Lg8/a;->c()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    goto :goto_3

    .line 70
    :cond_4
    move-object v7, v4

    .line 71
    :goto_3
    if-nez v7, :cond_5

    .line 72
    .line 73
    const-string v7, ""

    .line 74
    .line 75
    :cond_5
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    if-nez v8, :cond_7

    .line 80
    .line 81
    if-eqz v3, :cond_7

    .line 82
    .line 83
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    if-eqz v8, :cond_6

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_6
    invoke-virtual {v7, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    goto :goto_7

    .line 99
    :cond_7
    :goto_4
    const-string v3, "getIsSend"

    .line 100
    .line 101
    filled-new-array {v3, v6}, [Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    move v7, v2

    .line 106
    :goto_5
    if-lt v7, v1, :cond_a

    .line 107
    .line 108
    const-string v3, "field_isSend"

    .line 109
    .line 110
    filled-new-array {v3, v6}, [Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    move v3, v2

    .line 115
    :goto_6
    if-lt v3, v1, :cond_8

    .line 116
    .line 117
    move-object v1, v4

    .line 118
    goto :goto_7

    .line 119
    :cond_8
    aget-object v6, v8, v3

    .line 120
    .line 121
    invoke-static {v5, v6}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    invoke-static {v6}, Ls9/b;->d(Ljava/lang/Object;)Ljava/lang/Boolean;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    if-eqz v6, :cond_9

    .line 130
    .line 131
    move-object v1, v6

    .line 132
    goto :goto_7

    .line 133
    :cond_9
    add-int/lit8 v3, v3, 0x1

    .line 134
    .line 135
    goto :goto_6

    .line 136
    :cond_a
    aget-object v8, v3, v7

    .line 137
    .line 138
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    move-result-object v9

    .line 142
    new-array v10, v2, [Ljava/lang/Class;

    .line 143
    .line 144
    invoke-static {v9, v8, v10}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 145
    .line 146
    .line 147
    move-result-object v8

    .line 148
    new-array v9, v2, [Ljava/lang/Object;

    .line 149
    .line 150
    invoke-static {v8, v5, v9}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    invoke-static {v8}, Ls9/b;->d(Ljava/lang/Object;)Ljava/lang/Boolean;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    if-eqz v8, :cond_17

    .line 159
    .line 160
    move-object v1, v8

    .line 161
    :goto_7
    if-eqz v1, :cond_18

    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    iget-object v3, v0, Ls9/b;->b:Landroid/content/SharedPreferences;

    .line 168
    .line 169
    if-eqz v1, :cond_b

    .line 170
    .line 171
    const-string v1, "hide_chat_avatar_self"

    .line 172
    .line 173
    invoke-interface {v3, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    goto :goto_8

    .line 178
    :cond_b
    const-string v1, "hide_chat_avatar_other"

    .line 179
    .line 180
    invoke-interface {v3, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    :goto_8
    array-length v3, p1

    .line 185
    move v5, v2

    .line 186
    :goto_9
    if-ge v5, v3, :cond_d

    .line 187
    .line 188
    aget-object v6, p1, v5

    .line 189
    .line 190
    if-eqz v6, :cond_c

    .line 191
    .line 192
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    move-result-object v7

    .line 196
    invoke-virtual {v0, v7}, Ls9/b;->a(Ljava/lang/Class;)Ls9/a;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    if-eqz v7, :cond_c

    .line 201
    .line 202
    goto :goto_a

    .line 203
    :cond_c
    add-int/lit8 v5, v5, 0x1

    .line 204
    .line 205
    goto :goto_9

    .line 206
    :cond_d
    move-object v6, v4

    .line 207
    :goto_a
    if-eqz v6, :cond_18

    .line 208
    .line 209
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    invoke-virtual {v0, p1}, Ls9/b;->a(Ljava/lang/Class;)Ls9/a;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    if-eqz p1, :cond_18

    .line 218
    .line 219
    iget-object v3, p1, Ls9/a;->a:Ljava/lang/reflect/Field;

    .line 220
    .line 221
    invoke-static {v3, v6}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    instance-of v5, v3, Landroid/view/View;

    .line 226
    .line 227
    if-eqz v5, :cond_e

    .line 228
    .line 229
    check-cast v3, Landroid/view/View;

    .line 230
    .line 231
    goto :goto_b

    .line 232
    :cond_e
    move-object v3, v4

    .line 233
    :goto_b
    if-eqz v3, :cond_18

    .line 234
    .line 235
    iget-object p1, p1, Ls9/a;->b:Ljava/lang/reflect/Field;

    .line 236
    .line 237
    invoke-static {p1, v6}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    instance-of v5, p1, Landroid/view/View;

    .line 242
    .line 243
    if-eqz v5, :cond_f

    .line 244
    .line 245
    check-cast p1, Landroid/view/View;

    .line 246
    .line 247
    goto :goto_c

    .line 248
    :cond_f
    move-object p1, v4

    .line 249
    :goto_c
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    instance-of v6, v5, Landroid/view/View;

    .line 254
    .line 255
    if-eqz v6, :cond_10

    .line 256
    .line 257
    check-cast v5, Landroid/view/View;

    .line 258
    .line 259
    goto :goto_d

    .line 260
    :cond_10
    move-object v5, v4

    .line 261
    :goto_d
    filled-new-array {p1, v5}, [Landroid/view/View;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    invoke-static {p1}, Ltf/l;->k0([Ljava/lang/Object;)Lng/j;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    new-instance v5, Li2/z;

    .line 270
    .line 271
    const/16 v6, 0x1d

    .line 272
    .line 273
    invoke-direct {v5, v6}, Li2/z;-><init>(I)V

    .line 274
    .line 275
    .line 276
    new-instance v6, Lng/i;

    .line 277
    .line 278
    invoke-direct {v6, p1, v2, v5}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 279
    .line 280
    .line 281
    new-instance p1, Lng/h;

    .line 282
    .line 283
    invoke-direct {p1, v6}, Lng/h;-><init>(Lng/i;)V

    .line 284
    .line 285
    .line 286
    :cond_11
    invoke-virtual {p1}, Lng/h;->hasNext()Z

    .line 287
    .line 288
    .line 289
    move-result v5

    .line 290
    if-eqz v5, :cond_12

    .line 291
    .line 292
    invoke-virtual {p1}, Lng/h;->next()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v5

    .line 296
    move-object v6, v5

    .line 297
    check-cast v6, Landroid/view/View;

    .line 298
    .line 299
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    move-result-object v6

    .line 303
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v6

    .line 307
    const-string v7, "com.tencent.mm.ui.base.MaskLayout"

    .line 308
    .line 309
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v6

    .line 313
    if-eqz v6, :cond_11

    .line 314
    .line 315
    move-object v4, v5

    .line 316
    :cond_12
    check-cast v4, Landroid/view/View;

    .line 317
    .line 318
    const/16 p1, 0x8

    .line 319
    .line 320
    if-nez v4, :cond_13

    .line 321
    .line 322
    if-eqz v1, :cond_18

    .line 323
    .line 324
    invoke-virtual {v3, p1}, Landroid/view/View;->setVisibility(I)V

    .line 325
    .line 326
    .line 327
    return-void

    .line 328
    :cond_13
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 329
    .line 330
    .line 331
    move-result-object v5

    .line 332
    if-eqz v5, :cond_18

    .line 333
    .line 334
    iget-object v6, v0, Ls9/b;->f:Ljava/util/Map;

    .line 335
    .line 336
    if-eqz v1, :cond_16

    .line 337
    .line 338
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    monitor-enter v6

    .line 342
    :try_start_0
    iget-object v1, v0, Ls9/b;->f:Ljava/util/Map;

    .line 343
    .line 344
    invoke-interface {v1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result v1

    .line 348
    if-nez v1, :cond_14

    .line 349
    .line 350
    iget-object v0, v0, Ls9/b;->f:Ljava/util/Map;

    .line 351
    .line 352
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    check-cast v0, Ljava/util/Map;

    .line 356
    .line 357
    iget v1, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 358
    .line 359
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 364
    .line 365
    .line 366
    goto :goto_e

    .line 367
    :catchall_0
    move-exception p1

    .line 368
    goto :goto_f

    .line 369
    :cond_14
    :goto_e
    monitor-exit v6

    .line 370
    iget v0, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 371
    .line 372
    if-eqz v0, :cond_15

    .line 373
    .line 374
    iput v2, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 375
    .line 376
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 377
    .line 378
    .line 379
    :cond_15
    invoke-virtual {v3, p1}, Landroid/view/View;->setVisibility(I)V

    .line 380
    .line 381
    .line 382
    return-void

    .line 383
    :goto_f
    monitor-exit v6

    .line 384
    throw p1

    .line 385
    :cond_16
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    monitor-enter v6

    .line 389
    :try_start_1
    iget-object p1, v0, Ls9/b;->f:Ljava/util/Map;

    .line 390
    .line 391
    invoke-interface {p1, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object p1

    .line 395
    check-cast p1, Ljava/lang/Integer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 396
    .line 397
    monitor-exit v6

    .line 398
    if-eqz p1, :cond_18

    .line 399
    .line 400
    iget v0, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 401
    .line 402
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 403
    .line 404
    .line 405
    move-result v1

    .line 406
    if-eq v0, v1, :cond_18

    .line 407
    .line 408
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 409
    .line 410
    .line 411
    move-result p1

    .line 412
    iput p1, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 413
    .line 414
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 415
    .line 416
    .line 417
    return-void

    .line 418
    :catchall_1
    move-exception p1

    .line 419
    monitor-exit v6

    .line 420
    throw p1

    .line 421
    :cond_17
    add-int/lit8 v7, v7, 0x1

    .line 422
    .line 423
    goto/16 :goto_5

    .line 424
    .line 425
    :cond_18
    :goto_10
    return-void
.end method

.method private final j(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lb9/e;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lb5/c;

    .line 7
    .line 8
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-static {v2, p1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object p1, v1

    .line 20
    :goto_0
    iget-object v0, v0, Lb5/c;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Landroid/content/SharedPreferences;

    .line 23
    .line 24
    if-eqz p1, :cond_9

    .line 25
    .line 26
    const-string v3, "hide_chat_menu_enable"

    .line 27
    .line 28
    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_1

    .line 33
    .line 34
    goto/16 :goto_6

    .line 35
    .line 36
    :cond_1
    const-string v3, "hide_chat_menu_titles"

    .line 37
    .line 38
    const-string v4, "\u63d0\u9192,\u641c\u4e00\u641c,\u6536\u85cf"

    .line 39
    .line 40
    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, Lr9/e0;->Y(Ljava/lang/String;)Ljava/util/Set;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    goto/16 :goto_6

    .line 55
    .line 56
    :cond_2
    const-string v3, "size"

    .line 57
    .line 58
    new-array v4, v2, [Ljava/lang/Object;

    .line 59
    .line 60
    invoke-static {p1, v3, v4}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    instance-of v4, v3, Ljava/lang/Number;

    .line 65
    .line 66
    if-eqz v4, :cond_3

    .line 67
    .line 68
    check-cast v3, Ljava/lang/Number;

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    move-object v3, v1

    .line 72
    :goto_1
    if-eqz v3, :cond_9

    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 79
    .line 80
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 81
    .line 82
    .line 83
    :goto_2
    if-lt v2, v3, :cond_4

    .line 84
    .line 85
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_9

    .line 94
    .line 95
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, Ljava/lang/Number;

    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    const-string v2, "removeItem"

    .line 114
    .line 115
    invoke-static {p1, v2, v1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_4
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    const-string v6, "getItem"

    .line 128
    .line 129
    invoke-static {p1, v6, v5}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    instance-of v6, v5, Landroid/view/MenuItem;

    .line 134
    .line 135
    if-eqz v6, :cond_5

    .line 136
    .line 137
    check-cast v5, Landroid/view/MenuItem;

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_5
    move-object v5, v1

    .line 141
    :goto_4
    if-eqz v5, :cond_8

    .line 142
    .line 143
    invoke-interface {v5}, Landroid/view/MenuItem;->getTitle()Ljava/lang/CharSequence;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    if-eqz v6, :cond_6

    .line 148
    .line 149
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    if-eqz v6, :cond_6

    .line 154
    .line 155
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    goto :goto_5

    .line 164
    :cond_6
    move-object v6, v1

    .line 165
    :goto_5
    if-nez v6, :cond_7

    .line 166
    .line 167
    const-string v6, ""

    .line 168
    .line 169
    :cond_7
    invoke-interface {v0, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    if-eqz v6, :cond_8

    .line 174
    .line 175
    invoke-interface {v5}, Landroid/view/MenuItem;->getItemId()I

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    :cond_8
    add-int/lit8 v2, v2, 0x1

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_9
    :goto_6
    return-void
.end method

.method private final k(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Lb9/e;->b:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v4, v2

    .line 8
    check-cast v4, Lwa/g;

    .line 9
    .line 10
    iget-object v2, v4, Lwa/g;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    iget-object v3, v4, Lwa/g;->b:Lh/Hchat/dexkit/DexFinder;

    .line 13
    .line 14
    const-string v5, "req|"

    .line 15
    .line 16
    const-string v6, "\u5feb\u7167\u4fdd\u5b58: type="

    .line 17
    .line 18
    iget-object v7, v4, Lwa/g;->c:Landroid/content/SharedPreferences;

    .line 19
    .line 20
    const/4 v8, 0x0

    .line 21
    const/4 v9, 0x1

    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    const-string v10, "protobuf_packet_enable"

    .line 25
    .line 26
    invoke-interface {v7, v10, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 27
    .line 28
    .line 29
    move-result v10

    .line 30
    if-eqz v10, :cond_0

    .line 31
    .line 32
    move v10, v9

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v10, v8

    .line 35
    :goto_0
    sget-object v11, Lwa/j;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 36
    .line 37
    invoke-virtual {v11}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v11

    .line 41
    if-nez v10, :cond_1

    .line 42
    .line 43
    if-eqz v11, :cond_1

    .line 44
    .line 45
    goto/16 :goto_a

    .line 46
    .line 47
    :cond_1
    :try_start_0
    iget-object v12, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 48
    .line 49
    if-eqz v12, :cond_13

    .line 50
    .line 51
    array-length v13, v12

    .line 52
    const/4 v14, 0x3

    .line 53
    if-ge v13, v14, :cond_2

    .line 54
    .line 55
    goto/16 :goto_a

    .line 56
    .line 57
    :cond_2
    move v13, v8

    .line 58
    aget-object v8, v12, v9

    .line 59
    .line 60
    const/4 v14, 0x2

    .line 61
    aget-object v12, v12, v14

    .line 62
    .line 63
    if-nez v8, :cond_3

    .line 64
    .line 65
    goto/16 :goto_a

    .line 66
    .line 67
    :cond_3
    const-string v15, "getUri"

    .line 68
    .line 69
    invoke-static {v8, v15}, Lwa/g;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v15

    .line 73
    if-nez v15, :cond_4

    .line 74
    .line 75
    const-string v15, ""

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    invoke-static {v15}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v15

    .line 82
    :goto_1
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 83
    .line 84
    .line 85
    move-result v16

    .line 86
    if-nez v16, :cond_5

    .line 87
    .line 88
    const-string v15, "null"

    .line 89
    .line 90
    :cond_5
    move-object/from16 v16, v15

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :catchall_0
    move-exception v0

    .line 94
    goto/16 :goto_9

    .line 95
    .line 96
    :goto_2
    const-string v15, "getType"

    .line 97
    .line 98
    invoke-static {v8, v15}, Lwa/g;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v15

    .line 102
    instance-of v13, v15, Ljava/lang/Number;

    .line 103
    .line 104
    if-eqz v13, :cond_6

    .line 105
    .line 106
    check-cast v15, Ljava/lang/Number;

    .line 107
    .line 108
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result v13

    .line 112
    goto :goto_3

    .line 113
    :cond_6
    const/4 v13, -0x1

    .line 114
    :goto_3
    if-eqz v10, :cond_7

    .line 115
    .line 116
    invoke-virtual {v4, v13}, Lwa/g;->n(I)Z

    .line 117
    .line 118
    .line 119
    move-result v15

    .line 120
    if-eqz v15, :cond_7

    .line 121
    .line 122
    move/from16 v21, v9

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_7
    const/16 v21, 0x0

    .line 126
    .line 127
    :goto_4
    if-eqz v21, :cond_8

    .line 128
    .line 129
    if-eqz v11, :cond_8

    .line 130
    .line 131
    goto/16 :goto_a

    .line 132
    .line 133
    :cond_8
    iget-object v15, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    .line 135
    const/16 v22, 0x0

    .line 136
    .line 137
    move/from16 v23, v14

    .line 138
    .line 139
    :try_start_1
    const-string v14, "getReqObj"

    .line 140
    .line 141
    invoke-static {v8, v14}, Lwa/g;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v14

    .line 145
    invoke-static {v14}, Lwa/g;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v19

    .line 149
    invoke-static/range {v19 .. v19}, Lwa/g;->u(Ljava/lang/Object;)[B

    .line 150
    .line 151
    .line 152
    move-result-object v20

    .line 153
    if-eqz v19, :cond_9

    .line 154
    .line 155
    if-nez v20, :cond_a

    .line 156
    .line 157
    :catchall_1
    :cond_9
    move v14, v13

    .line 158
    move-object/from16 v13, v16

    .line 159
    .line 160
    goto :goto_5

    .line 161
    :cond_a
    move-object/from16 v18, v15

    .line 162
    .line 163
    new-instance v15, Lwa/f;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 164
    .line 165
    move/from16 v17, v13

    .line 166
    .line 167
    :try_start_2
    invoke-direct/range {v15 .. v20}, Lwa/f;-><init>(Ljava/lang/String;ILjava/lang/Object;Ljava/lang/Object;[B)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 168
    .line 169
    .line 170
    move-object/from16 v13, v16

    .line 171
    .line 172
    move/from16 v14, v17

    .line 173
    .line 174
    goto :goto_6

    .line 175
    :catchall_2
    move-object/from16 v13, v16

    .line 176
    .line 177
    move/from16 v14, v17

    .line 178
    .line 179
    :goto_5
    move-object/from16 v15, v22

    .line 180
    .line 181
    :goto_6
    if-eqz v15, :cond_f

    .line 182
    .line 183
    :try_start_3
    invoke-virtual {v15}, Lwa/f;->a()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v9

    .line 187
    invoke-virtual {v2, v9, v15}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 191
    .line 192
    .line 193
    move-result v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 194
    const/16 v1, 0x3c

    .line 195
    .line 196
    if-gt v9, v1, :cond_b

    .line 197
    .line 198
    goto :goto_7

    .line 199
    :cond_b
    :try_start_4
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    check-cast v1, Ljava/lang/String;

    .line 212
    .line 213
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 214
    .line 215
    .line 216
    :catchall_3
    :goto_7
    if-nez v11, :cond_c

    .line 217
    .line 218
    :try_start_5
    const-string v1, "request"

    .line 219
    .line 220
    iget-object v2, v15, Lwa/f;->e:[B

    .line 221
    .line 222
    invoke-static {v1, v13, v14, v2}, Lwa/g;->c(Ljava/lang/String;Ljava/lang/String;I[B)V

    .line 223
    .line 224
    .line 225
    :cond_c
    if-eqz v10, :cond_d

    .line 226
    .line 227
    if-nez v21, :cond_d

    .line 228
    .line 229
    new-instance v1, Ljava/lang/StringBuilder;

    .line 230
    .line 231
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    const-string v2, " uri="

    .line 238
    .line 239
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    const-string v2, " req="

    .line 246
    .line 247
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    iget-object v2, v15, Lwa/f;->d:Ljava/lang/Object;

    .line 251
    .line 252
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    invoke-virtual {v4, v1}, Lwa/g;->p(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    :cond_d
    if-eqz v10, :cond_f

    .line 271
    .line 272
    if-nez v21, :cond_f

    .line 273
    .line 274
    if-eqz v7, :cond_e

    .line 275
    .line 276
    const-string v1, "protobuf_packet_capture_request"

    .line 277
    .line 278
    const/4 v2, 0x1

    .line 279
    invoke-interface {v7, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 280
    .line 281
    .line 282
    move-result v1

    .line 283
    if-eqz v1, :cond_f

    .line 284
    .line 285
    :cond_e
    invoke-virtual {v15}, Lwa/f;->a()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    invoke-virtual {v5, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    iget-object v2, v15, Lwa/f;->e:[B

    .line 294
    .line 295
    invoke-virtual {v4, v1, v2}, Lwa/g;->t(Ljava/lang/String;[B)Z

    .line 296
    .line 297
    .line 298
    move-result v1

    .line 299
    if-eqz v1, :cond_f

    .line 300
    .line 301
    const-string v1, "\u8bf7\u6c42"

    .line 302
    .line 303
    iget-object v2, v15, Lwa/f;->e:[B

    .line 304
    .line 305
    invoke-virtual {v4, v1, v13, v14, v2}, Lwa/g;->q(Ljava/lang/String;Ljava/lang/String;I[B)V

    .line 306
    .line 307
    .line 308
    :cond_f
    if-eqz v11, :cond_12

    .line 309
    .line 310
    if-eqz v10, :cond_13

    .line 311
    .line 312
    if-nez v21, :cond_13

    .line 313
    .line 314
    if-eqz v7, :cond_11

    .line 315
    .line 316
    const-string v1, "protobuf_packet_capture_response"

    .line 317
    .line 318
    const/4 v2, 0x1

    .line 319
    invoke-interface {v7, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 320
    .line 321
    .line 322
    move-result v1

    .line 323
    if-eqz v1, :cond_10

    .line 324
    .line 325
    goto :goto_8

    .line 326
    :cond_10
    const/4 v2, 0x0

    .line 327
    goto :goto_8

    .line 328
    :cond_11
    const/4 v2, 0x1

    .line 329
    :goto_8
    if-eqz v2, :cond_13

    .line 330
    .line 331
    :cond_12
    if-eqz v12, :cond_13

    .line 332
    .line 333
    if-eqz v3, :cond_13

    .line 334
    .line 335
    iget-object v1, v3, Lh/Hchat/dexkit/DexFinder;->protobufOnGYNetEndClass:Ljava/lang/Class;

    .line 336
    .line 337
    if-eqz v1, :cond_13

    .line 338
    .line 339
    invoke-virtual {v1}, Ljava/lang/Class;->isInterface()Z

    .line 340
    .line 341
    .line 342
    move-result v1

    .line 343
    if-eqz v1, :cond_13

    .line 344
    .line 345
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    invoke-static {v1}, Ljava/lang/reflect/Proxy;->isProxyClass(Ljava/lang/Class;)Z

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    if-nez v1, :cond_13

    .line 354
    .line 355
    iget-object v1, v3, Lh/Hchat/dexkit/DexFinder;->protobufOnGYNetEndClass:Ljava/lang/Class;

    .line 356
    .line 357
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    iget-object v2, v3, Lh/Hchat/dexkit/DexFinder;->protobufOnGYNetEndClass:Ljava/lang/Class;

    .line 362
    .line 363
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    new-instance v3, Lwa/d;

    .line 368
    .line 369
    move-object v5, v12

    .line 370
    move-object v6, v13

    .line 371
    move v7, v14

    .line 372
    invoke-direct/range {v3 .. v8}, Lwa/d;-><init>(Lwa/g;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    invoke-static {v1, v2, v3}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 380
    .line 381
    aput-object v1, v0, v23
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 382
    .line 383
    goto :goto_a

    .line 384
    :goto_9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 385
    .line 386
    const-string v2, "dispatch\u5904\u7406\u5931\u8d25: "

    .line 387
    .line 388
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    invoke-static {v0}, Lwa/g;->h(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    :cond_13
    :goto_a
    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 33

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v2, v1, Lb9/e;->a:I

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    const-string v6, ""

    .line 11
    .line 12
    iget-object v8, v1, Lb9/e;->b:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v2, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    :pswitch_0
    invoke-super/range {p0 .. p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_1
    invoke-direct/range {p0 .. p1}, Lb9/e;->j(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_2
    invoke-direct/range {p0 .. p1}, Lb9/e;->i(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_3
    invoke-direct/range {p0 .. p1}, Lb9/e;->h(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_4
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v8, Lq8/b;

    .line 36
    .line 37
    invoke-static {v0, v8}, Ly4/c;->d(Ljava/lang/Object;Lq8/b;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_5
    invoke-direct/range {p0 .. p1}, Lb9/e;->g(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_6
    invoke-direct/range {p0 .. p1}, Lb9/e;->f(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_7
    invoke-direct/range {p0 .. p1}, Lb9/e;->e(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_8
    invoke-direct/range {p0 .. p1}, Lb9/e;->d(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    const-string v2, "hchat_send_text_decoration"

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getObjectExtra(Ljava/lang/String;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    instance-of v2, v0, Leb/h0;

    .line 67
    .line 68
    if-eqz v2, :cond_0

    .line 69
    .line 70
    move-object v7, v0

    .line 71
    check-cast v7, Leb/h0;

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    const/4 v7, 0x0

    .line 75
    :goto_0
    if-eqz v7, :cond_1

    .line 76
    .line 77
    check-cast v8, Leb/m0;

    .line 78
    .line 79
    :try_start_0
    invoke-static {v8, v7}, Leb/m0;->b(Leb/m0;Leb/h0;)V

    .line 80
    .line 81
    .line 82
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :catchall_0
    move-exception v0

    .line 86
    new-instance v2, Lsf/f;

    .line 87
    .line 88
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    move-object v0, v2

    .line 92
    :goto_1
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    if-eqz v0, :cond_1

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    const-string v3, "[Hchat:Script] \u6062\u590d\u672a\u53d1\u9001\u6587\u5b57\u5931\u8d25: "

    .line 103
    .line 104
    invoke-static {v3, v2, v0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    :cond_1
    return-void

    .line 108
    :pswitch_a
    invoke-direct/range {p0 .. p1}, Lb9/e;->c(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :pswitch_b
    invoke-direct/range {p0 .. p1}, Lb9/e;->b(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :pswitch_c
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 120
    .line 121
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-static {v5, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    instance-of v9, v2, Ljava/lang/Integer;

    .line 129
    .line 130
    if-eqz v9, :cond_2

    .line 131
    .line 132
    check-cast v2, Ljava/lang/Integer;

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_2
    const/4 v2, 0x0

    .line 136
    :goto_2
    if-eqz v2, :cond_b

    .line 137
    .line 138
    sget-object v9, Lc9/e;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 139
    .line 140
    invoke-virtual {v9, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v10

    .line 144
    move-object v14, v10

    .line 145
    check-cast v14, Lc9/d;

    .line 146
    .line 147
    if-eqz v14, :cond_b

    .line 148
    .line 149
    iget-object v10, v14, Lc9/d;->a:Ljava/lang/ref/WeakReference;

    .line 150
    .line 151
    invoke-virtual {v10}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v10

    .line 155
    move-object v13, v10

    .line 156
    check-cast v13, Landroid/app/Activity;

    .line 157
    .line 158
    if-nez v13, :cond_3

    .line 159
    .line 160
    invoke-virtual {v9, v2, v14}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    goto :goto_8

    .line 164
    :cond_3
    iget-object v10, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 165
    .line 166
    if-ne v10, v13, :cond_b

    .line 167
    .line 168
    invoke-virtual {v9, v2, v14}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-nez v2, :cond_4

    .line 173
    .line 174
    goto :goto_8

    .line 175
    :cond_4
    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 176
    .line 177
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-static {v4, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    instance-of v4, v2, Ljava/lang/Integer;

    .line 185
    .line 186
    if-eqz v4, :cond_5

    .line 187
    .line 188
    check-cast v2, Ljava/lang/Integer;

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_5
    const/4 v2, 0x0

    .line 192
    :goto_3
    if-eqz v2, :cond_6

    .line 193
    .line 194
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    goto :goto_4

    .line 199
    :cond_6
    move v2, v5

    .line 200
    :goto_4
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-static {v3, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    instance-of v3, v0, Landroid/content/Intent;

    .line 210
    .line 211
    if-eqz v3, :cond_7

    .line 212
    .line 213
    check-cast v0, Landroid/content/Intent;

    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_7
    const/4 v0, 0x0

    .line 217
    :goto_5
    if-eqz v0, :cond_8

    .line 218
    .line 219
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 220
    .line 221
    .line 222
    move-result-object v7

    .line 223
    move-object v15, v7

    .line 224
    goto :goto_6

    .line 225
    :cond_8
    const/4 v15, 0x0

    .line 226
    :goto_6
    const/4 v0, -0x1

    .line 227
    if-ne v2, v0, :cond_a

    .line 228
    .line 229
    if-nez v15, :cond_9

    .line 230
    .line 231
    goto :goto_7

    .line 232
    :cond_9
    new-instance v0, Ljava/lang/Thread;

    .line 233
    .line 234
    move-object v12, v8

    .line 235
    check-cast v12, Lc9/e;

    .line 236
    .line 237
    new-instance v11, Lac/l;

    .line 238
    .line 239
    const/16 v16, 0x3

    .line 240
    .line 241
    invoke-direct/range {v11 .. v16}, Lac/l;-><init>(Ljava/lang/Object;Landroid/content/Context;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 242
    .line 243
    .line 244
    const-string v2, "Hchat-ConversationGroupDocument"

    .line 245
    .line 246
    invoke-direct {v0, v11, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 250
    .line 251
    .line 252
    goto :goto_8

    .line 253
    :cond_a
    :goto_7
    new-instance v0, Lc9/p2;

    .line 254
    .line 255
    invoke-direct {v0, v6, v5}, Lc9/p2;-><init>(Ljava/lang/String;Z)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v14, v0}, Lc9/d;->a(Lc9/p2;)V

    .line 259
    .line 260
    .line 261
    :cond_b
    :goto_8
    return-void

    .line 262
    :pswitch_d
    invoke-direct/range {p0 .. p1}, Lb9/e;->a(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 263
    .line 264
    .line 265
    return-void

    .line 266
    :pswitch_e
    check-cast v8, Lb9/f;

    .line 267
    .line 268
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 272
    .line 273
    if-eqz v0, :cond_14

    .line 274
    .line 275
    iget-object v2, v8, Lb9/f;->b:Ljava/util/Map;

    .line 276
    .line 277
    invoke-interface {v2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    check-cast v2, Lbb/j;

    .line 282
    .line 283
    if-eqz v2, :cond_14

    .line 284
    .line 285
    const-string v3, "r"

    .line 286
    .line 287
    invoke-static {v0, v3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    if-eqz v0, :cond_d

    .line 292
    .line 293
    const-string v3, "f"

    .line 294
    .line 295
    invoke-static {v0, v3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    instance-of v3, v0, Ljava/lang/String;

    .line 300
    .line 301
    if-eqz v3, :cond_c

    .line 302
    .line 303
    check-cast v0, Ljava/lang/String;

    .line 304
    .line 305
    goto :goto_9

    .line 306
    :cond_c
    const/4 v0, 0x0

    .line 307
    :goto_9
    sget-object v3, Lbb/l;->c:Log/k;

    .line 308
    .line 309
    invoke-static {v0}, Lfb/v0;->G(Ljava/lang/String;)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    goto :goto_a

    .line 314
    :cond_d
    move-object v0, v6

    .line 315
    :goto_a
    iget-object v3, v2, Lbb/j;->a:Lbb/k;

    .line 316
    .line 317
    iget-object v4, v3, Lbb/k;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 318
    .line 319
    iget-object v5, v3, Lbb/k;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 320
    .line 321
    iget-object v8, v2, Lbb/j;->b:Ljava/lang/String;

    .line 322
    .line 323
    iget-object v9, v2, Lbb/j;->c:Ljava/lang/String;

    .line 324
    .line 325
    iget-wide v10, v2, Lbb/j;->d:J

    .line 326
    .line 327
    iget-object v2, v3, Lbb/k;->h:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 328
    .line 329
    invoke-static {v8, v9}, Lbb/k;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v12

    .line 333
    invoke-virtual {v3, v10, v11, v12}, Lbb/k;->f(JLjava/lang/String;)Z

    .line 334
    .line 335
    .line 336
    move-result v13

    .line 337
    if-nez v13, :cond_e

    .line 338
    .line 339
    goto/16 :goto_e

    .line 340
    .line 341
    :cond_e
    invoke-virtual {v3, v10, v11, v12}, Lbb/k;->b(JLjava/lang/String;)V

    .line 342
    .line 343
    .line 344
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 345
    .line 346
    .line 347
    move-result v10

    .line 348
    if-eqz v10, :cond_f

    .line 349
    .line 350
    invoke-virtual {v2, v9}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    invoke-virtual {v3}, Lbb/k;->l()V

    .line 354
    .line 355
    .line 356
    invoke-static {v8, v9}, Lbb/k;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    invoke-virtual {v5, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 364
    .line 365
    .line 366
    move-result-wide v5

    .line 367
    const-wide/16 v7, 0x1770

    .line 368
    .line 369
    add-long/2addr v5, v7

    .line 370
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    invoke-virtual {v4, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v3}, Lbb/k;->j()V

    .line 378
    .line 379
    .line 380
    goto :goto_e

    .line 381
    :cond_f
    iget-object v8, v3, Lbb/k;->a:Lbb/l;

    .line 382
    .line 383
    if-eqz v9, :cond_10

    .line 384
    .line 385
    invoke-static {v9}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 386
    .line 387
    .line 388
    move-result-object v7

    .line 389
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v7

    .line 393
    goto :goto_b

    .line 394
    :cond_10
    const/4 v7, 0x0

    .line 395
    :goto_b
    if-nez v7, :cond_11

    .line 396
    .line 397
    goto :goto_c

    .line 398
    :cond_11
    move-object v6, v7

    .line 399
    :goto_c
    sget-object v7, Lbb/l;->c:Log/k;

    .line 400
    .line 401
    invoke-static {v6}, Lfb/v0;->A(Ljava/lang/String;)Z

    .line 402
    .line 403
    .line 404
    move-result v7

    .line 405
    if-nez v7, :cond_12

    .line 406
    .line 407
    goto :goto_d

    .line 408
    :cond_12
    invoke-static {v0}, Lfb/v0;->G(Ljava/lang/String;)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 413
    .line 414
    .line 415
    move-result v7

    .line 416
    if-nez v7, :cond_13

    .line 417
    .line 418
    goto :goto_d

    .line 419
    :cond_13
    iget-object v7, v8, Lbb/l;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 420
    .line 421
    invoke-virtual {v7, v6, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    iget-object v7, v8, Lbb/l;->a:Landroid/content/SharedPreferences;

    .line 425
    .line 426
    invoke-interface {v7}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 427
    .line 428
    .line 429
    move-result-object v7

    .line 430
    const-string v8, "tail_"

    .line 431
    .line 432
    invoke-virtual {v8, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v6

    .line 436
    invoke-interface {v7, v6, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 441
    .line 442
    .line 443
    :goto_d
    invoke-virtual {v2, v9}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    invoke-virtual {v5, v12}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v4, v12}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v3}, Lbb/k;->l()V

    .line 453
    .line 454
    .line 455
    iget-object v0, v3, Lbb/k;->d:Lbb/c;

    .line 456
    .line 457
    invoke-virtual {v0, v9}, Lbb/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v3}, Lbb/k;->j()V

    .line 461
    .line 462
    .line 463
    :cond_14
    :goto_e
    return-void

    .line 464
    :pswitch_f
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    check-cast v8, Lba/m;

    .line 468
    .line 469
    iget-object v2, v8, Lba/m;->l:Ljava/lang/ThreadLocal;

    .line 470
    .line 471
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    check-cast v2, Ljava/util/ArrayDeque;

    .line 476
    .line 477
    if-eqz v2, :cond_c1

    .line 478
    .line 479
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pollLast()Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v9

    .line 483
    check-cast v9, Lba/h;

    .line 484
    .line 485
    if-eqz v9, :cond_c1

    .line 486
    .line 487
    iget-object v10, v9, Lba/h;->a:Landroid/view/View;

    .line 488
    .line 489
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 490
    .line 491
    .line 492
    move-result v2

    .line 493
    if-eqz v2, :cond_15

    .line 494
    .line 495
    iget-object v2, v8, Lba/m;->l:Ljava/lang/ThreadLocal;

    .line 496
    .line 497
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->remove()V

    .line 498
    .line 499
    .line 500
    :cond_15
    if-eqz v10, :cond_17

    .line 501
    .line 502
    invoke-virtual {v10}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v2

    .line 506
    if-eqz v2, :cond_17

    .line 507
    .line 508
    const-string v11, "com.tencent.mm.ui.chatting.viewitems."

    .line 509
    .line 510
    invoke-static {v11, v2, v5}, Leh/a;->z(Ljava/lang/String;Ljava/lang/Object;Z)Z

    .line 511
    .line 512
    .line 513
    move-result v11

    .line 514
    if-eqz v11, :cond_16

    .line 515
    .line 516
    goto :goto_f

    .line 517
    :cond_16
    const/4 v2, 0x0

    .line 518
    :goto_f
    if-eqz v2, :cond_17

    .line 519
    .line 520
    goto :goto_10

    .line 521
    :cond_17
    iget-object v2, v9, Lba/h;->b:Ljava/lang/Object;

    .line 522
    .line 523
    :goto_10
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 524
    .line 525
    iget-object v9, v8, Lba/m;->b:Landroid/content/SharedPreferences;

    .line 526
    .line 527
    if-eqz v10, :cond_c1

    .line 528
    .line 529
    if-eqz v0, :cond_18

    .line 530
    .line 531
    array-length v11, v0

    .line 532
    move v12, v4

    .line 533
    :goto_11
    if-lt v12, v11, :cond_19

    .line 534
    .line 535
    :cond_18
    const/4 v13, 0x0

    .line 536
    goto :goto_12

    .line 537
    :cond_19
    aget-object v13, v0, v12

    .line 538
    .line 539
    new-instance v14, Ljava/util/WeakHashMap;

    .line 540
    .line 541
    invoke-direct {v14}, Ljava/util/WeakHashMap;-><init>()V

    .line 542
    .line 543
    .line 544
    invoke-static {v14}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 545
    .line 546
    .line 547
    move-result-object v14

    .line 548
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 549
    .line 550
    .line 551
    check-cast v14, Ljava/util/Set;

    .line 552
    .line 553
    invoke-virtual {v8, v5, v13, v14}, Lba/m;->w(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v13

    .line 557
    if-eqz v13, :cond_1a

    .line 558
    .line 559
    goto :goto_12

    .line 560
    :cond_1a
    add-int/lit8 v12, v12, 0x1

    .line 561
    .line 562
    goto :goto_11

    .line 563
    :goto_12
    if-eqz v13, :cond_1b

    .line 564
    .line 565
    const-string v0, "field_type"

    .line 566
    .line 567
    const-string v11, "type"

    .line 568
    .line 569
    const-string v12, "getType"

    .line 570
    .line 571
    invoke-static {v13, v12, v0, v11}, Lba/m;->s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    invoke-static {v0}, Lba/m;->r(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 576
    .line 577
    .line 578
    move-result-object v0

    .line 579
    goto :goto_13

    .line 580
    :cond_1b
    const/4 v0, 0x0

    .line 581
    :goto_13
    if-eqz v13, :cond_1c

    .line 582
    .line 583
    const-string v11, "field_content"

    .line 584
    .line 585
    const-string v12, "content"

    .line 586
    .line 587
    const-string v14, "getContent"

    .line 588
    .line 589
    invoke-static {v13, v14, v11, v12}, Lba/m;->s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v11

    .line 593
    if-eqz v11, :cond_1c

    .line 594
    .line 595
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object v11

    .line 599
    goto :goto_14

    .line 600
    :cond_1c
    const/4 v11, 0x0

    .line 601
    :goto_14
    if-nez v11, :cond_1d

    .line 602
    .line 603
    move-object v11, v6

    .line 604
    :cond_1d
    const/16 v12, 0x2712

    .line 605
    .line 606
    const/16 v14, 0x2710

    .line 607
    .line 608
    if-eqz v0, :cond_23

    .line 609
    .line 610
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 611
    .line 612
    .line 613
    move-result v7

    .line 614
    if-gtz v7, :cond_1e

    .line 615
    .line 616
    const p1, 0xffff

    .line 617
    .line 618
    .line 619
    goto :goto_15

    .line 620
    :cond_1e
    const p1, 0xffff

    .line 621
    .line 622
    .line 623
    and-int/lit16 v15, v7, 0xff

    .line 624
    .line 625
    and-int v5, v7, p1

    .line 626
    .line 627
    ushr-int/lit8 v18, v7, 0x10

    .line 628
    .line 629
    if-nez v18, :cond_1f

    .line 630
    .line 631
    goto :goto_15

    .line 632
    :cond_1f
    if-eq v5, v14, :cond_20

    .line 633
    .line 634
    if-eq v5, v12, :cond_20

    .line 635
    .line 636
    if-eqz v15, :cond_21

    .line 637
    .line 638
    if-ne v5, v15, :cond_21

    .line 639
    .line 640
    move v7, v15

    .line 641
    goto :goto_15

    .line 642
    :cond_20
    move v7, v5

    .line 643
    :cond_21
    :goto_15
    const/16 v5, 0x31

    .line 644
    .line 645
    if-ne v7, v5, :cond_22

    .line 646
    .line 647
    move v5, v4

    .line 648
    goto :goto_16

    .line 649
    :cond_22
    const/4 v5, 0x0

    .line 650
    :goto_16
    if-ne v5, v4, :cond_24

    .line 651
    .line 652
    goto :goto_17

    .line 653
    :cond_23
    const p1, 0xffff

    .line 654
    .line 655
    .line 656
    :cond_24
    const-string v5, "<appmsg"

    .line 657
    .line 658
    invoke-static {v11, v5, v4}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 659
    .line 660
    .line 661
    move-result v5

    .line 662
    if-eqz v5, :cond_25

    .line 663
    .line 664
    :goto_17
    sget-object v5, Lba/m;->r:Log/k;

    .line 665
    .line 666
    invoke-virtual {v5, v11}, Log/k;->a(Ljava/lang/CharSequence;)Z

    .line 667
    .line 668
    .line 669
    move-result v5

    .line 670
    if-nez v5, :cond_26

    .line 671
    .line 672
    const-string v5, "<refermsg"

    .line 673
    .line 674
    invoke-static {v11, v5, v4}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 675
    .line 676
    .line 677
    move-result v5

    .line 678
    if-eqz v5, :cond_25

    .line 679
    .line 680
    goto :goto_18

    .line 681
    :cond_25
    const/4 v5, 0x0

    .line 682
    goto :goto_19

    .line 683
    :cond_26
    :goto_18
    move v5, v4

    .line 684
    :goto_19
    if-eqz v0, :cond_27

    .line 685
    .line 686
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 687
    .line 688
    .line 689
    move-result v7

    .line 690
    invoke-static {v7}, Lba/m;->n(I)Z

    .line 691
    .line 692
    .line 693
    move-result v7

    .line 694
    if-ne v7, v4, :cond_27

    .line 695
    .line 696
    move v7, v4

    .line 697
    goto :goto_1a

    .line 698
    :cond_27
    const/4 v7, 0x0

    .line 699
    :goto_1a
    if-eqz v0, :cond_28

    .line 700
    .line 701
    sget-object v15, Lba/m;->u:Ljava/util/Set;

    .line 702
    .line 703
    invoke-interface {v15, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 704
    .line 705
    .line 706
    move-result v15

    .line 707
    if-eqz v15, :cond_28

    .line 708
    .line 709
    move v15, v4

    .line 710
    goto :goto_1b

    .line 711
    :cond_28
    const/4 v15, 0x0

    .line 712
    :goto_1b
    const/16 v12, 0x22

    .line 713
    .line 714
    if-nez v0, :cond_29

    .line 715
    .line 716
    :goto_1c
    const/4 v14, 0x0

    .line 717
    goto :goto_20

    .line 718
    :cond_29
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 719
    .line 720
    .line 721
    move-result v19

    .line 722
    invoke-static/range {v19 .. v19}, Lfb/v0;->F(I)I

    .line 723
    .line 724
    .line 725
    move-result v14

    .line 726
    if-ne v14, v4, :cond_2a

    .line 727
    .line 728
    move v14, v4

    .line 729
    goto :goto_1d

    .line 730
    :cond_2a
    const/4 v14, 0x0

    .line 731
    :goto_1d
    if-nez v14, :cond_2d

    .line 732
    .line 733
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 734
    .line 735
    .line 736
    move-result v14

    .line 737
    invoke-static {v14}, Lfb/v0;->F(I)I

    .line 738
    .line 739
    .line 740
    move-result v14

    .line 741
    if-ne v14, v12, :cond_2b

    .line 742
    .line 743
    move v14, v4

    .line 744
    goto :goto_1e

    .line 745
    :cond_2b
    const/4 v14, 0x0

    .line 746
    :goto_1e
    if-nez v14, :cond_2d

    .line 747
    .line 748
    if-nez v7, :cond_2d

    .line 749
    .line 750
    sget-object v14, Lba/m;->o:Ljava/util/Set;

    .line 751
    .line 752
    invoke-interface {v14, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 753
    .line 754
    .line 755
    move-result v14

    .line 756
    if-eqz v14, :cond_2c

    .line 757
    .line 758
    goto :goto_1f

    .line 759
    :cond_2c
    if-eqz v5, :cond_2e

    .line 760
    .line 761
    invoke-static {v0, v11}, Lba/m;->k(Ljava/lang/Integer;Ljava/lang/String;)Z

    .line 762
    .line 763
    .line 764
    move-result v14

    .line 765
    if-nez v14, :cond_2e

    .line 766
    .line 767
    :cond_2d
    :goto_1f
    move v14, v4

    .line 768
    goto :goto_20

    .line 769
    :cond_2e
    invoke-static {v0, v11}, Lba/m;->v(Ljava/lang/Integer;Ljava/lang/String;)Lba/a;

    .line 770
    .line 771
    .line 772
    move-result-object v14

    .line 773
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 774
    .line 775
    .line 776
    move-result v14

    .line 777
    if-eq v14, v4, :cond_2d

    .line 778
    .line 779
    if-eq v14, v3, :cond_2d

    .line 780
    .line 781
    goto :goto_1c

    .line 782
    :goto_20
    if-nez v14, :cond_2f

    .line 783
    .line 784
    goto/16 :goto_86

    .line 785
    .line 786
    :cond_2f
    const-string v14, "bkl"

    .line 787
    .line 788
    sget-object v19, Ltf/t;->g:Ltf/t;

    .line 789
    .line 790
    if-eqz v5, :cond_4b

    .line 791
    .line 792
    invoke-virtual {v8}, Lba/m;->g()Ljava/util/Map;

    .line 793
    .line 794
    .line 795
    move-result-object v7

    .line 796
    invoke-interface {v7, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 797
    .line 798
    .line 799
    move-result-object v7

    .line 800
    check-cast v7, Ljava/lang/Integer;

    .line 801
    .line 802
    if-eqz v7, :cond_32

    .line 803
    .line 804
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 805
    .line 806
    .line 807
    move-result v7

    .line 808
    new-instance v15, Ljava/util/ArrayList;

    .line 809
    .line 810
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 811
    .line 812
    .line 813
    invoke-static {v10, v7, v15}, Lba/m;->c(Landroid/view/View;ILjava/util/ArrayList;)V

    .line 814
    .line 815
    .line 816
    new-instance v7, Ljava/util/ArrayList;

    .line 817
    .line 818
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 819
    .line 820
    .line 821
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 822
    .line 823
    .line 824
    move-result-object v15

    .line 825
    :goto_21
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 826
    .line 827
    .line 828
    move-result v21

    .line 829
    if-eqz v21, :cond_31

    .line 830
    .line 831
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 832
    .line 833
    .line 834
    move-result-object v4

    .line 835
    move-object v12, v4

    .line 836
    check-cast v12, Landroid/view/View;

    .line 837
    .line 838
    invoke-static {v12, v10}, Lba/m;->j(Landroid/view/View;Landroid/view/View;)Z

    .line 839
    .line 840
    .line 841
    move-result v12

    .line 842
    if-eqz v12, :cond_30

    .line 843
    .line 844
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 845
    .line 846
    .line 847
    :cond_30
    const/4 v4, 0x1

    .line 848
    const/16 v12, 0x22

    .line 849
    .line 850
    goto :goto_21

    .line 851
    :cond_31
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 852
    .line 853
    .line 854
    move-result v4

    .line 855
    if-eqz v4, :cond_33

    .line 856
    .line 857
    :cond_32
    move/from16 v24, v5

    .line 858
    .line 859
    const/4 v15, 0x0

    .line 860
    goto/16 :goto_31

    .line 861
    .line 862
    :cond_33
    sget-object v4, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 863
    .line 864
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 865
    .line 866
    .line 867
    const-string v4, "title"

    .line 868
    .line 869
    invoke-static {v11, v4}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 870
    .line 871
    .line 872
    move-result-object v4

    .line 873
    invoke-static {v4}, Lba/m;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v4

    .line 877
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 878
    .line 879
    .line 880
    move-result v12

    .line 881
    if-lez v12, :cond_47

    .line 882
    .line 883
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 884
    .line 885
    .line 886
    move-result-object v12

    .line 887
    :goto_22
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 888
    .line 889
    .line 890
    move-result v15

    .line 891
    if-eqz v15, :cond_46

    .line 892
    .line 893
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 894
    .line 895
    .line 896
    move-result-object v15

    .line 897
    move-object v3, v15

    .line 898
    check-cast v3, Landroid/view/View;

    .line 899
    .line 900
    const-string v1, "getWrappedTextView"

    .line 901
    .line 902
    move/from16 v24, v5

    .line 903
    .line 904
    move-object/from16 v25, v6

    .line 905
    .line 906
    const/4 v5, 0x0

    .line 907
    new-array v6, v5, [Ljava/lang/Object;

    .line 908
    .line 909
    invoke-static {v3, v1, v6}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 910
    .line 911
    .line 912
    move-result-object v1

    .line 913
    instance-of v5, v1, Landroid/widget/TextView;

    .line 914
    .line 915
    if-eqz v5, :cond_34

    .line 916
    .line 917
    check-cast v1, Landroid/widget/TextView;

    .line 918
    .line 919
    goto :goto_23

    .line 920
    :cond_34
    const/4 v1, 0x0

    .line 921
    :goto_23
    if-eqz v1, :cond_35

    .line 922
    .line 923
    goto :goto_24

    .line 924
    :cond_35
    instance-of v1, v3, Landroid/widget/TextView;

    .line 925
    .line 926
    if-eqz v1, :cond_36

    .line 927
    .line 928
    move-object v1, v3

    .line 929
    check-cast v1, Landroid/widget/TextView;

    .line 930
    .line 931
    goto :goto_24

    .line 932
    :cond_36
    const/4 v1, 0x0

    .line 933
    :goto_24
    const-string v5, "a"

    .line 934
    .line 935
    move-object/from16 v26, v1

    .line 936
    .line 937
    const/4 v6, 0x0

    .line 938
    new-array v1, v6, [Ljava/lang/Object;

    .line 939
    .line 940
    invoke-static {v3, v5, v1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 941
    .line 942
    .line 943
    move-result-object v1

    .line 944
    if-eqz v1, :cond_39

    .line 945
    .line 946
    instance-of v5, v1, Ljava/lang/CharSequence;

    .line 947
    .line 948
    if-eqz v5, :cond_37

    .line 949
    .line 950
    check-cast v1, Ljava/lang/CharSequence;

    .line 951
    .line 952
    goto :goto_25

    .line 953
    :cond_37
    const/4 v1, 0x0

    .line 954
    :goto_25
    if-eqz v1, :cond_39

    .line 955
    .line 956
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 957
    .line 958
    .line 959
    move-result-object v1

    .line 960
    if-eqz v1, :cond_39

    .line 961
    .line 962
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 963
    .line 964
    .line 965
    move-result v5

    .line 966
    if-nez v5, :cond_38

    .line 967
    .line 968
    goto :goto_26

    .line 969
    :cond_38
    const/4 v1, 0x0

    .line 970
    :goto_26
    if-eqz v1, :cond_39

    .line 971
    .line 972
    goto :goto_2b

    .line 973
    :cond_39
    const-string v1, "x"

    .line 974
    .line 975
    invoke-static {v3, v1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 976
    .line 977
    .line 978
    move-result-object v1

    .line 979
    if-eqz v1, :cond_3c

    .line 980
    .line 981
    instance-of v5, v1, Ljava/lang/CharSequence;

    .line 982
    .line 983
    if-eqz v5, :cond_3a

    .line 984
    .line 985
    check-cast v1, Ljava/lang/CharSequence;

    .line 986
    .line 987
    goto :goto_27

    .line 988
    :cond_3a
    const/4 v1, 0x0

    .line 989
    :goto_27
    if-eqz v1, :cond_3c

    .line 990
    .line 991
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 992
    .line 993
    .line 994
    move-result-object v1

    .line 995
    if-eqz v1, :cond_3c

    .line 996
    .line 997
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 998
    .line 999
    .line 1000
    move-result v5

    .line 1001
    if-nez v5, :cond_3b

    .line 1002
    .line 1003
    goto :goto_28

    .line 1004
    :cond_3b
    const/4 v1, 0x0

    .line 1005
    :goto_28
    if-eqz v1, :cond_3c

    .line 1006
    .line 1007
    goto :goto_2b

    .line 1008
    :cond_3c
    invoke-virtual {v3}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v1

    .line 1012
    if-eqz v1, :cond_3d

    .line 1013
    .line 1014
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v1

    .line 1018
    goto :goto_29

    .line 1019
    :cond_3d
    const/4 v1, 0x0

    .line 1020
    :goto_29
    if-nez v1, :cond_3e

    .line 1021
    .line 1022
    move-object/from16 v1, v25

    .line 1023
    .line 1024
    :cond_3e
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1025
    .line 1026
    .line 1027
    move-result v3

    .line 1028
    if-eqz v3, :cond_40

    .line 1029
    .line 1030
    if-eqz v26, :cond_3f

    .line 1031
    .line 1032
    invoke-virtual/range {v26 .. v26}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v1

    .line 1036
    if-eqz v1, :cond_3f

    .line 1037
    .line 1038
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v1

    .line 1042
    goto :goto_2a

    .line 1043
    :cond_3f
    const/4 v1, 0x0

    .line 1044
    :goto_2a
    if-nez v1, :cond_40

    .line 1045
    .line 1046
    move-object/from16 v1, v25

    .line 1047
    .line 1048
    :cond_40
    :goto_2b
    invoke-static {v1}, Lba/m;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v1

    .line 1052
    invoke-static {v1, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1053
    .line 1054
    .line 1055
    move-result v3

    .line 1056
    if-nez v3, :cond_44

    .line 1057
    .line 1058
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1059
    .line 1060
    .line 1061
    move-result v3

    .line 1062
    const/4 v5, 0x2

    .line 1063
    if-lt v3, v5, :cond_42

    .line 1064
    .line 1065
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1066
    .line 1067
    .line 1068
    move-result v3

    .line 1069
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1070
    .line 1071
    .line 1072
    move-result v5

    .line 1073
    mul-int/lit8 v5, v5, 0x3

    .line 1074
    .line 1075
    add-int/lit8 v5, v5, 0xc

    .line 1076
    .line 1077
    if-le v3, v5, :cond_41

    .line 1078
    .line 1079
    goto :goto_2c

    .line 1080
    :cond_41
    const/4 v5, 0x0

    .line 1081
    invoke-static {v1, v4, v5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1082
    .line 1083
    .line 1084
    move-result v1

    .line 1085
    goto :goto_2d

    .line 1086
    :cond_42
    :goto_2c
    const/4 v1, 0x0

    .line 1087
    :goto_2d
    if-eqz v1, :cond_43

    .line 1088
    .line 1089
    goto :goto_2e

    .line 1090
    :cond_43
    const/4 v1, 0x0

    .line 1091
    goto :goto_2f

    .line 1092
    :cond_44
    :goto_2e
    const/4 v1, 0x1

    .line 1093
    :goto_2f
    if-eqz v1, :cond_45

    .line 1094
    .line 1095
    goto :goto_30

    .line 1096
    :cond_45
    move-object/from16 v1, p0

    .line 1097
    .line 1098
    move/from16 v5, v24

    .line 1099
    .line 1100
    move-object/from16 v6, v25

    .line 1101
    .line 1102
    const/4 v3, 0x2

    .line 1103
    goto/16 :goto_22

    .line 1104
    .line 1105
    :cond_46
    move/from16 v24, v5

    .line 1106
    .line 1107
    const/4 v15, 0x0

    .line 1108
    :goto_30
    check-cast v15, Landroid/view/View;

    .line 1109
    .line 1110
    if-eqz v15, :cond_48

    .line 1111
    .line 1112
    goto :goto_31

    .line 1113
    :cond_47
    move/from16 v24, v5

    .line 1114
    .line 1115
    :cond_48
    invoke-static {v7}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v1

    .line 1119
    move-object v15, v1

    .line 1120
    check-cast v15, Landroid/view/View;

    .line 1121
    .line 1122
    :goto_31
    if-eqz v15, :cond_49

    .line 1123
    .line 1124
    invoke-static {v15}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v1

    .line 1128
    goto :goto_32

    .line 1129
    :cond_49
    const/4 v1, 0x0

    .line 1130
    :goto_32
    if-nez v1, :cond_72

    .line 1131
    .line 1132
    :cond_4a
    :goto_33
    move-object/from16 v1, v19

    .line 1133
    .line 1134
    goto/16 :goto_4d

    .line 1135
    .line 1136
    :cond_4b
    move/from16 v24, v5

    .line 1137
    .line 1138
    if-eqz v7, :cond_54

    .line 1139
    .line 1140
    if-eqz v15, :cond_4e

    .line 1141
    .line 1142
    invoke-virtual {v8}, Lba/m;->g()Ljava/util/Map;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v1

    .line 1146
    const-string v3, "kpw"

    .line 1147
    .line 1148
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v1

    .line 1152
    check-cast v1, Ljava/lang/Integer;

    .line 1153
    .line 1154
    if-eqz v1, :cond_4d

    .line 1155
    .line 1156
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1157
    .line 1158
    .line 1159
    move-result v1

    .line 1160
    invoke-virtual {v10, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v1

    .line 1164
    if-eqz v1, :cond_4d

    .line 1165
    .line 1166
    invoke-static {v1, v10}, Lba/m;->o(Landroid/view/View;Landroid/view/View;)Z

    .line 1167
    .line 1168
    .line 1169
    move-result v3

    .line 1170
    if-eqz v3, :cond_4c

    .line 1171
    .line 1172
    goto :goto_34

    .line 1173
    :cond_4c
    const/4 v1, 0x0

    .line 1174
    :goto_34
    if-eqz v1, :cond_4d

    .line 1175
    .line 1176
    goto :goto_35

    .line 1177
    :cond_4d
    move-object v1, v10

    .line 1178
    :goto_35
    new-instance v3, Ljava/util/ArrayList;

    .line 1179
    .line 1180
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1181
    .line 1182
    .line 1183
    invoke-static {v1, v10, v3}, Lba/m;->a(Landroid/view/View;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 1184
    .line 1185
    .line 1186
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1187
    .line 1188
    .line 1189
    move-result v1

    .line 1190
    if-nez v1, :cond_4e

    .line 1191
    .line 1192
    move-object v1, v3

    .line 1193
    goto/16 :goto_4d

    .line 1194
    .line 1195
    :cond_4e
    invoke-virtual {v8}, Lba/m;->g()Ljava/util/Map;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v1

    .line 1199
    invoke-interface {v1, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v1

    .line 1203
    check-cast v1, Ljava/lang/Integer;

    .line 1204
    .line 1205
    if-eqz v1, :cond_52

    .line 1206
    .line 1207
    invoke-virtual {v8, v2}, Lba/m;->i(Ljava/lang/Object;)Ljava/util/Map;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v3

    .line 1211
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v3

    .line 1215
    check-cast v3, Landroid/view/View;

    .line 1216
    .line 1217
    if-eqz v3, :cond_50

    .line 1218
    .line 1219
    invoke-static {v3, v10}, Lba/m;->o(Landroid/view/View;Landroid/view/View;)Z

    .line 1220
    .line 1221
    .line 1222
    move-result v4

    .line 1223
    if-eqz v4, :cond_4f

    .line 1224
    .line 1225
    goto :goto_36

    .line 1226
    :cond_4f
    const/4 v3, 0x0

    .line 1227
    :goto_36
    if-eqz v3, :cond_50

    .line 1228
    .line 1229
    invoke-static {v3}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v1

    .line 1233
    goto/16 :goto_4d

    .line 1234
    .line 1235
    :cond_50
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1236
    .line 1237
    .line 1238
    move-result v1

    .line 1239
    invoke-virtual {v10, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v1

    .line 1243
    if-eqz v1, :cond_52

    .line 1244
    .line 1245
    invoke-static {v1, v10}, Lba/m;->o(Landroid/view/View;Landroid/view/View;)Z

    .line 1246
    .line 1247
    .line 1248
    move-result v3

    .line 1249
    if-eqz v3, :cond_51

    .line 1250
    .line 1251
    goto :goto_37

    .line 1252
    :cond_51
    const/4 v1, 0x0

    .line 1253
    :goto_37
    if-eqz v1, :cond_52

    .line 1254
    .line 1255
    invoke-static {v1}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v1

    .line 1259
    goto/16 :goto_4d

    .line 1260
    .line 1261
    :cond_52
    invoke-static {v10, v10}, Lba/m;->d(Landroid/view/View;Landroid/view/View;)Landroid/view/View;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v1

    .line 1265
    if-eqz v1, :cond_53

    .line 1266
    .line 1267
    invoke-static {v1}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v1

    .line 1271
    goto :goto_38

    .line 1272
    :cond_53
    const/4 v1, 0x0

    .line 1273
    :goto_38
    if-nez v1, :cond_72

    .line 1274
    .line 1275
    goto/16 :goto_33

    .line 1276
    .line 1277
    :cond_54
    iget-object v1, v8, Lba/m;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1278
    .line 1279
    const-class v3, Landroid/view/View;

    .line 1280
    .line 1281
    const-class v4, Ljava/lang/Object;

    .line 1282
    .line 1283
    if-eqz v2, :cond_55

    .line 1284
    .line 1285
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v5

    .line 1289
    invoke-virtual {v1, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v5

    .line 1293
    check-cast v5, Ljava/lang/reflect/Field;

    .line 1294
    .line 1295
    if-eqz v5, :cond_56

    .line 1296
    .line 1297
    invoke-static {v5, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v1

    .line 1301
    instance-of v5, v1, Landroid/view/View;

    .line 1302
    .line 1303
    if-eqz v5, :cond_55

    .line 1304
    .line 1305
    check-cast v1, Landroid/view/View;

    .line 1306
    .line 1307
    goto :goto_3d

    .line 1308
    :cond_55
    const/4 v1, 0x0

    .line 1309
    goto :goto_3d

    .line 1310
    :cond_56
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v5

    .line 1314
    :goto_39
    if-eqz v5, :cond_55

    .line 1315
    .line 1316
    invoke-virtual {v5, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1317
    .line 1318
    .line 1319
    move-result v6

    .line 1320
    if-nez v6, :cond_55

    .line 1321
    .line 1322
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v6

    .line 1326
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v6

    .line 1330
    :goto_3a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1331
    .line 1332
    .line 1333
    move-result v7

    .line 1334
    if-eqz v7, :cond_59

    .line 1335
    .line 1336
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v7

    .line 1340
    move-object v12, v7

    .line 1341
    check-cast v12, Ljava/lang/reflect/Field;

    .line 1342
    .line 1343
    invoke-virtual {v12}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v15

    .line 1347
    move-object/from16 v25, v5

    .line 1348
    .line 1349
    const-string v5, "clickArea"

    .line 1350
    .line 1351
    invoke-static {v15, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1352
    .line 1353
    .line 1354
    move-result v5

    .line 1355
    if-eqz v5, :cond_57

    .line 1356
    .line 1357
    invoke-virtual {v12}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v5

    .line 1361
    invoke-virtual {v3, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1362
    .line 1363
    .line 1364
    move-result v5

    .line 1365
    if-eqz v5, :cond_57

    .line 1366
    .line 1367
    const/4 v5, 0x1

    .line 1368
    goto :goto_3b

    .line 1369
    :cond_57
    const/4 v5, 0x0

    .line 1370
    :goto_3b
    if-eqz v5, :cond_58

    .line 1371
    .line 1372
    goto :goto_3c

    .line 1373
    :cond_58
    move-object/from16 v5, v25

    .line 1374
    .line 1375
    goto :goto_3a

    .line 1376
    :cond_59
    move-object/from16 v25, v5

    .line 1377
    .line 1378
    const/4 v7, 0x0

    .line 1379
    :goto_3c
    check-cast v7, Ljava/lang/reflect/Field;

    .line 1380
    .line 1381
    if-eqz v7, :cond_5a

    .line 1382
    .line 1383
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v5

    .line 1387
    invoke-virtual {v1, v5, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1388
    .line 1389
    .line 1390
    invoke-static {v7, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v1

    .line 1394
    instance-of v5, v1, Landroid/view/View;

    .line 1395
    .line 1396
    if-eqz v5, :cond_55

    .line 1397
    .line 1398
    check-cast v1, Landroid/view/View;

    .line 1399
    .line 1400
    goto :goto_3d

    .line 1401
    :cond_5a
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v5

    .line 1405
    goto :goto_39

    .line 1406
    :goto_3d
    if-eqz v1, :cond_5b

    .line 1407
    .line 1408
    invoke-static {v1, v10}, Lba/m;->j(Landroid/view/View;Landroid/view/View;)Z

    .line 1409
    .line 1410
    .line 1411
    move-result v5

    .line 1412
    if-eqz v5, :cond_5b

    .line 1413
    .line 1414
    goto :goto_3e

    .line 1415
    :cond_5b
    const/4 v1, 0x0

    .line 1416
    :goto_3e
    if-eqz v1, :cond_5c

    .line 1417
    .line 1418
    invoke-static {v1}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v1

    .line 1422
    goto/16 :goto_4d

    .line 1423
    .line 1424
    :cond_5c
    invoke-virtual {v8, v2}, Lba/m;->i(Ljava/lang/Object;)Ljava/util/Map;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v1

    .line 1428
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 1429
    .line 1430
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1431
    .line 1432
    .line 1433
    sget-object v6, Lba/m;->v:Ljava/util/List;

    .line 1434
    .line 1435
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v6

    .line 1439
    :goto_3f
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1440
    .line 1441
    .line 1442
    move-result v7

    .line 1443
    if-eqz v7, :cond_64

    .line 1444
    .line 1445
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v7

    .line 1449
    check-cast v7, Ljava/lang/String;

    .line 1450
    .line 1451
    invoke-virtual {v8}, Lba/m;->g()Ljava/util/Map;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v12

    .line 1455
    invoke-interface {v12, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v12

    .line 1459
    check-cast v12, Ljava/lang/Integer;

    .line 1460
    .line 1461
    if-eqz v12, :cond_62

    .line 1462
    .line 1463
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 1464
    .line 1465
    .line 1466
    move-result v15

    .line 1467
    invoke-static {v7, v14}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1468
    .line 1469
    .line 1470
    move-result v7

    .line 1471
    if-eqz v7, :cond_5d

    .line 1472
    .line 1473
    if-nez v0, :cond_5e

    .line 1474
    .line 1475
    :cond_5d
    move-object/from16 v25, v6

    .line 1476
    .line 1477
    goto :goto_40

    .line 1478
    :cond_5e
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1479
    .line 1480
    .line 1481
    move-result v7

    .line 1482
    move-object/from16 v25, v6

    .line 1483
    .line 1484
    const/16 v6, 0x22

    .line 1485
    .line 1486
    if-ne v7, v6, :cond_5f

    .line 1487
    .line 1488
    goto :goto_43

    .line 1489
    :cond_5f
    :goto_40
    invoke-interface {v1, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1490
    .line 1491
    .line 1492
    move-result-object v6

    .line 1493
    check-cast v6, Landroid/view/View;

    .line 1494
    .line 1495
    if-eqz v6, :cond_60

    .line 1496
    .line 1497
    goto :goto_41

    .line 1498
    :cond_60
    invoke-virtual {v10, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v6

    .line 1502
    :goto_41
    if-eqz v6, :cond_63

    .line 1503
    .line 1504
    invoke-static {v6, v10}, Lba/m;->j(Landroid/view/View;Landroid/view/View;)Z

    .line 1505
    .line 1506
    .line 1507
    move-result v7

    .line 1508
    if-eqz v7, :cond_61

    .line 1509
    .line 1510
    goto :goto_42

    .line 1511
    :cond_61
    const/4 v6, 0x0

    .line 1512
    :goto_42
    if-eqz v6, :cond_63

    .line 1513
    .line 1514
    invoke-virtual {v5, v6}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 1515
    .line 1516
    .line 1517
    goto :goto_43

    .line 1518
    :cond_62
    move-object/from16 v25, v6

    .line 1519
    .line 1520
    :cond_63
    :goto_43
    move-object/from16 v6, v25

    .line 1521
    .line 1522
    goto :goto_3f

    .line 1523
    :cond_64
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 1524
    .line 1525
    .line 1526
    move-result v1

    .line 1527
    if-nez v1, :cond_65

    .line 1528
    .line 1529
    invoke-static {v5}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v1

    .line 1533
    goto/16 :goto_4d

    .line 1534
    .line 1535
    :cond_65
    iget-object v1, v8, Lba/m;->i:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 1536
    .line 1537
    iget-object v5, v8, Lba/m;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1538
    .line 1539
    if-eqz v2, :cond_66

    .line 1540
    .line 1541
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v6

    .line 1545
    invoke-virtual {v5, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v7

    .line 1549
    check-cast v7, Ljava/lang/reflect/Method;

    .line 1550
    .line 1551
    if-eqz v7, :cond_67

    .line 1552
    .line 1553
    const/4 v12, 0x0

    .line 1554
    new-array v1, v12, [Ljava/lang/Object;

    .line 1555
    .line 1556
    invoke-static {v7, v2, v1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v1

    .line 1560
    instance-of v3, v1, Landroid/view/View;

    .line 1561
    .line 1562
    if-eqz v3, :cond_66

    .line 1563
    .line 1564
    check-cast v1, Landroid/view/View;

    .line 1565
    .line 1566
    goto/16 :goto_49

    .line 1567
    .line 1568
    :cond_66
    :goto_44
    const/4 v1, 0x0

    .line 1569
    goto/16 :goto_49

    .line 1570
    .line 1571
    :cond_67
    invoke-virtual {v1, v6}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 1572
    .line 1573
    .line 1574
    move-result v7

    .line 1575
    if-eqz v7, :cond_68

    .line 1576
    .line 1577
    goto :goto_44

    .line 1578
    :cond_68
    move-object v7, v6

    .line 1579
    :goto_45
    if-eqz v7, :cond_6d

    .line 1580
    .line 1581
    invoke-virtual {v7, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1582
    .line 1583
    .line 1584
    move-result v12

    .line 1585
    if-nez v12, :cond_6d

    .line 1586
    .line 1587
    invoke-static {v7}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v12

    .line 1591
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1592
    .line 1593
    .line 1594
    move-result-object v12

    .line 1595
    :goto_46
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 1596
    .line 1597
    .line 1598
    move-result v15

    .line 1599
    if-eqz v15, :cond_6b

    .line 1600
    .line 1601
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1602
    .line 1603
    .line 1604
    move-result-object v15

    .line 1605
    move-object/from16 v25, v15

    .line 1606
    .line 1607
    check-cast v25, Ljava/lang/reflect/Method;

    .line 1608
    .line 1609
    move-object/from16 v26, v4

    .line 1610
    .line 1611
    invoke-virtual/range {v25 .. v25}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1612
    .line 1613
    .line 1614
    move-result-object v4

    .line 1615
    move-object/from16 v27, v7

    .line 1616
    .line 1617
    const-string v7, "getMainContainerView"

    .line 1618
    .line 1619
    invoke-static {v4, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1620
    .line 1621
    .line 1622
    move-result v4

    .line 1623
    if-eqz v4, :cond_69

    .line 1624
    .line 1625
    invoke-virtual/range {v25 .. v25}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1626
    .line 1627
    .line 1628
    move-result-object v4

    .line 1629
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1630
    .line 1631
    .line 1632
    array-length v4, v4

    .line 1633
    if-nez v4, :cond_69

    .line 1634
    .line 1635
    invoke-virtual/range {v25 .. v25}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1636
    .line 1637
    .line 1638
    move-result-object v4

    .line 1639
    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1640
    .line 1641
    .line 1642
    move-result v4

    .line 1643
    if-eqz v4, :cond_69

    .line 1644
    .line 1645
    const/4 v4, 0x1

    .line 1646
    goto :goto_47

    .line 1647
    :cond_69
    const/4 v4, 0x0

    .line 1648
    :goto_47
    if-eqz v4, :cond_6a

    .line 1649
    .line 1650
    goto :goto_48

    .line 1651
    :cond_6a
    move-object/from16 v4, v26

    .line 1652
    .line 1653
    move-object/from16 v7, v27

    .line 1654
    .line 1655
    goto :goto_46

    .line 1656
    :cond_6b
    move-object/from16 v26, v4

    .line 1657
    .line 1658
    move-object/from16 v27, v7

    .line 1659
    .line 1660
    const/4 v15, 0x0

    .line 1661
    :goto_48
    check-cast v15, Ljava/lang/reflect/Method;

    .line 1662
    .line 1663
    if-eqz v15, :cond_6c

    .line 1664
    .line 1665
    invoke-virtual {v5, v6, v15}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1666
    .line 1667
    .line 1668
    const/4 v5, 0x0

    .line 1669
    new-array v1, v5, [Ljava/lang/Object;

    .line 1670
    .line 1671
    invoke-static {v15, v2, v1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1672
    .line 1673
    .line 1674
    move-result-object v1

    .line 1675
    instance-of v3, v1, Landroid/view/View;

    .line 1676
    .line 1677
    if-eqz v3, :cond_66

    .line 1678
    .line 1679
    check-cast v1, Landroid/view/View;

    .line 1680
    .line 1681
    goto :goto_49

    .line 1682
    :cond_6c
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v7

    .line 1686
    move-object/from16 v4, v26

    .line 1687
    .line 1688
    goto :goto_45

    .line 1689
    :cond_6d
    invoke-interface {v1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1690
    .line 1691
    .line 1692
    goto :goto_44

    .line 1693
    :goto_49
    if-eqz v1, :cond_6f

    .line 1694
    .line 1695
    invoke-static {v1, v10}, Lba/m;->j(Landroid/view/View;Landroid/view/View;)Z

    .line 1696
    .line 1697
    .line 1698
    move-result v3

    .line 1699
    if-eqz v3, :cond_6e

    .line 1700
    .line 1701
    goto :goto_4a

    .line 1702
    :cond_6e
    const/4 v1, 0x0

    .line 1703
    :goto_4a
    if-eqz v1, :cond_6f

    .line 1704
    .line 1705
    invoke-static {v1}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 1706
    .line 1707
    .line 1708
    move-result-object v1

    .line 1709
    goto :goto_4d

    .line 1710
    :cond_6f
    invoke-virtual {v8}, Lba/m;->g()Ljava/util/Map;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v1

    .line 1714
    const-string v3, "bkg"

    .line 1715
    .line 1716
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1717
    .line 1718
    .line 1719
    move-result-object v1

    .line 1720
    check-cast v1, Ljava/lang/Integer;

    .line 1721
    .line 1722
    if-eqz v1, :cond_4a

    .line 1723
    .line 1724
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1725
    .line 1726
    .line 1727
    move-result v1

    .line 1728
    invoke-virtual {v10, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1729
    .line 1730
    .line 1731
    move-result-object v1

    .line 1732
    if-eqz v1, :cond_71

    .line 1733
    .line 1734
    invoke-static {v1, v10}, Lba/m;->j(Landroid/view/View;Landroid/view/View;)Z

    .line 1735
    .line 1736
    .line 1737
    move-result v3

    .line 1738
    if-eqz v3, :cond_70

    .line 1739
    .line 1740
    goto :goto_4b

    .line 1741
    :cond_70
    const/4 v1, 0x0

    .line 1742
    :goto_4b
    if-eqz v1, :cond_71

    .line 1743
    .line 1744
    invoke-static {v1}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v1

    .line 1748
    goto :goto_4c

    .line 1749
    :cond_71
    const/4 v1, 0x0

    .line 1750
    :goto_4c
    if-nez v1, :cond_72

    .line 1751
    .line 1752
    goto/16 :goto_33

    .line 1753
    .line 1754
    :cond_72
    :goto_4d
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 1755
    .line 1756
    .line 1757
    move-result v3

    .line 1758
    if-eqz v3, :cond_73

    .line 1759
    .line 1760
    goto/16 :goto_86

    .line 1761
    .line 1762
    :cond_73
    const-string v3, "message_bubble_enable"

    .line 1763
    .line 1764
    const/4 v5, 0x0

    .line 1765
    invoke-interface {v9, v3, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1766
    .line 1767
    .line 1768
    move-result v3

    .line 1769
    if-nez v3, :cond_74

    .line 1770
    .line 1771
    goto/16 :goto_86

    .line 1772
    .line 1773
    :cond_74
    if-eqz v13, :cond_76

    .line 1774
    .line 1775
    const-string v3, "field_isSend"

    .line 1776
    .line 1777
    const-string v4, "isSend"

    .line 1778
    .line 1779
    const-string v5, "getIsSend"

    .line 1780
    .line 1781
    invoke-static {v13, v5, v3, v4}, Lba/m;->s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 1782
    .line 1783
    .line 1784
    move-result-object v3

    .line 1785
    invoke-static {v3}, Lba/m;->r(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 1786
    .line 1787
    .line 1788
    move-result-object v3

    .line 1789
    if-eqz v3, :cond_76

    .line 1790
    .line 1791
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 1792
    .line 1793
    .line 1794
    move-result v3

    .line 1795
    if-eqz v3, :cond_75

    .line 1796
    .line 1797
    const/4 v3, 0x1

    .line 1798
    goto :goto_4e

    .line 1799
    :cond_75
    const/4 v3, 0x0

    .line 1800
    :goto_4e
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1801
    .line 1802
    .line 1803
    move-result-object v3

    .line 1804
    goto :goto_4f

    .line 1805
    :cond_76
    const/4 v3, 0x0

    .line 1806
    :goto_4f
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1807
    .line 1808
    .line 1809
    move-result-object v4

    .line 1810
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1811
    .line 1812
    .line 1813
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1814
    .line 1815
    .line 1816
    move-result-object v4

    .line 1817
    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 1818
    .line 1819
    .line 1820
    move-result-object v4

    .line 1821
    iget v4, v4, Landroid/content/res/Configuration;->uiMode:I

    .line 1822
    .line 1823
    and-int/lit8 v4, v4, 0x30

    .line 1824
    .line 1825
    const/16 v5, 0x20

    .line 1826
    .line 1827
    if-ne v4, v5, :cond_77

    .line 1828
    .line 1829
    const/4 v4, 0x1

    .line 1830
    goto :goto_50

    .line 1831
    :cond_77
    const/4 v4, 0x0

    .line 1832
    :goto_50
    const-string v5, "message_bubble_separate_dark_mode"

    .line 1833
    .line 1834
    const/4 v6, 0x0

    .line 1835
    invoke-interface {v9, v5, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1836
    .line 1837
    .line 1838
    move-result v5

    .line 1839
    invoke-static {v0, v11}, Lba/m;->v(Ljava/lang/Integer;Ljava/lang/String;)Lba/a;

    .line 1840
    .line 1841
    .line 1842
    move-result-object v6

    .line 1843
    sget-object v7, Lba/a;->k:Lba/a;

    .line 1844
    .line 1845
    if-ne v6, v7, :cond_79

    .line 1846
    .line 1847
    :cond_78
    :goto_51
    move-object/from16 v25, v1

    .line 1848
    .line 1849
    move-object/from16 v26, v3

    .line 1850
    .line 1851
    :goto_52
    const/4 v1, 0x0

    .line 1852
    goto/16 :goto_5a

    .line 1853
    .line 1854
    :cond_79
    invoke-static {v1}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 1855
    .line 1856
    .line 1857
    move-result-object v9

    .line 1858
    check-cast v9, Landroid/view/View;

    .line 1859
    .line 1860
    invoke-virtual {v10}, Landroid/view/View;->getWidth()I

    .line 1861
    .line 1862
    .line 1863
    move-result v12

    .line 1864
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1865
    .line 1866
    .line 1867
    move-result-object v13

    .line 1868
    if-lez v12, :cond_7a

    .line 1869
    .line 1870
    const/4 v12, 0x1

    .line 1871
    goto :goto_53

    .line 1872
    :cond_7a
    const/4 v12, 0x0

    .line 1873
    :goto_53
    if-eqz v12, :cond_7b

    .line 1874
    .line 1875
    goto :goto_54

    .line 1876
    :cond_7b
    const/4 v13, 0x0

    .line 1877
    :goto_54
    if-eqz v13, :cond_7c

    .line 1878
    .line 1879
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 1880
    .line 1881
    .line 1882
    move-result v12

    .line 1883
    goto :goto_55

    .line 1884
    :cond_7c
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    .line 1885
    .line 1886
    .line 1887
    move-result v12

    .line 1888
    :goto_55
    invoke-virtual {v9}, Landroid/view/View;->getWidth()I

    .line 1889
    .line 1890
    .line 1891
    move-result v13

    .line 1892
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1893
    .line 1894
    .line 1895
    move-result-object v15

    .line 1896
    if-lez v13, :cond_7d

    .line 1897
    .line 1898
    const/4 v13, 0x1

    .line 1899
    goto :goto_56

    .line 1900
    :cond_7d
    const/4 v13, 0x0

    .line 1901
    :goto_56
    if-eqz v13, :cond_7e

    .line 1902
    .line 1903
    goto :goto_57

    .line 1904
    :cond_7e
    const/4 v15, 0x0

    .line 1905
    :goto_57
    if-eqz v15, :cond_7f

    .line 1906
    .line 1907
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 1908
    .line 1909
    .line 1910
    move-result v13

    .line 1911
    goto :goto_58

    .line 1912
    :cond_7f
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredWidth()I

    .line 1913
    .line 1914
    .line 1915
    move-result v13

    .line 1916
    :goto_58
    if-lez v12, :cond_78

    .line 1917
    .line 1918
    if-gtz v13, :cond_80

    .line 1919
    .line 1920
    goto :goto_51

    .line 1921
    :cond_80
    move-object/from16 v25, v1

    .line 1922
    .line 1923
    const/4 v15, 0x2

    .line 1924
    new-array v1, v15, [I

    .line 1925
    .line 1926
    move-object/from16 v26, v3

    .line 1927
    .line 1928
    new-array v3, v15, [I

    .line 1929
    .line 1930
    invoke-virtual {v10, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 1931
    .line 1932
    .line 1933
    invoke-virtual {v9, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 1934
    .line 1935
    .line 1936
    const/16 v17, 0x0

    .line 1937
    .line 1938
    aget v1, v1, v17

    .line 1939
    .line 1940
    int-to-float v1, v1

    .line 1941
    int-to-float v9, v12

    .line 1942
    const/high16 v12, 0x40000000    # 2.0f

    .line 1943
    .line 1944
    div-float v15, v9, v12

    .line 1945
    .line 1946
    add-float/2addr v15, v1

    .line 1947
    aget v1, v3, v17

    .line 1948
    .line 1949
    int-to-float v1, v1

    .line 1950
    int-to-float v3, v13

    .line 1951
    div-float/2addr v3, v12

    .line 1952
    add-float/2addr v3, v1

    .line 1953
    sub-float v1, v3, v15

    .line 1954
    .line 1955
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 1956
    .line 1957
    .line 1958
    move-result v1

    .line 1959
    const v12, 0x3da3d70a    # 0.08f

    .line 1960
    .line 1961
    .line 1962
    mul-float/2addr v9, v12

    .line 1963
    cmpg-float v1, v1, v9

    .line 1964
    .line 1965
    if-gez v1, :cond_81

    .line 1966
    .line 1967
    goto :goto_52

    .line 1968
    :cond_81
    cmpl-float v1, v3, v15

    .line 1969
    .line 1970
    if-lez v1, :cond_82

    .line 1971
    .line 1972
    const/4 v1, 0x1

    .line 1973
    goto :goto_59

    .line 1974
    :cond_82
    const/4 v1, 0x0

    .line 1975
    :goto_59
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1976
    .line 1977
    .line 1978
    move-result-object v1

    .line 1979
    :goto_5a
    sget-object v3, Lba/a;->h:Lba/a;

    .line 1980
    .line 1981
    if-ne v6, v3, :cond_88

    .line 1982
    .line 1983
    if-nez v0, :cond_88

    .line 1984
    .line 1985
    if-nez v1, :cond_88

    .line 1986
    .line 1987
    invoke-interface/range {v25 .. v25}, Ljava/util/Collection;->isEmpty()Z

    .line 1988
    .line 1989
    .line 1990
    move-result v9

    .line 1991
    if-eqz v9, :cond_84

    .line 1992
    .line 1993
    :cond_83
    const/4 v9, 0x0

    .line 1994
    goto :goto_5d

    .line 1995
    :cond_84
    invoke-interface/range {v25 .. v25}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1996
    .line 1997
    .line 1998
    move-result-object v9

    .line 1999
    :cond_85
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 2000
    .line 2001
    .line 2002
    move-result v12

    .line 2003
    if-eqz v12, :cond_83

    .line 2004
    .line 2005
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2006
    .line 2007
    .line 2008
    move-result-object v12

    .line 2009
    check-cast v12, Landroid/view/View;

    .line 2010
    .line 2011
    invoke-virtual {v12}, Landroid/view/View;->getId()I

    .line 2012
    .line 2013
    .line 2014
    move-result v12

    .line 2015
    invoke-virtual {v8}, Lba/m;->g()Ljava/util/Map;

    .line 2016
    .line 2017
    .line 2018
    move-result-object v13

    .line 2019
    invoke-interface {v13, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2020
    .line 2021
    .line 2022
    move-result-object v13

    .line 2023
    check-cast v13, Ljava/lang/Integer;

    .line 2024
    .line 2025
    if-nez v13, :cond_86

    .line 2026
    .line 2027
    goto :goto_5b

    .line 2028
    :cond_86
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 2029
    .line 2030
    .line 2031
    move-result v13

    .line 2032
    if-ne v12, v13, :cond_87

    .line 2033
    .line 2034
    const/4 v12, 0x1

    .line 2035
    goto :goto_5c

    .line 2036
    :cond_87
    :goto_5b
    const/4 v12, 0x0

    .line 2037
    :goto_5c
    if-eqz v12, :cond_85

    .line 2038
    .line 2039
    const/4 v9, 0x1

    .line 2040
    :goto_5d
    if-eqz v9, :cond_88

    .line 2041
    .line 2042
    move-object v6, v7

    .line 2043
    :cond_88
    if-ne v6, v7, :cond_89

    .line 2044
    .line 2045
    const/4 v1, 0x0

    .line 2046
    goto :goto_5e

    .line 2047
    :cond_89
    if-eqz v26, :cond_8a

    .line 2048
    .line 2049
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2050
    .line 2051
    .line 2052
    move-result v1

    .line 2053
    goto :goto_5e

    .line 2054
    :cond_8a
    if-eqz v1, :cond_c1

    .line 2055
    .line 2056
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2057
    .line 2058
    .line 2059
    move-result v1

    .line 2060
    :goto_5e
    iget-object v7, v8, Lba/m;->c:Landroid/content/SharedPreferences;

    .line 2061
    .line 2062
    const-string v9, "message_text_color_enable"

    .line 2063
    .line 2064
    const/4 v12, 0x0

    .line 2065
    invoke-interface {v7, v9, v12}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 2066
    .line 2067
    .line 2068
    move-result v7

    .line 2069
    if-eqz v7, :cond_98

    .line 2070
    .line 2071
    if-eqz v0, :cond_90

    .line 2072
    .line 2073
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 2074
    .line 2075
    .line 2076
    move-result v7

    .line 2077
    if-gtz v7, :cond_8b

    .line 2078
    .line 2079
    goto :goto_5f

    .line 2080
    :cond_8b
    and-int/lit16 v9, v7, 0xff

    .line 2081
    .line 2082
    and-int v12, v7, p1

    .line 2083
    .line 2084
    ushr-int/lit8 v13, v7, 0x10

    .line 2085
    .line 2086
    if-nez v13, :cond_8c

    .line 2087
    .line 2088
    goto :goto_5f

    .line 2089
    :cond_8c
    const/16 v13, 0x2710

    .line 2090
    .line 2091
    if-eq v12, v13, :cond_8e

    .line 2092
    .line 2093
    const/16 v13, 0x2712

    .line 2094
    .line 2095
    if-eq v12, v13, :cond_8e

    .line 2096
    .line 2097
    if-eqz v9, :cond_8d

    .line 2098
    .line 2099
    if-ne v12, v9, :cond_8d

    .line 2100
    .line 2101
    move v7, v9

    .line 2102
    :cond_8d
    :goto_5f
    const/4 v9, 0x1

    .line 2103
    goto :goto_60

    .line 2104
    :cond_8e
    move v7, v12

    .line 2105
    goto :goto_5f

    .line 2106
    :goto_60
    if-ne v7, v9, :cond_8f

    .line 2107
    .line 2108
    move v7, v9

    .line 2109
    goto :goto_61

    .line 2110
    :cond_8f
    const/4 v7, 0x0

    .line 2111
    :goto_61
    if-ne v7, v9, :cond_90

    .line 2112
    .line 2113
    const/4 v7, 0x1

    .line 2114
    goto :goto_62

    .line 2115
    :cond_90
    const/4 v7, 0x0

    .line 2116
    :goto_62
    if-nez v7, :cond_97

    .line 2117
    .line 2118
    if-eqz v0, :cond_96

    .line 2119
    .line 2120
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 2121
    .line 2122
    .line 2123
    move-result v7

    .line 2124
    if-gtz v7, :cond_91

    .line 2125
    .line 2126
    goto :goto_63

    .line 2127
    :cond_91
    and-int/lit16 v9, v7, 0xff

    .line 2128
    .line 2129
    and-int v12, v7, p1

    .line 2130
    .line 2131
    ushr-int/lit8 v13, v7, 0x10

    .line 2132
    .line 2133
    if-nez v13, :cond_92

    .line 2134
    .line 2135
    goto :goto_63

    .line 2136
    :cond_92
    const/16 v13, 0x2710

    .line 2137
    .line 2138
    if-eq v12, v13, :cond_94

    .line 2139
    .line 2140
    const/16 v13, 0x2712

    .line 2141
    .line 2142
    if-eq v12, v13, :cond_94

    .line 2143
    .line 2144
    if-eqz v9, :cond_93

    .line 2145
    .line 2146
    if-ne v12, v9, :cond_93

    .line 2147
    .line 2148
    move v7, v9

    .line 2149
    :cond_93
    :goto_63
    const/16 v9, 0x22

    .line 2150
    .line 2151
    goto :goto_64

    .line 2152
    :cond_94
    move v7, v12

    .line 2153
    goto :goto_63

    .line 2154
    :goto_64
    if-ne v7, v9, :cond_95

    .line 2155
    .line 2156
    const/4 v7, 0x1

    .line 2157
    :goto_65
    const/4 v9, 0x1

    .line 2158
    goto :goto_66

    .line 2159
    :cond_95
    const/4 v7, 0x0

    .line 2160
    goto :goto_65

    .line 2161
    :goto_66
    if-ne v7, v9, :cond_96

    .line 2162
    .line 2163
    const/4 v7, 0x1

    .line 2164
    goto :goto_67

    .line 2165
    :cond_96
    const/4 v7, 0x0

    .line 2166
    :goto_67
    if-nez v7, :cond_97

    .line 2167
    .line 2168
    if-nez v24, :cond_97

    .line 2169
    .line 2170
    invoke-static {v0, v11}, Lba/m;->k(Ljava/lang/Integer;Ljava/lang/String;)Z

    .line 2171
    .line 2172
    .line 2173
    move-result v7

    .line 2174
    if-eqz v7, :cond_98

    .line 2175
    .line 2176
    :cond_97
    const/4 v7, 0x1

    .line 2177
    goto :goto_68

    .line 2178
    :cond_98
    const/4 v7, 0x0

    .line 2179
    :goto_68
    if-ne v6, v3, :cond_9a

    .line 2180
    .line 2181
    if-nez v7, :cond_99

    .line 2182
    .line 2183
    goto :goto_69

    .line 2184
    :cond_99
    const/4 v3, 0x0

    .line 2185
    goto :goto_6a

    .line 2186
    :cond_9a
    :goto_69
    const/4 v3, 0x1

    .line 2187
    :goto_6a
    if-eqz v0, :cond_a0

    .line 2188
    .line 2189
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 2190
    .line 2191
    .line 2192
    move-result v0

    .line 2193
    if-gtz v0, :cond_9b

    .line 2194
    .line 2195
    goto :goto_6b

    .line 2196
    :cond_9b
    and-int/lit16 v7, v0, 0xff

    .line 2197
    .line 2198
    and-int v9, v0, p1

    .line 2199
    .line 2200
    ushr-int/lit8 v11, v0, 0x10

    .line 2201
    .line 2202
    if-nez v11, :cond_9c

    .line 2203
    .line 2204
    goto :goto_6b

    .line 2205
    :cond_9c
    const/16 v13, 0x2710

    .line 2206
    .line 2207
    if-eq v9, v13, :cond_9e

    .line 2208
    .line 2209
    const/16 v13, 0x2712

    .line 2210
    .line 2211
    if-eq v9, v13, :cond_9e

    .line 2212
    .line 2213
    if-eqz v7, :cond_9d

    .line 2214
    .line 2215
    if-ne v9, v7, :cond_9d

    .line 2216
    .line 2217
    move v0, v7

    .line 2218
    :cond_9d
    :goto_6b
    const/16 v9, 0x22

    .line 2219
    .line 2220
    goto :goto_6c

    .line 2221
    :cond_9e
    move v0, v9

    .line 2222
    goto :goto_6b

    .line 2223
    :goto_6c
    if-ne v0, v9, :cond_9f

    .line 2224
    .line 2225
    const/4 v0, 0x1

    .line 2226
    :goto_6d
    const/4 v9, 0x1

    .line 2227
    goto :goto_6e

    .line 2228
    :cond_9f
    const/4 v0, 0x0

    .line 2229
    goto :goto_6d

    .line 2230
    :goto_6e
    if-ne v0, v9, :cond_a0

    .line 2231
    .line 2232
    const/4 v0, 0x1

    .line 2233
    goto :goto_6f

    .line 2234
    :cond_a0
    const/4 v0, 0x0

    .line 2235
    :goto_6f
    if-eqz v0, :cond_a4

    .line 2236
    .line 2237
    invoke-virtual {v8}, Lba/m;->g()Ljava/util/Map;

    .line 2238
    .line 2239
    .line 2240
    move-result-object v0

    .line 2241
    invoke-interface {v0, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2242
    .line 2243
    .line 2244
    move-result-object v0

    .line 2245
    check-cast v0, Ljava/lang/Integer;

    .line 2246
    .line 2247
    if-eqz v0, :cond_a4

    .line 2248
    .line 2249
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 2250
    .line 2251
    .line 2252
    move-result v7

    .line 2253
    invoke-virtual {v8, v2}, Lba/m;->i(Ljava/lang/Object;)Ljava/util/Map;

    .line 2254
    .line 2255
    .line 2256
    move-result-object v2

    .line 2257
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2258
    .line 2259
    .line 2260
    move-result-object v0

    .line 2261
    check-cast v0, Landroid/view/View;

    .line 2262
    .line 2263
    if-eqz v0, :cond_a1

    .line 2264
    .line 2265
    goto :goto_70

    .line 2266
    :cond_a1
    invoke-virtual {v10, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 2267
    .line 2268
    .line 2269
    move-result-object v0

    .line 2270
    if-eqz v0, :cond_a4

    .line 2271
    .line 2272
    :goto_70
    invoke-static {v0, v10}, Lba/m;->o(Landroid/view/View;Landroid/view/View;)Z

    .line 2273
    .line 2274
    .line 2275
    move-result v2

    .line 2276
    if-nez v2, :cond_a2

    .line 2277
    .line 2278
    goto :goto_72

    .line 2279
    :cond_a2
    invoke-static {v0}, Lba/m;->y(Landroid/view/View;)Lba/l;

    .line 2280
    .line 2281
    .line 2282
    move-result-object v0

    .line 2283
    if-eqz v0, :cond_a3

    .line 2284
    .line 2285
    invoke-static {v0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 2286
    .line 2287
    .line 2288
    move-result-object v0

    .line 2289
    goto :goto_71

    .line 2290
    :cond_a3
    const/4 v0, 0x0

    .line 2291
    :goto_71
    if-nez v0, :cond_a5

    .line 2292
    .line 2293
    :cond_a4
    :goto_72
    move-object/from16 v0, v19

    .line 2294
    .line 2295
    :cond_a5
    new-instance v2, Ljava/util/ArrayList;

    .line 2296
    .line 2297
    invoke-interface/range {v25 .. v25}, Ljava/util/List;->size()I

    .line 2298
    .line 2299
    .line 2300
    move-result v7

    .line 2301
    invoke-direct {v2, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 2302
    .line 2303
    .line 2304
    invoke-interface/range {v25 .. v25}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2305
    .line 2306
    .line 2307
    move-result-object v7

    .line 2308
    const/4 v9, 0x0

    .line 2309
    :goto_73
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 2310
    .line 2311
    .line 2312
    move-result v11

    .line 2313
    if-eqz v11, :cond_c0

    .line 2314
    .line 2315
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2316
    .line 2317
    .line 2318
    move-result-object v11

    .line 2319
    check-cast v11, Landroid/view/View;

    .line 2320
    .line 2321
    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2322
    .line 2323
    .line 2324
    move-result-object v12

    .line 2325
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2326
    .line 2327
    .line 2328
    if-eqz v4, :cond_a6

    .line 2329
    .line 2330
    if-eqz v5, :cond_a6

    .line 2331
    .line 2332
    const/4 v13, 0x1

    .line 2333
    goto :goto_74

    .line 2334
    :cond_a6
    const/4 v13, 0x0

    .line 2335
    :goto_74
    new-instance v15, Ljava/util/ArrayList;

    .line 2336
    .line 2337
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 2338
    .line 2339
    .line 2340
    sget-object v18, Lba/n;->l:La2/a;

    .line 2341
    .line 2342
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2343
    .line 2344
    .line 2345
    move-object/from16 p1, v0

    .line 2346
    .line 2347
    invoke-static {v6, v1, v13}, La2/a;->E(Lba/a;ZZ)Lba/n;

    .line 2348
    .line 2349
    .line 2350
    move-result-object v0

    .line 2351
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 2352
    .line 2353
    .line 2354
    move-result v20

    .line 2355
    if-nez v20, :cond_a7

    .line 2356
    .line 2357
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2358
    .line 2359
    .line 2360
    :cond_a7
    if-eqz v13, :cond_a8

    .line 2361
    .line 2362
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2363
    .line 2364
    .line 2365
    const/4 v0, 0x0

    .line 2366
    invoke-static {v6, v1, v0}, La2/a;->E(Lba/a;ZZ)Lba/n;

    .line 2367
    .line 2368
    .line 2369
    move-result-object v13

    .line 2370
    invoke-virtual {v15, v13}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 2371
    .line 2372
    .line 2373
    move-result v0

    .line 2374
    if-nez v0, :cond_a8

    .line 2375
    .line 2376
    invoke-virtual {v15, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2377
    .line 2378
    .line 2379
    :cond_a8
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2380
    .line 2381
    .line 2382
    move-result-object v0

    .line 2383
    :goto_75
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2384
    .line 2385
    .line 2386
    move-result v13

    .line 2387
    if-eqz v13, :cond_ab

    .line 2388
    .line 2389
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2390
    .line 2391
    .line 2392
    move-result-object v13

    .line 2393
    check-cast v13, Lba/n;

    .line 2394
    .line 2395
    sget-object v15, Lba/r;->a:Lba/r;

    .line 2396
    .line 2397
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2398
    .line 2399
    .line 2400
    sget-object v15, Lba/r;->a:Lba/r;

    .line 2401
    .line 2402
    invoke-virtual {v15, v12, v13}, Lba/r;->e(Landroid/content/Context;Lba/n;)Lba/o;

    .line 2403
    .line 2404
    .line 2405
    move-result-object v15

    .line 2406
    move-object/from16 v18, v0

    .line 2407
    .line 2408
    if-eqz v15, :cond_a9

    .line 2409
    .line 2410
    new-instance v0, Lba/q;

    .line 2411
    .line 2412
    move/from16 v20, v1

    .line 2413
    .line 2414
    iget-object v1, v15, Lba/o;->a:Landroid/graphics/Bitmap;

    .line 2415
    .line 2416
    move/from16 v22, v3

    .line 2417
    .line 2418
    iget-object v3, v15, Lba/o;->b:[B

    .line 2419
    .line 2420
    iget-object v15, v15, Lba/o;->c:Landroid/graphics/Rect;

    .line 2421
    .line 2422
    invoke-direct {v0, v1, v3, v15}, Lba/q;-><init>(Landroid/graphics/Bitmap;[BLandroid/graphics/Rect;)V

    .line 2423
    .line 2424
    .line 2425
    goto :goto_76

    .line 2426
    :cond_a9
    move/from16 v20, v1

    .line 2427
    .line 2428
    move/from16 v22, v3

    .line 2429
    .line 2430
    const/4 v0, 0x0

    .line 2431
    :goto_76
    if-eqz v0, :cond_aa

    .line 2432
    .line 2433
    new-instance v1, Lba/i;

    .line 2434
    .line 2435
    invoke-direct {v1, v0, v13}, Lba/i;-><init>(Lba/q;Lba/n;)V

    .line 2436
    .line 2437
    .line 2438
    goto :goto_77

    .line 2439
    :cond_aa
    move-object/from16 v0, v18

    .line 2440
    .line 2441
    move/from16 v1, v20

    .line 2442
    .line 2443
    move/from16 v3, v22

    .line 2444
    .line 2445
    goto :goto_75

    .line 2446
    :cond_ab
    move/from16 v20, v1

    .line 2447
    .line 2448
    move/from16 v22, v3

    .line 2449
    .line 2450
    const/4 v1, 0x0

    .line 2451
    :goto_77
    if-eqz v1, :cond_bf

    .line 2452
    .line 2453
    if-nez v9, :cond_ac

    .line 2454
    .line 2455
    move-object/from16 v0, p1

    .line 2456
    .line 2457
    goto :goto_78

    .line 2458
    :cond_ac
    move-object/from16 v0, v19

    .line 2459
    .line 2460
    :goto_78
    iget-object v3, v1, Lba/i;->a:Lba/q;

    .line 2461
    .line 2462
    iget-object v1, v1, Lba/i;->b:Lba/n;

    .line 2463
    .line 2464
    if-eqz v22, :cond_ad

    .line 2465
    .line 2466
    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2467
    .line 2468
    .line 2469
    move-result-object v12

    .line 2470
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2471
    .line 2472
    .line 2473
    sget-object v13, Lba/r;->a:Lba/r;

    .line 2474
    .line 2475
    invoke-virtual {v13, v12, v1}, Lba/r;->e(Landroid/content/Context;Lba/n;)Lba/o;

    .line 2476
    .line 2477
    .line 2478
    move-result-object v1

    .line 2479
    if-eqz v1, :cond_ad

    .line 2480
    .line 2481
    iget v1, v1, Lba/o;->d:I

    .line 2482
    .line 2483
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2484
    .line 2485
    .line 2486
    move-result-object v1

    .line 2487
    goto :goto_79

    .line 2488
    :cond_ad
    const/4 v1, 0x0

    .line 2489
    :goto_79
    if-eqz v1, :cond_b3

    .line 2490
    .line 2491
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 2492
    .line 2493
    .line 2494
    move-result v12

    .line 2495
    new-instance v13, Ljava/util/LinkedHashMap;

    .line 2496
    .line 2497
    invoke-direct {v13}, Ljava/util/LinkedHashMap;-><init>()V

    .line 2498
    .line 2499
    .line 2500
    new-instance v15, Ljava/util/LinkedHashMap;

    .line 2501
    .line 2502
    invoke-direct {v15}, Ljava/util/LinkedHashMap;-><init>()V

    .line 2503
    .line 2504
    .line 2505
    invoke-static {v8, v11, v15, v11}, Lba/m;->b(Lba/m;Landroid/view/View;Ljava/util/LinkedHashMap;Landroid/view/View;)V

    .line 2506
    .line 2507
    .line 2508
    move-object/from16 v18, v0

    .line 2509
    .line 2510
    new-instance v0, Ljava/util/ArrayList;

    .line 2511
    .line 2512
    move-object/from16 v31, v1

    .line 2513
    .line 2514
    invoke-interface {v15}, Ljava/util/Map;->size()I

    .line 2515
    .line 2516
    .line 2517
    move-result v1

    .line 2518
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 2519
    .line 2520
    .line 2521
    invoke-virtual {v15}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 2522
    .line 2523
    .line 2524
    move-result-object v1

    .line 2525
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 2526
    .line 2527
    .line 2528
    move-result-object v1

    .line 2529
    :goto_7a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2530
    .line 2531
    .line 2532
    move-result v15

    .line 2533
    if-eqz v15, :cond_ae

    .line 2534
    .line 2535
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2536
    .line 2537
    .line 2538
    move-result-object v15

    .line 2539
    check-cast v15, Ljava/util/Map$Entry;

    .line 2540
    .line 2541
    invoke-interface {v15}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2542
    .line 2543
    .line 2544
    move-result-object v24

    .line 2545
    move-object/from16 v25, v1

    .line 2546
    .line 2547
    move-object/from16 v1, v24

    .line 2548
    .line 2549
    check-cast v1, Landroid/widget/TextView;

    .line 2550
    .line 2551
    invoke-interface {v15}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2552
    .line 2553
    .line 2554
    move-result-object v15

    .line 2555
    check-cast v15, Landroid/view/View;

    .line 2556
    .line 2557
    move/from16 v32, v4

    .line 2558
    .line 2559
    new-instance v4, Lba/l;

    .line 2560
    .line 2561
    invoke-direct {v4, v15, v1}, Lba/l;-><init>(Landroid/view/View;Landroid/widget/TextView;)V

    .line 2562
    .line 2563
    .line 2564
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2565
    .line 2566
    .line 2567
    move-object/from16 v1, v25

    .line 2568
    .line 2569
    move/from16 v4, v32

    .line 2570
    .line 2571
    goto :goto_7a

    .line 2572
    :cond_ae
    move/from16 v32, v4

    .line 2573
    .line 2574
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2575
    .line 2576
    .line 2577
    move-result-object v0

    .line 2578
    :goto_7b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2579
    .line 2580
    .line 2581
    move-result v1

    .line 2582
    if-eqz v1, :cond_af

    .line 2583
    .line 2584
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2585
    .line 2586
    .line 2587
    move-result-object v1

    .line 2588
    check-cast v1, Lba/l;

    .line 2589
    .line 2590
    iget-object v4, v1, Lba/l;->b:Landroid/widget/TextView;

    .line 2591
    .line 2592
    invoke-interface {v13, v4, v1}, Ljava/util/Map;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2593
    .line 2594
    .line 2595
    goto :goto_7b

    .line 2596
    :cond_af
    invoke-interface/range {v18 .. v18}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2597
    .line 2598
    .line 2599
    move-result-object v0

    .line 2600
    :goto_7c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2601
    .line 2602
    .line 2603
    move-result v1

    .line 2604
    if-eqz v1, :cond_b0

    .line 2605
    .line 2606
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2607
    .line 2608
    .line 2609
    move-result-object v1

    .line 2610
    check-cast v1, Lba/l;

    .line 2611
    .line 2612
    iget-object v4, v1, Lba/l;->b:Landroid/widget/TextView;

    .line 2613
    .line 2614
    invoke-interface {v13, v4, v1}, Ljava/util/Map;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2615
    .line 2616
    .line 2617
    goto :goto_7c

    .line 2618
    :cond_b0
    invoke-virtual {v13}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 2619
    .line 2620
    .line 2621
    move-result-object v0

    .line 2622
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2623
    .line 2624
    .line 2625
    check-cast v0, Ljava/lang/Iterable;

    .line 2626
    .line 2627
    new-instance v1, Ljava/util/ArrayList;

    .line 2628
    .line 2629
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2630
    .line 2631
    .line 2632
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2633
    .line 2634
    .line 2635
    move-result-object v0

    .line 2636
    :goto_7d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2637
    .line 2638
    .line 2639
    move-result v4

    .line 2640
    if-eqz v4, :cond_b4

    .line 2641
    .line 2642
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2643
    .line 2644
    .line 2645
    move-result-object v4

    .line 2646
    check-cast v4, Lba/l;

    .line 2647
    .line 2648
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2649
    .line 2650
    .line 2651
    iget-object v13, v4, Lba/l;->b:Landroid/widget/TextView;

    .line 2652
    .line 2653
    invoke-virtual {v13}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 2654
    .line 2655
    .line 2656
    move-result v15

    .line 2657
    invoke-static {v15, v12}, Lba/m;->h(II)Z

    .line 2658
    .line 2659
    .line 2660
    move-result v28

    .line 2661
    invoke-virtual {v13}, Landroid/widget/TextView;->getLinkTextColors()Landroid/content/res/ColorStateList;

    .line 2662
    .line 2663
    .line 2664
    move-result-object v15

    .line 2665
    invoke-virtual {v15}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 2666
    .line 2667
    .line 2668
    move-result v15

    .line 2669
    invoke-static {v15, v12}, Lba/m;->h(II)Z

    .line 2670
    .line 2671
    .line 2672
    move-result v29

    .line 2673
    if-nez v28, :cond_b1

    .line 2674
    .line 2675
    if-nez v29, :cond_b1

    .line 2676
    .line 2677
    move/from16 v30, v12

    .line 2678
    .line 2679
    const/4 v4, 0x0

    .line 2680
    goto :goto_7e

    .line 2681
    :cond_b1
    new-instance v24, Lba/k;

    .line 2682
    .line 2683
    invoke-virtual {v13}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    .line 2684
    .line 2685
    .line 2686
    move-result-object v26

    .line 2687
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2688
    .line 2689
    .line 2690
    invoke-virtual {v13}, Landroid/widget/TextView;->getLinkTextColors()Landroid/content/res/ColorStateList;

    .line 2691
    .line 2692
    .line 2693
    move-result-object v27

    .line 2694
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2695
    .line 2696
    .line 2697
    move-object/from16 v25, v4

    .line 2698
    .line 2699
    move/from16 v30, v12

    .line 2700
    .line 2701
    invoke-direct/range {v24 .. v30}, Lba/k;-><init>(Lba/l;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;ZZI)V

    .line 2702
    .line 2703
    .line 2704
    move-object/from16 v4, v24

    .line 2705
    .line 2706
    :goto_7e
    if-eqz v4, :cond_b2

    .line 2707
    .line 2708
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2709
    .line 2710
    .line 2711
    :cond_b2
    move/from16 v12, v30

    .line 2712
    .line 2713
    goto :goto_7d

    .line 2714
    :cond_b3
    move-object/from16 v18, v0

    .line 2715
    .line 2716
    move-object/from16 v31, v1

    .line 2717
    .line 2718
    move/from16 v32, v4

    .line 2719
    .line 2720
    const/4 v1, 0x0

    .line 2721
    :cond_b4
    if-nez v1, :cond_b5

    .line 2722
    .line 2723
    move-object/from16 v30, v19

    .line 2724
    .line 2725
    goto :goto_7f

    .line 2726
    :cond_b5
    move-object/from16 v30, v1

    .line 2727
    .line 2728
    :goto_7f
    new-instance v24, Lba/j;

    .line 2729
    .line 2730
    invoke-virtual {v11}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 2731
    .line 2732
    .line 2733
    move-result-object v25

    .line 2734
    invoke-virtual {v11}, Landroid/view/View;->getPaddingLeft()I

    .line 2735
    .line 2736
    .line 2737
    move-result v26

    .line 2738
    invoke-virtual {v11}, Landroid/view/View;->getPaddingTop()I

    .line 2739
    .line 2740
    .line 2741
    move-result v27

    .line 2742
    invoke-virtual {v11}, Landroid/view/View;->getPaddingRight()I

    .line 2743
    .line 2744
    .line 2745
    move-result v28

    .line 2746
    invoke-virtual {v11}, Landroid/view/View;->getPaddingBottom()I

    .line 2747
    .line 2748
    .line 2749
    move-result v29

    .line 2750
    invoke-direct/range {v24 .. v30}, Lba/j;-><init>(Landroid/graphics/drawable/Drawable;IIIILjava/util/List;)V

    .line 2751
    .line 2752
    .line 2753
    move-object/from16 v0, v24

    .line 2754
    .line 2755
    move/from16 v1, v26

    .line 2756
    .line 2757
    move/from16 v4, v27

    .line 2758
    .line 2759
    move/from16 v12, v28

    .line 2760
    .line 2761
    move/from16 v13, v29

    .line 2762
    .line 2763
    const v15, 0x7f06003d

    .line 2764
    .line 2765
    .line 2766
    invoke-virtual {v11, v15, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 2767
    .line 2768
    .line 2769
    invoke-virtual {v11, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2770
    .line 2771
    .line 2772
    invoke-virtual {v8}, Lba/m;->g()Ljava/util/Map;

    .line 2773
    .line 2774
    .line 2775
    move-result-object v0

    .line 2776
    invoke-interface {v0, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2777
    .line 2778
    .line 2779
    move-result-object v0

    .line 2780
    check-cast v0, Ljava/lang/Integer;

    .line 2781
    .line 2782
    if-eqz v0, :cond_b9

    .line 2783
    .line 2784
    invoke-virtual {v11}, Landroid/view/View;->getId()I

    .line 2785
    .line 2786
    .line 2787
    move-result v15

    .line 2788
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 2789
    .line 2790
    .line 2791
    move-result v0

    .line 2792
    if-ne v15, v0, :cond_b9

    .line 2793
    .line 2794
    new-instance v0, Landroid/graphics/Rect;

    .line 2795
    .line 2796
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 2797
    .line 2798
    .line 2799
    invoke-virtual {v3, v0}, Lba/q;->getPadding(Landroid/graphics/Rect;)Z

    .line 2800
    .line 2801
    .line 2802
    move-result v3

    .line 2803
    if-eqz v3, :cond_b6

    .line 2804
    .line 2805
    iget v3, v0, Landroid/graphics/Rect;->left:I

    .line 2806
    .line 2807
    iget v15, v0, Landroid/graphics/Rect;->right:I

    .line 2808
    .line 2809
    add-int/2addr v3, v15

    .line 2810
    if-lez v3, :cond_b6

    .line 2811
    .line 2812
    const/4 v3, 0x1

    .line 2813
    goto :goto_80

    .line 2814
    :cond_b6
    const/4 v3, 0x0

    .line 2815
    :goto_80
    if-eqz v3, :cond_b7

    .line 2816
    .line 2817
    iget v15, v0, Landroid/graphics/Rect;->left:I

    .line 2818
    .line 2819
    const/16 v23, 0x2

    .line 2820
    .line 2821
    goto :goto_81

    .line 2822
    :cond_b7
    add-int v26, v1, v12

    .line 2823
    .line 2824
    const/16 v23, 0x2

    .line 2825
    .line 2826
    div-int/lit8 v15, v26, 0x2

    .line 2827
    .line 2828
    :goto_81
    if-eqz v3, :cond_b8

    .line 2829
    .line 2830
    iget v0, v0, Landroid/graphics/Rect;->right:I

    .line 2831
    .line 2832
    goto :goto_82

    .line 2833
    :cond_b8
    add-int v26, v1, v12

    .line 2834
    .line 2835
    sub-int v0, v26, v15

    .line 2836
    .line 2837
    :goto_82
    invoke-virtual {v11, v15, v4, v0, v13}, Landroid/view/View;->setPadding(IIII)V

    .line 2838
    .line 2839
    .line 2840
    goto :goto_83

    .line 2841
    :cond_b9
    const/16 v23, 0x2

    .line 2842
    .line 2843
    invoke-virtual {v11, v1, v4, v12, v13}, Landroid/view/View;->setPadding(IIII)V

    .line 2844
    .line 2845
    .line 2846
    :goto_83
    if-eqz v31, :cond_bd

    .line 2847
    .line 2848
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Number;->intValue()I

    .line 2849
    .line 2850
    .line 2851
    move-result v0

    .line 2852
    invoke-interface/range {v30 .. v30}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2853
    .line 2854
    .line 2855
    move-result-object v1

    .line 2856
    :goto_84
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2857
    .line 2858
    .line 2859
    move-result v3

    .line 2860
    if-eqz v3, :cond_bd

    .line 2861
    .line 2862
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2863
    .line 2864
    .line 2865
    move-result-object v3

    .line 2866
    check-cast v3, Lba/k;

    .line 2867
    .line 2868
    iget-object v4, v3, Lba/k;->a:Lba/l;

    .line 2869
    .line 2870
    iget-object v12, v4, Lba/l;->b:Landroid/widget/TextView;

    .line 2871
    .line 2872
    iget-object v4, v4, Lba/l;->a:Landroid/view/View;

    .line 2873
    .line 2874
    iget-boolean v13, v3, Lba/k;->d:Z

    .line 2875
    .line 2876
    if-eqz v13, :cond_bb

    .line 2877
    .line 2878
    invoke-static {v4}, Lba/m;->l(Landroid/view/View;)Z

    .line 2879
    .line 2880
    .line 2881
    move-result v13

    .line 2882
    if-eqz v13, :cond_ba

    .line 2883
    .line 2884
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2885
    .line 2886
    .line 2887
    move-result-object v13

    .line 2888
    filled-new-array {v13}, [Ljava/lang/Object;

    .line 2889
    .line 2890
    .line 2891
    move-result-object v13

    .line 2892
    const-string v15, "setTextColor"

    .line 2893
    .line 2894
    invoke-static {v4, v15, v13}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2895
    .line 2896
    .line 2897
    :cond_ba
    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2898
    .line 2899
    .line 2900
    :cond_bb
    iget-boolean v3, v3, Lba/k;->e:Z

    .line 2901
    .line 2902
    if-eqz v3, :cond_bc

    .line 2903
    .line 2904
    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setLinkTextColor(I)V

    .line 2905
    .line 2906
    .line 2907
    :cond_bc
    invoke-virtual {v12}, Landroid/view/View;->invalidate()V

    .line 2908
    .line 2909
    .line 2910
    invoke-virtual {v4}, Landroid/view/View;->invalidate()V

    .line 2911
    .line 2912
    .line 2913
    goto :goto_84

    .line 2914
    :cond_bd
    invoke-virtual {v11}, Landroid/view/View;->invalidate()V

    .line 2915
    .line 2916
    .line 2917
    invoke-interface/range {v18 .. v18}, Ljava/util/Collection;->isEmpty()Z

    .line 2918
    .line 2919
    .line 2920
    move-result v0

    .line 2921
    if-nez v0, :cond_be

    .line 2922
    .line 2923
    const/4 v9, 0x1

    .line 2924
    :cond_be
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2925
    .line 2926
    .line 2927
    goto :goto_85

    .line 2928
    :cond_bf
    move/from16 v32, v4

    .line 2929
    .line 2930
    const/16 v23, 0x2

    .line 2931
    .line 2932
    :goto_85
    move-object/from16 v0, p1

    .line 2933
    .line 2934
    move/from16 v1, v20

    .line 2935
    .line 2936
    move/from16 v3, v22

    .line 2937
    .line 2938
    move/from16 v4, v32

    .line 2939
    .line 2940
    goto/16 :goto_73

    .line 2941
    .line 2942
    :cond_c0
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2943
    .line 2944
    .line 2945
    move-result v0

    .line 2946
    if-nez v0, :cond_c1

    .line 2947
    .line 2948
    const v0, 0x7f06003e

    .line 2949
    .line 2950
    .line 2951
    invoke-virtual {v10, v0, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 2952
    .line 2953
    .line 2954
    :cond_c1
    :goto_86
    return-void

    .line 2955
    :pswitch_10
    move-object/from16 v25, v6

    .line 2956
    .line 2957
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2958
    .line 2959
    .line 2960
    check-cast v8, Lb9/f;

    .line 2961
    .line 2962
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2963
    .line 2964
    iget-object v1, v8, Lb9/f;->b:Ljava/util/Map;

    .line 2965
    .line 2966
    iget-object v2, v8, Lb9/f;->c:Landroid/content/SharedPreferences;

    .line 2967
    .line 2968
    const-string v3, "chat_time_mode"

    .line 2969
    .line 2970
    const-string v4, "original"

    .line 2971
    .line 2972
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2973
    .line 2974
    .line 2975
    move-result-object v2

    .line 2976
    const-string v3, "custom"

    .line 2977
    .line 2978
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2979
    .line 2980
    .line 2981
    move-result v5

    .line 2982
    if-eqz v5, :cond_c2

    .line 2983
    .line 2984
    goto :goto_87

    .line 2985
    :cond_c2
    const-string v3, "hidden"

    .line 2986
    .line 2987
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2988
    .line 2989
    .line 2990
    move-result v2

    .line 2991
    if-eqz v2, :cond_c3

    .line 2992
    .line 2993
    goto :goto_87

    .line 2994
    :cond_c3
    move-object v3, v4

    .line 2995
    :goto_87
    if-eqz v0, :cond_c7

    .line 2996
    .line 2997
    const/4 v5, 0x0

    .line 2998
    invoke-static {v5, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2999
    .line 3000
    .line 3001
    move-result-object v2

    .line 3002
    if-eqz v2, :cond_c5

    .line 3003
    .line 3004
    invoke-virtual {v8, v2}, Lb9/f;->e(Ljava/lang/Object;)Landroid/view/View;

    .line 3005
    .line 3006
    .line 3007
    move-result-object v5

    .line 3008
    if-eqz v5, :cond_c4

    .line 3009
    .line 3010
    goto :goto_88

    .line 3011
    :cond_c4
    const/4 v2, 0x0

    .line 3012
    :goto_88
    if-eqz v2, :cond_c5

    .line 3013
    .line 3014
    goto :goto_8a

    .line 3015
    :cond_c5
    array-length v2, v0

    .line 3016
    const/4 v5, 0x0

    .line 3017
    :goto_89
    if-ge v5, v2, :cond_c7

    .line 3018
    .line 3019
    aget-object v6, v0, v5

    .line 3020
    .line 3021
    if-eqz v6, :cond_c6

    .line 3022
    .line 3023
    invoke-virtual {v8, v6}, Lb9/f;->e(Ljava/lang/Object;)Landroid/view/View;

    .line 3024
    .line 3025
    .line 3026
    move-result-object v7

    .line 3027
    if-eqz v7, :cond_c6

    .line 3028
    .line 3029
    move-object v2, v6

    .line 3030
    goto :goto_8a

    .line 3031
    :cond_c6
    add-int/lit8 v5, v5, 0x1

    .line 3032
    .line 3033
    goto :goto_89

    .line 3034
    :cond_c7
    const/4 v2, 0x0

    .line 3035
    :goto_8a
    if-eqz v2, :cond_d0

    .line 3036
    .line 3037
    invoke-virtual {v8, v2}, Lb9/f;->e(Ljava/lang/Object;)Landroid/view/View;

    .line 3038
    .line 3039
    .line 3040
    move-result-object v5

    .line 3041
    if-eqz v5, :cond_d0

    .line 3042
    .line 3043
    invoke-virtual {v5}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 3044
    .line 3045
    .line 3046
    move-result-object v5

    .line 3047
    if-eqz v5, :cond_c8

    .line 3048
    .line 3049
    goto :goto_8b

    .line 3050
    :cond_c8
    move-object v5, v2

    .line 3051
    :goto_8b
    invoke-virtual {v8, v5}, Lb9/f;->f(Ljava/lang/Object;)Landroid/widget/TextView;

    .line 3052
    .line 3053
    .line 3054
    move-result-object v5

    .line 3055
    if-eqz v5, :cond_c9

    .line 3056
    .line 3057
    goto :goto_8c

    .line 3058
    :cond_c9
    invoke-virtual {v8, v2}, Lb9/f;->f(Ljava/lang/Object;)Landroid/widget/TextView;

    .line 3059
    .line 3060
    .line 3061
    move-result-object v5

    .line 3062
    if-eqz v5, :cond_d0

    .line 3063
    .line 3064
    :goto_8c
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 3065
    .line 3066
    .line 3067
    move-result v2

    .line 3068
    if-eqz v2, :cond_ca

    .line 3069
    .line 3070
    invoke-interface {v1, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3071
    .line 3072
    .line 3073
    goto :goto_91

    .line 3074
    :cond_ca
    if-eqz v0, :cond_cb

    .line 3075
    .line 3076
    const/4 v9, 0x1

    .line 3077
    invoke-static {v9, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 3078
    .line 3079
    .line 3080
    move-result-object v2

    .line 3081
    goto :goto_8d

    .line 3082
    :cond_cb
    const/4 v2, 0x0

    .line 3083
    :goto_8d
    new-instance v4, Ljava/util/IdentityHashMap;

    .line 3084
    .line 3085
    invoke-direct {v4}, Ljava/util/IdentityHashMap;-><init>()V

    .line 3086
    .line 3087
    .line 3088
    invoke-static {v4}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 3089
    .line 3090
    .line 3091
    move-result-object v4

    .line 3092
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3093
    .line 3094
    .line 3095
    check-cast v4, Ljava/util/Set;

    .line 3096
    .line 3097
    const/4 v6, 0x0

    .line 3098
    invoke-static {v6, v2, v4}, Lb9/f;->l(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 3099
    .line 3100
    .line 3101
    move-result-object v2

    .line 3102
    if-eqz v2, :cond_cc

    .line 3103
    .line 3104
    invoke-static {v2}, Lb9/f;->j(Ljava/lang/Object;)J

    .line 3105
    .line 3106
    .line 3107
    move-result-wide v6

    .line 3108
    goto :goto_8e

    .line 3109
    :cond_cc
    new-instance v2, Ljava/util/IdentityHashMap;

    .line 3110
    .line 3111
    invoke-direct {v2}, Ljava/util/IdentityHashMap;-><init>()V

    .line 3112
    .line 3113
    .line 3114
    invoke-static {v2}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 3115
    .line 3116
    .line 3117
    move-result-object v2

    .line 3118
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3119
    .line 3120
    .line 3121
    check-cast v2, Ljava/util/Set;

    .line 3122
    .line 3123
    invoke-static {v6, v0, v2}, Lb9/f;->l(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 3124
    .line 3125
    .line 3126
    move-result-object v0

    .line 3127
    if-eqz v0, :cond_cd

    .line 3128
    .line 3129
    invoke-static {v0}, Lb9/f;->j(Ljava/lang/Object;)J

    .line 3130
    .line 3131
    .line 3132
    move-result-wide v6

    .line 3133
    goto :goto_8e

    .line 3134
    :cond_cd
    const-wide/16 v6, 0x0

    .line 3135
    .line 3136
    :goto_8e
    new-instance v0, Lb9/d;

    .line 3137
    .line 3138
    invoke-virtual {v5}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 3139
    .line 3140
    .line 3141
    move-result-object v2

    .line 3142
    if-eqz v2, :cond_ce

    .line 3143
    .line 3144
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 3145
    .line 3146
    .line 3147
    move-result-object v2

    .line 3148
    move-object/from16 v16, v2

    .line 3149
    .line 3150
    goto :goto_8f

    .line 3151
    :cond_ce
    const/16 v16, 0x0

    .line 3152
    .line 3153
    :goto_8f
    if-nez v16, :cond_cf

    .line 3154
    .line 3155
    move-object/from16 v2, v25

    .line 3156
    .line 3157
    goto :goto_90

    .line 3158
    :cond_cf
    move-object/from16 v2, v16

    .line 3159
    .line 3160
    :goto_90
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 3161
    .line 3162
    .line 3163
    move-result v4

    .line 3164
    invoke-direct {v0, v4, v2, v6, v7}, Lb9/d;-><init>(ILjava/lang/String;J)V

    .line 3165
    .line 3166
    .line 3167
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3168
    .line 3169
    .line 3170
    check-cast v1, Ljava/util/Map;

    .line 3171
    .line 3172
    invoke-interface {v1, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3173
    .line 3174
    .line 3175
    invoke-virtual {v8, v5, v0, v3}, Lb9/f;->a(Landroid/widget/TextView;Lb9/d;Ljava/lang/String;)V

    .line 3176
    .line 3177
    .line 3178
    :cond_d0
    :goto_91
    return-void

    .line 3179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_0
        :pswitch_0
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_0
        :pswitch_0
        :pswitch_7
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_6
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget v0, v1, Lb9/e;->a:I

    .line 6
    .line 7
    const/4 v3, 0x5

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x3

    .line 10
    const/4 v6, 0x1

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v8, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    :pswitch_0
    invoke-super/range {p0 .. p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    invoke-direct/range {p0 .. p1}, Lb9/e;->k(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v0, v1, Lb9/e;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lw8/a;

    .line 30
    .line 31
    iget-object v0, v0, Lw8/a;->b:Landroid/content/SharedPreferences;

    .line 32
    .line 33
    const-string v3, "auto_original_image_enable"

    .line 34
    .line 35
    invoke-interface {v0, v3, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 43
    .line 44
    instance-of v2, v0, Landroid/app/Activity;

    .line 45
    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    move-object v7, v0

    .line 49
    check-cast v7, Landroid/app/Activity;

    .line 50
    .line 51
    :cond_1
    if-eqz v7, :cond_3

    .line 52
    .line 53
    invoke-virtual {v7}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    const-string v2, "query_source_type"

    .line 61
    .line 62
    invoke-virtual {v0, v2, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-ne v2, v5, :cond_3

    .line 67
    .line 68
    const-string v2, "GalleryUI_ToUser"

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    if-eqz v2, :cond_3

    .line 75
    .line 76
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_2

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    const-string v2, "key_send_raw_image"

    .line 84
    .line 85
    invoke-virtual {v0, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 86
    .line 87
    .line 88
    const-string v2, "send_raw_img"

    .line 89
    .line 90
    invoke-virtual {v0, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 91
    .line 92
    .line 93
    :cond_3
    :goto_0
    return-void

    .line 94
    :pswitch_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 98
    .line 99
    if-eqz v0, :cond_c

    .line 100
    .line 101
    array-length v3, v0

    .line 102
    if-eq v3, v5, :cond_4

    .line 103
    .line 104
    goto/16 :goto_7

    .line 105
    .line 106
    :cond_4
    iget-object v3, v1, Lb9/e;->b:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v3, Lrb/c;

    .line 109
    .line 110
    iget-object v10, v3, Lrb/c;->b:Lrb/k;

    .line 111
    .line 112
    iget-object v2, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 113
    .line 114
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    aget-object v3, v0, v8

    .line 118
    .line 119
    instance-of v5, v3, Ljava/lang/Number;

    .line 120
    .line 121
    if-eqz v5, :cond_5

    .line 122
    .line 123
    check-cast v3, Ljava/lang/Number;

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_5
    move-object v3, v7

    .line 127
    :goto_1
    if-eqz v3, :cond_c

    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 130
    .line 131
    .line 132
    move-result v12

    .line 133
    aget-object v3, v0, v6

    .line 134
    .line 135
    if-eqz v3, :cond_6

    .line 136
    .line 137
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    goto :goto_2

    .line 142
    :cond_6
    move-object v3, v7

    .line 143
    :goto_2
    if-nez v3, :cond_7

    .line 144
    .line 145
    const-string v3, ""

    .line 146
    .line 147
    :cond_7
    move-object v13, v3

    .line 148
    aget-object v0, v0, v4

    .line 149
    .line 150
    instance-of v3, v0, Lorg/json/JSONObject;

    .line 151
    .line 152
    if-eqz v3, :cond_8

    .line 153
    .line 154
    check-cast v0, Lorg/json/JSONObject;

    .line 155
    .line 156
    move-object v14, v0

    .line 157
    goto :goto_3

    .line 158
    :cond_8
    move-object v14, v7

    .line 159
    :goto_3
    iget-object v3, v10, Lrb/k;->d:Ljava/lang/Object;

    .line 160
    .line 161
    monitor-enter v3

    .line 162
    :try_start_0
    iget-object v11, v10, Lrb/k;->q:Lrb/h;

    .line 163
    .line 164
    if-eqz v11, :cond_b

    .line 165
    .line 166
    iget-object v0, v11, Lrb/h;->b:Ljava/lang/Object;

    .line 167
    .line 168
    if-eq v0, v2, :cond_9

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_9
    iget-object v0, v11, Lrb/h;->c:Ljava/util/concurrent/ScheduledFuture;

    .line 172
    .line 173
    if-eqz v0, :cond_a

    .line 174
    .line 175
    invoke-interface {v0, v8}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 176
    .line 177
    .line 178
    goto :goto_4

    .line 179
    :catchall_0
    move-exception v0

    .line 180
    goto :goto_6

    .line 181
    :cond_a
    :goto_4
    iput-object v7, v10, Lrb/k;->q:Lrb/h;

    .line 182
    .line 183
    const-string v0, ""

    .line 184
    .line 185
    iput-object v0, v10, Lrb/k;->o:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 186
    .line 187
    monitor-exit v3

    .line 188
    iget-object v0, v10, Lrb/k;->e:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 189
    .line 190
    new-instance v9, Llb/a;

    .line 191
    .line 192
    invoke-direct/range {v9 .. v14}, Llb/a;-><init>(Lrb/k;Lrb/h;ILjava/lang/String;Lorg/json/JSONObject;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0, v9}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 196
    .line 197
    .line 198
    goto :goto_7

    .line 199
    :cond_b
    :goto_5
    monitor-exit v3

    .line 200
    goto :goto_7

    .line 201
    :goto_6
    monitor-exit v3

    .line 202
    throw v0

    .line 203
    :cond_c
    :goto_7
    return-void

    .line 204
    :pswitch_4
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    iget-object v0, v1, Lb9/e;->b:Ljava/lang/Object;

    .line 208
    .line 209
    move-object v3, v0

    .line 210
    check-cast v3, Lr9/d0;

    .line 211
    .line 212
    iget-object v4, v3, Lr9/d0;->A:Ljava/lang/ThreadLocal;

    .line 213
    .line 214
    :try_start_1
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 215
    .line 216
    invoke-virtual {v3, v0}, Lr9/d0;->V([Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    if-eqz v0, :cond_10

    .line 221
    .line 222
    invoke-virtual {v3, v0}, Lr9/d0;->u(Ljava/lang/Object;)Landroid/view/View;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    if-eqz v0, :cond_f

    .line 227
    .line 228
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    if-eqz v2, :cond_e

    .line 233
    .line 234
    iget-object v5, v3, Lr9/d0;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 235
    .line 236
    invoke-static {v2, v5}, Lr9/d0;->p(Ljava/lang/Object;Ljava/util/concurrent/ConcurrentHashMap;)Landroid/widget/TextView;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    if-eqz v5, :cond_d

    .line 241
    .line 242
    invoke-static {v5, v0}, Lr9/d0;->P(Landroid/view/View;Landroid/view/View;)Z

    .line 243
    .line 244
    .line 245
    move-result v8

    .line 246
    :cond_d
    if-eqz v8, :cond_e

    .line 247
    .line 248
    goto :goto_8

    .line 249
    :cond_e
    move-object v2, v7

    .line 250
    :goto_8
    new-instance v0, Lr9/x;

    .line 251
    .line 252
    invoke-direct {v0, v2}, Lr9/x;-><init>(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    goto :goto_9

    .line 256
    :cond_f
    new-instance v0, Lr9/x;

    .line 257
    .line 258
    invoke-direct {v0, v7}, Lr9/x;-><init>(Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    goto :goto_9

    .line 262
    :cond_10
    new-instance v0, Lr9/x;

    .line 263
    .line 264
    invoke-direct {v0, v7}, Lr9/x;-><init>(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 265
    .line 266
    .line 267
    goto :goto_9

    .line 268
    :catchall_1
    move-exception v0

    .line 269
    new-instance v2, Lsf/f;

    .line 270
    .line 271
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 272
    .line 273
    .line 274
    move-object v0, v2

    .line 275
    :goto_9
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    if-nez v2, :cond_11

    .line 280
    .line 281
    goto :goto_a

    .line 282
    :cond_11
    iget-object v0, v3, Lr9/d0;->b:Lia/t;

    .line 283
    .line 284
    const-string v3, "\u6d88\u606f\u663e\u793a\u65f6\u95f4\u7ed1\u5b9a\u524d\u72b6\u6001\u8bfb\u53d6\u5931\u8d25"

    .line 285
    .line 286
    invoke-virtual {v0, v3, v2}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    new-instance v0, Lr9/x;

    .line 290
    .line 291
    invoke-direct {v0, v7}, Lr9/x;-><init>(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    :goto_a
    check-cast v0, Lr9/x;

    .line 295
    .line 296
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    check-cast v2, Ljava/util/ArrayDeque;

    .line 301
    .line 302
    if-eqz v2, :cond_12

    .line 303
    .line 304
    goto :goto_b

    .line 305
    :cond_12
    new-instance v2, Ljava/util/ArrayDeque;

    .line 306
    .line 307
    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v4, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    :goto_b
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    return-void

    .line 317
    :pswitch_5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    iget-object v0, v1, Lb9/e;->b:Ljava/lang/Object;

    .line 321
    .line 322
    check-cast v0, Lcb/f;

    .line 323
    .line 324
    iget-object v0, v0, Lcb/f;->d:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v0, Landroid/content/SharedPreferences;

    .line 327
    .line 328
    const-string v3, "block_typing_report_enable"

    .line 329
    .line 330
    invoke-interface {v0, v3, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    if-eqz v0, :cond_13

    .line 335
    .line 336
    invoke-virtual {v2, v7}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    :cond_13
    return-void

    .line 340
    :pswitch_6
    const-string v0, "message"

    .line 341
    .line 342
    iget-object v3, v1, Lb9/e;->b:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v3, Loa/a;

    .line 345
    .line 346
    iget-object v5, v3, Loa/a;->f:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v5, Lna/b;

    .line 349
    .line 350
    iget-object v9, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 351
    .line 352
    if-nez v9, :cond_14

    .line 353
    .line 354
    goto :goto_d

    .line 355
    :cond_14
    array-length v10, v9

    .line 356
    move v11, v8

    .line 357
    :goto_c
    if-ge v11, v10, :cond_16

    .line 358
    .line 359
    aget-object v12, v9, v11

    .line 360
    .line 361
    instance-of v13, v12, Landroid/content/ContentValues;

    .line 362
    .line 363
    if-eqz v13, :cond_15

    .line 364
    .line 365
    check-cast v12, Landroid/content/ContentValues;

    .line 366
    .line 367
    goto :goto_e

    .line 368
    :cond_15
    add-int/lit8 v11, v11, 0x1

    .line 369
    .line 370
    goto :goto_c

    .line 371
    :cond_16
    :goto_d
    move-object v12, v7

    .line 372
    :goto_e
    if-nez v12, :cond_17

    .line 373
    .line 374
    goto/16 :goto_1b

    .line 375
    .line 376
    :cond_17
    iget-object v2, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 377
    .line 378
    if-nez v2, :cond_18

    .line 379
    .line 380
    goto :goto_12

    .line 381
    :cond_18
    :try_start_2
    array-length v9, v2

    .line 382
    if-lez v9, :cond_19

    .line 383
    .line 384
    aget-object v9, v2, v8

    .line 385
    .line 386
    instance-of v10, v9, Ljava/lang/String;

    .line 387
    .line 388
    if-eqz v10, :cond_19

    .line 389
    .line 390
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v7

    .line 394
    goto :goto_12

    .line 395
    :cond_19
    array-length v9, v2

    .line 396
    move v10, v8

    .line 397
    :goto_f
    if-ge v10, v9, :cond_1d

    .line 398
    .line 399
    aget-object v11, v2, v10

    .line 400
    .line 401
    instance-of v13, v11, Ljava/lang/String;

    .line 402
    .line 403
    if-nez v13, :cond_1a

    .line 404
    .line 405
    goto :goto_10

    .line 406
    :cond_1a
    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v11

    .line 410
    invoke-virtual {v11}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v13

    .line 414
    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    move-result v14

    .line 418
    if-nez v14, :cond_1c

    .line 419
    .line 420
    invoke-virtual {v13, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 421
    .line 422
    .line 423
    move-result v13
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 424
    if-eqz v13, :cond_1b

    .line 425
    .line 426
    goto :goto_11

    .line 427
    :cond_1b
    :goto_10
    add-int/lit8 v10, v10, 0x1

    .line 428
    .line 429
    goto :goto_f

    .line 430
    :cond_1c
    :goto_11
    move-object v7, v11

    .line 431
    :catchall_2
    :cond_1d
    :goto_12
    const-string v2, "nativeurl"

    .line 432
    .line 433
    const-string v9, ":\n"

    .line 434
    .line 435
    const-string v10, "\u6570\u636e\u5e93\u515c\u5e95\u7ea2\u5305: talker="

    .line 436
    .line 437
    iget-object v11, v3, Loa/a;->a:Ll3/l;

    .line 438
    .line 439
    invoke-virtual {v11}, Ll3/l;->e()Z

    .line 440
    .line 441
    .line 442
    move-result v11

    .line 443
    if-eqz v11, :cond_31

    .line 444
    .line 445
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 446
    .line 447
    .line 448
    move-result v11

    .line 449
    if-eqz v11, :cond_1e

    .line 450
    .line 451
    goto :goto_13

    .line 452
    :cond_1e
    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v7

    .line 456
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 457
    .line 458
    .line 459
    move-result v11

    .line 460
    if-nez v11, :cond_1f

    .line 461
    .line 462
    invoke-virtual {v7, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 463
    .line 464
    .line 465
    move-result v11

    .line 466
    if-nez v11, :cond_1f

    .line 467
    .line 468
    invoke-virtual {v7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 469
    .line 470
    .line 471
    move-result v0

    .line 472
    if-eqz v0, :cond_31

    .line 473
    .line 474
    :cond_1f
    :goto_13
    :try_start_3
    invoke-static {v12}, Lpa/a;->a(Landroid/content/ContentValues;)V

    .line 475
    .line 476
    .line 477
    const-string v0, "content"

    .line 478
    .line 479
    invoke-static {v12, v0}, Loa/a;->a(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 484
    .line 485
    .line 486
    move-result v7

    .line 487
    if-eqz v7, :cond_20

    .line 488
    .line 489
    const-string v0, "msgContent"

    .line 490
    .line 491
    invoke-static {v12, v0}, Loa/a;->a(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    goto :goto_14

    .line 496
    :catchall_3
    move-exception v0

    .line 497
    goto/16 :goto_1a

    .line 498
    .line 499
    :cond_20
    :goto_14
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 500
    .line 501
    .line 502
    move-result v7

    .line 503
    if-nez v7, :cond_31

    .line 504
    .line 505
    const-string v7, "<wcpayinfo>"

    .line 506
    .line 507
    invoke-virtual {v0, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 508
    .line 509
    .line 510
    move-result v7

    .line 511
    if-nez v7, :cond_21

    .line 512
    .line 513
    goto/16 :goto_1b

    .line 514
    .line 515
    :cond_21
    sget-object v7, Loa/b;->a:Ljava/util/regex/Pattern;

    .line 516
    .line 517
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 518
    .line 519
    .line 520
    move-result v7

    .line 521
    if-nez v7, :cond_31

    .line 522
    .line 523
    const-string v7, "receivehongbao"

    .line 524
    .line 525
    invoke-virtual {v0, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 526
    .line 527
    .line 528
    move-result v7

    .line 529
    if-nez v7, :cond_22

    .line 530
    .line 531
    const-string v7, "wxhb_personalreceive"

    .line 532
    .line 533
    invoke-virtual {v0, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 534
    .line 535
    .line 536
    move-result v7

    .line 537
    if-nez v7, :cond_22

    .line 538
    .line 539
    const-string v7, "<nativeurl>"

    .line 540
    .line 541
    invoke-virtual {v0, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 542
    .line 543
    .line 544
    move-result v7

    .line 545
    if-eqz v7, :cond_31

    .line 546
    .line 547
    :cond_22
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 548
    .line 549
    .line 550
    move-result v7

    .line 551
    if-eqz v7, :cond_24

    .line 552
    .line 553
    :cond_23
    move-object v4, v0

    .line 554
    goto :goto_15

    .line 555
    :cond_24
    invoke-virtual {v0, v9}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 556
    .line 557
    .line 558
    move-result v7

    .line 559
    if-lez v7, :cond_23

    .line 560
    .line 561
    const-string v11, "<"

    .line 562
    .line 563
    invoke-virtual {v0, v11}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 564
    .line 565
    .line 566
    move-result v11

    .line 567
    if-le v11, v7, :cond_23

    .line 568
    .line 569
    add-int/2addr v7, v4

    .line 570
    invoke-virtual {v0, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v4

    .line 574
    :goto_15
    invoke-static {v4, v2}, Loa/b;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v7

    .line 578
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 579
    .line 580
    .line 581
    move-result v11

    .line 582
    if-eqz v11, :cond_25

    .line 583
    .line 584
    invoke-static {v0, v2}, Loa/b;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 585
    .line 586
    .line 587
    move-result-object v7

    .line 588
    :cond_25
    move-object v11, v7

    .line 589
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 590
    .line 591
    .line 592
    move-result v2

    .line 593
    if-eqz v2, :cond_26

    .line 594
    .line 595
    goto/16 :goto_1b

    .line 596
    .line 597
    :cond_26
    const-string v2, "talker"

    .line 598
    .line 599
    invoke-static {v12, v2}, Loa/a;->a(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v2

    .line 603
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 604
    .line 605
    .line 606
    move-result v7

    .line 607
    if-eqz v7, :cond_27

    .line 608
    .line 609
    const-string v2, "username"

    .line 610
    .line 611
    invoke-static {v12, v2}, Loa/a;->a(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v2

    .line 615
    :cond_27
    const-string v7, "sendTalker"

    .line 616
    .line 617
    invoke-static {v12, v7}, Loa/a;->a(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v7

    .line 621
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 622
    .line 623
    .line 624
    move-result v13

    .line 625
    if-eqz v13, :cond_28

    .line 626
    .line 627
    invoke-virtual {v0, v9}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 628
    .line 629
    .line 630
    move-result v9

    .line 631
    if-lez v9, :cond_28

    .line 632
    .line 633
    invoke-virtual {v0, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object v7

    .line 637
    :cond_28
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 638
    .line 639
    .line 640
    move-result v0

    .line 641
    if-eqz v0, :cond_2d

    .line 642
    .line 643
    const-string v0, "isSend"
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 644
    .line 645
    :try_start_4
    invoke-virtual {v12, v0}, Landroid/content/ContentValues;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    move-result-object v0

    .line 649
    instance-of v7, v0, Ljava/lang/Number;

    .line 650
    .line 651
    if-eqz v7, :cond_29

    .line 652
    .line 653
    check-cast v0, Ljava/lang/Number;

    .line 654
    .line 655
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 656
    .line 657
    .line 658
    move-result v8

    .line 659
    goto :goto_16

    .line 660
    :cond_29
    if-eqz v0, :cond_2b

    .line 661
    .line 662
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 667
    .line 668
    .line 669
    move-result v7

    .line 670
    if-eqz v7, :cond_2a

    .line 671
    .line 672
    goto :goto_16

    .line 673
    :cond_2a
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 674
    .line 675
    .line 676
    move-result v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 677
    :catchall_4
    :cond_2b
    :goto_16
    :try_start_5
    iget-object v0, v3, Loa/a;->d:Ljava/lang/Object;

    .line 678
    .line 679
    check-cast v0, Lna/b;

    .line 680
    .line 681
    iget-object v0, v0, Lna/b;->h:Lna/e;

    .line 682
    .line 683
    invoke-virtual {v0}, Lna/e;->a()Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    if-ne v8, v6, :cond_2c

    .line 688
    .line 689
    move-object v7, v0

    .line 690
    goto :goto_17

    .line 691
    :cond_2c
    move-object v7, v2

    .line 692
    :cond_2d
    :goto_17
    move-object v9, v7

    .line 693
    invoke-static {v2}, Loa/b;->f(Ljava/lang/String;)Z

    .line 694
    .line 695
    .line 696
    move-result v0

    .line 697
    if-eqz v0, :cond_2e

    .line 698
    .line 699
    goto :goto_19

    .line 700
    :cond_2e
    invoke-static {v9}, Loa/b;->f(Ljava/lang/String;)Z

    .line 701
    .line 702
    .line 703
    move-result v0

    .line 704
    if-eqz v0, :cond_2f

    .line 705
    .line 706
    goto :goto_18

    .line 707
    :cond_2f
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 708
    .line 709
    .line 710
    move-result v0

    .line 711
    if-eqz v0, :cond_30

    .line 712
    .line 713
    :goto_18
    move-object v2, v9

    .line 714
    :cond_30
    :goto_19
    const-string v0, "exclusive_recv_username"

    .line 715
    .line 716
    invoke-static {v4, v0}, Loa/b;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 717
    .line 718
    .line 719
    move-result-object v12

    .line 720
    new-instance v0, Ljava/lang/StringBuilder;

    .line 721
    .line 722
    invoke-direct {v0, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 723
    .line 724
    .line 725
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 726
    .line 727
    .line 728
    const-string v6, " sender="

    .line 729
    .line 730
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 731
    .line 732
    .line 733
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 734
    .line 735
    .line 736
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v0

    .line 740
    iget-object v6, v5, Lna/b;->h:Lna/e;

    .line 741
    .line 742
    invoke-virtual {v6, v0}, Lna/e;->d(Ljava/lang/Object;)V

    .line 743
    .line 744
    .line 745
    iget-object v0, v3, Loa/a;->e:Ljava/lang/Object;

    .line 746
    .line 747
    check-cast v0, Lna/b;

    .line 748
    .line 749
    const-string v7, "\u6570\u636e\u5e93\u515c\u5e95"

    .line 750
    .line 751
    iget-object v6, v0, Lna/b;->h:Lna/e;

    .line 752
    .line 753
    move-object v10, v2

    .line 754
    move-object v8, v4

    .line 755
    invoke-virtual/range {v6 .. v12}, Lna/e;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 756
    .line 757
    .line 758
    goto :goto_1b

    .line 759
    :goto_1a
    new-instance v2, Ljava/lang/StringBuilder;

    .line 760
    .line 761
    const-string v3, "ERROR \u6570\u636e\u5e93\u515c\u5e95\u5904\u7406\u5931\u8d25: "

    .line 762
    .line 763
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 764
    .line 765
    .line 766
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 767
    .line 768
    .line 769
    move-result-object v0

    .line 770
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 771
    .line 772
    .line 773
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    iget-object v2, v5, Lna/b;->h:Lna/e;

    .line 778
    .line 779
    invoke-virtual {v2, v0}, Lna/e;->d(Ljava/lang/Object;)V

    .line 780
    .line 781
    .line 782
    :cond_31
    :goto_1b
    return-void

    .line 783
    :pswitch_7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 784
    .line 785
    .line 786
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 787
    .line 788
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 789
    .line 790
    .line 791
    invoke-static {v8, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    instance-of v3, v0, Landroid/view/KeyEvent;

    .line 796
    .line 797
    if-eqz v3, :cond_32

    .line 798
    .line 799
    move-object v7, v0

    .line 800
    check-cast v7, Landroid/view/KeyEvent;

    .line 801
    .line 802
    :cond_32
    if-eqz v7, :cond_3e

    .line 803
    .line 804
    iget-object v0, v1, Lb9/e;->b:Ljava/lang/Object;

    .line 805
    .line 806
    check-cast v0, Lb9/a;

    .line 807
    .line 808
    iget-object v0, v0, Lb9/a;->f:Ljava/lang/Object;

    .line 809
    .line 810
    check-cast v0, Lnb/w;

    .line 811
    .line 812
    if-eqz v0, :cond_3e

    .line 813
    .line 814
    iget-object v3, v0, Lnb/w;->b:Landroid/os/Handler;

    .line 815
    .line 816
    invoke-virtual {v7}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 817
    .line 818
    .line 819
    move-result v4

    .line 820
    const/16 v5, 0x18

    .line 821
    .line 822
    const/16 v9, 0x19

    .line 823
    .line 824
    if-eq v4, v9, :cond_33

    .line 825
    .line 826
    invoke-virtual {v7}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 827
    .line 828
    .line 829
    move-result v4

    .line 830
    if-eq v4, v5, :cond_33

    .line 831
    .line 832
    goto/16 :goto_1d

    .line 833
    .line 834
    :cond_33
    invoke-virtual {v7}, Landroid/view/KeyEvent;->getAction()I

    .line 835
    .line 836
    .line 837
    move-result v4

    .line 838
    if-ne v4, v6, :cond_34

    .line 839
    .line 840
    iget v4, v0, Lnb/w;->t:I

    .line 841
    .line 842
    invoke-virtual {v7}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 843
    .line 844
    .line 845
    move-result v6

    .line 846
    if-ne v4, v6, :cond_34

    .line 847
    .line 848
    iput v8, v0, Lnb/w;->t:I

    .line 849
    .line 850
    goto/16 :goto_1c

    .line 851
    .line 852
    :cond_34
    invoke-virtual {v7}, Landroid/view/KeyEvent;->getAction()I

    .line 853
    .line 854
    .line 855
    move-result v4

    .line 856
    if-eqz v4, :cond_35

    .line 857
    .line 858
    goto/16 :goto_1d

    .line 859
    .line 860
    :cond_35
    iget v4, v0, Lnb/w;->t:I

    .line 861
    .line 862
    invoke-virtual {v7}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 863
    .line 864
    .line 865
    move-result v6

    .line 866
    if-ne v4, v6, :cond_36

    .line 867
    .line 868
    invoke-virtual {v7}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 869
    .line 870
    .line 871
    move-result v4

    .line 872
    if-lez v4, :cond_36

    .line 873
    .line 874
    goto :goto_1c

    .line 875
    :cond_36
    invoke-virtual {v7}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 876
    .line 877
    .line 878
    move-result v4

    .line 879
    if-nez v4, :cond_37

    .line 880
    .line 881
    iput v8, v0, Lnb/w;->t:I

    .line 882
    .line 883
    :cond_37
    invoke-virtual {v7}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 884
    .line 885
    .line 886
    move-result v4

    .line 887
    if-eqz v4, :cond_38

    .line 888
    .line 889
    goto :goto_1d

    .line 890
    :cond_38
    invoke-virtual {v0}, Lnb/w;->y()Lnb/z;

    .line 891
    .line 892
    .line 893
    move-result-object v4

    .line 894
    const-string v6, "text_speech_enable"

    .line 895
    .line 896
    invoke-virtual {v4, v6}, Lnb/z;->b(Ljava/lang/String;)Z

    .line 897
    .line 898
    .line 899
    move-result v6

    .line 900
    if-eqz v6, :cond_3e

    .line 901
    .line 902
    const-string v6, "text_speech_volume_control"

    .line 903
    .line 904
    invoke-virtual {v4, v6}, Lnb/z;->b(Ljava/lang/String;)Z

    .line 905
    .line 906
    .line 907
    move-result v4

    .line 908
    if-nez v4, :cond_39

    .line 909
    .line 910
    goto :goto_1d

    .line 911
    :cond_39
    iget-object v4, v0, Lnb/w;->o:Lnb/l;

    .line 912
    .line 913
    if-nez v4, :cond_3a

    .line 914
    .line 915
    iget-boolean v4, v0, Lnb/w;->r:Z

    .line 916
    .line 917
    if-nez v4, :cond_3a

    .line 918
    .line 919
    goto :goto_1d

    .line 920
    :cond_3a
    invoke-virtual {v7}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 921
    .line 922
    .line 923
    move-result v4

    .line 924
    if-eq v4, v5, :cond_3c

    .line 925
    .line 926
    if-eq v4, v9, :cond_3b

    .line 927
    .line 928
    goto :goto_1d

    .line 929
    :cond_3b
    invoke-virtual {v7}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 930
    .line 931
    .line 932
    move-result v4

    .line 933
    iput v4, v0, Lnb/w;->t:I

    .line 934
    .line 935
    new-instance v4, Lnb/e;

    .line 936
    .line 937
    const/4 v5, 0x7

    .line 938
    invoke-direct {v4, v0, v5}, Lnb/e;-><init>(Lnb/w;I)V

    .line 939
    .line 940
    .line 941
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 942
    .line 943
    .line 944
    goto :goto_1c

    .line 945
    :cond_3c
    iget-boolean v4, v0, Lnb/w;->r:Z

    .line 946
    .line 947
    if-nez v4, :cond_3d

    .line 948
    .line 949
    goto :goto_1d

    .line 950
    :cond_3d
    invoke-virtual {v7}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 951
    .line 952
    .line 953
    move-result v4

    .line 954
    iput v4, v0, Lnb/w;->t:I

    .line 955
    .line 956
    new-instance v4, Lnb/e;

    .line 957
    .line 958
    const/16 v5, 0x8

    .line 959
    .line 960
    invoke-direct {v4, v0, v5}, Lnb/e;-><init>(Lnb/w;I)V

    .line 961
    .line 962
    .line 963
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 964
    .line 965
    .line 966
    :goto_1c
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 967
    .line 968
    invoke-virtual {v2, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 969
    .line 970
    .line 971
    :cond_3e
    :goto_1d
    return-void

    .line 972
    :pswitch_8
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 973
    .line 974
    .line 975
    iget-object v0, v1, Lb9/e;->b:Ljava/lang/Object;

    .line 976
    .line 977
    check-cast v0, Lcb/f;

    .line 978
    .line 979
    iget-object v0, v0, Lcb/f;->d:Ljava/lang/Object;

    .line 980
    .line 981
    check-cast v0, Landroid/content/SharedPreferences;

    .line 982
    .line 983
    const-string v3, "disable_pat_enable"

    .line 984
    .line 985
    invoke-interface {v0, v3, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 986
    .line 987
    .line 988
    move-result v0

    .line 989
    if-eqz v0, :cond_3f

    .line 990
    .line 991
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 992
    .line 993
    invoke-virtual {v2, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 994
    .line 995
    .line 996
    :cond_3f
    return-void

    .line 997
    :pswitch_9
    const-string v0, "g"

    .line 998
    .line 999
    const-string v3, ""

    .line 1000
    .line 1001
    iget-object v2, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1002
    .line 1003
    if-eqz v2, :cond_50

    .line 1004
    .line 1005
    array-length v4, v2

    .line 1006
    if-ge v4, v6, :cond_40

    .line 1007
    .line 1008
    goto/16 :goto_29

    .line 1009
    .line 1010
    :cond_40
    iget-object v4, v1, Lb9/e;->b:Ljava/lang/Object;

    .line 1011
    .line 1012
    check-cast v4, Lk8/k;

    .line 1013
    .line 1014
    aget-object v5, v2, v8

    .line 1015
    .line 1016
    array-length v9, v2

    .line 1017
    if-le v9, v6, :cond_41

    .line 1018
    .line 1019
    aget-object v7, v2, v6

    .line 1020
    .line 1021
    :cond_41
    iget-object v2, v4, Lk8/k;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1022
    .line 1023
    const-string v9, "i"

    .line 1024
    .line 1025
    const-string v10, ":"

    .line 1026
    .line 1027
    if-nez v5, :cond_42

    .line 1028
    .line 1029
    goto/16 :goto_29

    .line 1030
    .line 1031
    :cond_42
    :try_start_6
    const-string v11, "d"

    .line 1032
    .line 1033
    invoke-static {v5, v11}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v11

    .line 1037
    if-eqz v11, :cond_43

    .line 1038
    .line 1039
    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v11

    .line 1043
    goto :goto_1e

    .line 1044
    :cond_43
    move-object v11, v3

    .line 1045
    :goto_1e
    const-string v12, "e"

    .line 1046
    .line 1047
    invoke-static {v5, v12}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v12

    .line 1051
    if-eqz v12, :cond_44

    .line 1052
    .line 1053
    invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v12

    .line 1057
    goto :goto_1f

    .line 1058
    :cond_44
    move-object v12, v3

    .line 1059
    :goto_1f
    const-string v13, "f"

    .line 1060
    .line 1061
    invoke-static {v5, v13}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v13

    .line 1065
    if-eqz v13, :cond_45

    .line 1066
    .line 1067
    invoke-static {v13}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v13

    .line 1071
    goto :goto_20

    .line 1072
    :cond_45
    move-object v13, v3

    .line 1073
    :goto_20
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v14

    .line 1077
    invoke-static {v14, v0}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v14

    .line 1081
    if-eqz v14, :cond_46

    .line 1082
    .line 1083
    move v14, v6

    .line 1084
    goto :goto_21

    .line 1085
    :cond_46
    move v14, v8

    .line 1086
    :goto_21
    if-eqz v14, :cond_47

    .line 1087
    .line 1088
    invoke-static {v5, v0}, Lk8/k;->e(Ljava/lang/Object;Ljava/lang/String;)J

    .line 1089
    .line 1090
    .line 1091
    move-result-wide v14

    .line 1092
    goto :goto_22

    .line 1093
    :cond_47
    invoke-static {v5, v9}, Lk8/k;->e(Ljava/lang/Object;Ljava/lang/String;)J

    .line 1094
    .line 1095
    .line 1096
    move-result-wide v14

    .line 1097
    :goto_22
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v6

    .line 1101
    invoke-static {v6, v0}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v0

    .line 1105
    if-eqz v0, :cond_48

    .line 1106
    .line 1107
    const/4 v6, 0x1

    .line 1108
    goto :goto_23

    .line 1109
    :cond_48
    move v6, v8

    .line 1110
    :goto_23
    if-eqz v6, :cond_49

    .line 1111
    .line 1112
    invoke-static {v5, v9}, Lk8/k;->e(Ljava/lang/Object;Ljava/lang/String;)J

    .line 1113
    .line 1114
    .line 1115
    move-result-wide v5

    .line 1116
    goto :goto_24

    .line 1117
    :cond_49
    const-string v0, "n"

    .line 1118
    .line 1119
    invoke-static {v5, v0}, Lk8/k;->e(Ljava/lang/Object;Ljava/lang/String;)J

    .line 1120
    .line 1121
    .line 1122
    move-result-wide v5

    .line 1123
    :goto_24
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1124
    .line 1125
    .line 1126
    move-result v0

    .line 1127
    if-nez v0, :cond_50

    .line 1128
    .line 1129
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1130
    .line 1131
    .line 1132
    move-result v0

    .line 1133
    if-eqz v0, :cond_4a

    .line 1134
    .line 1135
    goto/16 :goto_29

    .line 1136
    .line 1137
    :cond_4a
    const-wide/16 v16, 0x0

    .line 1138
    .line 1139
    cmp-long v0, v14, v16

    .line 1140
    .line 1141
    const-wide/32 v16, 0x493e0

    .line 1142
    .line 1143
    .line 1144
    if-gtz v0, :cond_4b

    .line 1145
    .line 1146
    goto :goto_26

    .line 1147
    :cond_4b
    const-wide v18, 0x174876e800L

    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    cmp-long v0, v14, v18

    .line 1153
    .line 1154
    if-lez v0, :cond_4c

    .line 1155
    .line 1156
    move-wide/from16 v18, v14

    .line 1157
    .line 1158
    goto :goto_25

    .line 1159
    :cond_4c
    const-wide/16 v18, 0x3e8

    .line 1160
    .line 1161
    mul-long v18, v18, v14

    .line 1162
    .line 1163
    :goto_25
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1164
    .line 1165
    .line 1166
    move-result-wide v20

    .line 1167
    sub-long v20, v20, v18

    .line 1168
    .line 1169
    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->abs(J)J

    .line 1170
    .line 1171
    .line 1172
    move-result-wide v18

    .line 1173
    cmp-long v0, v18, v16

    .line 1174
    .line 1175
    if-gtz v0, :cond_50

    .line 1176
    .line 1177
    :goto_26
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1178
    .line 1179
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1180
    .line 1181
    .line 1182
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1183
    .line 1184
    .line 1185
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1186
    .line 1187
    .line 1188
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1189
    .line 1190
    .line 1191
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1192
    .line 1193
    .line 1194
    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1195
    .line 1196
    .line 1197
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1198
    .line 1199
    .line 1200
    invoke-virtual {v0, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1201
    .line 1202
    .line 1203
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1204
    .line 1205
    .line 1206
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1207
    .line 1208
    .line 1209
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v0

    .line 1213
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1214
    .line 1215
    .line 1216
    move-result-wide v9

    .line 1217
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v8

    .line 1221
    invoke-virtual {v2, v0, v8}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v0

    .line 1225
    check-cast v0, Ljava/lang/Long;

    .line 1226
    .line 1227
    if-eqz v0, :cond_4d

    .line 1228
    .line 1229
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 1230
    .line 1231
    .line 1232
    move-result-wide v19

    .line 1233
    sub-long v19, v9, v19

    .line 1234
    .line 1235
    cmp-long v0, v19, v16

    .line 1236
    .line 1237
    if-gez v0, :cond_4d

    .line 1238
    .line 1239
    goto :goto_29

    .line 1240
    :catchall_5
    move-exception v0

    .line 1241
    goto :goto_28

    .line 1242
    :cond_4d
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 1243
    .line 1244
    .line 1245
    move-result v0

    .line 1246
    const/16 v8, 0x80

    .line 1247
    .line 1248
    if-ge v0, v8, :cond_4e

    .line 1249
    .line 1250
    goto :goto_27

    .line 1251
    :cond_4e
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v0

    .line 1255
    new-instance v2, Lk8/j;

    .line 1256
    .line 1257
    const/4 v8, 0x0

    .line 1258
    invoke-direct {v2, v9, v10, v8}, Lk8/j;-><init>(JI)V

    .line 1259
    .line 1260
    .line 1261
    invoke-interface {v0, v2}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 1262
    .line 1263
    .line 1264
    :goto_27
    instance-of v0, v7, Ljava/lang/String;

    .line 1265
    .line 1266
    if-eqz v0, :cond_4f

    .line 1267
    .line 1268
    move-object v3, v7

    .line 1269
    check-cast v3, Ljava/lang/String;

    .line 1270
    .line 1271
    :cond_4f
    move-object v9, v3

    .line 1272
    iget-object v0, v4, Lk8/k;->d:Lf8/c;

    .line 1273
    .line 1274
    move-object v7, v12

    .line 1275
    move-object v8, v13

    .line 1276
    move-wide v12, v5

    .line 1277
    new-instance v5, Lf8/h;

    .line 1278
    .line 1279
    move-object v6, v11

    .line 1280
    move-wide v10, v14

    .line 1281
    invoke-direct/range {v5 .. v13}, Lf8/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V

    .line 1282
    .line 1283
    .line 1284
    invoke-virtual {v0, v5}, Lf8/c;->b(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 1285
    .line 1286
    .line 1287
    goto :goto_29

    .line 1288
    :goto_28
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1289
    .line 1290
    const-string v3, "\u6d3e\u53d1\u62cd\u4e00\u62cd\u4e8b\u4ef6\u5931\u8d25: "

    .line 1291
    .line 1292
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1293
    .line 1294
    .line 1295
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v0

    .line 1299
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1300
    .line 1301
    .line 1302
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v0

    .line 1306
    invoke-virtual {v4, v0}, Lk8/k;->d(Ljava/lang/String;)V

    .line 1307
    .line 1308
    .line 1309
    :cond_50
    :goto_29
    return-void

    .line 1310
    :pswitch_a
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1311
    .line 1312
    .line 1313
    iget-object v0, v1, Lb9/e;->b:Ljava/lang/Object;

    .line 1314
    .line 1315
    check-cast v0, Lk8/e;

    .line 1316
    .line 1317
    iget-object v0, v0, Lk8/e;->b:Ljava/lang/ThreadLocal;

    .line 1318
    .line 1319
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v0

    .line 1323
    check-cast v0, Lk8/d;

    .line 1324
    .line 1325
    if-eqz v0, :cond_53

    .line 1326
    .line 1327
    iget-object v3, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1328
    .line 1329
    if-eqz v3, :cond_53

    .line 1330
    .line 1331
    const/4 v8, 0x0

    .line 1332
    invoke-static {v8, v3}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v3

    .line 1336
    instance-of v4, v3, Ljava/lang/String;

    .line 1337
    .line 1338
    if-eqz v4, :cond_51

    .line 1339
    .line 1340
    move-object v7, v3

    .line 1341
    check-cast v7, Ljava/lang/String;

    .line 1342
    .line 1343
    :cond_51
    if-eqz v7, :cond_53

    .line 1344
    .line 1345
    iget-object v3, v0, Lk8/d;->a:Ljava/lang/String;

    .line 1346
    .line 1347
    invoke-virtual {v7, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1348
    .line 1349
    .line 1350
    move-result v3

    .line 1351
    if-nez v3, :cond_52

    .line 1352
    .line 1353
    goto :goto_2a

    .line 1354
    :cond_52
    iget-wide v3, v0, Lk8/d;->b:J

    .line 1355
    .line 1356
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v0

    .line 1360
    invoke-virtual {v2, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1361
    .line 1362
    .line 1363
    :cond_53
    :goto_2a
    return-void

    .line 1364
    :pswitch_b
    const-string v0, "Hchat_fake_voice_duration_config"

    .line 1365
    .line 1366
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1367
    .line 1368
    .line 1369
    iget-object v4, v1, Lb9/e;->b:Ljava/lang/Object;

    .line 1370
    .line 1371
    check-cast v4, Lea/c;

    .line 1372
    .line 1373
    iget-object v5, v4, Lea/c;->a:Ljava/lang/Object;

    .line 1374
    .line 1375
    check-cast v5, Lr8/g;

    .line 1376
    .line 1377
    iget-object v5, v5, Lr8/g;->a:Landroid/content/Context;

    .line 1378
    .line 1379
    invoke-static {v5, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v5

    .line 1383
    const-string v6, "fake_voice_duration_enable"

    .line 1384
    .line 1385
    const/4 v8, 0x0

    .line 1386
    invoke-interface {v5, v6, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1387
    .line 1388
    .line 1389
    move-result v5

    .line 1390
    if-nez v5, :cond_54

    .line 1391
    .line 1392
    goto :goto_2b

    .line 1393
    :cond_54
    iget-object v4, v4, Lea/c;->a:Ljava/lang/Object;

    .line 1394
    .line 1395
    check-cast v4, Lr8/g;

    .line 1396
    .line 1397
    iget-object v4, v4, Lr8/g;->a:Landroid/content/Context;

    .line 1398
    .line 1399
    invoke-static {v4, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v0

    .line 1403
    const-string v4, "fake_voice_duration_seconds"

    .line 1404
    .line 1405
    invoke-interface {v0, v4, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1406
    .line 1407
    .line 1408
    move-result v0

    .line 1409
    const/16 v3, 0x3c

    .line 1410
    .line 1411
    const/4 v4, 0x1

    .line 1412
    invoke-static {v0, v4, v3}, Lr9/e0;->r(III)I

    .line 1413
    .line 1414
    .line 1415
    move-result v0

    .line 1416
    mul-int/lit16 v0, v0, 0x3e8

    .line 1417
    .line 1418
    int-to-long v3, v0

    .line 1419
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v0

    .line 1423
    invoke-virtual {v2, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1424
    .line 1425
    .line 1426
    :goto_2b
    return-void

    .line 1427
    :pswitch_c
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1428
    .line 1429
    .line 1430
    iget-object v0, v1, Lb9/e;->b:Ljava/lang/Object;

    .line 1431
    .line 1432
    check-cast v0, Lea/c;

    .line 1433
    .line 1434
    iget-object v0, v0, Lea/c;->b:Ljava/lang/Object;

    .line 1435
    .line 1436
    check-cast v0, Landroid/content/SharedPreferences;

    .line 1437
    .line 1438
    const-string v6, "fake_scan_camera_enable"

    .line 1439
    .line 1440
    const/4 v8, 0x0

    .line 1441
    invoke-interface {v0, v6, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1442
    .line 1443
    .line 1444
    move-result v0

    .line 1445
    if-nez v0, :cond_55

    .line 1446
    .line 1447
    goto/16 :goto_31

    .line 1448
    .line 1449
    :cond_55
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1450
    .line 1451
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v2

    .line 1455
    const/4 v5, 0x4

    .line 1456
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v6

    .line 1460
    if-eqz v0, :cond_5e

    .line 1461
    .line 1462
    array-length v8, v0

    .line 1463
    if-ge v8, v3, :cond_56

    .line 1464
    .line 1465
    goto/16 :goto_31

    .line 1466
    .line 1467
    :cond_56
    array-length v3, v0

    .line 1468
    const/16 v8, 0xf

    .line 1469
    .line 1470
    if-eq v3, v8, :cond_58

    .line 1471
    .line 1472
    const/16 v4, 0x10

    .line 1473
    .line 1474
    if-eq v3, v4, :cond_57

    .line 1475
    .line 1476
    goto/16 :goto_31

    .line 1477
    .line 1478
    :cond_57
    new-instance v3, Lsf/e;

    .line 1479
    .line 1480
    invoke-direct {v3, v2, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1481
    .line 1482
    .line 1483
    goto :goto_2c

    .line 1484
    :cond_58
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v3

    .line 1488
    new-instance v4, Lsf/e;

    .line 1489
    .line 1490
    invoke-direct {v4, v3, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1491
    .line 1492
    .line 1493
    move-object v3, v4

    .line 1494
    :goto_2c
    iget-object v2, v3, Lsf/e;->g:Ljava/lang/Object;

    .line 1495
    .line 1496
    check-cast v2, Ljava/lang/Number;

    .line 1497
    .line 1498
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 1499
    .line 1500
    .line 1501
    move-result v2

    .line 1502
    iget-object v3, v3, Lsf/e;->h:Ljava/lang/Object;

    .line 1503
    .line 1504
    check-cast v3, Ljava/lang/Number;

    .line 1505
    .line 1506
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 1507
    .line 1508
    .line 1509
    move-result v3

    .line 1510
    aget-object v4, v0, v2

    .line 1511
    .line 1512
    instance-of v8, v4, Ljava/lang/Integer;

    .line 1513
    .line 1514
    if-eqz v8, :cond_59

    .line 1515
    .line 1516
    check-cast v4, Ljava/lang/Integer;

    .line 1517
    .line 1518
    goto :goto_2d

    .line 1519
    :cond_59
    instance-of v8, v4, Ljava/lang/Number;

    .line 1520
    .line 1521
    if-eqz v8, :cond_5a

    .line 1522
    .line 1523
    check-cast v4, Ljava/lang/Number;

    .line 1524
    .line 1525
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 1526
    .line 1527
    .line 1528
    move-result v4

    .line 1529
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v4

    .line 1533
    goto :goto_2d

    .line 1534
    :cond_5a
    move-object v4, v7

    .line 1535
    :goto_2d
    if-eqz v4, :cond_5e

    .line 1536
    .line 1537
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1538
    .line 1539
    .line 1540
    move-result v4

    .line 1541
    aget-object v8, v0, v3

    .line 1542
    .line 1543
    instance-of v9, v8, Ljava/lang/Integer;

    .line 1544
    .line 1545
    if-eqz v9, :cond_5b

    .line 1546
    .line 1547
    move-object v7, v8

    .line 1548
    check-cast v7, Ljava/lang/Integer;

    .line 1549
    .line 1550
    goto :goto_2e

    .line 1551
    :cond_5b
    instance-of v9, v8, Ljava/lang/Number;

    .line 1552
    .line 1553
    if-eqz v9, :cond_5c

    .line 1554
    .line 1555
    check-cast v8, Ljava/lang/Number;

    .line 1556
    .line 1557
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 1558
    .line 1559
    .line 1560
    move-result v7

    .line 1561
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v7

    .line 1565
    :cond_5c
    :goto_2e
    if-eqz v7, :cond_5e

    .line 1566
    .line 1567
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 1568
    .line 1569
    .line 1570
    move-result v7

    .line 1571
    const/4 v8, 0x1

    .line 1572
    if-ne v4, v8, :cond_5d

    .line 1573
    .line 1574
    const/16 v8, 0x22

    .line 1575
    .line 1576
    if-ne v7, v8, :cond_5d

    .line 1577
    .line 1578
    :goto_2f
    const/16 v18, 0x0

    .line 1579
    .line 1580
    goto :goto_30

    .line 1581
    :cond_5d
    if-ne v4, v5, :cond_5e

    .line 1582
    .line 1583
    const/16 v4, 0x25

    .line 1584
    .line 1585
    if-ne v7, v4, :cond_5e

    .line 1586
    .line 1587
    goto :goto_2f

    .line 1588
    :goto_30
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v4

    .line 1592
    aput-object v4, v0, v2

    .line 1593
    .line 1594
    aput-object v6, v0, v3

    .line 1595
    .line 1596
    :cond_5e
    :goto_31
    return-void

    .line 1597
    :pswitch_d
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1598
    .line 1599
    .line 1600
    iget-object v0, v1, Lb9/e;->b:Ljava/lang/Object;

    .line 1601
    .line 1602
    check-cast v0, Lha/j0;

    .line 1603
    .line 1604
    iget-object v0, v0, Lha/j0;->b:Landroid/content/SharedPreferences;

    .line 1605
    .line 1606
    const-string v3, "sns_anti_recall_enable"

    .line 1607
    .line 1608
    const/4 v8, 0x0

    .line 1609
    invoke-interface {v0, v3, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1610
    .line 1611
    .line 1612
    move-result v3

    .line 1613
    if-eqz v3, :cond_5f

    .line 1614
    .line 1615
    const-string v3, "sns_force_legacy_profile_enable"

    .line 1616
    .line 1617
    invoke-interface {v0, v3, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1618
    .line 1619
    .line 1620
    move-result v0

    .line 1621
    if-eqz v0, :cond_5f

    .line 1622
    .line 1623
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1624
    .line 1625
    invoke-virtual {v2, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1626
    .line 1627
    .line 1628
    :cond_5f
    return-void

    .line 1629
    :pswitch_e
    move v8, v6

    .line 1630
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1631
    .line 1632
    .line 1633
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1634
    .line 1635
    if-nez v0, :cond_60

    .line 1636
    .line 1637
    goto/16 :goto_37

    .line 1638
    .line 1639
    :cond_60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v3

    .line 1643
    sget-object v4, Leb/m0;->c:Ljava/util/LinkedHashMap;

    .line 1644
    .line 1645
    monitor-enter v4

    .line 1646
    :try_start_7
    invoke-interface {v4, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1647
    .line 1648
    .line 1649
    move-result v5

    .line 1650
    if-eqz v5, :cond_61

    .line 1651
    .line 1652
    invoke-virtual {v4, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v5

    .line 1656
    check-cast v5, Ljava/lang/reflect/Field;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 1657
    .line 1658
    goto :goto_32

    .line 1659
    :catchall_6
    move-exception v0

    .line 1660
    goto/16 :goto_47

    .line 1661
    .line 1662
    :cond_61
    move-object v5, v7

    .line 1663
    :goto_32
    monitor-exit v4

    .line 1664
    if-eqz v5, :cond_62

    .line 1665
    .line 1666
    invoke-static {v5, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v0

    .line 1670
    :goto_33
    move-object v3, v0

    .line 1671
    goto :goto_38

    .line 1672
    :cond_62
    monitor-enter v4

    .line 1673
    :try_start_8
    invoke-interface {v4, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1674
    .line 1675
    .line 1676
    move-result v5
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_a

    .line 1677
    monitor-exit v4

    .line 1678
    if-eqz v5, :cond_63

    .line 1679
    .line 1680
    goto :goto_37

    .line 1681
    :cond_63
    new-instance v4, Ljava/util/ArrayList;

    .line 1682
    .line 1683
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1684
    .line 1685
    .line 1686
    move-object v5, v3

    .line 1687
    :goto_34
    if-eqz v5, :cond_64

    .line 1688
    .line 1689
    const-class v6, Ljava/lang/Object;

    .line 1690
    .line 1691
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1692
    .line 1693
    .line 1694
    move-result v6

    .line 1695
    if-nez v6, :cond_64

    .line 1696
    .line 1697
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 1698
    .line 1699
    .line 1700
    move-result-object v6

    .line 1701
    invoke-static {v4, v6}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1702
    .line 1703
    .line 1704
    invoke-virtual {v5}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 1705
    .line 1706
    .line 1707
    move-result-object v5

    .line 1708
    goto :goto_34

    .line 1709
    :cond_64
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1710
    .line 1711
    .line 1712
    move-result-object v4

    .line 1713
    :cond_65
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1714
    .line 1715
    .line 1716
    move-result v5

    .line 1717
    if-eqz v5, :cond_66

    .line 1718
    .line 1719
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1720
    .line 1721
    .line 1722
    move-result-object v5

    .line 1723
    move-object v6, v5

    .line 1724
    check-cast v6, Ljava/lang/reflect/Field;

    .line 1725
    .line 1726
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1727
    .line 1728
    .line 1729
    move-result-object v6

    .line 1730
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1731
    .line 1732
    .line 1733
    move-result-object v6

    .line 1734
    const-string v9, "com.tencent.mm.pluginsdk.ui.chat.ChatFooter"

    .line 1735
    .line 1736
    invoke-virtual {v6, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1737
    .line 1738
    .line 1739
    move-result v6

    .line 1740
    if-eqz v6, :cond_65

    .line 1741
    .line 1742
    goto :goto_35

    .line 1743
    :cond_66
    move-object v5, v7

    .line 1744
    :goto_35
    check-cast v5, Ljava/lang/reflect/Field;

    .line 1745
    .line 1746
    if-eqz v5, :cond_67

    .line 1747
    .line 1748
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Field;)Ljava/lang/reflect/Field;

    .line 1749
    .line 1750
    .line 1751
    move-result-object v4

    .line 1752
    goto :goto_36

    .line 1753
    :cond_67
    move-object v4, v7

    .line 1754
    :goto_36
    sget-object v5, Leb/m0;->c:Ljava/util/LinkedHashMap;

    .line 1755
    .line 1756
    monitor-enter v5

    .line 1757
    :try_start_9
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 1758
    .line 1759
    .line 1760
    monitor-exit v5

    .line 1761
    if-eqz v4, :cond_68

    .line 1762
    .line 1763
    invoke-static {v4, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1764
    .line 1765
    .line 1766
    move-result-object v0

    .line 1767
    goto :goto_33

    .line 1768
    :cond_68
    :goto_37
    move-object v3, v7

    .line 1769
    :goto_38
    if-eqz v3, :cond_7b

    .line 1770
    .line 1771
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 1772
    .line 1773
    invoke-direct {v0, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 1774
    .line 1775
    .line 1776
    sput-object v0, Leb/m0;->j:Ljava/lang/ref/WeakReference;

    .line 1777
    .line 1778
    instance-of v0, v3, Landroid/view/View;

    .line 1779
    .line 1780
    if-eqz v0, :cond_69

    .line 1781
    .line 1782
    move-object v0, v3

    .line 1783
    check-cast v0, Landroid/view/View;

    .line 1784
    .line 1785
    goto :goto_39

    .line 1786
    :cond_69
    move-object v0, v7

    .line 1787
    :goto_39
    if-eqz v0, :cond_6a

    .line 1788
    .line 1789
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1790
    .line 1791
    .line 1792
    move-result-object v0

    .line 1793
    goto :goto_3a

    .line 1794
    :cond_6a
    move-object v0, v7

    .line 1795
    :goto_3a
    invoke-static {v0}, Leb/m0;->c(Landroid/content/Context;)Landroid/app/Activity;

    .line 1796
    .line 1797
    .line 1798
    move-result-object v0

    .line 1799
    if-eqz v0, :cond_6b

    .line 1800
    .line 1801
    goto :goto_3d

    .line 1802
    :cond_6b
    invoke-static {v3}, Leb/m0;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v0

    .line 1806
    instance-of v4, v0, Landroid/view/View;

    .line 1807
    .line 1808
    if-eqz v4, :cond_6c

    .line 1809
    .line 1810
    check-cast v0, Landroid/view/View;

    .line 1811
    .line 1812
    goto :goto_3b

    .line 1813
    :cond_6c
    move-object v0, v7

    .line 1814
    :goto_3b
    if-eqz v0, :cond_6d

    .line 1815
    .line 1816
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1817
    .line 1818
    .line 1819
    move-result-object v0

    .line 1820
    goto :goto_3c

    .line 1821
    :cond_6d
    move-object v0, v7

    .line 1822
    :goto_3c
    invoke-static {v0}, Leb/m0;->c(Landroid/content/Context;)Landroid/app/Activity;

    .line 1823
    .line 1824
    .line 1825
    move-result-object v0

    .line 1826
    if-eqz v0, :cond_6e

    .line 1827
    .line 1828
    :goto_3d
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 1829
    .line 1830
    .line 1831
    move-result-object v4

    .line 1832
    if-eqz v4, :cond_6e

    .line 1833
    .line 1834
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 1835
    .line 1836
    .line 1837
    move-result v5

    .line 1838
    if-nez v5, :cond_6e

    .line 1839
    .line 1840
    new-instance v5, Ljava/lang/ref/WeakReference;

    .line 1841
    .line 1842
    invoke-direct {v5, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 1843
    .line 1844
    .line 1845
    iput-object v5, v4, Lq8/o;->b:Ljava/lang/ref/WeakReference;

    .line 1846
    .line 1847
    :cond_6e
    invoke-static {v3}, Leb/m0;->i(Ljava/lang/Object;)Ljava/lang/String;

    .line 1848
    .line 1849
    .line 1850
    move-result-object v4

    .line 1851
    sget-object v0, Leb/m0;->g:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1852
    .line 1853
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 1854
    .line 1855
    .line 1856
    move-result-object v5

    .line 1857
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1858
    .line 1859
    .line 1860
    :cond_6f
    :goto_3e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1861
    .line 1862
    .line 1863
    move-result v0

    .line 1864
    if-eqz v0, :cond_70

    .line 1865
    .line 1866
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1867
    .line 1868
    .line 1869
    move-result-object v0

    .line 1870
    move-object v6, v0

    .line 1871
    check-cast v6, Leb/j0;

    .line 1872
    .line 1873
    :try_start_a
    iget-object v0, v6, Leb/j0;->b:Leb/i0;

    .line 1874
    .line 1875
    invoke-interface {v0, v4}, Leb/i0;->b(Ljava/lang/String;)Z

    .line 1876
    .line 1877
    .line 1878
    move-result v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 1879
    if-eqz v0, :cond_6f

    .line 1880
    .line 1881
    move v6, v8

    .line 1882
    goto :goto_3f

    .line 1883
    :catchall_7
    move-exception v0

    .line 1884
    iget-object v6, v6, Leb/j0;->a:Ljava/lang/String;

    .line 1885
    .line 1886
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1887
    .line 1888
    .line 1889
    move-result-object v9

    .line 1890
    const-string v10, "[Hchat:Script] \u53d1\u9001\u6309\u94ae\u6a21\u5757\u56de\u8c03\u5931\u8d25: "

    .line 1891
    .line 1892
    const-string v11, " "

    .line 1893
    .line 1894
    invoke-static {v10, v6, v11, v9, v0}, Leh/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1895
    .line 1896
    .line 1897
    goto :goto_3e

    .line 1898
    :cond_70
    const/4 v6, 0x0

    .line 1899
    :goto_3f
    if-eqz v6, :cond_71

    .line 1900
    .line 1901
    const/4 v0, 0x0

    .line 1902
    goto :goto_40

    .line 1903
    :cond_71
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 1904
    .line 1905
    invoke-virtual {v0, v4}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->dispatchOnClickSendBtn(Ljava/lang/String;)Leb/d0;

    .line 1906
    .line 1907
    .line 1908
    move-result-object v0

    .line 1909
    iget-boolean v0, v0, Leb/d0;->a:Z

    .line 1910
    .line 1911
    :goto_40
    if-nez v6, :cond_74

    .line 1912
    .line 1913
    if-nez v0, :cond_74

    .line 1914
    .line 1915
    invoke-static {v3}, Leb/m0;->i(Ljava/lang/Object;)Ljava/lang/String;

    .line 1916
    .line 1917
    .line 1918
    move-result-object v0

    .line 1919
    iget-object v4, v1, Lb9/e;->b:Ljava/lang/Object;

    .line 1920
    .line 1921
    check-cast v4, Leb/m0;

    .line 1922
    .line 1923
    :try_start_b
    invoke-static {v4, v3, v0}, Leb/m0;->a(Leb/m0;Ljava/lang/Object;Ljava/lang/String;)Leb/h0;

    .line 1924
    .line 1925
    .line 1926
    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 1927
    goto :goto_41

    .line 1928
    :catchall_8
    move-exception v0

    .line 1929
    new-instance v3, Lsf/f;

    .line 1930
    .line 1931
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1932
    .line 1933
    .line 1934
    move-object v0, v3

    .line 1935
    :goto_41
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1936
    .line 1937
    .line 1938
    move-result-object v3

    .line 1939
    if-eqz v3, :cond_72

    .line 1940
    .line 1941
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1942
    .line 1943
    .line 1944
    move-result-object v4

    .line 1945
    const-string v5, "[Hchat:Script] \u53d1\u9001\u6587\u5b57\u88c5\u9970\u5931\u8d25: "

    .line 1946
    .line 1947
    invoke-static {v5, v4, v3}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1948
    .line 1949
    .line 1950
    :cond_72
    instance-of v3, v0, Lsf/f;

    .line 1951
    .line 1952
    if-eqz v3, :cond_73

    .line 1953
    .line 1954
    goto :goto_42

    .line 1955
    :cond_73
    move-object v7, v0

    .line 1956
    :goto_42
    check-cast v7, Leb/h0;

    .line 1957
    .line 1958
    if-eqz v7, :cond_7b

    .line 1959
    .line 1960
    const-string v0, "hchat_send_text_decoration"

    .line 1961
    .line 1962
    invoke-virtual {v2, v0, v7}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setObjectExtra(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1963
    .line 1964
    .line 1965
    goto/16 :goto_46

    .line 1966
    .line 1967
    :cond_74
    const-string v0, ""

    .line 1968
    .line 1969
    invoke-static {v3}, Leb/m0;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1970
    .line 1971
    .line 1972
    move-result-object v4

    .line 1973
    if-eqz v4, :cond_79

    .line 1974
    .line 1975
    sget-object v5, Leb/m0;->a:Leb/m0;

    .line 1976
    .line 1977
    instance-of v5, v4, Landroid/widget/TextView;

    .line 1978
    .line 1979
    if-eqz v5, :cond_75

    .line 1980
    .line 1981
    check-cast v4, Landroid/widget/TextView;

    .line 1982
    .line 1983
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1984
    .line 1985
    .line 1986
    goto :goto_45

    .line 1987
    :cond_75
    invoke-static {v4}, Leb/m0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1988
    .line 1989
    .line 1990
    move-result-object v5

    .line 1991
    if-eqz v5, :cond_76

    .line 1992
    .line 1993
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1994
    .line 1995
    .line 1996
    move-result-object v6

    .line 1997
    goto :goto_43

    .line 1998
    :cond_76
    move-object v6, v7

    .line 1999
    :goto_43
    const-string v8, "clear"

    .line 2000
    .line 2001
    invoke-static {v6, v8}, Leb/m0;->e(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 2002
    .line 2003
    .line 2004
    move-result-object v6

    .line 2005
    if-eqz v5, :cond_77

    .line 2006
    .line 2007
    if-eqz v6, :cond_77

    .line 2008
    .line 2009
    const/4 v8, 0x0

    .line 2010
    new-array v0, v8, [Ljava/lang/Object;

    .line 2011
    .line 2012
    invoke-static {v6, v5, v0}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2013
    .line 2014
    .line 2015
    goto :goto_45

    .line 2016
    :cond_77
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2017
    .line 2018
    .line 2019
    move-result-object v5

    .line 2020
    const-class v6, Ljava/lang/CharSequence;

    .line 2021
    .line 2022
    invoke-static {v5, v6}, Leb/m0;->f(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 2023
    .line 2024
    .line 2025
    move-result-object v5

    .line 2026
    if-eqz v5, :cond_78

    .line 2027
    .line 2028
    goto :goto_44

    .line 2029
    :cond_78
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2030
    .line 2031
    .line 2032
    move-result-object v5

    .line 2033
    const-class v6, Ljava/lang/String;

    .line 2034
    .line 2035
    invoke-static {v5, v6}, Leb/m0;->f(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 2036
    .line 2037
    .line 2038
    move-result-object v5

    .line 2039
    :goto_44
    if-eqz v5, :cond_79

    .line 2040
    .line 2041
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 2042
    .line 2043
    .line 2044
    move-result-object v0

    .line 2045
    invoke-static {v5, v4, v0}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2046
    .line 2047
    .line 2048
    goto :goto_45

    .line 2049
    :cond_79
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2050
    .line 2051
    .line 2052
    move-result-object v4

    .line 2053
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2054
    .line 2055
    .line 2056
    move-result-object v5

    .line 2057
    invoke-static {v4, v5}, Leb/m0;->f(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 2058
    .line 2059
    .line 2060
    move-result-object v4

    .line 2061
    if-eqz v4, :cond_7a

    .line 2062
    .line 2063
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 2064
    .line 2065
    .line 2066
    move-result-object v0

    .line 2067
    invoke-static {v4, v3, v0}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2068
    .line 2069
    .line 2070
    :cond_7a
    :goto_45
    invoke-virtual {v2, v7}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 2071
    .line 2072
    .line 2073
    :cond_7b
    :goto_46
    return-void

    .line 2074
    :catchall_9
    move-exception v0

    .line 2075
    monitor-exit v5

    .line 2076
    throw v0

    .line 2077
    :catchall_a
    move-exception v0

    .line 2078
    monitor-exit v4

    .line 2079
    throw v0

    .line 2080
    :goto_47
    monitor-exit v4

    .line 2081
    throw v0

    .line 2082
    :pswitch_f
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2083
    .line 2084
    .line 2085
    iget-object v0, v1, Lb9/e;->b:Ljava/lang/Object;

    .line 2086
    .line 2087
    check-cast v0, Ljava/util/function/Function;

    .line 2088
    .line 2089
    invoke-interface {v0, v2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2090
    .line 2091
    .line 2092
    move-result-object v0

    .line 2093
    invoke-virtual {v2, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 2094
    .line 2095
    .line 2096
    return-void

    .line 2097
    :pswitch_10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2098
    .line 2099
    .line 2100
    iget-object v0, v1, Lb9/e;->b:Ljava/lang/Object;

    .line 2101
    .line 2102
    check-cast v0, Lea/c;

    .line 2103
    .line 2104
    iget-object v0, v0, Lea/c;->a:Ljava/lang/Object;

    .line 2105
    .line 2106
    check-cast v0, Lr8/g;

    .line 2107
    .line 2108
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 2109
    .line 2110
    const-string v3, "Hchat_fake_mini_program_base_lib_config"

    .line 2111
    .line 2112
    invoke-static {v0, v3}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 2113
    .line 2114
    .line 2115
    move-result-object v0

    .line 2116
    const-string v3, "fake_mini_program_base_lib_enable"

    .line 2117
    .line 2118
    const/4 v8, 0x0

    .line 2119
    invoke-interface {v0, v3, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 2120
    .line 2121
    .line 2122
    move-result v0

    .line 2123
    if-nez v0, :cond_7c

    .line 2124
    .line 2125
    goto :goto_48

    .line 2126
    :cond_7c
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2127
    .line 2128
    array-length v2, v0

    .line 2129
    const/4 v3, 0x6

    .line 2130
    if-gt v2, v3, :cond_7d

    .line 2131
    .line 2132
    goto :goto_48

    .line 2133
    :cond_7d
    const/16 v2, 0x270f

    .line 2134
    .line 2135
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2136
    .line 2137
    .line 2138
    move-result-object v2

    .line 2139
    aput-object v2, v0, v3

    .line 2140
    .line 2141
    :goto_48
    return-void

    .line 2142
    :pswitch_11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2143
    .line 2144
    .line 2145
    iget-object v0, v1, Lb9/e;->b:Ljava/lang/Object;

    .line 2146
    .line 2147
    check-cast v0, Lba/m;

    .line 2148
    .line 2149
    iget-object v2, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 2150
    .line 2151
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2152
    .line 2153
    .line 2154
    iget-object v3, v0, Lba/m;->l:Ljava/lang/ThreadLocal;

    .line 2155
    .line 2156
    if-eqz v2, :cond_7f

    .line 2157
    .line 2158
    array-length v4, v2

    .line 2159
    const/4 v8, 0x0

    .line 2160
    :goto_49
    if-ge v8, v4, :cond_7f

    .line 2161
    .line 2162
    aget-object v5, v2, v8

    .line 2163
    .line 2164
    if-eqz v5, :cond_7e

    .line 2165
    .line 2166
    invoke-virtual {v0, v5}, Lba/m;->f(Ljava/lang/Object;)Landroid/view/View;

    .line 2167
    .line 2168
    .line 2169
    move-result-object v6

    .line 2170
    if-eqz v6, :cond_7e

    .line 2171
    .line 2172
    goto :goto_4a

    .line 2173
    :cond_7e
    add-int/lit8 v8, v8, 0x1

    .line 2174
    .line 2175
    goto :goto_49

    .line 2176
    :cond_7f
    move-object v5, v7

    .line 2177
    :goto_4a
    if-eqz v5, :cond_80

    .line 2178
    .line 2179
    invoke-virtual {v0, v5}, Lba/m;->f(Ljava/lang/Object;)Landroid/view/View;

    .line 2180
    .line 2181
    .line 2182
    move-result-object v0

    .line 2183
    goto :goto_4b

    .line 2184
    :cond_80
    move-object v0, v7

    .line 2185
    :goto_4b
    if-eqz v0, :cond_81

    .line 2186
    .line 2187
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 2188
    .line 2189
    .line 2190
    move-result-object v2

    .line 2191
    if-eqz v2, :cond_81

    .line 2192
    .line 2193
    const-string v4, "com.tencent.mm.ui.chatting.viewitems."

    .line 2194
    .line 2195
    const/4 v8, 0x0

    .line 2196
    invoke-static {v4, v2, v8}, Leh/a;->z(Ljava/lang/String;Ljava/lang/Object;Z)Z

    .line 2197
    .line 2198
    .line 2199
    move-result v4

    .line 2200
    if-eqz v4, :cond_81

    .line 2201
    .line 2202
    goto :goto_4c

    .line 2203
    :cond_81
    move-object v2, v7

    .line 2204
    :goto_4c
    new-instance v4, Lba/h;

    .line 2205
    .line 2206
    invoke-direct {v4, v0, v2}, Lba/h;-><init>(Landroid/view/View;Ljava/lang/Object;)V

    .line 2207
    .line 2208
    .line 2209
    if-eqz v0, :cond_86

    .line 2210
    .line 2211
    const v2, 0x7f06003e

    .line 2212
    .line 2213
    .line 2214
    invoke-virtual {v0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 2215
    .line 2216
    .line 2217
    move-result-object v5

    .line 2218
    instance-of v6, v5, Landroid/view/View;

    .line 2219
    .line 2220
    if-eqz v6, :cond_82

    .line 2221
    .line 2222
    check-cast v5, Landroid/view/View;

    .line 2223
    .line 2224
    invoke-static {v5}, Lba/m;->x(Landroid/view/View;)V

    .line 2225
    .line 2226
    .line 2227
    goto :goto_4f

    .line 2228
    :cond_82
    instance-of v6, v5, Ljava/util/Collection;

    .line 2229
    .line 2230
    if-eqz v6, :cond_85

    .line 2231
    .line 2232
    check-cast v5, Ljava/lang/Iterable;

    .line 2233
    .line 2234
    new-instance v6, Ljava/util/ArrayList;

    .line 2235
    .line 2236
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 2237
    .line 2238
    .line 2239
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2240
    .line 2241
    .line 2242
    move-result-object v5

    .line 2243
    :cond_83
    :goto_4d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 2244
    .line 2245
    .line 2246
    move-result v8

    .line 2247
    if-eqz v8, :cond_84

    .line 2248
    .line 2249
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2250
    .line 2251
    .line 2252
    move-result-object v8

    .line 2253
    instance-of v9, v8, Landroid/view/View;

    .line 2254
    .line 2255
    if-eqz v9, :cond_83

    .line 2256
    .line 2257
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2258
    .line 2259
    .line 2260
    goto :goto_4d

    .line 2261
    :cond_84
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2262
    .line 2263
    .line 2264
    move-result-object v5

    .line 2265
    :goto_4e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 2266
    .line 2267
    .line 2268
    move-result v6

    .line 2269
    if-eqz v6, :cond_85

    .line 2270
    .line 2271
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2272
    .line 2273
    .line 2274
    move-result-object v6

    .line 2275
    check-cast v6, Landroid/view/View;

    .line 2276
    .line 2277
    invoke-static {v6}, Lba/m;->x(Landroid/view/View;)V

    .line 2278
    .line 2279
    .line 2280
    goto :goto_4e

    .line 2281
    :cond_85
    :goto_4f
    invoke-virtual {v0, v2, v7}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 2282
    .line 2283
    .line 2284
    :cond_86
    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 2285
    .line 2286
    .line 2287
    move-result-object v0

    .line 2288
    check-cast v0, Ljava/util/ArrayDeque;

    .line 2289
    .line 2290
    if-eqz v0, :cond_87

    .line 2291
    .line 2292
    goto :goto_50

    .line 2293
    :cond_87
    new-instance v0, Ljava/util/ArrayDeque;

    .line 2294
    .line 2295
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 2296
    .line 2297
    .line 2298
    invoke-virtual {v3, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 2299
    .line 2300
    .line 2301
    :goto_50
    invoke-virtual {v0, v4}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 2302
    .line 2303
    .line 2304
    return-void

    .line 2305
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_11
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_0
        :pswitch_c
        :pswitch_b
        :pswitch_0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
