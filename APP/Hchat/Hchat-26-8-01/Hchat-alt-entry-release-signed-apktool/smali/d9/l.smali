.class public final Ld9/l;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ld9/m;


# direct methods
.method public synthetic constructor <init>(Ld9/m;I)V
    .locals 0

    .line 1
    iput p2, p0, Ld9/l;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ld9/l;->b:Ld9/m;

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
    .locals 13

    .line 1
    iget v0, p0, Ld9/l;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :sswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Ld9/l;->b:Ld9/m;

    .line 14
    .line 15
    iget-object v1, v0, Ld9/m;->a:Lr8/g;

    .line 16
    .line 17
    iget-object v1, v1, Lr8/g;->a:Landroid/content/Context;

    .line 18
    .line 19
    const-string v2, "Hchat_custom_friend_avatar_config"

    .line 20
    .line 21
    invoke-static {v1, v2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const-string v4, "enable"

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1d

    .line 33
    .line 34
    invoke-static {v1, v2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v2, "conversation_menu"

    .line 39
    .line 40
    const/4 v3, 0x1

    .line 41
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_1d

    .line 46
    .line 47
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {v5, v1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    instance-of v2, v1, Landroid/view/ContextMenu;

    .line 57
    .line 58
    const/4 v4, 0x0

    .line 59
    if-eqz v2, :cond_0

    .line 60
    .line 61
    check-cast v1, Landroid/view/ContextMenu;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move-object v1, v4

    .line 65
    :goto_0
    if-eqz v1, :cond_1d

    .line 66
    .line 67
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 68
    .line 69
    if-eqz v2, :cond_4

    .line 70
    .line 71
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contacts()Lg8/i;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    if-eqz v6, :cond_4

    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    invoke-static {v7}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    invoke-static {v7}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    new-instance v8, Lb4/b;

    .line 90
    .line 91
    const/16 v9, 0x14

    .line 92
    .line 93
    invoke-direct {v8, v9}, Lb4/b;-><init>(I)V

    .line 94
    .line 95
    .line 96
    new-instance v9, Lng/i;

    .line 97
    .line 98
    invoke-direct {v9, v7, v3, v8}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 99
    .line 100
    .line 101
    new-instance v7, Lc9/k1;

    .line 102
    .line 103
    const/4 v8, 0x5

    .line 104
    invoke-direct {v7, v2, v8}, Lc9/k1;-><init>(Ljava/lang/Object;I)V

    .line 105
    .line 106
    .line 107
    invoke-static {v9, v7}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    new-instance v7, Lb4/b;

    .line 112
    .line 113
    const/16 v8, 0x15

    .line 114
    .line 115
    invoke-direct {v7, v8}, Lb4/b;-><init>(I)V

    .line 116
    .line 117
    .line 118
    invoke-static {v2, v7}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    new-instance v7, Lb4/b;

    .line 123
    .line 124
    const/16 v8, 0x16

    .line 125
    .line 126
    invoke-direct {v7, v8}, Lb4/b;-><init>(I)V

    .line 127
    .line 128
    .line 129
    new-instance v8, Lng/i;

    .line 130
    .line 131
    invoke-direct {v8, v2, v3, v7}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 132
    .line 133
    .line 134
    new-instance v2, Lng/h;

    .line 135
    .line 136
    invoke-direct {v2, v8}, Lng/h;-><init>(Lng/i;)V

    .line 137
    .line 138
    .line 139
    :cond_1
    invoke-virtual {v2}, Lng/h;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-eqz v3, :cond_3

    .line 144
    .line 145
    invoke-virtual {v2}, Lng/h;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    move-object v7, v3

    .line 150
    check-cast v7, Ljava/lang/String;

    .line 151
    .line 152
    :try_start_0
    invoke-virtual {v6, v7}, Lg8/i;->H(Ljava/lang/String;)Z

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 157
    .line 158
    .line 159
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    goto :goto_1

    .line 161
    :catchall_0
    move-exception v7

    .line 162
    new-instance v8, Lsf/f;

    .line 163
    .line 164
    invoke-direct {v8, v7}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 165
    .line 166
    .line 167
    move-object v7, v8

    .line 168
    :goto_1
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 169
    .line 170
    instance-of v9, v7, Lsf/f;

    .line 171
    .line 172
    if-eqz v9, :cond_2

    .line 173
    .line 174
    move-object v7, v8

    .line 175
    :cond_2
    check-cast v7, Ljava/lang/Boolean;

    .line 176
    .line 177
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    if-eqz v7, :cond_1

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_3
    move-object v3, v4

    .line 185
    :goto_2
    check-cast v3, Ljava/lang/String;

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_4
    move-object v3, v4

    .line 189
    :goto_3
    if-eqz v3, :cond_1d

    .line 190
    .line 191
    const v2, 0x7a1001

    .line 192
    .line 193
    .line 194
    invoke-interface {v1, v2}, Landroid/view/Menu;->removeItem(I)V

    .line 195
    .line 196
    .line 197
    :try_start_1
    invoke-interface {v1, v5}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    invoke-interface {v6}, Landroid/view/MenuItem;->getGroupId()I

    .line 202
    .line 203
    .line 204
    move-result v6

    .line 205
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 206
    .line 207
    .line 208
    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 209
    goto :goto_4

    .line 210
    :catchall_1
    move-exception v6

    .line 211
    new-instance v7, Lsf/f;

    .line 212
    .line 213
    invoke-direct {v7, v6}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 214
    .line 215
    .line 216
    move-object v6, v7

    .line 217
    :goto_4
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 218
    .line 219
    .line 220
    move-result-object v7

    .line 221
    instance-of v8, v6, Lsf/f;

    .line 222
    .line 223
    if-eqz v8, :cond_5

    .line 224
    .line 225
    move-object v6, v7

    .line 226
    :cond_5
    check-cast v6, Ljava/lang/Number;

    .line 227
    .line 228
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 229
    .line 230
    .line 231
    move-result v6

    .line 232
    const-string v7, "\u8bbe\u7f6e\u81ea\u5b9a\u4e49\u5934\u50cf"

    .line 233
    .line 234
    invoke-interface {v1, v6, v2, v5, v7}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    move-result-object v6

    .line 245
    :goto_5
    if-eqz v6, :cond_f

    .line 246
    .line 247
    const-class v7, Ljava/lang/Object;

    .line 248
    .line 249
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v7

    .line 253
    if-nez v7, :cond_f

    .line 254
    .line 255
    invoke-static {v6}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 256
    .line 257
    .line 258
    move-result-object v7

    .line 259
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 260
    .line 261
    .line 262
    move-result-object v7

    .line 263
    :cond_6
    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 264
    .line 265
    .line 266
    move-result v8

    .line 267
    if-eqz v8, :cond_e

    .line 268
    .line 269
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v8

    .line 273
    check-cast v8, Ljava/lang/reflect/Field;

    .line 274
    .line 275
    const-class v9, Ljava/util/List;

    .line 276
    .line 277
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    move-result-object v10

    .line 281
    invoke-virtual {v9, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 282
    .line 283
    .line 284
    move-result v9

    .line 285
    if-nez v9, :cond_7

    .line 286
    .line 287
    goto :goto_6

    .line 288
    :cond_7
    invoke-static {v8, v1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v8

    .line 292
    invoke-static {v8}, Lgg/x;->e(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v9

    .line 296
    if-eqz v9, :cond_8

    .line 297
    .line 298
    check-cast v8, Ljava/util/List;

    .line 299
    .line 300
    goto :goto_7

    .line 301
    :cond_8
    move-object v8, v4

    .line 302
    :goto_7
    if-eqz v8, :cond_6

    .line 303
    .line 304
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 305
    .line 306
    .line 307
    move-result-object v9

    .line 308
    move v10, v5

    .line 309
    :goto_8
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 310
    .line 311
    .line 312
    move-result v11

    .line 313
    if-eqz v11, :cond_b

    .line 314
    .line 315
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v11

    .line 319
    if-eq v11, v2, :cond_c

    .line 320
    .line 321
    instance-of v12, v11, Landroid/view/MenuItem;

    .line 322
    .line 323
    if-eqz v12, :cond_9

    .line 324
    .line 325
    check-cast v11, Landroid/view/MenuItem;

    .line 326
    .line 327
    goto :goto_9

    .line 328
    :cond_9
    move-object v11, v4

    .line 329
    :goto_9
    if-eqz v11, :cond_a

    .line 330
    .line 331
    invoke-interface {v11}, Landroid/view/MenuItem;->getItemId()I

    .line 332
    .line 333
    .line 334
    move-result v11

    .line 335
    invoke-interface {v2}, Landroid/view/MenuItem;->getItemId()I

    .line 336
    .line 337
    .line 338
    move-result v12

    .line 339
    if-ne v11, v12, :cond_a

    .line 340
    .line 341
    goto :goto_a

    .line 342
    :cond_a
    add-int/lit8 v10, v10, 0x1

    .line 343
    .line 344
    goto :goto_8

    .line 345
    :cond_b
    const/4 v10, -0x1

    .line 346
    :cond_c
    :goto_a
    if-lez v10, :cond_d

    .line 347
    .line 348
    :try_start_2
    invoke-interface {v8, v10}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v9

    .line 352
    invoke-interface {v8, v5, v9}, Ljava/util/List;->add(ILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 353
    .line 354
    .line 355
    :catchall_2
    :cond_d
    if-ltz v10, :cond_6

    .line 356
    .line 357
    goto :goto_b

    .line 358
    :cond_e
    invoke-virtual {v6}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    move-result-object v6

    .line 362
    goto :goto_5

    .line 363
    :cond_f
    :goto_b
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 364
    .line 365
    const-string v6, "getActivity"

    .line 366
    .line 367
    new-array v7, v5, [Ljava/lang/Object;

    .line 368
    .line 369
    invoke-static {v1, v6, v7}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v6

    .line 373
    instance-of v7, v6, Landroid/app/Activity;

    .line 374
    .line 375
    if-eqz v7, :cond_10

    .line 376
    .line 377
    check-cast v6, Landroid/app/Activity;

    .line 378
    .line 379
    goto :goto_c

    .line 380
    :cond_10
    move-object v6, v4

    .line 381
    :goto_c
    if-eqz v6, :cond_11

    .line 382
    .line 383
    goto/16 :goto_12

    .line 384
    .line 385
    :cond_11
    const-string v6, "getContext"

    .line 386
    .line 387
    new-array v7, v5, [Ljava/lang/Object;

    .line 388
    .line 389
    invoke-static {v1, v6, v7}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v6

    .line 393
    instance-of v7, v6, Landroid/app/Activity;

    .line 394
    .line 395
    if-eqz v7, :cond_12

    .line 396
    .line 397
    check-cast v6, Landroid/app/Activity;

    .line 398
    .line 399
    goto :goto_d

    .line 400
    :cond_12
    move-object v6, v4

    .line 401
    :goto_d
    if-eqz v6, :cond_13

    .line 402
    .line 403
    goto :goto_12

    .line 404
    :cond_13
    new-instance v6, Lgg/u;

    .line 405
    .line 406
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 407
    .line 408
    .line 409
    iput-object v1, v6, Lgg/u;->g:Ljava/lang/Object;

    .line 410
    .line 411
    move v1, v5

    .line 412
    :goto_e
    const/4 v7, 0x4

    .line 413
    if-ge v1, v7, :cond_1a

    .line 414
    .line 415
    iget-object v7, v6, Lgg/u;->g:Ljava/lang/Object;

    .line 416
    .line 417
    instance-of v8, v7, Landroid/app/Activity;

    .line 418
    .line 419
    if-eqz v8, :cond_14

    .line 420
    .line 421
    move-object v6, v7

    .line 422
    check-cast v6, Landroid/app/Activity;

    .line 423
    .line 424
    goto :goto_12

    .line 425
    :cond_14
    instance-of v8, v7, Landroid/content/ContextWrapper;

    .line 426
    .line 427
    if-eqz v8, :cond_15

    .line 428
    .line 429
    check-cast v7, Landroid/content/ContextWrapper;

    .line 430
    .line 431
    invoke-virtual {v7}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 432
    .line 433
    .line 434
    move-result-object v7

    .line 435
    iput-object v7, v6, Lgg/u;->g:Ljava/lang/Object;

    .line 436
    .line 437
    goto :goto_11

    .line 438
    :cond_15
    if-eqz v7, :cond_16

    .line 439
    .line 440
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    move-result-object v7

    .line 444
    goto :goto_f

    .line 445
    :cond_16
    move-object v7, v4

    .line 446
    :goto_f
    new-instance v8, Ld9/k;

    .line 447
    .line 448
    const/4 v9, 0x0

    .line 449
    invoke-direct {v8, v7, v4, v9}, Ld9/k;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 450
    .line 451
    .line 452
    new-instance v7, Ldg/n;

    .line 453
    .line 454
    invoke-direct {v7, v8}, Ldg/n;-><init>(Lfg/p;)V

    .line 455
    .line 456
    .line 457
    new-instance v8, Ld9/g;

    .line 458
    .line 459
    invoke-direct {v8, v6, v9}, Ld9/g;-><init>(Lgg/u;I)V

    .line 460
    .line 461
    .line 462
    invoke-static {v7, v8}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 463
    .line 464
    .line 465
    move-result-object v7

    .line 466
    new-instance v8, Lng/h;

    .line 467
    .line 468
    invoke-direct {v8, v7}, Lng/h;-><init>(Lng/i;)V

    .line 469
    .line 470
    .line 471
    :cond_17
    invoke-virtual {v8}, Lng/h;->hasNext()Z

    .line 472
    .line 473
    .line 474
    move-result v7

    .line 475
    if-eqz v7, :cond_18

    .line 476
    .line 477
    invoke-virtual {v8}, Lng/h;->next()Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v7

    .line 481
    instance-of v9, v7, Landroid/app/Activity;

    .line 482
    .line 483
    if-nez v9, :cond_19

    .line 484
    .line 485
    instance-of v9, v7, Landroid/content/ContextWrapper;

    .line 486
    .line 487
    if-eqz v9, :cond_17

    .line 488
    .line 489
    goto :goto_10

    .line 490
    :cond_18
    move-object v7, v4

    .line 491
    :cond_19
    :goto_10
    iput-object v7, v6, Lgg/u;->g:Ljava/lang/Object;

    .line 492
    .line 493
    :goto_11
    add-int/lit8 v1, v1, 0x1

    .line 494
    .line 495
    goto :goto_e

    .line 496
    :cond_1a
    move-object v6, v4

    .line 497
    :goto_12
    if-eqz v6, :cond_1d

    .line 498
    .line 499
    iget-object v1, v0, Ld9/m;->g:Ljava/util/Map;

    .line 500
    .line 501
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    check-cast v1, Ljava/util/Map;

    .line 505
    .line 506
    new-instance v7, Lsf/e;

    .line 507
    .line 508
    invoke-direct {v7, v6, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    invoke-interface {v1, v2, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 515
    .line 516
    if-eqz p1, :cond_1d

    .line 517
    .line 518
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    invoke-static {v1}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 527
    .line 528
    .line 529
    move-result-object v1

    .line 530
    new-instance v2, Lb4/b;

    .line 531
    .line 532
    const/16 v3, 0x12

    .line 533
    .line 534
    invoke-direct {v2, v3}, Lb4/b;-><init>(I)V

    .line 535
    .line 536
    .line 537
    new-instance v3, Lng/i;

    .line 538
    .line 539
    invoke-direct {v3, v1, v5, v2}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 540
    .line 541
    .line 542
    new-instance v1, Lc9/k1;

    .line 543
    .line 544
    const/4 v2, 0x4

    .line 545
    invoke-direct {v1, p1, v2}, Lc9/k1;-><init>(Ljava/lang/Object;I)V

    .line 546
    .line 547
    .line 548
    invoke-static {v3, v1}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 549
    .line 550
    .line 551
    move-result-object p1

    .line 552
    new-instance v1, Lb4/b;

    .line 553
    .line 554
    const/16 v2, 0x13

    .line 555
    .line 556
    invoke-direct {v1, v2}, Lb4/b;-><init>(I)V

    .line 557
    .line 558
    .line 559
    invoke-static {p1, v1}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 560
    .line 561
    .line 562
    move-result-object p1

    .line 563
    new-instance v1, Lng/h;

    .line 564
    .line 565
    invoke-direct {v1, p1}, Lng/h;-><init>(Lng/i;)V

    .line 566
    .line 567
    .line 568
    :cond_1b
    invoke-virtual {v1}, Lng/h;->hasNext()Z

    .line 569
    .line 570
    .line 571
    move-result p1

    .line 572
    if-eqz p1, :cond_1c

    .line 573
    .line 574
    invoke-virtual {v1}, Lng/h;->next()Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object p1

    .line 578
    move-object v2, p1

    .line 579
    check-cast v2, Ljava/lang/reflect/Method;

    .line 580
    .line 581
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    move-result-object v3

    .line 585
    sget-object v6, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 586
    .line 587
    invoke-static {v3, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    move-result v3

    .line 591
    if-eqz v3, :cond_1b

    .line 592
    .line 593
    const-string v3, "com.tencent.mm.ui.conversation."

    .line 594
    .line 595
    invoke-static {v2, v5, v3}, Leh/a;->A(Ljava/lang/reflect/Method;ZLjava/lang/String;)Z

    .line 596
    .line 597
    .line 598
    move-result v2

    .line 599
    if-eqz v2, :cond_1b

    .line 600
    .line 601
    move-object v4, p1

    .line 602
    :cond_1c
    check-cast v4, Ljava/lang/reflect/Method;

    .line 603
    .line 604
    if-eqz v4, :cond_1d

    .line 605
    .line 606
    new-instance p1, Ld9/l;

    .line 607
    .line 608
    const/4 v1, 0x4

    .line 609
    invoke-direct {p1, v0, v1}, Ld9/l;-><init>(Ld9/m;I)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v0, v4, p1}, Ld9/m;->e(Ljava/lang/reflect/Executable;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 613
    .line 614
    .line 615
    :cond_1d
    return-void

    .line 616
    :sswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 617
    .line 618
    .line 619
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 620
    .line 621
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    const/4 v1, 0x0

    .line 625
    invoke-static {v1, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    instance-of v2, v0, Landroid/widget/ImageView;

    .line 630
    .line 631
    const/4 v3, 0x0

    .line 632
    if-eqz v2, :cond_1e

    .line 633
    .line 634
    check-cast v0, Landroid/widget/ImageView;

    .line 635
    .line 636
    goto :goto_13

    .line 637
    :cond_1e
    move-object v0, v3

    .line 638
    :goto_13
    if-eqz v0, :cond_25

    .line 639
    .line 640
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 641
    .line 642
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 643
    .line 644
    .line 645
    const/4 v4, 0x1

    .line 646
    invoke-static {v4, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v2

    .line 650
    instance-of v4, v2, Ljava/lang/String;

    .line 651
    .line 652
    if-eqz v4, :cond_1f

    .line 653
    .line 654
    check-cast v2, Ljava/lang/String;

    .line 655
    .line 656
    goto :goto_14

    .line 657
    :cond_1f
    move-object v2, v3

    .line 658
    :goto_14
    if-eqz v2, :cond_25

    .line 659
    .line 660
    new-instance v4, Ljava/util/ArrayList;

    .line 661
    .line 662
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 663
    .line 664
    .line 665
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 666
    .line 667
    .line 668
    move-result-object v5

    .line 669
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v5

    .line 673
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 674
    .line 675
    .line 676
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 677
    .line 678
    .line 679
    move-result-object v5

    .line 680
    :goto_15
    const/16 v6, 0x8

    .line 681
    .line 682
    if-ge v1, v6, :cond_21

    .line 683
    .line 684
    if-nez v5, :cond_20

    .line 685
    .line 686
    goto :goto_16

    .line 687
    :cond_20
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 688
    .line 689
    .line 690
    move-result-object v6

    .line 691
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object v6

    .line 695
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 696
    .line 697
    .line 698
    invoke-interface {v5}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 699
    .line 700
    .line 701
    move-result-object v5

    .line 702
    :goto_16
    add-int/lit8 v1, v1, 0x1

    .line 703
    .line 704
    goto :goto_15

    .line 705
    :cond_21
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 706
    .line 707
    .line 708
    move-result-object v1

    .line 709
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 710
    .line 711
    .line 712
    move-result-object v1

    .line 713
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 714
    .line 715
    .line 716
    move-result-object v1

    .line 717
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 718
    .line 719
    .line 720
    invoke-static {v4}, La7/a;->h(Ljava/util/ArrayList;)Ld9/a;

    .line 721
    .line 722
    .line 723
    move-result-object v1

    .line 724
    iget-object v4, p0, Ld9/l;->b:Ld9/m;

    .line 725
    .line 726
    invoke-static {v4, v2, v1}, Ld9/m;->a(Ld9/m;Ljava/lang/String;Ld9/a;)Z

    .line 727
    .line 728
    .line 729
    move-result v1

    .line 730
    if-nez v1, :cond_22

    .line 731
    .line 732
    goto :goto_19

    .line 733
    :cond_22
    iget-object v1, v4, Ld9/m;->a:Lr8/g;

    .line 734
    .line 735
    iget-object v1, v1, Lr8/g;->a:Landroid/content/Context;

    .line 736
    .line 737
    invoke-static {v1, v2}, Ld9/o;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 738
    .line 739
    .line 740
    move-result-object v1

    .line 741
    if-eqz v1, :cond_25

    .line 742
    .line 743
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 744
    .line 745
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 746
    .line 747
    .line 748
    const/4 v5, 0x2

    .line 749
    invoke-static {v5, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    move-result-object v2

    .line 753
    instance-of v5, v2, Ljava/lang/Number;

    .line 754
    .line 755
    if-eqz v5, :cond_23

    .line 756
    .line 757
    check-cast v2, Ljava/lang/Number;

    .line 758
    .line 759
    goto :goto_17

    .line 760
    :cond_23
    move-object v2, v3

    .line 761
    :goto_17
    if-eqz v2, :cond_24

    .line 762
    .line 763
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 764
    .line 765
    .line 766
    move-result v2

    .line 767
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 768
    .line 769
    .line 770
    move-result-object v2

    .line 771
    goto :goto_18

    .line 772
    :cond_24
    move-object v2, v3

    .line 773
    :goto_18
    invoke-static {v4, v1, v2}, Ld9/m;->c(Ld9/m;Landroid/graphics/Bitmap;Ljava/lang/Float;)Landroid/graphics/Bitmap;

    .line 774
    .line 775
    .line 776
    move-result-object v1

    .line 777
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 778
    .line 779
    .line 780
    invoke-virtual {p1, v3}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 781
    .line 782
    .line 783
    :cond_25
    :goto_19
    return-void

    .line 784
    :sswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 785
    .line 786
    .line 787
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 788
    .line 789
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 790
    .line 791
    .line 792
    const/4 v1, 0x1

    .line 793
    invoke-static {v1, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    instance-of v1, v0, Ljava/lang/String;

    .line 798
    .line 799
    if-eqz v1, :cond_26

    .line 800
    .line 801
    check-cast v0, Ljava/lang/String;

    .line 802
    .line 803
    goto :goto_1a

    .line 804
    :cond_26
    const/4 v0, 0x0

    .line 805
    :goto_1a
    if-eqz v0, :cond_27

    .line 806
    .line 807
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 808
    .line 809
    .line 810
    move-result v1

    .line 811
    if-nez v1, :cond_27

    .line 812
    .line 813
    iget-object v1, p0, Ld9/l;->b:Ld9/m;

    .line 814
    .line 815
    iget-object v2, v1, Ld9/m;->d:Ljava/util/Map;

    .line 816
    .line 817
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 818
    .line 819
    .line 820
    check-cast v2, Ljava/util/Map;

    .line 821
    .line 822
    iget-object v3, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 823
    .line 824
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 825
    .line 826
    .line 827
    iget-object v0, v1, Ld9/m;->e:Ljava/util/Map;

    .line 828
    .line 829
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 830
    .line 831
    .line 832
    check-cast v0, Ljava/util/Map;

    .line 833
    .line 834
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 835
    .line 836
    iget-object v3, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 837
    .line 838
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 839
    .line 840
    .line 841
    const/4 v4, 0x0

    .line 842
    invoke-static {v4, v3}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 843
    .line 844
    .line 845
    move-result-object v3

    .line 846
    invoke-static {v3}, La7/a;->t(Ljava/lang/Object;)Ld9/a;

    .line 847
    .line 848
    .line 849
    move-result-object v3

    .line 850
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 851
    .line 852
    .line 853
    iget-object v0, v1, Ld9/m;->f:Ljava/util/Map;

    .line 854
    .line 855
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 856
    .line 857
    .line 858
    check-cast v0, Ljava/util/Map;

    .line 859
    .line 860
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 861
    .line 862
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 863
    .line 864
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 865
    .line 866
    .line 867
    const/4 v3, 0x2

    .line 868
    const/4 v4, 0x5

    .line 869
    invoke-static {v1, p1, v3, v4}, Ld9/m;->b(Ld9/m;[Ljava/lang/Object;II)F

    .line 870
    .line 871
    .line 872
    move-result p1

    .line 873
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 874
    .line 875
    .line 876
    move-result-object p1

    .line 877
    invoke-interface {v0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 878
    .line 879
    .line 880
    :cond_27
    return-void

    .line 881
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_2
        0x2 -> :sswitch_1
        0x5 -> :sswitch_0
    .end sparse-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v2, v1, Ld9/l;->a:I

    .line 6
    .line 7
    const-string v3, "enable"

    .line 8
    .line 9
    const-string v4, "Hchat_custom_friend_avatar_config"

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const-string v6, ""

    .line 13
    .line 14
    iget-object v7, v1, Ld9/l;->b:Ld9/m;

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    const/4 v9, 0x0

    .line 18
    packed-switch v2, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    :pswitch_0
    invoke-super/range {p0 .. p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v2, v7, Ld9/m;->a:Lr8/g;

    .line 29
    .line 30
    iget-object v10, v2, Lr8/g;->a:Landroid/content/Context;

    .line 31
    .line 32
    invoke-static {v10, v4}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 33
    .line 34
    .line 35
    move-result-object v11

    .line 36
    invoke-interface {v11, v3, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_5

    .line 41
    .line 42
    invoke-static {v10, v4}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    const-string v4, "scope_notifications"

    .line 47
    .line 48
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_5

    .line 53
    .line 54
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    array-length v3, v0

    .line 60
    if-nez v3, :cond_0

    .line 61
    .line 62
    move-object v0, v9

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    array-length v3, v0

    .line 65
    sub-int/2addr v3, v5

    .line 66
    aget-object v0, v0, v3

    .line 67
    .line 68
    :goto_0
    instance-of v3, v0, Landroid/app/Notification;

    .line 69
    .line 70
    if-eqz v3, :cond_1

    .line 71
    .line 72
    check-cast v0, Landroid/app/Notification;

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    move-object v0, v9

    .line 76
    :goto_1
    if-eqz v0, :cond_5

    .line 77
    .line 78
    sget-object v3, Le9/q;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 79
    .line 80
    iget-object v3, v0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 81
    .line 82
    if-eqz v3, :cond_2

    .line 83
    .line 84
    const-string v4, "hchat_custom_notification_talker"

    .line 85
    .line 86
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    :cond_2
    if-nez v9, :cond_3

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    move-object v6, v9

    .line 94
    :goto_2
    iget-object v2, v2, Lr8/g;->a:Landroid/content/Context;

    .line 95
    .line 96
    invoke-static {v2, v6}, Ld9/o;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    if-eqz v2, :cond_5

    .line 101
    .line 102
    const v3, 0x3dcccccd    # 0.1f

    .line 103
    .line 104
    .line 105
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-static {v7, v2, v3}, Ld9/m;->c(Ld9/m;Landroid/graphics/Bitmap;Ljava/lang/Float;)Landroid/graphics/Bitmap;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    :try_start_0
    iput-object v2, v0, Landroid/app/Notification;->largeIcon:Landroid/graphics/Bitmap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    .line 115
    :catchall_0
    invoke-static {v2}, Landroid/graphics/drawable/Icon;->createWithBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    const-string v3, "mLargeIcon"

    .line 123
    .line 124
    invoke-static {v0, v3, v2}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    iget-object v3, v0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 128
    .line 129
    if-nez v3, :cond_4

    .line 130
    .line 131
    new-instance v3, Landroid/os/Bundle;

    .line 132
    .line 133
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 134
    .line 135
    .line 136
    iput-object v3, v0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 137
    .line 138
    :cond_4
    iget-object v0, v0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 139
    .line 140
    const-string v3, "android.largeIcon"

    .line 141
    .line 142
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 143
    .line 144
    .line 145
    :cond_5
    return-void

    .line 146
    :pswitch_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 150
    .line 151
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-static {v8, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    instance-of v5, v2, Landroid/view/MenuItem;

    .line 159
    .line 160
    if-eqz v5, :cond_6

    .line 161
    .line 162
    check-cast v2, Landroid/view/MenuItem;

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_6
    move-object v2, v9

    .line 166
    :goto_3
    if-eqz v2, :cond_e

    .line 167
    .line 168
    invoke-interface {v2}, Landroid/view/MenuItem;->getItemId()I

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    const v7, 0x7a1001

    .line 173
    .line 174
    .line 175
    if-eq v5, v7, :cond_7

    .line 176
    .line 177
    goto/16 :goto_9

    .line 178
    .line 179
    :cond_7
    iget-object v14, v1, Ld9/l;->b:Ld9/m;

    .line 180
    .line 181
    iget-object v5, v14, Ld9/m;->g:Ljava/util/Map;

    .line 182
    .line 183
    invoke-interface {v5, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    check-cast v2, Lsf/e;

    .line 188
    .line 189
    if-eqz v2, :cond_e

    .line 190
    .line 191
    invoke-virtual {v0, v9}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    iget-object v0, v2, Lsf/e;->g:Ljava/lang/Object;

    .line 195
    .line 196
    move-object v15, v0

    .line 197
    check-cast v15, Landroid/app/Activity;

    .line 198
    .line 199
    iget-object v0, v2, Lsf/e;->h:Ljava/lang/Object;

    .line 200
    .line 201
    move-object v12, v0

    .line 202
    check-cast v12, Ljava/lang/String;

    .line 203
    .line 204
    iget-object v0, v14, Ld9/m;->a:Lr8/g;

    .line 205
    .line 206
    if-eqz v15, :cond_e

    .line 207
    .line 208
    iget-object v2, v0, Lr8/g;->a:Landroid/content/Context;

    .line 209
    .line 210
    invoke-static {v2, v4}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    invoke-interface {v2, v3, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    if-nez v2, :cond_8

    .line 219
    .line 220
    goto/16 :goto_9

    .line 221
    .line 222
    :cond_8
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 223
    .line 224
    invoke-static {v0, v12}, Ld9/o;->d(Landroid/content/Context;Ljava/lang/String;)Z

    .line 225
    .line 226
    .line 227
    move-result v13

    .line 228
    :try_start_1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contacts()Lg8/i;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    if-eqz v0, :cond_9

    .line 233
    .line 234
    invoke-virtual {v0, v12}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    if-eqz v0, :cond_9

    .line 239
    .line 240
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatContact;->displayName()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 244
    goto :goto_5

    .line 245
    :catchall_1
    move-exception v0

    .line 246
    goto :goto_4

    .line 247
    :cond_9
    move-object v0, v9

    .line 248
    goto :goto_5

    .line 249
    :goto_4
    new-instance v2, Lsf/f;

    .line 250
    .line 251
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 252
    .line 253
    .line 254
    move-object v0, v2

    .line 255
    :goto_5
    nop

    .line 256
    instance-of v2, v0, Lsf/f;

    .line 257
    .line 258
    if-eqz v2, :cond_a

    .line 259
    .line 260
    goto :goto_6

    .line 261
    :cond_a
    move-object v9, v0

    .line 262
    :goto_6
    check-cast v9, Ljava/lang/String;

    .line 263
    .line 264
    if-nez v9, :cond_b

    .line 265
    .line 266
    goto :goto_7

    .line 267
    :cond_b
    move-object v6, v9

    .line 268
    :goto_7
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    if-eqz v0, :cond_c

    .line 273
    .line 274
    move-object/from16 v17, v12

    .line 275
    .line 276
    goto :goto_8

    .line 277
    :cond_c
    move-object/from16 v17, v6

    .line 278
    .line 279
    :goto_8
    invoke-static {}, La/a;->E()Luf/c;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    new-instance v2, Lsf/e;

    .line 284
    .line 285
    const-string v3, "\u8bbe\u7f6e\u6216\u66f4\u6362\u5934\u50cf"

    .line 286
    .line 287
    const-string v4, "\u4ece\u7cfb\u7edf\u76f8\u518c\u6216\u6587\u4ef6\u4e2d\u9009\u62e9\u56fe\u7247"

    .line 288
    .line 289
    invoke-direct {v2, v3, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0, v2}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    if-eqz v13, :cond_d

    .line 296
    .line 297
    new-instance v2, Lsf/e;

    .line 298
    .line 299
    const-string v3, "\u6062\u590d\u5fae\u4fe1\u5934\u50cf"

    .line 300
    .line 301
    const-string v4, "\u79fb\u9664\u672c\u5730\u81ea\u5b9a\u4e49\u5934\u50cf"

    .line 302
    .line 303
    invoke-direct {v2, v3, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v0, v2}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    :cond_d
    invoke-static {v0}, La/a;->t(Luf/c;)Luf/c;

    .line 310
    .line 311
    .line 312
    move-result-object v18

    .line 313
    new-instance v19, Ld9/h;

    .line 314
    .line 315
    move-object v11, v15

    .line 316
    const/4 v15, 0x0

    .line 317
    move-object/from16 v10, v19

    .line 318
    .line 319
    invoke-direct/range {v10 .. v15}, Ld9/h;-><init>(Ljava/lang/Object;Ljava/io/Serializable;ZLjava/lang/Object;I)V

    .line 320
    .line 321
    .line 322
    new-instance v0, Lbi/c;

    .line 323
    .line 324
    const/16 v2, 0xd

    .line 325
    .line 326
    invoke-direct {v0, v2}, Lbi/c;-><init>(I)V

    .line 327
    .line 328
    .line 329
    sget-object v21, Lwb/lv;->j:Lwb/lv;

    .line 330
    .line 331
    const-string v16, "\u8bbe\u7f6e\u81ea\u5b9a\u4e49\u5934\u50cf"

    .line 332
    .line 333
    move-object/from16 v20, v0

    .line 334
    .line 335
    move-object v15, v11

    .line 336
    invoke-static/range {v15 .. v21}, Lwb/y2;->Q1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/a;Lwb/lv;)Lwb/kv;

    .line 337
    .line 338
    .line 339
    :cond_e
    :goto_9
    return-void

    .line 340
    :pswitch_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 344
    .line 345
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    invoke-static {v8, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    if-eqz v2, :cond_10

    .line 353
    .line 354
    iget-object v3, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 355
    .line 356
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    const/4 v4, 0x2

    .line 360
    invoke-static {v4, v3}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    instance-of v4, v3, Ljava/lang/String;

    .line 365
    .line 366
    if-eqz v4, :cond_f

    .line 367
    .line 368
    move-object v9, v3

    .line 369
    check-cast v9, Ljava/lang/String;

    .line 370
    .line 371
    :cond_f
    if-eqz v9, :cond_10

    .line 372
    .line 373
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 374
    .line 375
    .line 376
    move-result v3

    .line 377
    if-nez v3, :cond_10

    .line 378
    .line 379
    iget-object v3, v7, Ld9/m;->d:Ljava/util/Map;

    .line 380
    .line 381
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    check-cast v3, Ljava/util/Map;

    .line 385
    .line 386
    invoke-interface {v3, v2, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    iget-object v3, v7, Ld9/m;->e:Ljava/util/Map;

    .line 390
    .line 391
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    check-cast v3, Ljava/util/Map;

    .line 395
    .line 396
    iget-object v4, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 397
    .line 398
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    invoke-static {v5, v4}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v4

    .line 405
    invoke-static {v4}, La7/a;->t(Ljava/lang/Object;)Ld9/a;

    .line 406
    .line 407
    .line 408
    move-result-object v4

    .line 409
    invoke-interface {v3, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    iget-object v3, v7, Ld9/m;->f:Ljava/util/Map;

    .line 413
    .line 414
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    check-cast v3, Ljava/util/Map;

    .line 418
    .line 419
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 420
    .line 421
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    const/4 v4, 0x3

    .line 425
    const/4 v5, 0x6

    .line 426
    invoke-static {v7, v0, v4, v5}, Ld9/m;->b(Ld9/m;[Ljava/lang/Object;II)F

    .line 427
    .line 428
    .line 429
    move-result v0

    .line 430
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    invoke-interface {v3, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    :cond_10
    return-void

    .line 438
    :pswitch_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    iget-object v2, v7, Ld9/m;->d:Ljava/util/Map;

    .line 442
    .line 443
    iget-object v3, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 444
    .line 445
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    check-cast v2, Ljava/lang/String;

    .line 450
    .line 451
    if-nez v2, :cond_11

    .line 452
    .line 453
    goto :goto_a

    .line 454
    :cond_11
    move-object v6, v2

    .line 455
    :goto_a
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 456
    .line 457
    .line 458
    move-result v2

    .line 459
    if-eqz v2, :cond_12

    .line 460
    .line 461
    goto :goto_e

    .line 462
    :cond_12
    iget-object v2, v7, Ld9/m;->e:Ljava/util/Map;

    .line 463
    .line 464
    iget-object v3, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 465
    .line 466
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    check-cast v2, Ld9/a;

    .line 471
    .line 472
    if-eqz v2, :cond_13

    .line 473
    .line 474
    goto :goto_b

    .line 475
    :cond_13
    sget-object v2, Ld9/a;->l:Ld9/a;

    .line 476
    .line 477
    :goto_b
    invoke-static {v7, v6, v2}, Ld9/m;->a(Ld9/m;Ljava/lang/String;Ld9/a;)Z

    .line 478
    .line 479
    .line 480
    move-result v2

    .line 481
    if-nez v2, :cond_14

    .line 482
    .line 483
    goto :goto_e

    .line 484
    :cond_14
    iget-object v2, v7, Ld9/m;->a:Lr8/g;

    .line 485
    .line 486
    iget-object v2, v2, Lr8/g;->a:Landroid/content/Context;

    .line 487
    .line 488
    invoke-static {v2, v6}, Ld9/o;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    if-eqz v2, :cond_17

    .line 493
    .line 494
    iget-object v3, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 495
    .line 496
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 497
    .line 498
    .line 499
    invoke-static {v8, v3}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v3

    .line 503
    instance-of v4, v3, Landroid/graphics/Canvas;

    .line 504
    .line 505
    if-eqz v4, :cond_15

    .line 506
    .line 507
    check-cast v3, Landroid/graphics/Canvas;

    .line 508
    .line 509
    goto :goto_c

    .line 510
    :cond_15
    move-object v3, v9

    .line 511
    :goto_c
    if-eqz v3, :cond_17

    .line 512
    .line 513
    iget-object v4, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 514
    .line 515
    instance-of v5, v4, Landroid/graphics/drawable/Drawable;

    .line 516
    .line 517
    if-eqz v5, :cond_16

    .line 518
    .line 519
    move-object v5, v4

    .line 520
    check-cast v5, Landroid/graphics/drawable/Drawable;

    .line 521
    .line 522
    goto :goto_d

    .line 523
    :cond_16
    move-object v5, v9

    .line 524
    :goto_d
    if-eqz v5, :cond_17

    .line 525
    .line 526
    iget-object v6, v7, Ld9/m;->f:Ljava/util/Map;

    .line 527
    .line 528
    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v4

    .line 532
    check-cast v4, Ljava/lang/Float;

    .line 533
    .line 534
    invoke-static {v7, v2, v4}, Ld9/m;->c(Ld9/m;Landroid/graphics/Bitmap;Ljava/lang/Float;)Landroid/graphics/Bitmap;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 539
    .line 540
    .line 541
    move-result-object v4

    .line 542
    sget-object v5, Ld9/m;->j:Landroid/graphics/Paint;

    .line 543
    .line 544
    invoke-virtual {v3, v2, v9, v4, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v0, v9}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    :cond_17
    :goto_e
    return-void

    .line 551
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
