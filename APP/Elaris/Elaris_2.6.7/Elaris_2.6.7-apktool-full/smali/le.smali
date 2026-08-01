.class public final Lle;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final synthetic a:Ljava/lang/ClassLoader;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lle;->a:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    const/16 p1, 0x46

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final beforeHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 14

    .line 1
    const-string v0, "voice_message_actions"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_14

    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    if-nez p1, :cond_1

    .line 13
    .line 14
    move-object v1, v0

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    iget-object v1, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 17
    .line 18
    :goto_0
    const/4 v2, 0x1

    .line 19
    const/4 v3, 0x0

    .line 20
    if-nez v1, :cond_3

    .line 21
    .line 22
    :cond_2
    move-object v7, v0

    .line 23
    goto :goto_4

    .line 24
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    :goto_1
    if-eqz v4, :cond_2

    .line 29
    .line 30
    const-class v5, Ljava/lang/Object;

    .line 31
    .line 32
    if-eq v4, v5, :cond_2

    .line 33
    .line 34
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    move v6, v3

    .line 39
    :goto_2
    array-length v7, v5

    .line 40
    if-ge v6, v7, :cond_6

    .line 41
    .line 42
    aget-object v7, v5, v6

    .line 43
    .line 44
    const-class v8, Landroid/os/Bundle;

    .line 45
    .line 46
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    invoke-virtual {v8, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    if-nez v8, :cond_4

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_4
    :try_start_0
    invoke-virtual {v7, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v7, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    instance-of v8, v7, Landroid/os/Bundle;

    .line 65
    .line 66
    if-eqz v8, :cond_5

    .line 67
    .line 68
    check-cast v7, Landroid/os/Bundle;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :catchall_0
    :cond_5
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_6
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    goto :goto_1

    .line 79
    :goto_4
    if-eqz v7, :cond_22

    .line 80
    .line 81
    const-string v1, "elaris_ptt_forward_path"

    .line 82
    .line 83
    invoke-virtual {v7, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-eqz v4, :cond_22

    .line 88
    .line 89
    const-string v4, "elaris_ptt_forward_handled"

    .line 90
    .line 91
    invoke-virtual {v7, v4, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-eqz v5, :cond_7

    .line 96
    .line 97
    goto/16 :goto_14

    .line 98
    .line 99
    :cond_7
    invoke-virtual {v7, v4, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 100
    .line 101
    .line 102
    const-string v2, ""

    .line 103
    .line 104
    invoke-virtual {v7, v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    if-eqz v9, :cond_1d

    .line 109
    .line 110
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_1d

    .line 115
    .line 116
    new-instance v1, Ljava/io/File;

    .line 117
    .line 118
    invoke-direct {v1, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-nez v1, :cond_8

    .line 126
    .line 127
    goto/16 :goto_10

    .line 128
    .line 129
    :cond_8
    new-instance v1, Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 132
    .line 133
    .line 134
    :try_start_1
    const-string v2, "forward_multi_target"

    .line 135
    .line 136
    invoke-virtual {v7, v2}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    if-eqz v2, :cond_a

    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-nez v4, :cond_a

    .line 147
    .line 148
    move v4, v3

    .line 149
    :goto_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    if-ge v4, v5, :cond_c

    .line 154
    .line 155
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    invoke-static {v5}, Lcom/mr/elaris/w;->Q0(Ljava/lang/Object;)Lpd;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    if-eqz v5, :cond_9

    .line 164
    .line 165
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 166
    .line 167
    .line 168
    :cond_9
    add-int/lit8 v4, v4, 0x1

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :catchall_1
    :cond_a
    const-string v2, "uin"

    .line 172
    .line 173
    invoke-virtual {v7, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    const-string v4, "Uid"

    .line 178
    .line 179
    invoke-virtual {v7, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    const-string v5, "peerUin"

    .line 184
    .line 185
    invoke-virtual {v7, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    const-string v6, "peerUid"

    .line 190
    .line 191
    invoke-virtual {v7, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    filled-new-array {v2, v4, v5, v6}, [Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-static {v2}, Lcom/mr/elaris/w;->G([Ljava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    const-string v4, "uintype"

    .line 204
    .line 205
    invoke-virtual {v7, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    const/4 v6, -0x1

    .line 210
    if-eqz v5, :cond_b

    .line 211
    .line 212
    invoke-virtual {v7, v4, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 213
    .line 214
    .line 215
    move-result v6

    .line 216
    :cond_b
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    if-lez v4, :cond_c

    .line 221
    .line 222
    new-instance v4, Lpd;

    .line 223
    .line 224
    invoke-static {v6}, Lcom/mr/elaris/w;->i(I)I

    .line 225
    .line 226
    .line 227
    move-result v5

    .line 228
    invoke-direct {v4, v2, v5}, Lpd;-><init>(Ljava/lang/String;I)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    :cond_c
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    if-eqz v2, :cond_11

    .line 239
    .line 240
    if-nez p1, :cond_d

    .line 241
    .line 242
    move-object p0, v0

    .line 243
    goto :goto_6

    .line 244
    :cond_d
    iget-object p0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 245
    .line 246
    :goto_6
    instance-of v1, p0, Landroid/app/Activity;

    .line 247
    .line 248
    if-eqz v1, :cond_e

    .line 249
    .line 250
    check-cast p0, Landroid/app/Activity;

    .line 251
    .line 252
    goto :goto_7

    .line 253
    :cond_e
    invoke-static {v3, p0}, Lcom/mr/elaris/w;->y(ILjava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    instance-of v1, p0, Landroid/app/Activity;

    .line 258
    .line 259
    if-eqz v1, :cond_f

    .line 260
    .line 261
    check-cast p0, Landroid/app/Activity;

    .line 262
    .line 263
    goto :goto_7

    .line 264
    :cond_f
    invoke-static {}, Lcom/mr/elaris/HookEntry;->topActivity()Landroid/app/Activity;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    :goto_7
    if-eqz p0, :cond_10

    .line 269
    .line 270
    goto :goto_8

    .line 271
    :cond_10
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostContext()Landroid/content/Context;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    :goto_8
    const-string v1, "\u672a\u83b7\u53d6\u5230\u8f6c\u53d1\u5bf9\u8c61"

    .line 276
    .line 277
    invoke-static {p0, v1}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {p1, v0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    return-void

    .line 284
    :cond_11
    move v2, v3

    .line 285
    move v4, v2

    .line 286
    :goto_9
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 287
    .line 288
    .line 289
    move-result v5

    .line 290
    if-ge v2, v5, :cond_13

    .line 291
    .line 292
    const-string v5, "elaris_ptt_forward_duration"

    .line 293
    .line 294
    invoke-virtual {v7, v5, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 295
    .line 296
    .line 297
    move-result v10

    .line 298
    const-string v5, "elaris_ptt_forward_waves"

    .line 299
    .line 300
    invoke-virtual {v7, v5}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 301
    .line 302
    .line 303
    move-result-object v11

    .line 304
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v5

    .line 308
    move-object v12, v5

    .line 309
    check-cast v12, Lpd;

    .line 310
    .line 311
    const/4 v13, 0x0

    .line 312
    iget-object v8, p0, Lle;->a:Ljava/lang/ClassLoader;

    .line 313
    .line 314
    invoke-static/range {v8 .. v13}, Lcom/mr/elaris/w;->J0(Ljava/lang/ClassLoader;Ljava/lang/String;I[BLpd;Lx2;)Z

    .line 315
    .line 316
    .line 317
    move-result v5

    .line 318
    if-eqz v5, :cond_12

    .line 319
    .line 320
    add-int/lit8 v4, v4, 0x1

    .line 321
    .line 322
    :cond_12
    add-int/lit8 v2, v2, 0x1

    .line 323
    .line 324
    goto :goto_9

    .line 325
    :cond_13
    if-nez p1, :cond_14

    .line 326
    .line 327
    move-object p0, v0

    .line 328
    goto :goto_a

    .line 329
    :cond_14
    iget-object p0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 330
    .line 331
    :goto_a
    instance-of v2, p0, Landroid/app/Activity;

    .line 332
    .line 333
    if-eqz v2, :cond_15

    .line 334
    .line 335
    check-cast p0, Landroid/app/Activity;

    .line 336
    .line 337
    goto :goto_b

    .line 338
    :cond_15
    invoke-static {v3, p0}, Lcom/mr/elaris/w;->y(ILjava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object p0

    .line 342
    instance-of v2, p0, Landroid/app/Activity;

    .line 343
    .line 344
    if-eqz v2, :cond_16

    .line 345
    .line 346
    check-cast p0, Landroid/app/Activity;

    .line 347
    .line 348
    goto :goto_b

    .line 349
    :cond_16
    invoke-static {}, Lcom/mr/elaris/HookEntry;->topActivity()Landroid/app/Activity;

    .line 350
    .line 351
    .line 352
    move-result-object p0

    .line 353
    :goto_b
    if-eqz p0, :cond_17

    .line 354
    .line 355
    goto :goto_c

    .line 356
    :cond_17
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostContext()Landroid/content/Context;

    .line 357
    .line 358
    .line 359
    move-result-object p0

    .line 360
    :goto_c
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 361
    .line 362
    .line 363
    move-result v2

    .line 364
    if-ne v4, v2, :cond_18

    .line 365
    .line 366
    const-string v1, "\u5df2\u63d0\u4ea4\u8bed\u97f3\u8f6c\u53d1"

    .line 367
    .line 368
    goto :goto_d

    .line 369
    :cond_18
    new-instance v2, Ljava/lang/StringBuilder;

    .line 370
    .line 371
    const-string v5, "\u8bed\u97f3\u8f6c\u53d1\u90e8\u5206\u5931\u8d25\uff1a"

    .line 372
    .line 373
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    const-string v4, "/"

    .line 380
    .line 381
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    :goto_d
    invoke-static {p0, v1}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    if-nez p1, :cond_19

    .line 399
    .line 400
    move-object p0, v0

    .line 401
    goto :goto_e

    .line 402
    :cond_19
    iget-object p0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 403
    .line 404
    :goto_e
    instance-of v1, p0, Landroid/app/Activity;

    .line 405
    .line 406
    if-eqz v1, :cond_1a

    .line 407
    .line 408
    check-cast p0, Landroid/app/Activity;

    .line 409
    .line 410
    goto :goto_f

    .line 411
    :cond_1a
    invoke-static {v3, p0}, Lcom/mr/elaris/w;->y(ILjava/lang/Object;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object p0

    .line 415
    instance-of v1, p0, Landroid/app/Activity;

    .line 416
    .line 417
    if-eqz v1, :cond_1b

    .line 418
    .line 419
    check-cast p0, Landroid/app/Activity;

    .line 420
    .line 421
    goto :goto_f

    .line 422
    :cond_1b
    invoke-static {}, Lcom/mr/elaris/HookEntry;->topActivity()Landroid/app/Activity;

    .line 423
    .line 424
    .line 425
    move-result-object p0

    .line 426
    :goto_f
    if-eqz p0, :cond_1c

    .line 427
    .line 428
    :try_start_2
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 429
    .line 430
    .line 431
    :catchall_2
    :cond_1c
    invoke-virtual {p1, v0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    return-void

    .line 435
    :cond_1d
    :goto_10
    if-nez p1, :cond_1e

    .line 436
    .line 437
    move-object p0, v0

    .line 438
    goto :goto_11

    .line 439
    :cond_1e
    iget-object p0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 440
    .line 441
    :goto_11
    instance-of v1, p0, Landroid/app/Activity;

    .line 442
    .line 443
    if-eqz v1, :cond_1f

    .line 444
    .line 445
    check-cast p0, Landroid/app/Activity;

    .line 446
    .line 447
    goto :goto_12

    .line 448
    :cond_1f
    invoke-static {v3, p0}, Lcom/mr/elaris/w;->y(ILjava/lang/Object;)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object p0

    .line 452
    instance-of v1, p0, Landroid/app/Activity;

    .line 453
    .line 454
    if-eqz v1, :cond_20

    .line 455
    .line 456
    check-cast p0, Landroid/app/Activity;

    .line 457
    .line 458
    goto :goto_12

    .line 459
    :cond_20
    invoke-static {}, Lcom/mr/elaris/HookEntry;->topActivity()Landroid/app/Activity;

    .line 460
    .line 461
    .line 462
    move-result-object p0

    .line 463
    :goto_12
    if-eqz p0, :cond_21

    .line 464
    .line 465
    goto :goto_13

    .line 466
    :cond_21
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostContext()Landroid/content/Context;

    .line 467
    .line 468
    .line 469
    move-result-object p0

    .line 470
    :goto_13
    const-string v1, "\u8bed\u97f3\u6587\u4ef6\u4e0d\u5b58\u5728"

    .line 471
    .line 472
    invoke-static {p0, v1}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {p1, v0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 476
    .line 477
    .line 478
    :cond_22
    :goto_14
    return-void
.end method
