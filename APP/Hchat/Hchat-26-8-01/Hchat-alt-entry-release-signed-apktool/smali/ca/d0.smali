.class public final Lca/d0;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lca/e0;


# direct methods
.method public synthetic constructor <init>(Lca/e0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lca/d0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lca/d0;->b:Lca/e0;

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
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v2, v1, Lca/d0;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    :pswitch_0
    invoke-super/range {p0 .. p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v2, v1, Lca/d0;->b:Lca/e0;

    .line 18
    .line 19
    iget-object v2, v2, Lca/e0;->e:Landroid/content/SharedPreferences;

    .line 20
    .line 21
    const-string v3, "message_forward_multi_moments_enable"

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    goto/16 :goto_2

    .line 31
    .line 32
    :cond_0
    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-static {v2}, Lk8/b;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    new-instance v3, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    :cond_1
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-eqz v6, :cond_2

    .line 52
    .line 53
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-static {v6}, Lca/e0;->i(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    if-eqz v6, :cond_1

    .line 62
    .line 63
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-nez v5, :cond_8

    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-ne v5, v2, :cond_8

    .line 82
    .line 83
    invoke-static {v3}, Lca/e0;->h(Ljava/util/ArrayList;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    if-eqz v2, :cond_3

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 91
    .line 92
    if-eqz v0, :cond_8

    .line 93
    .line 94
    invoke-static {v4, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    if-eqz v0, :cond_8

    .line 99
    .line 100
    const-string v2, "\u8f6c\u53d1\u5230\u670b\u53cb\u5708[H]"

    .line 101
    .line 102
    const-string v3, "f"

    .line 103
    .line 104
    const-string v5, "add"

    .line 105
    .line 106
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    const-string v6, "findItem"

    .line 111
    .line 112
    const v7, 0x48434d50    # 199989.25f

    .line 113
    .line 114
    .line 115
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    invoke-static {v0, v6, v8}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    if-eqz v6, :cond_4

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_4
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    filled-new-array {v4, v6, v4, v2}, [Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-static {v0, v5, v6}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    if-eqz v6, :cond_5

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_5
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    filled-new-array {v4, v6, v4, v2}, [Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    invoke-static {v0, v5, v4}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    :goto_1
    if-eqz v6, :cond_6

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_6
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    filled-new-array {v4, v2}, [Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    invoke-static {v0, v3, v4}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    if-eqz v4, :cond_7

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_7
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    filled-new-array {v4, v2}, [Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-static {v0, v3, v2}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    :cond_8
    :goto_2
    return-void

    .line 187
    :pswitch_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    iget-object v2, v1, Lca/d0;->b:Lca/e0;

    .line 191
    .line 192
    iget-object v3, v2, Lca/e0;->e:Landroid/content/SharedPreferences;

    .line 193
    .line 194
    const-string v4, "message_forward_favorite_enable"

    .line 195
    .line 196
    const/4 v5, 0x0

    .line 197
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    if-nez v3, :cond_9

    .line 202
    .line 203
    goto/16 :goto_7

    .line 204
    .line 205
    :cond_9
    iget-object v3, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 206
    .line 207
    if-eqz v3, :cond_10

    .line 208
    .line 209
    const/4 v4, 0x1

    .line 210
    invoke-static {v4, v3}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v6

    .line 214
    instance-of v7, v6, Landroid/view/View;

    .line 215
    .line 216
    const/4 v8, 0x0

    .line 217
    if-eqz v7, :cond_a

    .line 218
    .line 219
    check-cast v6, Landroid/view/View;

    .line 220
    .line 221
    goto :goto_3

    .line 222
    :cond_a
    move-object v6, v8

    .line 223
    :goto_3
    invoke-static {v6}, Lg4/a;->J(Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    if-eqz v6, :cond_b

    .line 228
    .line 229
    goto :goto_4

    .line 230
    :cond_b
    invoke-static {v3}, Lg4/a;->J(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v6

    .line 234
    if-eqz v6, :cond_c

    .line 235
    .line 236
    goto :goto_4

    .line 237
    :cond_c
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 238
    .line 239
    invoke-static {v0}, Lg4/a;->J(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    if-eqz v6, :cond_10

    .line 244
    .line 245
    :goto_4
    invoke-static {v6}, Lg4/a;->B(Ljava/lang/Object;)J

    .line 246
    .line 247
    .line 248
    move-result-wide v6

    .line 249
    const-wide/16 v9, 0x0

    .line 250
    .line 251
    cmp-long v0, v6, v9

    .line 252
    .line 253
    if-gtz v0, :cond_d

    .line 254
    .line 255
    goto :goto_7

    .line 256
    :cond_d
    invoke-static {v5, v3}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    if-eqz v0, :cond_10

    .line 261
    .line 262
    invoke-static {v4, v3}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    instance-of v4, v3, Landroid/view/View;

    .line 267
    .line 268
    if-eqz v4, :cond_e

    .line 269
    .line 270
    move-object v8, v3

    .line 271
    check-cast v8, Landroid/view/View;

    .line 272
    .line 273
    :cond_e
    invoke-static {v0}, Lca/e0;->m(Ljava/lang/Object;)I

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    const v4, 0x48434641    # 199961.02f

    .line 278
    .line 279
    .line 280
    invoke-static {v0, v8, v3, v4}, Lca/e0;->a(Ljava/lang/Object;Landroid/view/View;II)Landroid/view/MenuItem;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    if-eqz v0, :cond_10

    .line 285
    .line 286
    iget-object v3, v2, Lca/e0;->i:Ljava/util/Map;

    .line 287
    .line 288
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    monitor-enter v3

    .line 292
    :try_start_0
    iget-object v4, v2, Lca/e0;->i:Ljava/util/Map;

    .line 293
    .line 294
    invoke-interface {v4, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v4

    .line 298
    if-nez v4, :cond_f

    .line 299
    .line 300
    iget-object v4, v2, Lca/e0;->i:Ljava/util/Map;

    .line 301
    .line 302
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    check-cast v4, Ljava/util/Map;

    .line 306
    .line 307
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 308
    .line 309
    .line 310
    move-result-object v5

    .line 311
    invoke-interface {v4, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    iput-wide v6, v2, Lca/e0;->j:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 315
    .line 316
    goto :goto_5

    .line 317
    :catchall_0
    move-exception v0

    .line 318
    goto :goto_6

    .line 319
    :cond_f
    :goto_5
    monitor-exit v3

    .line 320
    goto :goto_7

    .line 321
    :goto_6
    monitor-exit v3

    .line 322
    throw v0

    .line 323
    :cond_10
    :goto_7
    return-void

    .line 324
    :pswitch_3
    const-string v2, "com.tencent.mm.storage."

    .line 325
    .line 326
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    iget-object v3, v1, Lca/d0;->b:Lca/e0;

    .line 330
    .line 331
    const-class v4, Ljava/lang/Object;

    .line 332
    .line 333
    iget-object v5, v3, Lca/e0;->g:Ljava/util/Map;

    .line 334
    .line 335
    invoke-interface {v5}, Ljava/util/Map;->clear()V

    .line 336
    .line 337
    .line 338
    iget-object v5, v3, Lca/e0;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 339
    .line 340
    invoke-virtual {v5}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 341
    .line 342
    .line 343
    iget-object v6, v3, Lca/e0;->e:Landroid/content/SharedPreferences;

    .line 344
    .line 345
    const-string v7, "message_forward_enable"

    .line 346
    .line 347
    const/4 v8, 0x0

    .line 348
    invoke-interface {v6, v7, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 349
    .line 350
    .line 351
    move-result v6

    .line 352
    if-nez v6, :cond_11

    .line 353
    .line 354
    goto/16 :goto_17

    .line 355
    .line 356
    :cond_11
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 357
    .line 358
    if-eqz v0, :cond_2c

    .line 359
    .line 360
    invoke-static {v8, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v6

    .line 364
    if-eqz v6, :cond_2c

    .line 365
    .line 366
    const/4 v7, 0x1

    .line 367
    invoke-static {v7, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    instance-of v9, v0, Landroid/view/View;

    .line 372
    .line 373
    if-eqz v9, :cond_12

    .line 374
    .line 375
    check-cast v0, Landroid/view/View;

    .line 376
    .line 377
    goto :goto_8

    .line 378
    :cond_12
    const/4 v0, 0x0

    .line 379
    :goto_8
    if-eqz v0, :cond_2c

    .line 380
    .line 381
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v9

    .line 385
    instance-of v11, v9, Landroid/view/View;

    .line 386
    .line 387
    if-eqz v11, :cond_13

    .line 388
    .line 389
    check-cast v9, Landroid/view/View;

    .line 390
    .line 391
    invoke-virtual {v9}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v9

    .line 395
    :cond_13
    if-nez v9, :cond_15

    .line 396
    .line 397
    :cond_14
    const/4 v9, 0x0

    .line 398
    goto/16 :goto_d

    .line 399
    .line 400
    :cond_15
    invoke-static {v2, v9, v8}, Leh/a;->z(Ljava/lang/String;Ljava/lang/Object;Z)Z

    .line 401
    .line 402
    .line 403
    move-result v11

    .line 404
    const-wide/16 v12, 0x0

    .line 405
    .line 406
    if-eqz v11, :cond_16

    .line 407
    .line 408
    invoke-virtual {v3, v9}, Lca/e0;->g(Ljava/lang/Object;)J

    .line 409
    .line 410
    .line 411
    move-result-wide v14

    .line 412
    cmp-long v11, v14, v12

    .line 413
    .line 414
    if-lez v11, :cond_16

    .line 415
    .line 416
    goto/16 :goto_d

    .line 417
    .line 418
    :cond_16
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 419
    .line 420
    .line 421
    move-result-object v11

    .line 422
    :goto_9
    if-eqz v11, :cond_1a

    .line 423
    .line 424
    invoke-virtual {v11, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    move-result v14

    .line 428
    if-nez v14, :cond_1a

    .line 429
    .line 430
    invoke-static {v11}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 431
    .line 432
    .line 433
    move-result-object v14

    .line 434
    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 435
    .line 436
    .line 437
    move-result-object v14

    .line 438
    :cond_17
    :goto_a
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 439
    .line 440
    .line 441
    move-result v15

    .line 442
    if-eqz v15, :cond_19

    .line 443
    .line 444
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v15

    .line 448
    check-cast v15, Ljava/lang/reflect/Field;

    .line 449
    .line 450
    invoke-static {v15}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    .line 451
    .line 452
    .line 453
    move-result v16

    .line 454
    if-nez v16, :cond_17

    .line 455
    .line 456
    invoke-virtual {v15}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    move-result-object v16

    .line 460
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v10

    .line 467
    invoke-static {v10, v2, v8}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 468
    .line 469
    .line 470
    move-result v10

    .line 471
    if-nez v10, :cond_18

    .line 472
    .line 473
    goto :goto_a

    .line 474
    :cond_18
    invoke-static {v15, v9}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v10

    .line 478
    if-eqz v10, :cond_17

    .line 479
    .line 480
    invoke-virtual {v3, v10}, Lca/e0;->g(Ljava/lang/Object;)J

    .line 481
    .line 482
    .line 483
    move-result-wide v15

    .line 484
    cmp-long v15, v15, v12

    .line 485
    .line 486
    if-lez v15, :cond_17

    .line 487
    .line 488
    move-object v9, v10

    .line 489
    goto :goto_d

    .line 490
    :cond_19
    invoke-virtual {v11}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    move-result-object v11

    .line 494
    goto :goto_9

    .line 495
    :cond_1a
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    move-result-object v10

    .line 499
    :goto_b
    if-eqz v10, :cond_14

    .line 500
    .line 501
    invoke-virtual {v10, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    move-result v11

    .line 505
    if-nez v11, :cond_14

    .line 506
    .line 507
    invoke-static {v10}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 508
    .line 509
    .line 510
    move-result-object v11

    .line 511
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 512
    .line 513
    .line 514
    move-result-object v11

    .line 515
    :cond_1b
    :goto_c
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 516
    .line 517
    .line 518
    move-result v14

    .line 519
    if-eqz v14, :cond_1d

    .line 520
    .line 521
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v14

    .line 525
    check-cast v14, Ljava/lang/reflect/Method;

    .line 526
    .line 527
    invoke-static {v14}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Method;)Z

    .line 528
    .line 529
    .line 530
    move-result v15

    .line 531
    if-nez v15, :cond_1b

    .line 532
    .line 533
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    move-result-object v15

    .line 537
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 538
    .line 539
    .line 540
    array-length v15, v15

    .line 541
    if-nez v15, :cond_1b

    .line 542
    .line 543
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    move-result-object v15

    .line 547
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object v15

    .line 554
    invoke-static {v15, v2, v8}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 555
    .line 556
    .line 557
    move-result v15

    .line 558
    if-nez v15, :cond_1c

    .line 559
    .line 560
    goto :goto_c

    .line 561
    :cond_1c
    new-array v15, v8, [Ljava/lang/Object;

    .line 562
    .line 563
    invoke-static {v14, v9, v15}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v14

    .line 567
    if-eqz v14, :cond_1b

    .line 568
    .line 569
    invoke-virtual {v3, v14}, Lca/e0;->g(Ljava/lang/Object;)J

    .line 570
    .line 571
    .line 572
    move-result-wide v15

    .line 573
    cmp-long v15, v15, v12

    .line 574
    .line 575
    if-lez v15, :cond_1b

    .line 576
    .line 577
    move-object v9, v14

    .line 578
    goto :goto_d

    .line 579
    :cond_1d
    invoke-virtual {v10}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 580
    .line 581
    .line 582
    move-result-object v10

    .line 583
    goto :goto_b

    .line 584
    :goto_d
    if-eqz v9, :cond_2c

    .line 585
    .line 586
    invoke-static {v9}, Lca/e0;->i(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 587
    .line 588
    .line 589
    move-result-object v2

    .line 590
    if-eqz v2, :cond_2c

    .line 591
    .line 592
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 593
    .line 594
    .line 595
    move-result v2

    .line 596
    sget-object v10, Lca/e0;->s:Ljava/util/Set;

    .line 597
    .line 598
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 599
    .line 600
    .line 601
    move-result-object v2

    .line 602
    invoke-interface {v10, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 603
    .line 604
    .line 605
    move-result v2

    .line 606
    if-ne v2, v7, :cond_2c

    .line 607
    .line 608
    invoke-static {v6}, Lca/e0;->m(Ljava/lang/Object;)I

    .line 609
    .line 610
    .line 611
    move-result v2

    .line 612
    const v10, 0x48434657    # 199961.36f

    .line 613
    .line 614
    .line 615
    invoke-static {v6, v0, v2, v10}, Lca/e0;->a(Ljava/lang/Object;Landroid/view/View;II)Landroid/view/MenuItem;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    if-eqz v0, :cond_2c

    .line 620
    .line 621
    new-instance v2, Lca/b0;

    .line 622
    .line 623
    invoke-direct {v2, v9}, Lca/b0;-><init>(Ljava/lang/Object;)V

    .line 624
    .line 625
    .line 626
    iget-object v3, v3, Lca/e0;->g:Ljava/util/Map;

    .line 627
    .line 628
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 629
    .line 630
    .line 631
    check-cast v3, Ljava/util/Map;

    .line 632
    .line 633
    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    invoke-interface {v0}, Landroid/view/MenuItem;->getGroupId()I

    .line 637
    .line 638
    .line 639
    move-result v3

    .line 640
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 641
    .line 642
    .line 643
    move-result-object v3

    .line 644
    invoke-virtual {v5, v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 648
    .line 649
    .line 650
    move-result-object v2

    .line 651
    :goto_e
    if-eqz v2, :cond_2c

    .line 652
    .line 653
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 654
    .line 655
    .line 656
    move-result v3

    .line 657
    if-nez v3, :cond_2c

    .line 658
    .line 659
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 660
    .line 661
    .line 662
    move-result-object v3

    .line 663
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 664
    .line 665
    .line 666
    move-result-object v3

    .line 667
    :cond_1e
    :goto_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 668
    .line 669
    .line 670
    move-result v5

    .line 671
    if-eqz v5, :cond_2b

    .line 672
    .line 673
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object v5

    .line 677
    check-cast v5, Ljava/lang/reflect/Field;

    .line 678
    .line 679
    const-class v9, Ljava/util/List;

    .line 680
    .line 681
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 682
    .line 683
    .line 684
    move-result-object v11

    .line 685
    invoke-virtual {v9, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 686
    .line 687
    .line 688
    move-result v9

    .line 689
    if-nez v9, :cond_1f

    .line 690
    .line 691
    goto :goto_f

    .line 692
    :cond_1f
    invoke-static {v5, v6}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object v5

    .line 696
    invoke-static {v5}, Lgg/x;->e(Ljava/lang/Object;)Z

    .line 697
    .line 698
    .line 699
    move-result v9

    .line 700
    if-eqz v9, :cond_20

    .line 701
    .line 702
    check-cast v5, Ljava/util/List;

    .line 703
    .line 704
    goto :goto_10

    .line 705
    :cond_20
    const/4 v5, 0x0

    .line 706
    :goto_10
    if-eqz v5, :cond_1e

    .line 707
    .line 708
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 709
    .line 710
    .line 711
    move-result-object v9

    .line 712
    move v11, v8

    .line 713
    :goto_11
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 714
    .line 715
    .line 716
    move-result v12

    .line 717
    const/4 v13, -0x1

    .line 718
    if-eqz v12, :cond_23

    .line 719
    .line 720
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v12

    .line 724
    if-eq v12, v0, :cond_24

    .line 725
    .line 726
    instance-of v14, v12, Landroid/view/MenuItem;

    .line 727
    .line 728
    if-eqz v14, :cond_21

    .line 729
    .line 730
    check-cast v12, Landroid/view/MenuItem;

    .line 731
    .line 732
    goto :goto_12

    .line 733
    :cond_21
    const/4 v12, 0x0

    .line 734
    :goto_12
    if-eqz v12, :cond_22

    .line 735
    .line 736
    invoke-interface {v12}, Landroid/view/MenuItem;->getItemId()I

    .line 737
    .line 738
    .line 739
    move-result v12

    .line 740
    if-ne v12, v10, :cond_22

    .line 741
    .line 742
    goto :goto_13

    .line 743
    :cond_22
    add-int/lit8 v11, v11, 0x1

    .line 744
    .line 745
    goto :goto_11

    .line 746
    :cond_23
    move v11, v13

    .line 747
    :cond_24
    :goto_13
    if-gez v11, :cond_25

    .line 748
    .line 749
    goto :goto_f

    .line 750
    :cond_25
    invoke-interface {v5, v11}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 751
    .line 752
    .line 753
    move-result-object v0

    .line 754
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 755
    .line 756
    .line 757
    move-result-object v2

    .line 758
    move v3, v8

    .line 759
    :goto_14
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 760
    .line 761
    .line 762
    move-result v4

    .line 763
    if-eqz v4, :cond_28

    .line 764
    .line 765
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 766
    .line 767
    .line 768
    move-result-object v4

    .line 769
    instance-of v6, v4, Landroid/view/MenuItem;

    .line 770
    .line 771
    if-eqz v6, :cond_26

    .line 772
    .line 773
    check-cast v4, Landroid/view/MenuItem;

    .line 774
    .line 775
    goto :goto_15

    .line 776
    :cond_26
    const/4 v4, 0x0

    .line 777
    :goto_15
    if-eqz v4, :cond_27

    .line 778
    .line 779
    invoke-interface {v4}, Landroid/view/MenuItem;->getItemId()I

    .line 780
    .line 781
    .line 782
    move-result v4

    .line 783
    const v6, 0x48435250    # 200009.25f

    .line 784
    .line 785
    .line 786
    if-ne v4, v6, :cond_27

    .line 787
    .line 788
    move v13, v3

    .line 789
    goto :goto_16

    .line 790
    :cond_27
    add-int/lit8 v3, v3, 0x1

    .line 791
    .line 792
    goto :goto_14

    .line 793
    :cond_28
    :goto_16
    if-ltz v13, :cond_29

    .line 794
    .line 795
    add-int/lit8 v8, v13, 0x1

    .line 796
    .line 797
    :cond_29
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 798
    .line 799
    .line 800
    move-result v2

    .line 801
    if-le v8, v2, :cond_2a

    .line 802
    .line 803
    move v8, v2

    .line 804
    :cond_2a
    invoke-interface {v5, v8, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 805
    .line 806
    .line 807
    goto :goto_17

    .line 808
    :cond_2b
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 809
    .line 810
    .line 811
    move-result-object v2

    .line 812
    goto/16 :goto_e

    .line 813
    .line 814
    :cond_2c
    :goto_17
    return-void

    .line 815
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 11

    .line 1
    iget v0, p0, Lca/d0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, Lca/d0;->b:Lca/e0;

    .line 14
    .line 15
    monitor-enter v3

    .line 16
    :try_start_0
    iget-object v0, v3, Lca/e0;->e:Landroid/content/SharedPreferences;

    .line 17
    .line 18
    const-string v1, "message_forward_favorite_enable"

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    monitor-exit v3

    .line 28
    goto/16 :goto_5

    .line 29
    .line 30
    :cond_0
    :try_start_1
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 31
    .line 32
    if-eqz v0, :cond_c

    .line 33
    .line 34
    array-length v1, v0

    .line 35
    :goto_0
    const/4 v4, 0x0

    .line 36
    if-ge v2, v1, :cond_3

    .line 37
    .line 38
    aget-object v5, v0, v2

    .line 39
    .line 40
    instance-of v6, v5, Landroid/view/MenuItem;

    .line 41
    .line 42
    if-eqz v6, :cond_1

    .line 43
    .line 44
    check-cast v5, Landroid/view/MenuItem;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    move-object p1, v0

    .line 49
    goto/16 :goto_6

    .line 50
    .line 51
    :cond_1
    move-object v5, v4

    .line 52
    :goto_1
    if-eqz v5, :cond_2

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    move-object v5, v4

    .line 59
    :goto_2
    if-eqz v5, :cond_c

    .line 60
    .line 61
    invoke-interface {v5}, Landroid/view/MenuItem;->getItemId()I

    .line 62
    .line 63
    .line 64
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    const v1, 0x48434641    # 199961.02f

    .line 66
    .line 67
    .line 68
    if-eq v0, v1, :cond_4

    .line 69
    .line 70
    monitor-exit v3

    .line 71
    goto/16 :goto_5

    .line 72
    .line 73
    :cond_4
    :try_start_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 74
    .line 75
    .line 76
    move-result-wide v0

    .line 77
    iget-object v2, v3, Lca/e0;->k:Ljava/lang/ref/WeakReference;

    .line 78
    .line 79
    if-eqz v2, :cond_5

    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, Landroid/view/MenuItem;

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_5
    move-object v2, v4

    .line 89
    :goto_3
    if-ne v2, v5, :cond_6

    .line 90
    .line 91
    iget-wide v6, v3, Lca/e0;->l:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 92
    .line 93
    sub-long v6, v0, v6

    .line 94
    .line 95
    const-wide/16 v8, 0x5dc

    .line 96
    .line 97
    cmp-long v2, v6, v8

    .line 98
    .line 99
    if-gez v2, :cond_6

    .line 100
    .line 101
    monitor-exit v3

    .line 102
    goto :goto_5

    .line 103
    :cond_6
    :try_start_3
    invoke-virtual {p1, v4}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-static {}, Lca/e0;->b()Landroid/app/Activity;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    if-eqz v2, :cond_b

    .line 111
    .line 112
    iget-object v6, v3, Lca/e0;->i:Ljava/util/Map;

    .line 113
    .line 114
    invoke-interface {v6, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    check-cast v6, Ljava/lang/Long;

    .line 119
    .line 120
    const-wide/16 v7, 0x0

    .line 121
    .line 122
    if-eqz v6, :cond_7

    .line 123
    .line 124
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 125
    .line 126
    .line 127
    move-result-wide v9

    .line 128
    goto :goto_4

    .line 129
    :cond_7
    iget-wide v9, v3, Lca/e0;->j:J

    .line 130
    .line 131
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    cmp-long v9, v9, v7

    .line 136
    .line 137
    if-lez v9, :cond_8

    .line 138
    .line 139
    move-object v4, v6

    .line 140
    :cond_8
    if-eqz v4, :cond_9

    .line 141
    .line 142
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 143
    .line 144
    .line 145
    move-result-wide v9

    .line 146
    goto :goto_4

    .line 147
    :cond_9
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 148
    .line 149
    invoke-static {p1}, Lg4/a;->J(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-static {p1}, Lg4/a;->B(Ljava/lang/Object;)J

    .line 154
    .line 155
    .line 156
    move-result-wide v9

    .line 157
    :goto_4
    iget-object p1, v3, Lca/e0;->i:Ljava/util/Map;

    .line 158
    .line 159
    invoke-interface {p1}, Ljava/util/Map;->clear()V

    .line 160
    .line 161
    .line 162
    iput-wide v7, v3, Lca/e0;->j:J

    .line 163
    .line 164
    cmp-long p1, v9, v7

    .line 165
    .line 166
    if-gtz p1, :cond_a

    .line 167
    .line 168
    const-string p1, "\u5f53\u524d\u6536\u85cf\u4e0d\u53ef\u7528"

    .line 169
    .line 170
    invoke-virtual {v3, v2, p1}, Lca/e0;->r(Landroid/app/Activity;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 171
    .line 172
    .line 173
    monitor-exit v3

    .line 174
    goto :goto_5

    .line 175
    :cond_a
    :try_start_4
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 176
    .line 177
    invoke-direct {p1, v5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    iput-object p1, v3, Lca/e0;->k:Ljava/lang/ref/WeakReference;

    .line 181
    .line 182
    iput-wide v0, v3, Lca/e0;->l:J

    .line 183
    .line 184
    iget-object p1, v3, Lca/e0;->d:Landroid/os/Handler;

    .line 185
    .line 186
    new-instance v1, Lca/r;

    .line 187
    .line 188
    const/4 v6, 0x0

    .line 189
    move-wide v4, v9

    .line 190
    invoke-direct/range {v1 .. v6}, Lca/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;JI)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 194
    .line 195
    .line 196
    monitor-exit v3

    .line 197
    goto :goto_5

    .line 198
    :cond_b
    monitor-exit v3

    .line 199
    goto :goto_5

    .line 200
    :cond_c
    monitor-exit v3

    .line 201
    :goto_5
    return-void

    .line 202
    :goto_6
    :try_start_5
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 203
    throw p1

    .line 204
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    iget-object v0, p0, Lca/d0;->b:Lca/e0;

    .line 208
    .line 209
    iget-object v1, v0, Lca/e0;->e:Landroid/content/SharedPreferences;

    .line 210
    .line 211
    iget-object v2, v0, Lca/e0;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 212
    .line 213
    iget-object v3, v0, Lca/e0;->g:Ljava/util/Map;

    .line 214
    .line 215
    const-string v4, "message_forward_enable"

    .line 216
    .line 217
    const/4 v5, 0x0

    .line 218
    invoke-interface {v1, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    if-nez v1, :cond_d

    .line 223
    .line 224
    goto/16 :goto_b

    .line 225
    .line 226
    :cond_d
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 227
    .line 228
    if-eqz p1, :cond_16

    .line 229
    .line 230
    array-length v1, p1

    .line 231
    :goto_7
    const/4 v4, 0x0

    .line 232
    if-ge v5, v1, :cond_10

    .line 233
    .line 234
    aget-object v6, p1, v5

    .line 235
    .line 236
    instance-of v7, v6, Landroid/view/MenuItem;

    .line 237
    .line 238
    if-eqz v7, :cond_e

    .line 239
    .line 240
    move-object v4, v6

    .line 241
    check-cast v4, Landroid/view/MenuItem;

    .line 242
    .line 243
    :cond_e
    if-eqz v4, :cond_f

    .line 244
    .line 245
    goto :goto_8

    .line 246
    :cond_f
    add-int/lit8 v5, v5, 0x1

    .line 247
    .line 248
    goto :goto_7

    .line 249
    :cond_10
    :goto_8
    if-eqz v4, :cond_16

    .line 250
    .line 251
    invoke-interface {v4}, Landroid/view/MenuItem;->getItemId()I

    .line 252
    .line 253
    .line 254
    move-result p1

    .line 255
    const v1, 0x48434657    # 199961.36f

    .line 256
    .line 257
    .line 258
    if-eq p1, v1, :cond_11

    .line 259
    .line 260
    goto :goto_b

    .line 261
    :cond_11
    invoke-interface {v3, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    check-cast p1, Lca/b0;

    .line 266
    .line 267
    if-eqz p1, :cond_12

    .line 268
    .line 269
    goto :goto_9

    .line 270
    :cond_12
    invoke-interface {v4}, Landroid/view/MenuItem;->getGroupId()I

    .line 271
    .line 272
    .line 273
    move-result p1

    .line 274
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    invoke-virtual {v2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    check-cast p1, Lca/b0;

    .line 283
    .line 284
    :goto_9
    invoke-interface {v3}, Ljava/util/Map;->clear()V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 288
    .line 289
    .line 290
    invoke-static {}, Lca/e0;->b()Landroid/app/Activity;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    if-eqz p1, :cond_15

    .line 295
    .line 296
    if-nez v1, :cond_13

    .line 297
    .line 298
    goto :goto_a

    .line 299
    :cond_13
    iget-object p1, p1, Lca/b0;->a:Ljava/lang/Object;

    .line 300
    .line 301
    invoke-static {p1}, Lx6/d;->y(Ljava/lang/Object;)Lhb/t;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    if-nez p1, :cond_14

    .line 306
    .line 307
    const-string p1, "\u8be5\u6d88\u606f\u6682\u4e0d\u652f\u6301\u8f6c\u53d1"

    .line 308
    .line 309
    invoke-virtual {v0, v1, p1}, Lca/e0;->r(Landroid/app/Activity;Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    goto :goto_b

    .line 313
    :cond_14
    iget-object v2, v0, Lca/e0;->d:Landroid/os/Handler;

    .line 314
    .line 315
    new-instance v3, Lac/l;

    .line 316
    .line 317
    const/4 v4, 0x7

    .line 318
    invoke-direct {v3, v1, v0, p1, v4}, Lac/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 322
    .line 323
    .line 324
    goto :goto_b

    .line 325
    :cond_15
    :goto_a
    const-string p1, "\u6d88\u606f\u4e0d\u53ef\u8f6c\u53d1"

    .line 326
    .line 327
    invoke-virtual {v0, v1, p1}, Lca/e0;->r(Landroid/app/Activity;Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    :cond_16
    :goto_b
    return-void

    .line 331
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
