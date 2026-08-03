.class public final Llb/h;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Llb/i;


# direct methods
.method public synthetic constructor <init>(Llb/i;I)V
    .locals 0

    .line 1
    iput p2, p0, Llb/h;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Llb/h;->b:Llb/i;

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
    .locals 14

    .line 1
    iget v0, p0, Llb/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

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
    iget-object v0, p0, Llb/h;->b:Llb/i;

    .line 14
    .line 15
    iget-object v0, v0, Llb/i;->o:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 22
    .line 23
    if-ne v0, p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Llb/h;->b:Llb/i;

    .line 26
    .line 27
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p1, Llb/i;->o:Ljava/lang/ref/WeakReference;

    .line 34
    .line 35
    :cond_0
    return-void

    .line 36
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 40
    .line 41
    instance-of v0, p1, Landroid/view/View;

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    iget-object v0, p0, Llb/h;->b:Llb/i;

    .line 46
    .line 47
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 48
    .line 49
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput-object v1, v0, Llb/i;->o:Ljava/lang/ref/WeakReference;

    .line 53
    .line 54
    :cond_1
    return-void

    .line 55
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Llb/h;->b:Llb/i;

    .line 59
    .line 60
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 61
    .line 62
    if-eqz v1, :cond_19

    .line 63
    .line 64
    array-length v2, v1

    .line 65
    const/4 v3, 0x2

    .line 66
    if-ge v2, v3, :cond_2

    .line 67
    .line 68
    goto/16 :goto_9

    .line 69
    .line 70
    :cond_2
    const/4 v2, 0x0

    .line 71
    aget-object v3, v1, v2

    .line 72
    .line 73
    if-eqz v3, :cond_19

    .line 74
    .line 75
    const/4 v4, 0x1

    .line 76
    aget-object v1, v1, v4

    .line 77
    .line 78
    instance-of v5, v1, Ljava/lang/Integer;

    .line 79
    .line 80
    const/4 v6, 0x0

    .line 81
    if-eqz v5, :cond_3

    .line 82
    .line 83
    check-cast v1, Ljava/lang/Integer;

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    move-object v1, v6

    .line 87
    :goto_0
    if-eqz v1, :cond_19

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 94
    .line 95
    if-eqz p1, :cond_19

    .line 96
    .line 97
    iget-object v7, v0, Llb/i;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 98
    .line 99
    if-gez v5, :cond_4

    .line 100
    .line 101
    move-object p1, v6

    .line 102
    goto/16 :goto_5

    .line 103
    .line 104
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    invoke-virtual {v7, v8}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    check-cast v8, Ljava/lang/reflect/Method;

    .line 113
    .line 114
    if-eqz v8, :cond_5

    .line 115
    .line 116
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-static {v8, p1, v1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    goto/16 :goto_5

    .line 125
    .line 126
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    :goto_1
    const-class v9, Ljava/lang/Object;

    .line 131
    .line 132
    if-eqz v8, :cond_b

    .line 133
    .line 134
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v10

    .line 138
    if-nez v10, :cond_b

    .line 139
    .line 140
    invoke-static {v8}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v9

    .line 144
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    :cond_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    if-eqz v10, :cond_8

    .line 153
    .line 154
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v10

    .line 158
    move-object v11, v10

    .line 159
    check-cast v11, Ljava/lang/reflect/Method;

    .line 160
    .line 161
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-result-object v12

    .line 165
    array-length v12, v12

    .line 166
    if-ne v12, v4, :cond_6

    .line 167
    .line 168
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    move-result-object v12

    .line 172
    aget-object v12, v12, v2

    .line 173
    .line 174
    sget-object v13, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 175
    .line 176
    invoke-static {v12, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v12

    .line 180
    if-nez v12, :cond_7

    .line 181
    .line 182
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    move-result-object v12

    .line 186
    aget-object v12, v12, v2

    .line 187
    .line 188
    invoke-static {v12, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v12

    .line 192
    if-eqz v12, :cond_6

    .line 193
    .line 194
    :cond_7
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v12

    .line 198
    const-string v13, "J0"

    .line 199
    .line 200
    invoke-static {v12, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v12

    .line 204
    if-nez v12, :cond_9

    .line 205
    .line 206
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v12

    .line 210
    const-string v13, "getItem"

    .line 211
    .line 212
    invoke-static {v12, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v12

    .line 216
    if-nez v12, :cond_9

    .line 217
    .line 218
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v11

    .line 222
    const-string v12, "get"

    .line 223
    .line 224
    invoke-static {v11, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v11

    .line 228
    if-eqz v11, :cond_6

    .line 229
    .line 230
    goto :goto_2

    .line 231
    :cond_8
    move-object v10, v6

    .line 232
    :cond_9
    :goto_2
    check-cast v10, Ljava/lang/reflect/Method;

    .line 233
    .line 234
    if-eqz v10, :cond_a

    .line 235
    .line 236
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    move-result-object v9

    .line 240
    invoke-virtual {v7, v9, v10}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v9

    .line 247
    invoke-static {v10, p1, v9}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v9

    .line 251
    if-eqz v9, :cond_a

    .line 252
    .line 253
    move-object p1, v9

    .line 254
    goto/16 :goto_5

    .line 255
    .line 256
    :cond_a
    invoke-virtual {v8}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    move-result-object v8

    .line 260
    goto/16 :goto_1

    .line 261
    .line 262
    :cond_b
    iget-object v1, v0, Llb/i;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 263
    .line 264
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    invoke-virtual {v1, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    check-cast v4, Ljava/lang/reflect/Field;

    .line 273
    .line 274
    if-eqz v4, :cond_c

    .line 275
    .line 276
    invoke-static {v4, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v4

    .line 280
    invoke-static {v5, v4}, Llb/i;->v(ILjava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    if-eqz v4, :cond_c

    .line 285
    .line 286
    move-object p1, v4

    .line 287
    goto/16 :goto_5

    .line 288
    .line 289
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    move-result-object v4

    .line 293
    :goto_3
    if-eqz v4, :cond_11

    .line 294
    .line 295
    invoke-virtual {v4, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v7

    .line 299
    if-nez v7, :cond_11

    .line 300
    .line 301
    invoke-static {v4}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 302
    .line 303
    .line 304
    move-result-object v7

    .line 305
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 306
    .line 307
    .line 308
    move-result-object v7

    .line 309
    :cond_d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 310
    .line 311
    .line 312
    move-result v8

    .line 313
    if-eqz v8, :cond_e

    .line 314
    .line 315
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v8

    .line 319
    move-object v10, v8

    .line 320
    check-cast v10, Ljava/lang/reflect/Field;

    .line 321
    .line 322
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v11

    .line 326
    const-string v12, "K"

    .line 327
    .line 328
    invoke-static {v11, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v11

    .line 332
    if-nez v11, :cond_f

    .line 333
    .line 334
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v11

    .line 338
    const-string v12, "items"

    .line 339
    .line 340
    invoke-static {v11, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v11

    .line 344
    if-nez v11, :cond_f

    .line 345
    .line 346
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v11

    .line 350
    const-string v12, "data"

    .line 351
    .line 352
    invoke-static {v11, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v11

    .line 356
    if-nez v11, :cond_f

    .line 357
    .line 358
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v10

    .line 362
    const-string v11, "list"

    .line 363
    .line 364
    invoke-static {v10, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v10

    .line 368
    if-eqz v10, :cond_d

    .line 369
    .line 370
    goto :goto_4

    .line 371
    :cond_e
    move-object v8, v6

    .line 372
    :cond_f
    :goto_4
    check-cast v8, Ljava/lang/reflect/Field;

    .line 373
    .line 374
    if-eqz v8, :cond_10

    .line 375
    .line 376
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    invoke-virtual {v1, v2, v8}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    invoke-static {v8, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object p1

    .line 387
    invoke-static {v5, p1}, Llb/i;->v(ILjava/lang/Object;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    goto :goto_5

    .line 392
    :cond_10
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    move-result-object v4

    .line 396
    goto :goto_3

    .line 397
    :cond_11
    new-instance v1, Ljava/util/WeakHashMap;

    .line 398
    .line 399
    invoke-direct {v1}, Ljava/util/WeakHashMap;-><init>()V

    .line 400
    .line 401
    .line 402
    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    check-cast v1, Ljava/util/Set;

    .line 410
    .line 411
    invoke-static {p1, v5, v1, v2}, Llb/i;->h(Ljava/lang/Object;ILjava/util/Set;I)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object p1

    .line 415
    :goto_5
    if-eqz p1, :cond_19

    .line 416
    .line 417
    invoke-static {p1}, Llb/i;->K(Ljava/lang/Object;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object p1

    .line 421
    if-eqz p1, :cond_19

    .line 422
    .line 423
    invoke-static {p1}, Llb/i;->x(Ljava/lang/Object;)J

    .line 424
    .line 425
    .line 426
    move-result-wide v1

    .line 427
    const-wide/16 v4, 0x0

    .line 428
    .line 429
    cmp-long v4, v1, v4

    .line 430
    .line 431
    if-gtz v4, :cond_12

    .line 432
    .line 433
    goto :goto_9

    .line 434
    :cond_12
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->chatPage()Lq8/m;

    .line 435
    .line 436
    .line 437
    move-result-object v4

    .line 438
    if-eqz v4, :cond_13

    .line 439
    .line 440
    invoke-virtual {v4}, Lq8/m;->a()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v4

    .line 444
    goto :goto_6

    .line 445
    :cond_13
    move-object v4, v6

    .line 446
    :goto_6
    if-nez v4, :cond_14

    .line 447
    .line 448
    const-string v4, ""

    .line 449
    .line 450
    :cond_14
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 451
    .line 452
    .line 453
    move-result v5

    .line 454
    if-nez v5, :cond_15

    .line 455
    .line 456
    goto :goto_9

    .line 457
    :cond_15
    const-string v5, "itemView"

    .line 458
    .line 459
    invoke-static {v3, v5}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v5

    .line 463
    instance-of v7, v5, Landroid/view/View;

    .line 464
    .line 465
    if-eqz v7, :cond_16

    .line 466
    .line 467
    check-cast v5, Landroid/view/View;

    .line 468
    .line 469
    goto :goto_7

    .line 470
    :cond_16
    move-object v5, v6

    .line 471
    :goto_7
    if-eqz v5, :cond_17

    .line 472
    .line 473
    move-object v6, v5

    .line 474
    goto :goto_8

    .line 475
    :cond_17
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    move-result-object v5

    .line 479
    invoke-virtual {v0, v5}, Llb/i;->i(Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 480
    .line 481
    .line 482
    move-result-object v5

    .line 483
    invoke-static {v5, v3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v3

    .line 487
    instance-of v5, v3, Landroid/view/View;

    .line 488
    .line 489
    if-eqz v5, :cond_18

    .line 490
    .line 491
    move-object v6, v3

    .line 492
    check-cast v6, Landroid/view/View;

    .line 493
    .line 494
    :cond_18
    :goto_8
    if-eqz v6, :cond_19

    .line 495
    .line 496
    invoke-static {v6}, Llb/i;->b(Landroid/view/View;)V

    .line 497
    .line 498
    .line 499
    iget-object v0, v0, Llb/i;->p:Ljava/util/Map;

    .line 500
    .line 501
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    check-cast v0, Ljava/util/Map;

    .line 505
    .line 506
    new-instance v3, Llb/c;

    .line 507
    .line 508
    invoke-direct {v3, v1, v2, v4, p1}, Llb/c;-><init>(JLjava/lang/String;Ljava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    invoke-interface {v0, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    :cond_19
    :goto_9
    return-void

    .line 515
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget v0, v1, Llb/h;->a:I

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-super/range {p0 .. p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    sget-object v3, Llb/f;->g:Llb/f;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 20
    .line 21
    instance-of v4, v0, Landroid/view/View;

    .line 22
    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    check-cast v0, Landroid/view/View;

    .line 26
    .line 27
    move-object v4, v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v4, 0x0

    .line 30
    :goto_0
    if-eqz v4, :cond_6b

    .line 31
    .line 32
    iget-object v0, v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-static {v6, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const/4 v0, 0x0

    .line 43
    :goto_1
    instance-of v7, v0, Landroid/view/MotionEvent;

    .line 44
    .line 45
    if-eqz v7, :cond_2

    .line 46
    .line 47
    check-cast v0, Landroid/view/MotionEvent;

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/4 v0, 0x0

    .line 51
    :goto_2
    if-eqz v0, :cond_6b

    .line 52
    .line 53
    iget-object v7, v1, Llb/h;->b:Llb/i;

    .line 54
    .line 55
    iget-object v8, v7, Llb/i;->a:Lr8/g;

    .line 56
    .line 57
    iget-object v8, v8, Lr8/g;->a:Landroid/content/Context;

    .line 58
    .line 59
    const-string v9, "Hchat_swipe_quote_config"

    .line 60
    .line 61
    invoke-static {v8, v9}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    const-string v10, "swipe_quote_enable"

    .line 66
    .line 67
    invoke-interface {v8, v10, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    const-string v11, "swipe_repeat_enable"

    .line 72
    .line 73
    if-nez v8, :cond_3

    .line 74
    .line 75
    iget-object v7, v7, Llb/i;->a:Lr8/g;

    .line 76
    .line 77
    iget-object v7, v7, Lr8/g;->a:Landroid/content/Context;

    .line 78
    .line 79
    invoke-static {v7, v9}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-interface {v7, v11, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    if-eqz v7, :cond_6b

    .line 88
    .line 89
    :cond_3
    iget-object v7, v1, Llb/h;->b:Llb/i;

    .line 90
    .line 91
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getX()F

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getY()F

    .line 96
    .line 97
    .line 98
    move-result v12

    .line 99
    instance-of v13, v4, Landroid/view/ViewGroup;

    .line 100
    .line 101
    if-eqz v13, :cond_4

    .line 102
    .line 103
    move-object v13, v4

    .line 104
    check-cast v13, Landroid/view/ViewGroup;

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_4
    const/4 v13, 0x0

    .line 108
    :goto_3
    const/4 v14, 0x1

    .line 109
    const/4 v15, -0x1

    .line 110
    if-eqz v13, :cond_8

    .line 111
    .line 112
    invoke-virtual {v13}, Landroid/view/ViewGroup;->getChildCount()I

    .line 113
    .line 114
    .line 115
    move-result v16

    .line 116
    add-int/lit8 v16, v16, -0x1

    .line 117
    .line 118
    move/from16 v5, v16

    .line 119
    .line 120
    :goto_4
    if-lt v15, v5, :cond_5

    .line 121
    .line 122
    goto :goto_6

    .line 123
    :cond_5
    invoke-virtual {v13, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    if-eqz v6, :cond_7

    .line 128
    .line 129
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    .line 130
    .line 131
    .line 132
    move-result v14

    .line 133
    int-to-float v14, v14

    .line 134
    cmpg-float v14, v8, v14

    .line 135
    .line 136
    if-ltz v14, :cond_7

    .line 137
    .line 138
    invoke-virtual {v6}, Landroid/view/View;->getRight()I

    .line 139
    .line 140
    .line 141
    move-result v14

    .line 142
    int-to-float v14, v14

    .line 143
    cmpl-float v14, v8, v14

    .line 144
    .line 145
    if-gtz v14, :cond_7

    .line 146
    .line 147
    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    .line 148
    .line 149
    .line 150
    move-result v14

    .line 151
    int-to-float v14, v14

    .line 152
    cmpg-float v14, v12, v14

    .line 153
    .line 154
    if-ltz v14, :cond_7

    .line 155
    .line 156
    invoke-virtual {v6}, Landroid/view/View;->getBottom()I

    .line 157
    .line 158
    .line 159
    move-result v14

    .line 160
    int-to-float v14, v14

    .line 161
    cmpl-float v14, v12, v14

    .line 162
    .line 163
    if-lez v14, :cond_6

    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_6
    invoke-virtual {v7, v6}, Llb/i;->j(Landroid/view/View;)Llb/c;

    .line 167
    .line 168
    .line 169
    move-result-object v14

    .line 170
    if-eqz v14, :cond_7

    .line 171
    .line 172
    new-instance v5, Llb/b;

    .line 173
    .line 174
    invoke-direct {v5, v6, v14}, Llb/b;-><init>(Landroid/view/View;Llb/c;)V

    .line 175
    .line 176
    .line 177
    goto :goto_7

    .line 178
    :cond_7
    :goto_5
    add-int/lit8 v5, v5, -0x1

    .line 179
    .line 180
    const/4 v6, 0x0

    .line 181
    const/4 v14, 0x1

    .line 182
    goto :goto_4

    .line 183
    :cond_8
    :goto_6
    const/4 v5, 0x0

    .line 184
    :goto_7
    iget-object v6, v1, Llb/h;->b:Llb/i;

    .line 185
    .line 186
    iget-object v7, v6, Llb/i;->q:Ljava/util/Map;

    .line 187
    .line 188
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    check-cast v7, Ljava/util/Map;

    .line 192
    .line 193
    invoke-interface {v7, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    if-nez v8, :cond_9

    .line 198
    .line 199
    new-instance v8, Llb/g;

    .line 200
    .line 201
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 202
    .line 203
    .line 204
    iput-object v3, v8, Llb/g;->e:Llb/f;

    .line 205
    .line 206
    iput v15, v8, Llb/g;->l:I

    .line 207
    .line 208
    invoke-interface {v7, v4, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    :cond_9
    check-cast v8, Llb/g;

    .line 212
    .line 213
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 214
    .line 215
    .line 216
    move-result v7

    .line 217
    const/4 v12, 0x2

    .line 218
    if-ne v7, v12, :cond_a

    .line 219
    .line 220
    iget-wide v13, v8, Llb/g;->k:J

    .line 221
    .line 222
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getEventTime()J

    .line 223
    .line 224
    .line 225
    move-result-wide v18

    .line 226
    cmp-long v7, v13, v18

    .line 227
    .line 228
    if-nez v7, :cond_a

    .line 229
    .line 230
    iget v7, v8, Llb/g;->l:I

    .line 231
    .line 232
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 233
    .line 234
    .line 235
    move-result v13

    .line 236
    if-ne v7, v13, :cond_a

    .line 237
    .line 238
    iget-boolean v6, v8, Llb/g;->g:Z

    .line 239
    .line 240
    goto/16 :goto_3a

    .line 241
    .line 242
    :cond_a
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getEventTime()J

    .line 243
    .line 244
    .line 245
    move-result-wide v13

    .line 246
    iput-wide v13, v8, Llb/g;->k:J

    .line 247
    .line 248
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    iput v7, v8, Llb/g;->l:I

    .line 253
    .line 254
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 255
    .line 256
    .line 257
    move-result v7

    .line 258
    if-eqz v7, :cond_6a

    .line 259
    .line 260
    const/4 v13, 0x3

    .line 261
    const/4 v14, 0x1

    .line 262
    if-eq v7, v14, :cond_27

    .line 263
    .line 264
    if-eq v7, v12, :cond_b

    .line 265
    .line 266
    if-eq v7, v13, :cond_27

    .line 267
    .line 268
    goto :goto_9

    .line 269
    :cond_b
    iget-boolean v7, v8, Llb/g;->f:Z

    .line 270
    .line 271
    if-nez v7, :cond_c

    .line 272
    .line 273
    goto :goto_9

    .line 274
    :cond_c
    iget-boolean v7, v8, Llb/g;->j:Z

    .line 275
    .line 276
    if-eqz v7, :cond_d

    .line 277
    .line 278
    goto/16 :goto_13

    .line 279
    .line 280
    :cond_d
    iget-object v7, v8, Llb/g;->c:Llb/b;

    .line 281
    .line 282
    if-eqz v7, :cond_e

    .line 283
    .line 284
    move-object v5, v7

    .line 285
    goto :goto_8

    .line 286
    :cond_e
    if-eqz v5, :cond_f

    .line 287
    .line 288
    :goto_8
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawX()F

    .line 289
    .line 290
    .line 291
    move-result v7

    .line 292
    iget v13, v8, Llb/g;->a:F

    .line 293
    .line 294
    sub-float/2addr v7, v13

    .line 295
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawY()F

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    iget v13, v8, Llb/g;->b:F

    .line 300
    .line 301
    sub-float/2addr v0, v13

    .line 302
    iget-object v13, v6, Llb/i;->a:Lr8/g;

    .line 303
    .line 304
    iget-object v13, v13, Lr8/g;->a:Landroid/content/Context;

    .line 305
    .line 306
    invoke-static {v13, v9}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 307
    .line 308
    .line 309
    move-result-object v13

    .line 310
    const/4 v14, 0x0

    .line 311
    invoke-interface {v13, v10, v14}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 312
    .line 313
    .line 314
    move-result v10

    .line 315
    iget-object v13, v6, Llb/i;->a:Lr8/g;

    .line 316
    .line 317
    iget-object v13, v13, Lr8/g;->a:Landroid/content/Context;

    .line 318
    .line 319
    invoke-static {v13, v9}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 320
    .line 321
    .line 322
    move-result-object v9

    .line 323
    invoke-interface {v9, v11, v14}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 324
    .line 325
    .line 326
    move-result v9

    .line 327
    iget-boolean v11, v8, Llb/g;->g:Z

    .line 328
    .line 329
    if-nez v11, :cond_10

    .line 330
    .line 331
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 332
    .line 333
    .line 334
    move-result v11

    .line 335
    const/high16 v13, 0x42000000    # 32.0f

    .line 336
    .line 337
    invoke-virtual {v6, v13}, Llb/i;->c(F)F

    .line 338
    .line 339
    .line 340
    move-result v13

    .line 341
    cmpl-float v11, v11, v13

    .line 342
    .line 343
    if-lez v11, :cond_10

    .line 344
    .line 345
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 346
    .line 347
    .line 348
    move-result v11

    .line 349
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 350
    .line 351
    .line 352
    move-result v13

    .line 353
    const v14, 0x3f99999a    # 1.2f

    .line 354
    .line 355
    .line 356
    mul-float/2addr v13, v14

    .line 357
    cmpl-float v11, v11, v13

    .line 358
    .line 359
    if-lez v11, :cond_10

    .line 360
    .line 361
    invoke-static {v8}, Llb/i;->I(Llb/g;)V

    .line 362
    .line 363
    .line 364
    const/4 v14, 0x0

    .line 365
    iput-boolean v14, v8, Llb/g;->f:Z

    .line 366
    .line 367
    :cond_f
    :goto_9
    const/4 v6, 0x0

    .line 368
    goto/16 :goto_3a

    .line 369
    .line 370
    :cond_10
    iget-boolean v11, v8, Llb/g;->g:Z

    .line 371
    .line 372
    const/4 v13, 0x0

    .line 373
    if-nez v11, :cond_16

    .line 374
    .line 375
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 376
    .line 377
    .line 378
    move-result v11

    .line 379
    const/high16 v14, 0x40c00000    # 6.0f

    .line 380
    .line 381
    invoke-virtual {v6, v14}, Llb/i;->c(F)F

    .line 382
    .line 383
    .line 384
    move-result v14

    .line 385
    cmpl-float v11, v11, v14

    .line 386
    .line 387
    if-lez v11, :cond_11

    .line 388
    .line 389
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 390
    .line 391
    .line 392
    move-result v11

    .line 393
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 394
    .line 395
    .line 396
    move-result v14

    .line 397
    const v15, 0x3f933333    # 1.15f

    .line 398
    .line 399
    .line 400
    mul-float/2addr v14, v15

    .line 401
    cmpl-float v11, v11, v14

    .line 402
    .line 403
    if-lez v11, :cond_11

    .line 404
    .line 405
    const/4 v11, 0x1

    .line 406
    goto :goto_a

    .line 407
    :cond_11
    const/4 v11, 0x0

    .line 408
    :goto_a
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 409
    .line 410
    .line 411
    move-result v14

    .line 412
    const/high16 v15, 0x41900000    # 18.0f

    .line 413
    .line 414
    invoke-virtual {v6, v15}, Llb/i;->c(F)F

    .line 415
    .line 416
    .line 417
    move-result v15

    .line 418
    cmpl-float v14, v14, v15

    .line 419
    .line 420
    if-lez v14, :cond_12

    .line 421
    .line 422
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 423
    .line 424
    .line 425
    move-result v14

    .line 426
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 427
    .line 428
    .line 429
    move-result v0

    .line 430
    const v15, 0x3faccccd    # 1.35f

    .line 431
    .line 432
    .line 433
    mul-float/2addr v0, v15

    .line 434
    cmpl-float v0, v14, v0

    .line 435
    .line 436
    if-lez v0, :cond_12

    .line 437
    .line 438
    const/4 v0, 0x1

    .line 439
    goto :goto_b

    .line 440
    :cond_12
    const/4 v0, 0x0

    .line 441
    :goto_b
    if-eqz v11, :cond_13

    .line 442
    .line 443
    cmpg-float v11, v7, v13

    .line 444
    .line 445
    if-gez v11, :cond_13

    .line 446
    .line 447
    if-eqz v10, :cond_13

    .line 448
    .line 449
    sget-object v0, Llb/f;->h:Llb/f;

    .line 450
    .line 451
    goto :goto_c

    .line 452
    :cond_13
    if-eqz v0, :cond_14

    .line 453
    .line 454
    cmpl-float v0, v7, v13

    .line 455
    .line 456
    if-lez v0, :cond_14

    .line 457
    .line 458
    if-eqz v9, :cond_14

    .line 459
    .line 460
    sget-object v0, Llb/f;->i:Llb/f;

    .line 461
    .line 462
    goto :goto_c

    .line 463
    :cond_14
    move-object v0, v3

    .line 464
    :goto_c
    if-ne v0, v3, :cond_15

    .line 465
    .line 466
    goto :goto_9

    .line 467
    :cond_15
    iput-object v0, v8, Llb/g;->e:Llb/f;

    .line 468
    .line 469
    const/4 v14, 0x1

    .line 470
    iput-boolean v14, v8, Llb/g;->g:Z

    .line 471
    .line 472
    goto :goto_d

    .line 473
    :cond_16
    const/4 v14, 0x1

    .line 474
    :goto_d
    iget-object v0, v8, Llb/g;->e:Llb/f;

    .line 475
    .line 476
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 477
    .line 478
    .line 479
    move-result v0

    .line 480
    if-eqz v0, :cond_f

    .line 481
    .line 482
    if-eq v0, v14, :cond_18

    .line 483
    .line 484
    if-ne v0, v12, :cond_17

    .line 485
    .line 486
    cmpg-float v0, v7, v13

    .line 487
    .line 488
    if-gez v0, :cond_1a

    .line 489
    .line 490
    :goto_e
    move v7, v13

    .line 491
    goto :goto_f

    .line 492
    :cond_17
    invoke-static {}, Lokio/a;->k()V

    .line 493
    .line 494
    .line 495
    goto/16 :goto_3b

    .line 496
    .line 497
    :cond_18
    neg-float v0, v7

    .line 498
    cmpg-float v3, v0, v13

    .line 499
    .line 500
    if-gez v3, :cond_19

    .line 501
    .line 502
    goto :goto_e

    .line 503
    :cond_19
    move v7, v0

    .line 504
    :cond_1a
    :goto_f
    const/high16 v0, 0x43160000    # 150.0f

    .line 505
    .line 506
    invoke-virtual {v6, v0}, Llb/i;->c(F)F

    .line 507
    .line 508
    .line 509
    move-result v0

    .line 510
    cmpl-float v3, v7, v0

    .line 511
    .line 512
    if-lez v3, :cond_1b

    .line 513
    .line 514
    move v7, v0

    .line 515
    :cond_1b
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    const/4 v14, 0x1

    .line 520
    if-eqz v0, :cond_1c

    .line 521
    .line 522
    invoke-interface {v0, v14}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 523
    .line 524
    .line 525
    :cond_1c
    iget-object v0, v8, Llb/g;->e:Llb/f;

    .line 526
    .line 527
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 528
    .line 529
    .line 530
    move-result v0

    .line 531
    if-eqz v0, :cond_1f

    .line 532
    .line 533
    if-eq v0, v14, :cond_1e

    .line 534
    .line 535
    if-ne v0, v12, :cond_1d

    .line 536
    .line 537
    const/high16 v0, 0x42b80000    # 92.0f

    .line 538
    .line 539
    invoke-virtual {v6, v0}, Llb/i;->c(F)F

    .line 540
    .line 541
    .line 542
    move-result v0

    .line 543
    goto :goto_10

    .line 544
    :cond_1d
    invoke-static {}, Lokio/a;->k()V

    .line 545
    .line 546
    .line 547
    goto/16 :goto_3b

    .line 548
    .line 549
    :cond_1e
    const/high16 v0, 0x42500000    # 52.0f

    .line 550
    .line 551
    invoke-virtual {v6, v0}, Llb/i;->c(F)F

    .line 552
    .line 553
    .line 554
    move-result v0

    .line 555
    goto :goto_10

    .line 556
    :cond_1f
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 557
    .line 558
    .line 559
    :goto_10
    cmpl-float v0, v7, v0

    .line 560
    .line 561
    if-ltz v0, :cond_20

    .line 562
    .line 563
    const/4 v0, 0x1

    .line 564
    goto :goto_11

    .line 565
    :cond_20
    const/4 v0, 0x0

    .line 566
    :goto_11
    iput-boolean v0, v8, Llb/g;->h:Z

    .line 567
    .line 568
    iget-object v0, v5, Llb/b;->a:Landroid/view/View;

    .line 569
    .line 570
    iget-object v3, v8, Llb/g;->d:Landroid/view/View;

    .line 571
    .line 572
    if-eq v3, v0, :cond_21

    .line 573
    .line 574
    invoke-static {v8}, Llb/i;->I(Llb/g;)V

    .line 575
    .line 576
    .line 577
    iput-object v0, v8, Llb/g;->d:Landroid/view/View;

    .line 578
    .line 579
    invoke-static {v0}, Llb/i;->b(Landroid/view/View;)V

    .line 580
    .line 581
    .line 582
    :cond_21
    const/high16 v3, 0x43040000    # 132.0f

    .line 583
    .line 584
    invoke-virtual {v6, v3}, Llb/i;->c(F)F

    .line 585
    .line 586
    .line 587
    move-result v3

    .line 588
    cmpl-float v5, v7, v3

    .line 589
    .line 590
    if-lez v5, :cond_22

    .line 591
    .line 592
    move v7, v3

    .line 593
    :cond_22
    iget-object v5, v8, Llb/g;->e:Llb/f;

    .line 594
    .line 595
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 596
    .line 597
    .line 598
    move-result v5

    .line 599
    if-eqz v5, :cond_25

    .line 600
    .line 601
    const/4 v14, 0x1

    .line 602
    if-eq v5, v14, :cond_24

    .line 603
    .line 604
    if-ne v5, v12, :cond_23

    .line 605
    .line 606
    add-float v5, v13, v7

    .line 607
    .line 608
    goto :goto_12

    .line 609
    :cond_23
    invoke-static {}, Lokio/a;->k()V

    .line 610
    .line 611
    .line 612
    goto/16 :goto_3b

    .line 613
    .line 614
    :cond_24
    sub-float v5, v13, v7

    .line 615
    .line 616
    goto :goto_12

    .line 617
    :cond_25
    move v5, v13

    .line 618
    :goto_12
    invoke-virtual {v0, v5}, Landroid/view/View;->setTranslationX(F)V

    .line 619
    .line 620
    .line 621
    div-float/2addr v7, v3

    .line 622
    const/high16 v3, 0x3f800000    # 1.0f

    .line 623
    .line 624
    invoke-static {v7, v13, v3}, Lr9/e0;->q(FFF)F

    .line 625
    .line 626
    .line 627
    move-result v5

    .line 628
    const v6, 0x3d8f5c29    # 0.07f

    .line 629
    .line 630
    .line 631
    mul-float/2addr v5, v6

    .line 632
    sub-float/2addr v3, v5

    .line 633
    invoke-virtual {v0, v3}, Landroid/view/View;->setAlpha(F)V

    .line 634
    .line 635
    .line 636
    iget-boolean v0, v8, Llb/g;->h:Z

    .line 637
    .line 638
    if-eqz v0, :cond_26

    .line 639
    .line 640
    iget-boolean v0, v8, Llb/g;->i:Z

    .line 641
    .line 642
    if-nez v0, :cond_26

    .line 643
    .line 644
    const/4 v0, 0x4

    .line 645
    invoke-virtual {v4, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 646
    .line 647
    .line 648
    const/4 v14, 0x1

    .line 649
    iput-boolean v14, v8, Llb/g;->i:Z

    .line 650
    .line 651
    :cond_26
    :goto_13
    const/4 v6, 0x1

    .line 652
    goto/16 :goto_3a

    .line 653
    .line 654
    :cond_27
    iget-object v7, v8, Llb/g;->c:Llb/b;

    .line 655
    .line 656
    if-eqz v7, :cond_28

    .line 657
    .line 658
    move-object v5, v7

    .line 659
    :cond_28
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 660
    .line 661
    .line 662
    move-result v0

    .line 663
    const/4 v14, 0x1

    .line 664
    if-ne v0, v14, :cond_65

    .line 665
    .line 666
    iget-boolean v0, v8, Llb/g;->h:Z

    .line 667
    .line 668
    if-eqz v0, :cond_65

    .line 669
    .line 670
    if-eqz v5, :cond_65

    .line 671
    .line 672
    iget-object v0, v8, Llb/g;->e:Llb/f;

    .line 673
    .line 674
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 675
    .line 676
    .line 677
    move-result v0

    .line 678
    if-eqz v0, :cond_65

    .line 679
    .line 680
    if-eq v0, v14, :cond_2a

    .line 681
    .line 682
    if-ne v0, v12, :cond_29

    .line 683
    .line 684
    iget-object v0, v5, Llb/b;->b:Llb/c;

    .line 685
    .line 686
    invoke-virtual {v6, v0}, Llb/i;->F(Llb/c;)Z

    .line 687
    .line 688
    .line 689
    move-result v0

    .line 690
    move v14, v0

    .line 691
    move-object/from16 v22, v3

    .line 692
    .line 693
    move-object/from16 v23, v4

    .line 694
    .line 695
    goto/16 :goto_37

    .line 696
    .line 697
    :cond_29
    invoke-static {}, Lokio/a;->k()V

    .line 698
    .line 699
    .line 700
    goto/16 :goto_3b

    .line 701
    .line 702
    :cond_2a
    iget-object v0, v5, Llb/b;->a:Landroid/view/View;

    .line 703
    .line 704
    iget-object v5, v5, Llb/b;->b:Llb/c;

    .line 705
    .line 706
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->chatPage()Lq8/m;

    .line 707
    .line 708
    .line 709
    move-result-object v7

    .line 710
    if-eqz v7, :cond_2b

    .line 711
    .line 712
    invoke-virtual {v7}, Lq8/m;->a()Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object v7

    .line 716
    goto :goto_14

    .line 717
    :cond_2b
    const/4 v7, 0x0

    .line 718
    :goto_14
    const-string v9, ""

    .line 719
    .line 720
    if-nez v7, :cond_2c

    .line 721
    .line 722
    move-object v7, v9

    .line 723
    :cond_2c
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 724
    .line 725
    .line 726
    move-result v10

    .line 727
    if-nez v10, :cond_2d

    .line 728
    .line 729
    goto :goto_15

    .line 730
    :cond_2d
    iget-object v10, v5, Llb/c;->a:Ljava/lang/String;

    .line 731
    .line 732
    invoke-virtual {v7, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 733
    .line 734
    .line 735
    move-result v10

    .line 736
    if-nez v10, :cond_30

    .line 737
    .line 738
    :cond_2e
    :goto_15
    move-object/from16 v22, v3

    .line 739
    .line 740
    move-object/from16 v23, v4

    .line 741
    .line 742
    :cond_2f
    const/4 v0, 0x0

    .line 743
    goto/16 :goto_36

    .line 744
    .line 745
    :cond_30
    iget-object v10, v6, Llb/i;->o:Ljava/lang/ref/WeakReference;

    .line 746
    .line 747
    invoke-virtual {v10}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object v10

    .line 751
    instance-of v11, v10, Landroid/view/View;

    .line 752
    .line 753
    if-eqz v11, :cond_31

    .line 754
    .line 755
    move-object v11, v10

    .line 756
    check-cast v11, Landroid/view/View;

    .line 757
    .line 758
    invoke-virtual {v11}, Landroid/view/View;->isAttachedToWindow()Z

    .line 759
    .line 760
    .line 761
    move-result v11

    .line 762
    if-eqz v11, :cond_31

    .line 763
    .line 764
    goto :goto_19

    .line 765
    :cond_31
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 766
    .line 767
    .line 768
    move-result-object v0

    .line 769
    if-eqz v0, :cond_32

    .line 770
    .line 771
    invoke-virtual {v6, v0}, Llb/i;->d(Landroid/view/View;)Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    if-eqz v0, :cond_32

    .line 776
    .line 777
    :goto_16
    move-object v10, v0

    .line 778
    goto :goto_19

    .line 779
    :cond_32
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    if-eqz v0, :cond_33

    .line 784
    .line 785
    invoke-virtual {v0}, Lq8/o;->a()Landroid/app/Activity;

    .line 786
    .line 787
    .line 788
    move-result-object v0

    .line 789
    goto :goto_17

    .line 790
    :cond_33
    const/4 v0, 0x0

    .line 791
    :goto_17
    if-eqz v0, :cond_34

    .line 792
    .line 793
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    if-eqz v0, :cond_34

    .line 798
    .line 799
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 800
    .line 801
    .line 802
    move-result-object v0

    .line 803
    goto :goto_18

    .line 804
    :cond_34
    const/4 v0, 0x0

    .line 805
    :goto_18
    if-eqz v0, :cond_35

    .line 806
    .line 807
    invoke-virtual {v6, v0}, Llb/i;->d(Landroid/view/View;)Ljava/lang/Object;

    .line 808
    .line 809
    .line 810
    move-result-object v0

    .line 811
    if-eqz v0, :cond_35

    .line 812
    .line 813
    goto :goto_16

    .line 814
    :cond_35
    const/4 v10, 0x0

    .line 815
    :goto_19
    if-eqz v10, :cond_2e

    .line 816
    .line 817
    iget-object v0, v5, Llb/c;->c:Ljava/lang/Object;

    .line 818
    .line 819
    iget-object v11, v6, Llb/i;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 820
    .line 821
    new-instance v14, Ljava/util/ArrayList;

    .line 822
    .line 823
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 824
    .line 825
    .line 826
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 827
    .line 828
    .line 829
    invoke-static {v0}, Llb/i;->x(Ljava/lang/Object;)J

    .line 830
    .line 831
    .line 832
    move-result-wide v18

    .line 833
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 834
    .line 835
    .line 836
    move-result-object v15

    .line 837
    move/from16 v20, v12

    .line 838
    .line 839
    :goto_1a
    const-class v12, Ljava/lang/Object;

    .line 840
    .line 841
    if-eqz v15, :cond_3e

    .line 842
    .line 843
    invoke-virtual {v15, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 844
    .line 845
    .line 846
    move-result v21

    .line 847
    if-nez v21, :cond_3e

    .line 848
    .line 849
    invoke-static {v15}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 850
    .line 851
    .line 852
    move-result-object v12

    .line 853
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 854
    .line 855
    .line 856
    move-result-object v12

    .line 857
    :goto_1b
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 858
    .line 859
    .line 860
    move-result v21

    .line 861
    if-eqz v21, :cond_3d

    .line 862
    .line 863
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 864
    .line 865
    .line 866
    move-result-object v21

    .line 867
    move-object/from16 v13, v21

    .line 868
    .line 869
    check-cast v13, Ljava/lang/reflect/Field;

    .line 870
    .line 871
    invoke-static {v13, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 872
    .line 873
    .line 874
    move-result-object v13

    .line 875
    if-eqz v13, :cond_3c

    .line 876
    .line 877
    if-eq v13, v0, :cond_3b

    .line 878
    .line 879
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 880
    .line 881
    .line 882
    move-result v21

    .line 883
    if-eqz v21, :cond_37

    .line 884
    .line 885
    :cond_36
    move-object/from16 v22, v0

    .line 886
    .line 887
    goto :goto_1d

    .line 888
    :cond_37
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 889
    .line 890
    .line 891
    move-result-object v21

    .line 892
    :goto_1c
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    .line 893
    .line 894
    .line 895
    move-result v22

    .line 896
    if-eqz v22, :cond_36

    .line 897
    .line 898
    move-object/from16 v22, v0

    .line 899
    .line 900
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 901
    .line 902
    .line 903
    move-result-object v0

    .line 904
    if-ne v0, v13, :cond_38

    .line 905
    .line 906
    goto :goto_1e

    .line 907
    :cond_38
    move-object/from16 v0, v22

    .line 908
    .line 909
    goto :goto_1c

    .line 910
    :goto_1d
    const-string v0, "com.tencent.mm.storage."

    .line 911
    .line 912
    const/4 v1, 0x0

    .line 913
    invoke-static {v0, v13, v1}, Leh/a;->z(Ljava/lang/String;Ljava/lang/Object;Z)Z

    .line 914
    .line 915
    .line 916
    move-result v0

    .line 917
    const-wide/16 v23, 0x0

    .line 918
    .line 919
    if-nez v0, :cond_39

    .line 920
    .line 921
    cmp-long v0, v18, v23

    .line 922
    .line 923
    if-gtz v0, :cond_39

    .line 924
    .line 925
    :goto_1e
    move-object/from16 v1, p0

    .line 926
    .line 927
    move-object/from16 v0, v22

    .line 928
    .line 929
    :goto_1f
    const/4 v13, 0x3

    .line 930
    goto :goto_1b

    .line 931
    :cond_39
    cmp-long v0, v18, v23

    .line 932
    .line 933
    if-lez v0, :cond_3a

    .line 934
    .line 935
    invoke-static {v13}, Llb/i;->x(Ljava/lang/Object;)J

    .line 936
    .line 937
    .line 938
    move-result-wide v0

    .line 939
    cmp-long v0, v0, v18

    .line 940
    .line 941
    if-eqz v0, :cond_3a

    .line 942
    .line 943
    goto :goto_1e

    .line 944
    :cond_3a
    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 945
    .line 946
    .line 947
    goto :goto_1e

    .line 948
    :cond_3b
    move-object/from16 v22, v0

    .line 949
    .line 950
    goto :goto_1e

    .line 951
    :cond_3c
    move-object/from16 v1, p0

    .line 952
    .line 953
    goto :goto_1f

    .line 954
    :cond_3d
    move-object/from16 v22, v0

    .line 955
    .line 956
    invoke-virtual {v15}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 957
    .line 958
    .line 959
    move-result-object v15

    .line 960
    move-object/from16 v1, p0

    .line 961
    .line 962
    const/4 v13, 0x3

    .line 963
    goto :goto_1a

    .line 964
    :cond_3e
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 965
    .line 966
    .line 967
    move-result-object v0

    .line 968
    :goto_20
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 969
    .line 970
    .line 971
    move-result v1

    .line 972
    sget-object v13, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 973
    .line 974
    if-eqz v1, :cond_4d

    .line 975
    .line 976
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 977
    .line 978
    .line 979
    move-result-object v1

    .line 980
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 981
    .line 982
    .line 983
    move-result-object v14

    .line 984
    invoke-virtual {v11, v14}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 985
    .line 986
    .line 987
    move-result-object v15

    .line 988
    check-cast v15, Ljava/lang/reflect/Method;

    .line 989
    .line 990
    if-eqz v15, :cond_42

    .line 991
    .line 992
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 993
    .line 994
    .line 995
    move-result-object v18

    .line 996
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 997
    .line 998
    .line 999
    invoke-static/range {v18 .. v18}, Ltf/l;->z0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v18

    .line 1003
    move-object/from16 v19, v0

    .line 1004
    .line 1005
    move-object/from16 v0, v18

    .line 1006
    .line 1007
    check-cast v0, Ljava/lang/Class;

    .line 1008
    .line 1009
    if-eqz v0, :cond_3f

    .line 1010
    .line 1011
    if-nez v1, :cond_40

    .line 1012
    .line 1013
    :cond_3f
    move-object/from16 v18, v1

    .line 1014
    .line 1015
    goto :goto_21

    .line 1016
    :cond_40
    move-object/from16 v18, v1

    .line 1017
    .line 1018
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v1

    .line 1022
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1023
    .line 1024
    .line 1025
    move-result v0

    .line 1026
    goto :goto_22

    .line 1027
    :goto_21
    const/4 v0, 0x0

    .line 1028
    :goto_22
    if-eqz v0, :cond_41

    .line 1029
    .line 1030
    goto :goto_23

    .line 1031
    :cond_41
    const/4 v15, 0x0

    .line 1032
    :goto_23
    if-eqz v15, :cond_43

    .line 1033
    .line 1034
    move-object/from16 v23, v4

    .line 1035
    .line 1036
    move-object v0, v15

    .line 1037
    goto/16 :goto_28

    .line 1038
    .line 1039
    :cond_42
    move-object/from16 v19, v0

    .line 1040
    .line 1041
    move-object/from16 v18, v1

    .line 1042
    .line 1043
    :cond_43
    move-object v0, v14

    .line 1044
    :goto_24
    if-eqz v0, :cond_49

    .line 1045
    .line 1046
    invoke-virtual {v0, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1047
    .line 1048
    .line 1049
    move-result v1

    .line 1050
    if-nez v1, :cond_49

    .line 1051
    .line 1052
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v1

    .line 1056
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v1

    .line 1060
    :goto_25
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1061
    .line 1062
    .line 1063
    move-result v15

    .line 1064
    if-eqz v15, :cond_48

    .line 1065
    .line 1066
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v15

    .line 1070
    check-cast v15, Ljava/lang/reflect/Method;

    .line 1071
    .line 1072
    move-object/from16 v21, v0

    .line 1073
    .line 1074
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v0

    .line 1078
    move-object/from16 v22, v1

    .line 1079
    .line 1080
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v1

    .line 1084
    invoke-static {v1, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1085
    .line 1086
    .line 1087
    move-result v1

    .line 1088
    if-eqz v1, :cond_46

    .line 1089
    .line 1090
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 1091
    .line 1092
    .line 1093
    move-result v1

    .line 1094
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1095
    .line 1096
    .line 1097
    move-result v1

    .line 1098
    if-nez v1, :cond_46

    .line 1099
    .line 1100
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v1

    .line 1104
    move-object/from16 v23, v4

    .line 1105
    .line 1106
    const-string v4, "setLastQuoteMsgInfo"

    .line 1107
    .line 1108
    invoke-static {v1, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1109
    .line 1110
    .line 1111
    move-result v1

    .line 1112
    if-eqz v1, :cond_47

    .line 1113
    .line 1114
    array-length v1, v0

    .line 1115
    const/4 v4, 0x1

    .line 1116
    if-ne v1, v4, :cond_47

    .line 1117
    .line 1118
    const/16 v16, 0x0

    .line 1119
    .line 1120
    aget-object v0, v0, v16

    .line 1121
    .line 1122
    if-eqz v0, :cond_45

    .line 1123
    .line 1124
    if-nez v18, :cond_44

    .line 1125
    .line 1126
    goto :goto_26

    .line 1127
    :cond_44
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v1

    .line 1131
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1132
    .line 1133
    .line 1134
    move-result v0

    .line 1135
    goto :goto_27

    .line 1136
    :cond_45
    :goto_26
    const/4 v0, 0x0

    .line 1137
    :goto_27
    if-eqz v0, :cond_47

    .line 1138
    .line 1139
    invoke-static {v15}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v0

    .line 1143
    if-eqz v0, :cond_4a

    .line 1144
    .line 1145
    invoke-virtual {v11, v14, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1146
    .line 1147
    .line 1148
    goto :goto_28

    .line 1149
    :cond_46
    move-object/from16 v23, v4

    .line 1150
    .line 1151
    :cond_47
    move-object/from16 v0, v21

    .line 1152
    .line 1153
    move-object/from16 v1, v22

    .line 1154
    .line 1155
    move-object/from16 v4, v23

    .line 1156
    .line 1157
    goto :goto_25

    .line 1158
    :cond_48
    move-object/from16 v21, v0

    .line 1159
    .line 1160
    move-object/from16 v23, v4

    .line 1161
    .line 1162
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v0

    .line 1166
    goto :goto_24

    .line 1167
    :cond_49
    move-object/from16 v23, v4

    .line 1168
    .line 1169
    const/4 v0, 0x0

    .line 1170
    :cond_4a
    :goto_28
    if-eqz v0, :cond_4c

    .line 1171
    .line 1172
    filled-new-array/range {v18 .. v18}, [Ljava/lang/Object;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v1

    .line 1176
    invoke-static {v0, v10, v1}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 1177
    .line 1178
    .line 1179
    move-result v0

    .line 1180
    if-eqz v0, :cond_4b

    .line 1181
    .line 1182
    iget-wide v0, v5, Llb/c;->b:J

    .line 1183
    .line 1184
    invoke-virtual {v6, v10, v0, v1}, Llb/i;->r(Ljava/lang/Object;J)Z

    .line 1185
    .line 1186
    .line 1187
    invoke-virtual {v6, v10}, Llb/i;->D(Ljava/lang/Object;)V

    .line 1188
    .line 1189
    .line 1190
    iget-wide v0, v5, Llb/c;->b:J

    .line 1191
    .line 1192
    invoke-virtual {v6, v10, v0, v1}, Llb/i;->C(Ljava/lang/Object;J)V

    .line 1193
    .line 1194
    .line 1195
    invoke-virtual {v6, v10}, Llb/i;->k(Ljava/lang/Object;)V

    .line 1196
    .line 1197
    .line 1198
    move-object/from16 v22, v3

    .line 1199
    .line 1200
    :goto_29
    const/4 v0, 0x1

    .line 1201
    goto/16 :goto_36

    .line 1202
    .line 1203
    :cond_4b
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v0

    .line 1207
    invoke-virtual {v11, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1208
    .line 1209
    .line 1210
    :cond_4c
    move-object/from16 v0, v19

    .line 1211
    .line 1212
    move-object/from16 v4, v23

    .line 1213
    .line 1214
    goto/16 :goto_20

    .line 1215
    .line 1216
    :cond_4d
    move-object/from16 v23, v4

    .line 1217
    .line 1218
    iget-wide v14, v5, Llb/c;->b:J

    .line 1219
    .line 1220
    iget-object v1, v5, Llb/c;->c:Ljava/lang/Object;

    .line 1221
    .line 1222
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v4

    .line 1226
    iget-object v0, v6, Llb/i;->n:Ljava/lang/reflect/Method;

    .line 1227
    .line 1228
    if-eqz v0, :cond_4e

    .line 1229
    .line 1230
    move-object/from16 v22, v3

    .line 1231
    .line 1232
    move-wide/from16 v18, v14

    .line 1233
    .line 1234
    goto/16 :goto_30

    .line 1235
    .line 1236
    :cond_4e
    invoke-virtual {v6}, Llb/i;->y()Ljava/lang/String;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v11

    .line 1240
    iget-object v0, v6, Llb/i;->u:Landroid/content/SharedPreferences;

    .line 1241
    .line 1242
    move-wide/from16 v18, v14

    .line 1243
    .line 1244
    iget-object v14, v6, Llb/i;->a:Lr8/g;

    .line 1245
    .line 1246
    iget-object v14, v14, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 1247
    .line 1248
    const-string v15, "quote_method"

    .line 1249
    .line 1250
    invoke-static {v0, v11, v14, v15}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v0

    .line 1254
    if-eqz v0, :cond_50

    .line 1255
    .line 1256
    invoke-static {v0}, Llb/i;->t(Ljava/lang/reflect/Method;)Z

    .line 1257
    .line 1258
    .line 1259
    move-result v14

    .line 1260
    if-eqz v14, :cond_4f

    .line 1261
    .line 1262
    goto :goto_2a

    .line 1263
    :cond_4f
    const/4 v0, 0x0

    .line 1264
    :goto_2a
    if-eqz v0, :cond_50

    .line 1265
    .line 1266
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v0

    .line 1270
    iput-object v0, v6, Llb/i;->n:Ljava/lang/reflect/Method;

    .line 1271
    .line 1272
    iget-object v0, v6, Llb/i;->n:Ljava/lang/reflect/Method;

    .line 1273
    .line 1274
    move-object/from16 v22, v3

    .line 1275
    .line 1276
    goto/16 :goto_30

    .line 1277
    .line 1278
    :cond_50
    :try_start_0
    iget-object v0, v6, Llb/i;->a:Lr8/g;

    .line 1279
    .line 1280
    iget-object v0, v0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 1281
    .line 1282
    new-instance v14, Lch/e;

    .line 1283
    .line 1284
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 1285
    .line 1286
    .line 1287
    new-instance v2, Lfh/k;

    .line 1288
    .line 1289
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1290
    .line 1291
    .line 1292
    const-string v21, "invalid quote msg id"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 1293
    .line 1294
    move-object/from16 v22, v3

    .line 1295
    .line 1296
    :try_start_1
    invoke-static/range {v21 .. v21}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v3

    .line 1300
    invoke-static {v2, v3}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 1301
    .line 1302
    .line 1303
    iput-object v2, v14, Lch/e;->h:Lfh/k;

    .line 1304
    .line 1305
    invoke-virtual {v0, v14}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v0

    .line 1309
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v2

    .line 1313
    :cond_51
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1314
    .line 1315
    .line 1316
    move-result v0

    .line 1317
    if-eqz v0, :cond_54

    .line 1318
    .line 1319
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v0

    .line 1323
    check-cast v0, Lhh/o;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1324
    .line 1325
    :try_start_2
    iget-object v3, v6, Llb/i;->a:Lr8/g;

    .line 1326
    .line 1327
    iget-object v3, v3, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 1328
    .line 1329
    invoke-virtual {v0, v3}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1333
    goto :goto_2b

    .line 1334
    :catchall_0
    move-exception v0

    .line 1335
    :try_start_3
    new-instance v3, Lsf/f;

    .line 1336
    .line 1337
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1338
    .line 1339
    .line 1340
    move-object v0, v3

    .line 1341
    :goto_2b
    nop

    .line 1342
    instance-of v3, v0, Lsf/f;

    .line 1343
    .line 1344
    if-eqz v3, :cond_52

    .line 1345
    .line 1346
    const/4 v0, 0x0

    .line 1347
    :cond_52
    check-cast v0, Ljava/lang/reflect/Method;

    .line 1348
    .line 1349
    if-eqz v0, :cond_53

    .line 1350
    .line 1351
    invoke-static {v0}, Llb/i;->t(Ljava/lang/reflect/Method;)Z

    .line 1352
    .line 1353
    .line 1354
    move-result v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1355
    if-eqz v3, :cond_53

    .line 1356
    .line 1357
    goto :goto_2c

    .line 1358
    :catchall_1
    move-exception v0

    .line 1359
    goto :goto_2d

    .line 1360
    :cond_53
    const/4 v0, 0x0

    .line 1361
    :goto_2c
    if-eqz v0, :cond_51

    .line 1362
    .line 1363
    goto :goto_2e

    .line 1364
    :cond_54
    const/4 v0, 0x0

    .line 1365
    goto :goto_2e

    .line 1366
    :catchall_2
    move-exception v0

    .line 1367
    move-object/from16 v22, v3

    .line 1368
    .line 1369
    :goto_2d
    new-instance v2, Lsf/f;

    .line 1370
    .line 1371
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1372
    .line 1373
    .line 1374
    move-object v0, v2

    .line 1375
    :goto_2e
    nop

    .line 1376
    instance-of v2, v0, Lsf/f;

    .line 1377
    .line 1378
    if-eqz v2, :cond_55

    .line 1379
    .line 1380
    const/4 v0, 0x0

    .line 1381
    :cond_55
    check-cast v0, Ljava/lang/reflect/Method;

    .line 1382
    .line 1383
    if-eqz v0, :cond_56

    .line 1384
    .line 1385
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v2

    .line 1389
    iput-object v2, v6, Llb/i;->n:Ljava/lang/reflect/Method;

    .line 1390
    .line 1391
    iget-object v2, v6, Llb/i;->u:Landroid/content/SharedPreferences;

    .line 1392
    .line 1393
    invoke-static {v2, v11, v15, v0}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 1394
    .line 1395
    .line 1396
    goto :goto_2f

    .line 1397
    :cond_56
    iget-object v0, v6, Llb/i;->u:Landroid/content/SharedPreferences;

    .line 1398
    .line 1399
    const-string v2, "cache.key"

    .line 1400
    .line 1401
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1402
    .line 1403
    .line 1404
    :try_start_4
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v3

    .line 1408
    invoke-interface {v0, v2, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v0

    .line 1412
    invoke-static {v0, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1413
    .line 1414
    .line 1415
    move-result v0

    .line 1416
    if-nez v0, :cond_57

    .line 1417
    .line 1418
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v0

    .line 1422
    invoke-interface {v0, v2, v11}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1423
    .line 1424
    .line 1425
    :cond_57
    invoke-interface {v3, v15}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v0

    .line 1429
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 1430
    .line 1431
    .line 1432
    :catchall_3
    :goto_2f
    iget-object v0, v6, Llb/i;->n:Ljava/lang/reflect/Method;

    .line 1433
    .line 1434
    :goto_30
    if-eqz v0, :cond_5a

    .line 1435
    .line 1436
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v2

    .line 1440
    invoke-virtual {v4, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1441
    .line 1442
    .line 1443
    move-result v2

    .line 1444
    if-nez v2, :cond_59

    .line 1445
    .line 1446
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 1447
    .line 1448
    .line 1449
    move-result-object v2

    .line 1450
    invoke-virtual {v2, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1451
    .line 1452
    .line 1453
    move-result v2

    .line 1454
    if-eqz v2, :cond_58

    .line 1455
    .line 1456
    goto :goto_31

    .line 1457
    :cond_58
    const/4 v0, 0x0

    .line 1458
    :cond_59
    :goto_31
    if-eqz v0, :cond_5a

    .line 1459
    .line 1460
    goto/16 :goto_33

    .line 1461
    .line 1462
    :cond_5a
    iget-object v0, v6, Llb/i;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1463
    .line 1464
    invoke-virtual {v0, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v0

    .line 1468
    check-cast v0, Ljava/lang/reflect/Method;

    .line 1469
    .line 1470
    if-eqz v0, :cond_5b

    .line 1471
    .line 1472
    goto/16 :goto_33

    .line 1473
    .line 1474
    :cond_5b
    move-object v0, v4

    .line 1475
    :goto_32
    if-eqz v0, :cond_5f

    .line 1476
    .line 1477
    invoke-virtual {v0, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1478
    .line 1479
    .line 1480
    move-result v2

    .line 1481
    if-nez v2, :cond_5f

    .line 1482
    .line 1483
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v2

    .line 1487
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v2

    .line 1491
    :cond_5c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1492
    .line 1493
    .line 1494
    move-result v3

    .line 1495
    if-eqz v3, :cond_5e

    .line 1496
    .line 1497
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v3

    .line 1501
    check-cast v3, Ljava/lang/reflect/Method;

    .line 1502
    .line 1503
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1504
    .line 1505
    .line 1506
    move-result-object v9

    .line 1507
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v11

    .line 1511
    invoke-static {v11, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1512
    .line 1513
    .line 1514
    move-result v11

    .line 1515
    if-eqz v11, :cond_5c

    .line 1516
    .line 1517
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 1518
    .line 1519
    .line 1520
    move-result v11

    .line 1521
    invoke-static {v11}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1522
    .line 1523
    .line 1524
    move-result v11

    .line 1525
    if-nez v11, :cond_5c

    .line 1526
    .line 1527
    array-length v11, v9

    .line 1528
    const/4 v14, 0x3

    .line 1529
    if-ne v11, v14, :cond_5c

    .line 1530
    .line 1531
    const/16 v16, 0x0

    .line 1532
    .line 1533
    aget-object v11, v9, v16

    .line 1534
    .line 1535
    const-class v15, Ljava/lang/String;

    .line 1536
    .line 1537
    invoke-static {v11, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1538
    .line 1539
    .line 1540
    move-result v11

    .line 1541
    if-eqz v11, :cond_5c

    .line 1542
    .line 1543
    const/16 v17, 0x1

    .line 1544
    .line 1545
    aget-object v11, v9, v17

    .line 1546
    .line 1547
    sget-object v15, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 1548
    .line 1549
    invoke-static {v11, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1550
    .line 1551
    .line 1552
    move-result v11

    .line 1553
    if-nez v11, :cond_5d

    .line 1554
    .line 1555
    aget-object v11, v9, v17

    .line 1556
    .line 1557
    const-class v15, Ljava/lang/Long;

    .line 1558
    .line 1559
    invoke-static {v11, v15}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1560
    .line 1561
    .line 1562
    move-result v11

    .line 1563
    if-eqz v11, :cond_5c

    .line 1564
    .line 1565
    :cond_5d
    aget-object v11, v9, v20

    .line 1566
    .line 1567
    invoke-virtual {v11}, Ljava/lang/Class;->isPrimitive()Z

    .line 1568
    .line 1569
    .line 1570
    move-result v11

    .line 1571
    if-nez v11, :cond_5c

    .line 1572
    .line 1573
    aget-object v11, v9, v20

    .line 1574
    .line 1575
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1576
    .line 1577
    .line 1578
    move-result-object v11

    .line 1579
    const-string v15, "java."

    .line 1580
    .line 1581
    const/4 v14, 0x0

    .line 1582
    invoke-static {v11, v15, v14}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1583
    .line 1584
    .line 1585
    move-result v11

    .line 1586
    if-nez v11, :cond_5c

    .line 1587
    .line 1588
    aget-object v9, v9, v20

    .line 1589
    .line 1590
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1591
    .line 1592
    .line 1593
    move-result-object v9

    .line 1594
    const-string v11, "android."

    .line 1595
    .line 1596
    invoke-static {v9, v11, v14}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1597
    .line 1598
    .line 1599
    move-result v9

    .line 1600
    if-nez v9, :cond_5c

    .line 1601
    .line 1602
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v0

    .line 1606
    if-eqz v0, :cond_60

    .line 1607
    .line 1608
    iget-object v2, v6, Llb/i;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1609
    .line 1610
    invoke-virtual {v2, v4, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1611
    .line 1612
    .line 1613
    goto :goto_33

    .line 1614
    :cond_5e
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v0

    .line 1618
    goto/16 :goto_32

    .line 1619
    .line 1620
    :cond_5f
    const/4 v0, 0x0

    .line 1621
    :cond_60
    :goto_33
    if-eqz v0, :cond_64

    .line 1622
    .line 1623
    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v2

    .line 1627
    const/4 v3, 0x0

    .line 1628
    filled-new-array {v7, v2, v3}, [Ljava/lang/Object;

    .line 1629
    .line 1630
    .line 1631
    move-result-object v2

    .line 1632
    invoke-static {v0, v10, v2}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 1633
    .line 1634
    .line 1635
    move-result v2

    .line 1636
    if-eqz v2, :cond_61

    .line 1637
    .line 1638
    goto :goto_35

    .line 1639
    :cond_61
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v2

    .line 1643
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1644
    .line 1645
    .line 1646
    move/from16 v3, v20

    .line 1647
    .line 1648
    invoke-static {v3, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v2

    .line 1652
    check-cast v2, Ljava/lang/Class;

    .line 1653
    .line 1654
    if-eqz v2, :cond_62

    .line 1655
    .line 1656
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v3

    .line 1660
    invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1661
    .line 1662
    .line 1663
    move-result v14

    .line 1664
    goto :goto_34

    .line 1665
    :cond_62
    const/4 v14, 0x0

    .line 1666
    :goto_34
    if-eqz v14, :cond_63

    .line 1667
    .line 1668
    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1669
    .line 1670
    .line 1671
    move-result-object v2

    .line 1672
    filled-new-array {v7, v2, v1}, [Ljava/lang/Object;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v1

    .line 1676
    invoke-static {v0, v10, v1}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 1677
    .line 1678
    .line 1679
    move-result v1

    .line 1680
    if-eqz v1, :cond_63

    .line 1681
    .line 1682
    :goto_35
    invoke-virtual {v6, v10}, Llb/i;->D(Ljava/lang/Object;)V

    .line 1683
    .line 1684
    .line 1685
    invoke-virtual {v6, v10}, Llb/i;->k(Ljava/lang/Object;)V

    .line 1686
    .line 1687
    .line 1688
    goto/16 :goto_29

    .line 1689
    .line 1690
    :cond_63
    iget-object v1, v6, Llb/i;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1691
    .line 1692
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1693
    .line 1694
    .line 1695
    move-result-object v2

    .line 1696
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1697
    .line 1698
    .line 1699
    iget-object v1, v6, Llb/i;->n:Ljava/lang/reflect/Method;

    .line 1700
    .line 1701
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1702
    .line 1703
    .line 1704
    move-result v0

    .line 1705
    if-eqz v0, :cond_64

    .line 1706
    .line 1707
    const/4 v3, 0x0

    .line 1708
    iput-object v3, v6, Llb/i;->n:Ljava/lang/reflect/Method;

    .line 1709
    .line 1710
    :cond_64
    iget-wide v0, v5, Llb/c;->b:J

    .line 1711
    .line 1712
    invoke-virtual {v6, v10, v0, v1}, Llb/i;->r(Ljava/lang/Object;J)Z

    .line 1713
    .line 1714
    .line 1715
    move-result v0

    .line 1716
    if-eqz v0, :cond_2f

    .line 1717
    .line 1718
    invoke-virtual {v6, v10}, Llb/i;->D(Ljava/lang/Object;)V

    .line 1719
    .line 1720
    .line 1721
    iget-wide v0, v5, Llb/c;->b:J

    .line 1722
    .line 1723
    invoke-virtual {v6, v10, v0, v1}, Llb/i;->C(Ljava/lang/Object;J)V

    .line 1724
    .line 1725
    .line 1726
    invoke-virtual {v6, v10}, Llb/i;->k(Ljava/lang/Object;)V

    .line 1727
    .line 1728
    .line 1729
    goto/16 :goto_29

    .line 1730
    .line 1731
    :goto_36
    move v14, v0

    .line 1732
    goto :goto_37

    .line 1733
    :cond_65
    move-object/from16 v22, v3

    .line 1734
    .line 1735
    move-object/from16 v23, v4

    .line 1736
    .line 1737
    const/4 v14, 0x0

    .line 1738
    :goto_37
    if-eqz v14, :cond_66

    .line 1739
    .line 1740
    const/4 v14, 0x1

    .line 1741
    iput-boolean v14, v8, Llb/g;->j:Z

    .line 1742
    .line 1743
    :cond_66
    iget-boolean v0, v8, Llb/g;->g:Z

    .line 1744
    .line 1745
    if-nez v0, :cond_68

    .line 1746
    .line 1747
    iget-boolean v0, v8, Llb/g;->j:Z

    .line 1748
    .line 1749
    if-eqz v0, :cond_67

    .line 1750
    .line 1751
    goto :goto_38

    .line 1752
    :cond_67
    const/4 v14, 0x0

    .line 1753
    goto :goto_39

    .line 1754
    :cond_68
    :goto_38
    const/4 v14, 0x1

    .line 1755
    :goto_39
    invoke-static {v8}, Llb/i;->I(Llb/g;)V

    .line 1756
    .line 1757
    .line 1758
    const/4 v1, 0x0

    .line 1759
    iput-boolean v1, v8, Llb/g;->f:Z

    .line 1760
    .line 1761
    iput-boolean v1, v8, Llb/g;->j:Z

    .line 1762
    .line 1763
    const/4 v3, 0x0

    .line 1764
    iput-object v3, v8, Llb/g;->c:Llb/b;

    .line 1765
    .line 1766
    move-object/from16 v2, v22

    .line 1767
    .line 1768
    iput-object v2, v8, Llb/g;->e:Llb/f;

    .line 1769
    .line 1770
    iput-boolean v1, v8, Llb/g;->g:Z

    .line 1771
    .line 1772
    iput-boolean v1, v8, Llb/g;->h:Z

    .line 1773
    .line 1774
    iput-boolean v1, v8, Llb/g;->i:Z

    .line 1775
    .line 1776
    invoke-virtual/range {v23 .. v23}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1777
    .line 1778
    .line 1779
    move-result-object v0

    .line 1780
    if-eqz v0, :cond_69

    .line 1781
    .line 1782
    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 1783
    .line 1784
    .line 1785
    :cond_69
    move v6, v14

    .line 1786
    goto :goto_3a

    .line 1787
    :cond_6a
    move-object v2, v3

    .line 1788
    const/4 v1, 0x0

    .line 1789
    invoke-static {v8}, Llb/i;->I(Llb/g;)V

    .line 1790
    .line 1791
    .line 1792
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawX()F

    .line 1793
    .line 1794
    .line 1795
    move-result v3

    .line 1796
    iput v3, v8, Llb/g;->a:F

    .line 1797
    .line 1798
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawY()F

    .line 1799
    .line 1800
    .line 1801
    move-result v0

    .line 1802
    iput v0, v8, Llb/g;->b:F

    .line 1803
    .line 1804
    iput-object v5, v8, Llb/g;->c:Llb/b;

    .line 1805
    .line 1806
    iput-object v2, v8, Llb/g;->e:Llb/f;

    .line 1807
    .line 1808
    iput-boolean v1, v8, Llb/g;->g:Z

    .line 1809
    .line 1810
    iput-boolean v1, v8, Llb/g;->h:Z

    .line 1811
    .line 1812
    iput-boolean v1, v8, Llb/g;->i:Z

    .line 1813
    .line 1814
    const/4 v14, 0x1

    .line 1815
    iput-boolean v14, v8, Llb/g;->f:Z

    .line 1816
    .line 1817
    iput-boolean v1, v8, Llb/g;->j:Z

    .line 1818
    .line 1819
    const/4 v3, 0x0

    .line 1820
    iput-object v3, v8, Llb/g;->d:Landroid/view/View;

    .line 1821
    .line 1822
    move v6, v1

    .line 1823
    :goto_3a
    if-eqz v6, :cond_6b

    .line 1824
    .line 1825
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1826
    .line 1827
    move-object/from16 v2, p1

    .line 1828
    .line 1829
    invoke-virtual {v2, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1830
    .line 1831
    .line 1832
    :cond_6b
    :goto_3b
    return-void

    .line 1833
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
