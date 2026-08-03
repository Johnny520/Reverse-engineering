.class public final Lwb/q0;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lwb/q0;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v2, v1, Lwb/q0;->a:I

    .line 6
    .line 7
    const/4 v5, 0x2

    .line 8
    const/4 v6, -0x1

    .line 9
    const/4 v7, 0x0

    .line 10
    const/4 v8, 0x0

    .line 11
    const/4 v9, 0x1

    .line 12
    packed-switch v2, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v7, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    instance-of v3, v2, Ljava/lang/Integer;

    .line 28
    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    check-cast v2, Ljava/lang/Integer;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v2, v8

    .line 35
    :goto_0
    if-eqz v2, :cond_1a

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    const v3, 0x4843525e    # 200009.47f

    .line 42
    .line 43
    .line 44
    if-eq v2, v3, :cond_1

    .line 45
    .line 46
    goto/16 :goto_11

    .line 47
    .line 48
    :cond_1
    sget-object v2, Lwb/hr;->a:Lwb/hr;

    .line 49
    .line 50
    monitor-enter v2

    .line 51
    :try_start_0
    sget-object v15, Lwb/hr;->c:Lwb/gr;

    .line 52
    .line 53
    sput-object v8, Lwb/hr;->c:Lwb/gr;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 54
    .line 55
    monitor-exit v2

    .line 56
    if-eqz v15, :cond_1a

    .line 57
    .line 58
    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-static {v9, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    instance-of v3, v2, Ljava/lang/Integer;

    .line 68
    .line 69
    if-eqz v3, :cond_2

    .line 70
    .line 71
    check-cast v2, Ljava/lang/Integer;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    move-object v2, v8

    .line 75
    :goto_1
    if-eqz v2, :cond_1a

    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eq v2, v6, :cond_3

    .line 82
    .line 83
    goto/16 :goto_11

    .line 84
    .line 85
    :cond_3
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-static {v5, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    instance-of v2, v0, Landroid/content/Intent;

    .line 95
    .line 96
    if-eqz v2, :cond_4

    .line 97
    .line 98
    check-cast v0, Landroid/content/Intent;

    .line 99
    .line 100
    move-object v2, v0

    .line 101
    goto :goto_2

    .line 102
    :cond_4
    move-object v2, v8

    .line 103
    :goto_2
    if-eqz v2, :cond_1a

    .line 104
    .line 105
    iget-object v12, v15, Lwb/gr;->a:Landroid/app/Activity;

    .line 106
    .line 107
    iget-object v13, v15, Lwb/gr;->b:Ljava/io/File;

    .line 108
    .line 109
    new-instance v3, Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    if-eqz v0, :cond_5

    .line 119
    .line 120
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    :cond_5
    invoke-virtual {v2}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    if-eqz v4, :cond_a

    .line 128
    .line 129
    invoke-virtual {v4}, Landroid/content/ClipData;->getItemCount()I

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    move v6, v7

    .line 134
    :goto_3
    if-lt v6, v5, :cond_6

    .line 135
    .line 136
    goto :goto_6

    .line 137
    :cond_6
    :try_start_1
    invoke-virtual {v4, v6}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    if-eqz v0, :cond_7

    .line 142
    .line 143
    invoke-virtual {v0}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    .line 144
    .line 145
    .line 146
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 147
    goto :goto_5

    .line 148
    :catchall_0
    move-exception v0

    .line 149
    goto :goto_4

    .line 150
    :cond_7
    move-object v0, v8

    .line 151
    goto :goto_5

    .line 152
    :goto_4
    new-instance v10, Lsf/f;

    .line 153
    .line 154
    invoke-direct {v10, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 155
    .line 156
    .line 157
    move-object v0, v10

    .line 158
    :goto_5
    nop

    .line 159
    instance-of v10, v0, Lsf/f;

    .line 160
    .line 161
    if-eqz v10, :cond_8

    .line 162
    .line 163
    move-object v0, v8

    .line 164
    :cond_8
    check-cast v0, Landroid/net/Uri;

    .line 165
    .line 166
    if-eqz v0, :cond_9

    .line 167
    .line 168
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    :cond_9
    add-int/lit8 v6, v6, 0x1

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_a
    :goto_6
    invoke-static {v3}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object v11

    .line 182
    new-instance v3, Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    :cond_b
    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-eqz v0, :cond_18

    .line 196
    .line 197
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    move-object v6, v5

    .line 202
    check-cast v6, Landroid/net/Uri;

    .line 203
    .line 204
    sget-object v0, Lwb/hr;->a:Lwb/hr;

    .line 205
    .line 206
    invoke-virtual {v6}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    const-string v8, "content"

    .line 211
    .line 212
    invoke-static {v0, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-nez v0, :cond_d

    .line 217
    .line 218
    :cond_c
    :goto_8
    move v0, v7

    .line 219
    goto/16 :goto_f

    .line 220
    .line 221
    :cond_d
    invoke-virtual {v12}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 222
    .line 223
    .line 224
    move-result-object v8

    .line 225
    :try_start_2
    invoke-virtual {v8}, Landroid/content/ContentResolver;->getPersistedUriPermissions()Ljava/util/List;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 233
    .line 234
    .line 235
    move-result v10

    .line 236
    if-eqz v10, :cond_f

    .line 237
    .line 238
    :cond_e
    move v0, v7

    .line 239
    goto :goto_9

    .line 240
    :cond_f
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    :cond_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 245
    .line 246
    .line 247
    move-result v10

    .line 248
    if-eqz v10, :cond_e

    .line 249
    .line 250
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v10

    .line 254
    check-cast v10, Landroid/content/UriPermission;

    .line 255
    .line 256
    invoke-virtual {v10}, Landroid/content/UriPermission;->getUri()Landroid/net/Uri;

    .line 257
    .line 258
    .line 259
    move-result-object v14

    .line 260
    invoke-static {v14, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v14

    .line 264
    if-eqz v14, :cond_10

    .line 265
    .line 266
    invoke-virtual {v10}, Landroid/content/UriPermission;->isReadPermission()Z

    .line 267
    .line 268
    .line 269
    move-result v10

    .line 270
    if-eqz v10, :cond_10

    .line 271
    .line 272
    move v0, v9

    .line 273
    goto :goto_9

    .line 274
    :catchall_1
    move-exception v0

    .line 275
    goto :goto_a

    .line 276
    :goto_9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 277
    .line 278
    .line 279
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 280
    goto :goto_b

    .line 281
    :goto_a
    new-instance v10, Lsf/f;

    .line 282
    .line 283
    invoke-direct {v10, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 284
    .line 285
    .line 286
    move-object v0, v10

    .line 287
    :goto_b
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 288
    .line 289
    instance-of v14, v0, Lsf/f;

    .line 290
    .line 291
    if-eqz v14, :cond_11

    .line 292
    .line 293
    move-object v0, v10

    .line 294
    :cond_11
    check-cast v0, Ljava/lang/Boolean;

    .line 295
    .line 296
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    if-eqz v0, :cond_12

    .line 301
    .line 302
    move v0, v9

    .line 303
    goto :goto_f

    .line 304
    :cond_12
    invoke-virtual {v2}, Landroid/content/Intent;->getFlags()I

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    and-int/lit8 v10, v0, 0x1

    .line 309
    .line 310
    if-eqz v10, :cond_c

    .line 311
    .line 312
    and-int/lit8 v0, v0, 0x40

    .line 313
    .line 314
    if-nez v0, :cond_13

    .line 315
    .line 316
    goto :goto_8

    .line 317
    :cond_13
    :try_start_3
    invoke-virtual {v8, v6, v9}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v8}, Landroid/content/ContentResolver;->getPersistedUriPermissions()Ljava/util/List;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 328
    .line 329
    .line 330
    move-result v8

    .line 331
    if-eqz v8, :cond_15

    .line 332
    .line 333
    :cond_14
    move v0, v7

    .line 334
    goto :goto_c

    .line 335
    :cond_15
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    :cond_16
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 340
    .line 341
    .line 342
    move-result v8

    .line 343
    if-eqz v8, :cond_14

    .line 344
    .line 345
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v8

    .line 349
    check-cast v8, Landroid/content/UriPermission;

    .line 350
    .line 351
    invoke-virtual {v8}, Landroid/content/UriPermission;->getUri()Landroid/net/Uri;

    .line 352
    .line 353
    .line 354
    move-result-object v10

    .line 355
    invoke-static {v10, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v10

    .line 359
    if-eqz v10, :cond_16

    .line 360
    .line 361
    invoke-virtual {v8}, Landroid/content/UriPermission;->isReadPermission()Z

    .line 362
    .line 363
    .line 364
    move-result v8

    .line 365
    if-eqz v8, :cond_16

    .line 366
    .line 367
    move v0, v9

    .line 368
    goto :goto_c

    .line 369
    :catchall_2
    move-exception v0

    .line 370
    goto :goto_d

    .line 371
    :goto_c
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 372
    .line 373
    .line 374
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 375
    goto :goto_e

    .line 376
    :goto_d
    new-instance v6, Lsf/f;

    .line 377
    .line 378
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 379
    .line 380
    .line 381
    move-object v0, v6

    .line 382
    :goto_e
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 383
    .line 384
    instance-of v8, v0, Lsf/f;

    .line 385
    .line 386
    if-eqz v8, :cond_17

    .line 387
    .line 388
    move-object v0, v6

    .line 389
    :cond_17
    check-cast v0, Ljava/lang/Boolean;

    .line 390
    .line 391
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 392
    .line 393
    .line 394
    move-result v0

    .line 395
    :goto_f
    if-eqz v0, :cond_b

    .line 396
    .line 397
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    goto/16 :goto_7

    .line 401
    .line 402
    :cond_18
    new-instance v14, Ljava/util/HashSet;

    .line 403
    .line 404
    invoke-direct {v14}, Ljava/util/HashSet;-><init>()V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 412
    .line 413
    .line 414
    move-result v2

    .line 415
    if-eqz v2, :cond_19

    .line 416
    .line 417
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    check-cast v2, Landroid/net/Uri;

    .line 422
    .line 423
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    invoke-virtual {v14, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    goto :goto_10

    .line 431
    :cond_19
    new-instance v0, Ljava/lang/Thread;

    .line 432
    .line 433
    new-instance v10, Lca/x;

    .line 434
    .line 435
    const/16 v16, 0x11

    .line 436
    .line 437
    invoke-direct/range {v10 .. v16}, Lca/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 438
    .line 439
    .line 440
    const-string v2, "Hchat-Agent-Attachment-Copy"

    .line 441
    .line 442
    invoke-direct {v0, v10, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 446
    .line 447
    .line 448
    goto :goto_11

    .line 449
    :catchall_3
    move-exception v0

    .line 450
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 451
    throw v0

    .line 452
    :cond_1a
    :goto_11
    return-void

    .line 453
    :pswitch_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 454
    .line 455
    .line 456
    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 457
    .line 458
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    invoke-static {v7, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    instance-of v10, v2, Ljava/lang/Integer;

    .line 466
    .line 467
    if-eqz v10, :cond_1b

    .line 468
    .line 469
    check-cast v2, Ljava/lang/Integer;

    .line 470
    .line 471
    goto :goto_12

    .line 472
    :cond_1b
    move-object v2, v8

    .line 473
    :goto_12
    if-eqz v2, :cond_30

    .line 474
    .line 475
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 476
    .line 477
    .line 478
    move-result v2

    .line 479
    const v10, 0x4843525a    # 200009.4f

    .line 480
    .line 481
    .line 482
    if-eq v2, v10, :cond_1c

    .line 483
    .line 484
    goto/16 :goto_1e

    .line 485
    .line 486
    :cond_1c
    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 487
    .line 488
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 489
    .line 490
    .line 491
    invoke-static {v9, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    instance-of v10, v2, Ljava/lang/Integer;

    .line 496
    .line 497
    if-eqz v10, :cond_1d

    .line 498
    .line 499
    check-cast v2, Ljava/lang/Integer;

    .line 500
    .line 501
    goto :goto_13

    .line 502
    :cond_1d
    move-object v2, v8

    .line 503
    :goto_13
    if-eqz v2, :cond_30

    .line 504
    .line 505
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 506
    .line 507
    .line 508
    move-result v2

    .line 509
    if-eq v2, v6, :cond_1e

    .line 510
    .line 511
    goto/16 :goto_1e

    .line 512
    .line 513
    :cond_1e
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 514
    .line 515
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 516
    .line 517
    .line 518
    invoke-static {v5, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    instance-of v2, v0, Landroid/content/Intent;

    .line 523
    .line 524
    if-eqz v2, :cond_1f

    .line 525
    .line 526
    check-cast v0, Landroid/content/Intent;

    .line 527
    .line 528
    move-object v2, v0

    .line 529
    goto :goto_14

    .line 530
    :cond_1f
    move-object v2, v8

    .line 531
    :goto_14
    if-eqz v2, :cond_30

    .line 532
    .line 533
    sget-object v5, Lwb/wq;->d:Landroid/app/Activity;

    .line 534
    .line 535
    if-eqz v5, :cond_30

    .line 536
    .line 537
    new-instance v0, Ljava/util/ArrayList;

    .line 538
    .line 539
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 543
    .line 544
    .line 545
    move-result-object v6

    .line 546
    if-eqz v6, :cond_20

    .line 547
    .line 548
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 549
    .line 550
    .line 551
    :cond_20
    invoke-virtual {v2}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    .line 552
    .line 553
    .line 554
    move-result-object v6

    .line 555
    if-eqz v6, :cond_23

    .line 556
    .line 557
    invoke-virtual {v6}, Landroid/content/ClipData;->getItemCount()I

    .line 558
    .line 559
    .line 560
    move-result v10

    .line 561
    :goto_15
    if-lt v7, v10, :cond_21

    .line 562
    .line 563
    goto :goto_16

    .line 564
    :cond_21
    :try_start_5
    invoke-virtual {v6, v7}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 565
    .line 566
    .line 567
    move-result-object v11

    .line 568
    if-eqz v11, :cond_22

    .line 569
    .line 570
    invoke-virtual {v11}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    .line 571
    .line 572
    .line 573
    move-result-object v11

    .line 574
    if-eqz v11, :cond_22

    .line 575
    .line 576
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 577
    .line 578
    .line 579
    :catchall_4
    :cond_22
    add-int/lit8 v7, v7, 0x1

    .line 580
    .line 581
    goto :goto_15

    .line 582
    :cond_23
    :goto_16
    const-string v6, "android.intent.extra.STREAM"

    .line 583
    .line 584
    invoke-virtual {v2, v6}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 585
    .line 586
    .line 587
    move-result-object v6

    .line 588
    instance-of v7, v6, Landroid/net/Uri;

    .line 589
    .line 590
    if-eqz v7, :cond_24

    .line 591
    .line 592
    check-cast v6, Landroid/net/Uri;

    .line 593
    .line 594
    goto :goto_17

    .line 595
    :cond_24
    move-object v6, v8

    .line 596
    :goto_17
    if-eqz v6, :cond_25

    .line 597
    .line 598
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 599
    .line 600
    .line 601
    :cond_25
    invoke-static {v0}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    new-instance v6, Ljava/util/ArrayList;

    .line 610
    .line 611
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 612
    .line 613
    .line 614
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 615
    .line 616
    .line 617
    move-result-object v7

    .line 618
    :cond_26
    :goto_18
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 619
    .line 620
    .line 621
    move-result v0

    .line 622
    if-eqz v0, :cond_2f

    .line 623
    .line 624
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    check-cast v0, Landroid/net/Uri;

    .line 629
    .line 630
    sget-object v10, Lwb/wq;->a:Lwb/wq;

    .line 631
    .line 632
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object v10

    .line 636
    const-string v11, "content"

    .line 637
    .line 638
    invoke-static {v10, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 639
    .line 640
    .line 641
    move-result v10

    .line 642
    if-nez v10, :cond_27

    .line 643
    .line 644
    goto :goto_19

    .line 645
    :cond_27
    :try_start_6
    invoke-virtual {v2}, Landroid/content/Intent;->getFlags()I

    .line 646
    .line 647
    .line 648
    move-result v10

    .line 649
    and-int/2addr v10, v9

    .line 650
    if-nez v10, :cond_28

    .line 651
    .line 652
    goto :goto_19

    .line 653
    :cond_28
    invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 654
    .line 655
    .line 656
    move-result-object v10

    .line 657
    invoke-virtual {v10, v0, v9}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 658
    .line 659
    .line 660
    :catchall_5
    :goto_19
    sget-object v10, Lwb/wq;->a:Lwb/wq;

    .line 661
    .line 662
    const-string v10, "_"

    .line 663
    .line 664
    const-string v11, "scheduled_task_file"

    .line 665
    .line 666
    const-string v12, "file"

    .line 667
    .line 668
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v13

    .line 672
    invoke-virtual {v12, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 673
    .line 674
    .line 675
    move-result v12

    .line 676
    if-eqz v12, :cond_2a

    .line 677
    .line 678
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v12

    .line 682
    if-nez v12, :cond_29

    .line 683
    .line 684
    const-string v12, ""

    .line 685
    .line 686
    :cond_29
    invoke-static {v12}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 687
    .line 688
    .line 689
    move-result v13

    .line 690
    if-nez v13, :cond_2a

    .line 691
    .line 692
    invoke-static {v12}, Leh/a;->y(Ljava/lang/String;)Z

    .line 693
    .line 694
    .line 695
    move-result v13

    .line 696
    if-eqz v13, :cond_2a

    .line 697
    .line 698
    const-wide/16 v16, 0x0

    .line 699
    .line 700
    goto/16 :goto_1d

    .line 701
    .line 702
    :cond_2a
    :try_start_7
    invoke-static {v5, v0}, Lwb/ho;->C6(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    .line 703
    .line 704
    .line 705
    move-result-object v12

    .line 706
    if-eqz v12, :cond_2b

    .line 707
    .line 708
    goto :goto_1a

    .line 709
    :cond_2b
    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v12

    .line 713
    if-eqz v12, :cond_2c

    .line 714
    .line 715
    goto :goto_1a

    .line 716
    :cond_2c
    move-object v12, v11

    .line 717
    :goto_1a
    const-string v13, "[\\\\/:*?\"<>|]"

    .line 718
    .line 719
    invoke-static {v13}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 720
    .line 721
    .line 722
    move-result-object v13

    .line 723
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 724
    .line 725
    .line 726
    invoke-virtual {v13, v12}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 727
    .line 728
    .line 729
    move-result-object v12

    .line 730
    invoke-virtual {v12, v10}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 731
    .line 732
    .line 733
    move-result-object v12

    .line 734
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 735
    .line 736
    .line 737
    invoke-static {v12}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 738
    .line 739
    .line 740
    move-result-object v12

    .line 741
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 742
    .line 743
    .line 744
    move-result-object v12

    .line 745
    invoke-static {v12}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 746
    .line 747
    .line 748
    move-result v13

    .line 749
    if-eqz v13, :cond_2d

    .line 750
    .line 751
    goto :goto_1b

    .line 752
    :cond_2d
    move-object v11, v12

    .line 753
    :goto_1b
    new-instance v12, Ljava/io/File;

    .line 754
    .line 755
    invoke-virtual {v5}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 756
    .line 757
    .line 758
    move-result-object v13

    .line 759
    const-string v14, "Hchat/scheduled_task"

    .line 760
    .line 761
    invoke-direct {v12, v13, v14}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 762
    .line 763
    .line 764
    invoke-virtual {v12}, Ljava/io/File;->mkdirs()Z

    .line 765
    .line 766
    .line 767
    new-instance v13, Ljava/io/File;

    .line 768
    .line 769
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 770
    .line 771
    .line 772
    move-result-wide v14
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_a

    .line 773
    const-wide/16 v16, 0x0

    .line 774
    .line 775
    :try_start_8
    new-instance v3, Ljava/lang/StringBuilder;

    .line 776
    .line 777
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 778
    .line 779
    .line 780
    invoke-virtual {v3, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 781
    .line 782
    .line 783
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 784
    .line 785
    .line 786
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 787
    .line 788
    .line 789
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 790
    .line 791
    .line 792
    move-result-object v3

    .line 793
    invoke-direct {v13, v12, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 794
    .line 795
    .line 796
    invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 797
    .line 798
    .line 799
    move-result-object v3

    .line 800
    invoke-virtual {v3, v0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 801
    .line 802
    .line 803
    move-result-object v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_b

    .line 804
    if-eqz v3, :cond_2e

    .line 805
    .line 806
    :try_start_9
    new-instance v4, Ljava/io/FileOutputStream;

    .line 807
    .line 808
    invoke-direct {v4, v13}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 809
    .line 810
    .line 811
    :try_start_a
    invoke-static {v3, v4}, Lg4/a;->j(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 812
    .line 813
    .line 814
    :try_start_b
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 815
    .line 816
    .line 817
    :try_start_c
    invoke-interface {v3}, Ljava/io/Closeable;->close()V

    .line 818
    .line 819
    .line 820
    invoke-virtual {v13}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 821
    .line 822
    .line 823
    move-result-object v12

    .line 824
    invoke-virtual {v13}, Ljava/io/File;->isFile()Z

    .line 825
    .line 826
    .line 827
    move-result v0

    .line 828
    if-eqz v0, :cond_2e

    .line 829
    .line 830
    invoke-virtual {v13}, Ljava/io/File;->length()J

    .line 831
    .line 832
    .line 833
    move-result-wide v3
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_b

    .line 834
    cmp-long v0, v3, v16

    .line 835
    .line 836
    if-lez v0, :cond_2e

    .line 837
    .line 838
    goto :goto_1d

    .line 839
    :catchall_6
    move-exception v0

    .line 840
    move-object v4, v0

    .line 841
    goto :goto_1c

    .line 842
    :catchall_7
    move-exception v0

    .line 843
    move-object v10, v0

    .line 844
    :try_start_d
    throw v10
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    .line 845
    :catchall_8
    move-exception v0

    .line 846
    :try_start_e
    invoke-static {v4, v10}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 847
    .line 848
    .line 849
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 850
    :goto_1c
    :try_start_f
    throw v4
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    .line 851
    :catchall_9
    move-exception v0

    .line 852
    :try_start_10
    invoke-static {v3, v4}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 853
    .line 854
    .line 855
    throw v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_b

    .line 856
    :catchall_a
    const-wide/16 v16, 0x0

    .line 857
    .line 858
    :catchall_b
    :cond_2e
    move-object v12, v8

    .line 859
    :goto_1d
    if-eqz v12, :cond_26

    .line 860
    .line 861
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 862
    .line 863
    .line 864
    goto/16 :goto_18

    .line 865
    .line 866
    :cond_2f
    invoke-static {v6}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 867
    .line 868
    .line 869
    move-result-object v0

    .line 870
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 871
    .line 872
    .line 873
    move-result-object v0

    .line 874
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 875
    .line 876
    .line 877
    move-result v2

    .line 878
    if-nez v2, :cond_30

    .line 879
    .line 880
    sget-object v2, Lwb/wq;->c:Lfg/l;

    .line 881
    .line 882
    if-eqz v2, :cond_30

    .line 883
    .line 884
    invoke-interface {v2, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 885
    .line 886
    .line 887
    :cond_30
    :goto_1e
    return-void

    .line 888
    :pswitch_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 889
    .line 890
    .line 891
    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 892
    .line 893
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 894
    .line 895
    .line 896
    invoke-static {v7, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 897
    .line 898
    .line 899
    move-result-object v2

    .line 900
    instance-of v3, v2, Ljava/lang/Integer;

    .line 901
    .line 902
    if-eqz v3, :cond_31

    .line 903
    .line 904
    check-cast v2, Ljava/lang/Integer;

    .line 905
    .line 906
    goto :goto_1f

    .line 907
    :cond_31
    move-object v2, v8

    .line 908
    :goto_1f
    if-eqz v2, :cond_43

    .line 909
    .line 910
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 911
    .line 912
    .line 913
    move-result v2

    .line 914
    const v3, 0x48435254    # 200009.31f

    .line 915
    .line 916
    .line 917
    if-eq v2, v3, :cond_32

    .line 918
    .line 919
    const v4, 0x48435255    # 200009.33f

    .line 920
    .line 921
    .line 922
    if-eq v2, v4, :cond_32

    .line 923
    .line 924
    goto/16 :goto_28

    .line 925
    .line 926
    :cond_32
    iget-object v4, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 927
    .line 928
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 929
    .line 930
    .line 931
    invoke-static {v9, v4}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 932
    .line 933
    .line 934
    move-result-object v4

    .line 935
    instance-of v10, v4, Ljava/lang/Integer;

    .line 936
    .line 937
    if-eqz v10, :cond_33

    .line 938
    .line 939
    check-cast v4, Ljava/lang/Integer;

    .line 940
    .line 941
    goto :goto_20

    .line 942
    :cond_33
    move-object v4, v8

    .line 943
    :goto_20
    if-eqz v4, :cond_43

    .line 944
    .line 945
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 946
    .line 947
    .line 948
    move-result v4

    .line 949
    if-eq v4, v6, :cond_34

    .line 950
    .line 951
    goto/16 :goto_28

    .line 952
    .line 953
    :cond_34
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 954
    .line 955
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 956
    .line 957
    .line 958
    invoke-static {v5, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 959
    .line 960
    .line 961
    move-result-object v0

    .line 962
    instance-of v4, v0, Landroid/content/Intent;

    .line 963
    .line 964
    if-eqz v4, :cond_35

    .line 965
    .line 966
    check-cast v0, Landroid/content/Intent;

    .line 967
    .line 968
    goto :goto_21

    .line 969
    :cond_35
    move-object v0, v8

    .line 970
    :goto_21
    if-eqz v0, :cond_43

    .line 971
    .line 972
    sget-object v4, Lwb/vq;->a:Lwb/vq;

    .line 973
    .line 974
    if-ne v2, v3, :cond_37

    .line 975
    .line 976
    const-string v2, "android.intent.extra.ringtone.PICKED_URI"

    .line 977
    .line 978
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 979
    .line 980
    .line 981
    move-result-object v2

    .line 982
    instance-of v3, v2, Landroid/net/Uri;

    .line 983
    .line 984
    if-eqz v3, :cond_36

    .line 985
    .line 986
    check-cast v2, Landroid/net/Uri;

    .line 987
    .line 988
    goto :goto_22

    .line 989
    :cond_36
    move-object v2, v8

    .line 990
    :goto_22
    if-eqz v2, :cond_37

    .line 991
    .line 992
    goto :goto_26

    .line 993
    :cond_37
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 994
    .line 995
    .line 996
    move-result-object v2

    .line 997
    if-eqz v2, :cond_38

    .line 998
    .line 999
    goto :goto_26

    .line 1000
    :cond_38
    const-string v2, "android.intent.extra.STREAM"

    .line 1001
    .line 1002
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v2

    .line 1006
    instance-of v3, v2, Landroid/net/Uri;

    .line 1007
    .line 1008
    if-eqz v3, :cond_39

    .line 1009
    .line 1010
    check-cast v2, Landroid/net/Uri;

    .line 1011
    .line 1012
    goto :goto_23

    .line 1013
    :cond_39
    move-object v2, v8

    .line 1014
    :goto_23
    if-eqz v2, :cond_3a

    .line 1015
    .line 1016
    goto :goto_26

    .line 1017
    :cond_3a
    invoke-virtual {v0}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v2

    .line 1021
    if-eqz v2, :cond_3c

    .line 1022
    .line 1023
    invoke-virtual {v2}, Landroid/content/ClipData;->getItemCount()I

    .line 1024
    .line 1025
    .line 1026
    move-result v3

    .line 1027
    if-gtz v3, :cond_3b

    .line 1028
    .line 1029
    goto :goto_24

    .line 1030
    :cond_3b
    :try_start_11
    invoke-virtual {v2, v7}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v2

    .line 1034
    if-eqz v2, :cond_3c

    .line 1035
    .line 1036
    invoke-virtual {v2}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_c

    .line 1040
    goto :goto_25

    .line 1041
    :catchall_c
    :cond_3c
    :goto_24
    move-object v2, v8

    .line 1042
    :goto_25
    if-eqz v2, :cond_3d

    .line 1043
    .line 1044
    goto :goto_26

    .line 1045
    :cond_3d
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v2

    .line 1049
    invoke-static {v2}, Lwb/vq;->a(Landroid/os/Bundle;)Landroid/net/Uri;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v2

    .line 1053
    :goto_26
    sget-object v3, Lwb/vq;->a:Lwb/vq;

    .line 1054
    .line 1055
    if-eqz v2, :cond_40

    .line 1056
    .line 1057
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v3

    .line 1061
    const-string v4, "content"

    .line 1062
    .line 1063
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1064
    .line 1065
    .line 1066
    move-result v3

    .line 1067
    if-nez v3, :cond_3e

    .line 1068
    .line 1069
    goto :goto_27

    .line 1070
    :cond_3e
    :try_start_12
    invoke-virtual {v0}, Landroid/content/Intent;->getFlags()I

    .line 1071
    .line 1072
    .line 1073
    move-result v0

    .line 1074
    and-int/2addr v0, v9

    .line 1075
    if-nez v0, :cond_3f

    .line 1076
    .line 1077
    goto :goto_27

    .line 1078
    :cond_3f
    sget-object v0, Lwb/vq;->d:Landroid/app/Activity;

    .line 1079
    .line 1080
    if-eqz v0, :cond_40

    .line 1081
    .line 1082
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v0

    .line 1086
    if-eqz v0, :cond_40

    .line 1087
    .line 1088
    invoke-virtual {v0, v2, v9}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_d

    .line 1089
    .line 1090
    .line 1091
    :catchall_d
    :cond_40
    :goto_27
    sget-object v0, Lwb/vq;->c:Lfg/l;

    .line 1092
    .line 1093
    if-eqz v0, :cond_43

    .line 1094
    .line 1095
    if-eqz v2, :cond_41

    .line 1096
    .line 1097
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v8

    .line 1101
    :cond_41
    if-nez v8, :cond_42

    .line 1102
    .line 1103
    const-string v8, ""

    .line 1104
    .line 1105
    :cond_42
    invoke-interface {v0, v8}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1106
    .line 1107
    .line 1108
    :cond_43
    :goto_28
    return-void

    .line 1109
    :pswitch_2
    const-wide/16 v16, 0x0

    .line 1110
    .line 1111
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1112
    .line 1113
    .line 1114
    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1115
    .line 1116
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1117
    .line 1118
    .line 1119
    invoke-static {v7, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v2

    .line 1123
    instance-of v3, v2, Ljava/lang/Integer;

    .line 1124
    .line 1125
    if-eqz v3, :cond_44

    .line 1126
    .line 1127
    check-cast v2, Ljava/lang/Integer;

    .line 1128
    .line 1129
    goto :goto_29

    .line 1130
    :cond_44
    move-object v2, v8

    .line 1131
    :goto_29
    if-eqz v2, :cond_59

    .line 1132
    .line 1133
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1134
    .line 1135
    .line 1136
    move-result v2

    .line 1137
    const v3, 0x48435256    # 200009.34f

    .line 1138
    .line 1139
    .line 1140
    if-eq v2, v3, :cond_45

    .line 1141
    .line 1142
    goto/16 :goto_35

    .line 1143
    .line 1144
    :cond_45
    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1145
    .line 1146
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1147
    .line 1148
    .line 1149
    invoke-static {v9, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v2

    .line 1153
    instance-of v3, v2, Ljava/lang/Integer;

    .line 1154
    .line 1155
    if-eqz v3, :cond_46

    .line 1156
    .line 1157
    check-cast v2, Ljava/lang/Integer;

    .line 1158
    .line 1159
    goto :goto_2a

    .line 1160
    :cond_46
    move-object v2, v8

    .line 1161
    :goto_2a
    if-eqz v2, :cond_59

    .line 1162
    .line 1163
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1164
    .line 1165
    .line 1166
    move-result v2

    .line 1167
    if-eq v2, v6, :cond_47

    .line 1168
    .line 1169
    goto/16 :goto_35

    .line 1170
    .line 1171
    :cond_47
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1172
    .line 1173
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1174
    .line 1175
    .line 1176
    invoke-static {v5, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v0

    .line 1180
    instance-of v2, v0, Landroid/content/Intent;

    .line 1181
    .line 1182
    if-eqz v2, :cond_48

    .line 1183
    .line 1184
    check-cast v0, Landroid/content/Intent;

    .line 1185
    .line 1186
    move-object v2, v0

    .line 1187
    goto :goto_2b

    .line 1188
    :cond_48
    move-object v2, v8

    .line 1189
    :goto_2b
    if-eqz v2, :cond_59

    .line 1190
    .line 1191
    sget-object v3, Lwb/iq;->d:Landroid/app/Activity;

    .line 1192
    .line 1193
    if-eqz v3, :cond_59

    .line 1194
    .line 1195
    new-instance v0, Ljava/util/ArrayList;

    .line 1196
    .line 1197
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1198
    .line 1199
    .line 1200
    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v4

    .line 1204
    if-eqz v4, :cond_49

    .line 1205
    .line 1206
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1207
    .line 1208
    .line 1209
    :cond_49
    invoke-virtual {v2}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v4

    .line 1213
    if-eqz v4, :cond_4c

    .line 1214
    .line 1215
    invoke-virtual {v4}, Landroid/content/ClipData;->getItemCount()I

    .line 1216
    .line 1217
    .line 1218
    move-result v5

    .line 1219
    :goto_2c
    if-lt v7, v5, :cond_4a

    .line 1220
    .line 1221
    goto :goto_2d

    .line 1222
    :cond_4a
    :try_start_13
    invoke-virtual {v4, v7}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v6

    .line 1226
    if-eqz v6, :cond_4b

    .line 1227
    .line 1228
    invoke-virtual {v6}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v6

    .line 1232
    if-eqz v6, :cond_4b

    .line 1233
    .line 1234
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_e

    .line 1235
    .line 1236
    .line 1237
    :catchall_e
    :cond_4b
    add-int/lit8 v7, v7, 0x1

    .line 1238
    .line 1239
    goto :goto_2c

    .line 1240
    :cond_4c
    :goto_2d
    const-string v4, "android.intent.extra.STREAM"

    .line 1241
    .line 1242
    invoke-virtual {v2, v4}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v4

    .line 1246
    instance-of v5, v4, Landroid/net/Uri;

    .line 1247
    .line 1248
    if-eqz v5, :cond_4d

    .line 1249
    .line 1250
    check-cast v4, Landroid/net/Uri;

    .line 1251
    .line 1252
    goto :goto_2e

    .line 1253
    :cond_4d
    move-object v4, v8

    .line 1254
    :goto_2e
    if-eqz v4, :cond_4e

    .line 1255
    .line 1256
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1257
    .line 1258
    .line 1259
    :cond_4e
    invoke-static {v0}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v0

    .line 1263
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v0

    .line 1267
    new-instance v4, Ljava/util/ArrayList;

    .line 1268
    .line 1269
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1270
    .line 1271
    .line 1272
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v5

    .line 1276
    :cond_4f
    :goto_2f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1277
    .line 1278
    .line 1279
    move-result v0

    .line 1280
    if-eqz v0, :cond_58

    .line 1281
    .line 1282
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v0

    .line 1286
    check-cast v0, Landroid/net/Uri;

    .line 1287
    .line 1288
    sget-object v6, Lwb/iq;->a:Lwb/iq;

    .line 1289
    .line 1290
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v6

    .line 1294
    const-string v7, "content"

    .line 1295
    .line 1296
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1297
    .line 1298
    .line 1299
    move-result v6

    .line 1300
    if-nez v6, :cond_50

    .line 1301
    .line 1302
    goto :goto_30

    .line 1303
    :cond_50
    :try_start_14
    invoke-virtual {v2}, Landroid/content/Intent;->getFlags()I

    .line 1304
    .line 1305
    .line 1306
    move-result v6

    .line 1307
    and-int/2addr v6, v9

    .line 1308
    if-nez v6, :cond_51

    .line 1309
    .line 1310
    goto :goto_30

    .line 1311
    :cond_51
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v6

    .line 1315
    invoke-virtual {v6, v0, v9}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_f

    .line 1316
    .line 1317
    .line 1318
    :catchall_f
    :goto_30
    sget-object v6, Lwb/iq;->a:Lwb/iq;

    .line 1319
    .line 1320
    const-string v6, "_"

    .line 1321
    .line 1322
    const-string v7, "reply_file"

    .line 1323
    .line 1324
    const-string v10, "file"

    .line 1325
    .line 1326
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v11

    .line 1330
    invoke-virtual {v10, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1331
    .line 1332
    .line 1333
    move-result v10

    .line 1334
    if-eqz v10, :cond_53

    .line 1335
    .line 1336
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v10

    .line 1340
    if-nez v10, :cond_52

    .line 1341
    .line 1342
    const-string v10, ""

    .line 1343
    .line 1344
    :cond_52
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1345
    .line 1346
    .line 1347
    move-result v11

    .line 1348
    if-nez v11, :cond_53

    .line 1349
    .line 1350
    invoke-static {v10}, Leh/a;->y(Ljava/lang/String;)Z

    .line 1351
    .line 1352
    .line 1353
    move-result v11

    .line 1354
    if-eqz v11, :cond_53

    .line 1355
    .line 1356
    goto/16 :goto_34

    .line 1357
    .line 1358
    :cond_53
    :try_start_15
    invoke-static {v3, v0}, Lwb/ho;->C6(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    .line 1359
    .line 1360
    .line 1361
    move-result-object v10

    .line 1362
    if-eqz v10, :cond_54

    .line 1363
    .line 1364
    goto :goto_31

    .line 1365
    :cond_54
    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v10

    .line 1369
    if-eqz v10, :cond_55

    .line 1370
    .line 1371
    goto :goto_31

    .line 1372
    :cond_55
    move-object v10, v7

    .line 1373
    :goto_31
    const-string v11, "[\\\\/:*?\"<>|]"

    .line 1374
    .line 1375
    invoke-static {v11}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v11

    .line 1379
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1380
    .line 1381
    .line 1382
    invoke-virtual {v11, v10}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v10

    .line 1386
    invoke-virtual {v10, v6}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v10

    .line 1390
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1391
    .line 1392
    .line 1393
    invoke-static {v10}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v10

    .line 1397
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v10

    .line 1401
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1402
    .line 1403
    .line 1404
    move-result v11

    .line 1405
    if-eqz v11, :cond_56

    .line 1406
    .line 1407
    goto :goto_32

    .line 1408
    :cond_56
    move-object v7, v10

    .line 1409
    :goto_32
    new-instance v10, Ljava/io/File;

    .line 1410
    .line 1411
    invoke-virtual {v3}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v11

    .line 1415
    const-string v12, "Hchat/redpacket_reply"

    .line 1416
    .line 1417
    invoke-direct {v10, v11, v12}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1418
    .line 1419
    .line 1420
    invoke-virtual {v10}, Ljava/io/File;->mkdirs()Z

    .line 1421
    .line 1422
    .line 1423
    new-instance v11, Ljava/io/File;

    .line 1424
    .line 1425
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1426
    .line 1427
    .line 1428
    move-result-wide v12

    .line 1429
    new-instance v14, Ljava/lang/StringBuilder;

    .line 1430
    .line 1431
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 1432
    .line 1433
    .line 1434
    invoke-virtual {v14, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1435
    .line 1436
    .line 1437
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1438
    .line 1439
    .line 1440
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1441
    .line 1442
    .line 1443
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v6

    .line 1447
    invoke-direct {v11, v10, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1448
    .line 1449
    .line 1450
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v6

    .line 1454
    invoke-virtual {v6, v0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v6
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_14

    .line 1458
    if-eqz v6, :cond_57

    .line 1459
    .line 1460
    :try_start_16
    new-instance v7, Ljava/io/FileOutputStream;

    .line 1461
    .line 1462
    invoke-direct {v7, v11}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_10

    .line 1463
    .line 1464
    .line 1465
    :try_start_17
    invoke-static {v6, v7}, Lg4/a;->j(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_11

    .line 1466
    .line 1467
    .line 1468
    :try_start_18
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_10

    .line 1469
    .line 1470
    .line 1471
    :try_start_19
    invoke-interface {v6}, Ljava/io/Closeable;->close()V

    .line 1472
    .line 1473
    .line 1474
    invoke-virtual {v11}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v10

    .line 1478
    invoke-virtual {v11}, Ljava/io/File;->isFile()Z

    .line 1479
    .line 1480
    .line 1481
    move-result v0

    .line 1482
    if-eqz v0, :cond_57

    .line 1483
    .line 1484
    invoke-virtual {v11}, Ljava/io/File;->length()J

    .line 1485
    .line 1486
    .line 1487
    move-result-wide v6
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_14

    .line 1488
    cmp-long v0, v6, v16

    .line 1489
    .line 1490
    if-lez v0, :cond_57

    .line 1491
    .line 1492
    goto :goto_34

    .line 1493
    :catchall_10
    move-exception v0

    .line 1494
    move-object v7, v0

    .line 1495
    goto :goto_33

    .line 1496
    :catchall_11
    move-exception v0

    .line 1497
    move-object v10, v0

    .line 1498
    :try_start_1a
    throw v10
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_12

    .line 1499
    :catchall_12
    move-exception v0

    .line 1500
    :try_start_1b
    invoke-static {v7, v10}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1501
    .line 1502
    .line 1503
    throw v0
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_10

    .line 1504
    :goto_33
    :try_start_1c
    throw v7
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_13

    .line 1505
    :catchall_13
    move-exception v0

    .line 1506
    :try_start_1d
    invoke-static {v6, v7}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1507
    .line 1508
    .line 1509
    throw v0
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_14

    .line 1510
    :catchall_14
    :cond_57
    move-object v10, v8

    .line 1511
    :goto_34
    if-eqz v10, :cond_4f

    .line 1512
    .line 1513
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1514
    .line 1515
    .line 1516
    goto/16 :goto_2f

    .line 1517
    .line 1518
    :cond_58
    invoke-static {v4}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v0

    .line 1522
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v0

    .line 1526
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 1527
    .line 1528
    .line 1529
    move-result v2

    .line 1530
    if-nez v2, :cond_59

    .line 1531
    .line 1532
    sget-object v2, Lwb/iq;->c:Lfg/l;

    .line 1533
    .line 1534
    if-eqz v2, :cond_59

    .line 1535
    .line 1536
    invoke-interface {v2, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1537
    .line 1538
    .line 1539
    :cond_59
    :goto_35
    return-void

    .line 1540
    :pswitch_3
    const-string v2, "prefs"

    .line 1541
    .line 1542
    const-string v3, "HchatConfigBackup"

    .line 1543
    .line 1544
    const-string v4, "format"

    .line 1545
    .line 1546
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1547
    .line 1548
    .line 1549
    iget-object v10, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1550
    .line 1551
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1552
    .line 1553
    .line 1554
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v11

    .line 1558
    invoke-static {v7, v10}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1559
    .line 1560
    .line 1561
    move-result-object v10

    .line 1562
    instance-of v12, v10, Ljava/lang/Integer;

    .line 1563
    .line 1564
    if-eqz v12, :cond_5a

    .line 1565
    .line 1566
    check-cast v10, Ljava/lang/Integer;

    .line 1567
    .line 1568
    goto :goto_36

    .line 1569
    :cond_5a
    move-object v10, v8

    .line 1570
    :goto_36
    if-eqz v10, :cond_73

    .line 1571
    .line 1572
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 1573
    .line 1574
    .line 1575
    move-result v10

    .line 1576
    const v12, 0x48435258    # 200009.38f

    .line 1577
    .line 1578
    .line 1579
    if-eq v10, v12, :cond_5b

    .line 1580
    .line 1581
    const v13, 0x48435259    # 200009.39f

    .line 1582
    .line 1583
    .line 1584
    if-eq v10, v13, :cond_5b

    .line 1585
    .line 1586
    goto/16 :goto_48

    .line 1587
    .line 1588
    :cond_5b
    iget-object v13, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1589
    .line 1590
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1591
    .line 1592
    .line 1593
    invoke-static {v9, v13}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1594
    .line 1595
    .line 1596
    move-result-object v13

    .line 1597
    instance-of v14, v13, Ljava/lang/Integer;

    .line 1598
    .line 1599
    if-eqz v14, :cond_5c

    .line 1600
    .line 1601
    check-cast v13, Ljava/lang/Integer;

    .line 1602
    .line 1603
    goto :goto_37

    .line 1604
    :cond_5c
    move-object v13, v8

    .line 1605
    :goto_37
    if-eqz v13, :cond_73

    .line 1606
    .line 1607
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 1608
    .line 1609
    .line 1610
    move-result v13

    .line 1611
    if-eq v13, v6, :cond_5d

    .line 1612
    .line 1613
    goto/16 :goto_48

    .line 1614
    .line 1615
    :cond_5d
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1616
    .line 1617
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1618
    .line 1619
    .line 1620
    invoke-static {v5, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v0

    .line 1624
    instance-of v6, v0, Landroid/content/Intent;

    .line 1625
    .line 1626
    if-eqz v6, :cond_5e

    .line 1627
    .line 1628
    check-cast v0, Landroid/content/Intent;

    .line 1629
    .line 1630
    goto :goto_38

    .line 1631
    :cond_5e
    move-object v0, v8

    .line 1632
    :goto_38
    if-eqz v0, :cond_73

    .line 1633
    .line 1634
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v0

    .line 1638
    if-eqz v0, :cond_73

    .line 1639
    .line 1640
    sget-object v6, Lwb/r0;->d:Landroid/app/Activity;

    .line 1641
    .line 1642
    if-eqz v6, :cond_73

    .line 1643
    .line 1644
    if-ne v10, v12, :cond_66

    .line 1645
    .line 1646
    sget-object v8, Lwb/m4;->a:Ljava/util/List;

    .line 1647
    .line 1648
    :try_start_1e
    new-instance v8, Lorg/json/JSONObject;

    .line 1649
    .line 1650
    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 1651
    .line 1652
    .line 1653
    sget-object v10, Lwb/m4;->a:Ljava/util/List;

    .line 1654
    .line 1655
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1656
    .line 1657
    .line 1658
    move-result-object v10

    .line 1659
    move v12, v7

    .line 1660
    :goto_39
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1661
    .line 1662
    .line 1663
    move-result v13

    .line 1664
    if-eqz v13, :cond_62

    .line 1665
    .line 1666
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v13

    .line 1670
    check-cast v13, Ljava/lang/String;

    .line 1671
    .line 1672
    invoke-static {v6, v13}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v14

    .line 1676
    new-instance v15, Lorg/json/JSONObject;

    .line 1677
    .line 1678
    invoke-direct {v15}, Lorg/json/JSONObject;-><init>()V

    .line 1679
    .line 1680
    .line 1681
    invoke-interface {v14}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    .line 1682
    .line 1683
    .line 1684
    move-result-object v14

    .line 1685
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1686
    .line 1687
    .line 1688
    check-cast v14, Ljava/util/Map;

    .line 1689
    .line 1690
    invoke-interface {v14}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 1691
    .line 1692
    .line 1693
    move-result-object v14

    .line 1694
    invoke-interface {v14}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1695
    .line 1696
    .line 1697
    move-result-object v14

    .line 1698
    :goto_3a
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 1699
    .line 1700
    .line 1701
    move-result v16

    .line 1702
    if-eqz v16, :cond_60

    .line 1703
    .line 1704
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1705
    .line 1706
    .line 1707
    move-result-object v16

    .line 1708
    check-cast v16, Ljava/util/Map$Entry;

    .line 1709
    .line 1710
    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v17

    .line 1714
    move-object/from16 v7, v17

    .line 1715
    .line 1716
    check-cast v7, Ljava/lang/String;

    .line 1717
    .line 1718
    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1719
    .line 1720
    .line 1721
    move-result-object v16

    .line 1722
    invoke-static/range {v16 .. v16}, Lwb/m4;->b(Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1723
    .line 1724
    .line 1725
    move-result-object v5

    .line 1726
    if-eqz v5, :cond_5f

    .line 1727
    .line 1728
    invoke-virtual {v15, v7, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1729
    .line 1730
    .line 1731
    add-int/lit8 v12, v12, 0x1

    .line 1732
    .line 1733
    goto :goto_3b

    .line 1734
    :catchall_15
    move-exception v0

    .line 1735
    goto :goto_3c

    .line 1736
    :cond_5f
    :goto_3b
    const/4 v5, 0x2

    .line 1737
    const/4 v7, 0x0

    .line 1738
    goto :goto_3a

    .line 1739
    :cond_60
    invoke-virtual {v15}, Lorg/json/JSONObject;->length()I

    .line 1740
    .line 1741
    .line 1742
    move-result v5

    .line 1743
    if-lez v5, :cond_61

    .line 1744
    .line 1745
    invoke-virtual {v8, v13, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1746
    .line 1747
    .line 1748
    :cond_61
    const/4 v5, 0x2

    .line 1749
    const/4 v7, 0x0

    .line 1750
    goto :goto_39

    .line 1751
    :cond_62
    new-instance v5, Lorg/json/JSONObject;

    .line 1752
    .line 1753
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 1754
    .line 1755
    .line 1756
    invoke-virtual {v5, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1757
    .line 1758
    .line 1759
    const-string v3, "version"

    .line 1760
    .line 1761
    invoke-virtual {v5, v3, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1762
    .line 1763
    .line 1764
    const-string v3, "appVersion"

    .line 1765
    .line 1766
    const-string v4, "5.5.6"

    .line 1767
    .line 1768
    invoke-virtual {v5, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1769
    .line 1770
    .line 1771
    const-string v3, "exportedAt"

    .line 1772
    .line 1773
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1774
    .line 1775
    .line 1776
    move-result-wide v9

    .line 1777
    invoke-virtual {v5, v3, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 1778
    .line 1779
    .line 1780
    invoke-virtual {v5, v2, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1781
    .line 1782
    .line 1783
    invoke-virtual {v6}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 1784
    .line 1785
    .line 1786
    move-result-object v2

    .line 1787
    const-string v3, "wt"

    .line 1788
    .line 1789
    invoke-virtual {v2, v0, v3}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;Ljava/lang/String;)Ljava/io/OutputStream;

    .line 1790
    .line 1791
    .line 1792
    move-result-object v2
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_15

    .line 1793
    if-eqz v2, :cond_63

    .line 1794
    .line 1795
    const/4 v0, 0x2

    .line 1796
    :try_start_1f
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;

    .line 1797
    .line 1798
    .line 1799
    move-result-object v0

    .line 1800
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1801
    .line 1802
    .line 1803
    sget-object v3, Log/a;->a:Ljava/nio/charset/Charset;

    .line 1804
    .line 1805
    invoke-virtual {v0, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 1806
    .line 1807
    .line 1808
    move-result-object v0

    .line 1809
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1810
    .line 1811
    .line 1812
    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_16

    .line 1813
    .line 1814
    .line 1815
    :try_start_20
    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    .line 1816
    .line 1817
    .line 1818
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1819
    .line 1820
    .line 1821
    move-result-object v0
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_15

    .line 1822
    goto :goto_3d

    .line 1823
    :catchall_16
    move-exception v0

    .line 1824
    move-object v3, v0

    .line 1825
    :try_start_21
    throw v3
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_17

    .line 1826
    :catchall_17
    move-exception v0

    .line 1827
    :try_start_22
    invoke-static {v2, v3}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1828
    .line 1829
    .line 1830
    throw v0
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_15

    .line 1831
    :cond_63
    const/4 v0, 0x0

    .line 1832
    goto :goto_3f

    .line 1833
    :goto_3c
    new-instance v2, Lsf/f;

    .line 1834
    .line 1835
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1836
    .line 1837
    .line 1838
    move-object v0, v2

    .line 1839
    :goto_3d
    nop

    .line 1840
    instance-of v2, v0, Lsf/f;

    .line 1841
    .line 1842
    if-eqz v2, :cond_64

    .line 1843
    .line 1844
    goto :goto_3e

    .line 1845
    :cond_64
    move-object v11, v0

    .line 1846
    :goto_3e
    check-cast v11, Ljava/lang/Number;

    .line 1847
    .line 1848
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 1849
    .line 1850
    .line 1851
    move-result v0

    .line 1852
    :goto_3f
    if-lez v0, :cond_65

    .line 1853
    .line 1854
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1855
    .line 1856
    const-string v3, "\u5df2\u5bfc\u51fa "

    .line 1857
    .line 1858
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1859
    .line 1860
    .line 1861
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1862
    .line 1863
    .line 1864
    const-string v0, " \u9879\u914d\u7f6e"

    .line 1865
    .line 1866
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1867
    .line 1868
    .line 1869
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1870
    .line 1871
    .line 1872
    move-result-object v0

    .line 1873
    const/4 v2, 0x0

    .line 1874
    invoke-static {v6, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1875
    .line 1876
    .line 1877
    move-result-object v0

    .line 1878
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1879
    .line 1880
    .line 1881
    goto/16 :goto_48

    .line 1882
    .line 1883
    :cond_65
    const/4 v2, 0x0

    .line 1884
    const-string v0, "\u5bfc\u51fa\u5931\u8d25"

    .line 1885
    .line 1886
    invoke-static {v6, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1887
    .line 1888
    .line 1889
    move-result-object v0

    .line 1890
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1891
    .line 1892
    .line 1893
    goto/16 :goto_48

    .line 1894
    .line 1895
    :cond_66
    sget-object v5, Lwb/m4;->a:Ljava/util/List;

    .line 1896
    .line 1897
    :try_start_23
    invoke-virtual {v6}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 1898
    .line 1899
    .line 1900
    move-result-object v5

    .line 1901
    invoke-virtual {v5, v0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 1902
    .line 1903
    .line 1904
    move-result-object v5
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_18

    .line 1905
    if-eqz v5, :cond_67

    .line 1906
    .line 1907
    :try_start_24
    new-instance v0, Ljava/io/InputStreamReader;

    .line 1908
    .line 1909
    sget-object v7, Log/a;->a:Ljava/nio/charset/Charset;

    .line 1910
    .line 1911
    invoke-direct {v0, v5, v7}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 1912
    .line 1913
    .line 1914
    invoke-static {v0}, Lr9/e0;->e0(Ljava/io/Reader;)Ljava/lang/String;

    .line 1915
    .line 1916
    .line 1917
    move-result-object v8
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_19

    .line 1918
    :try_start_25
    invoke-interface {v5}, Ljava/io/Closeable;->close()V
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_18

    .line 1919
    .line 1920
    .line 1921
    goto :goto_40

    .line 1922
    :catchall_18
    move-exception v0

    .line 1923
    goto/16 :goto_44

    .line 1924
    .line 1925
    :catchall_19
    move-exception v0

    .line 1926
    move-object v2, v0

    .line 1927
    :try_start_26
    throw v2
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_1a

    .line 1928
    :catchall_1a
    move-exception v0

    .line 1929
    :try_start_27
    invoke-static {v5, v2}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1930
    .line 1931
    .line 1932
    throw v0

    .line 1933
    :cond_67
    :goto_40
    if-nez v8, :cond_68

    .line 1934
    .line 1935
    const-string v8, ""

    .line 1936
    .line 1937
    :cond_68
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1938
    .line 1939
    .line 1940
    move-result v0

    .line 1941
    if-eqz v0, :cond_6a

    .line 1942
    .line 1943
    :cond_69
    :goto_41
    const/4 v2, 0x0

    .line 1944
    goto/16 :goto_47

    .line 1945
    .line 1946
    :cond_6a
    new-instance v0, Lorg/json/JSONObject;

    .line 1947
    .line 1948
    invoke-direct {v0, v8}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1949
    .line 1950
    .line 1951
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1952
    .line 1953
    .line 1954
    move-result-object v4

    .line 1955
    invoke-static {v4, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1956
    .line 1957
    .line 1958
    move-result v3

    .line 1959
    if-nez v3, :cond_6b

    .line 1960
    .line 1961
    goto :goto_41

    .line 1962
    :cond_6b
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1963
    .line 1964
    .line 1965
    move-result-object v0

    .line 1966
    if-eqz v0, :cond_69

    .line 1967
    .line 1968
    sget-object v2, Lwb/m4;->a:Ljava/util/List;

    .line 1969
    .line 1970
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1971
    .line 1972
    .line 1973
    move-result-object v2

    .line 1974
    const/4 v3, 0x0

    .line 1975
    :cond_6c
    :goto_42
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1976
    .line 1977
    .line 1978
    move-result v4

    .line 1979
    if-eqz v4, :cond_6f

    .line 1980
    .line 1981
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1982
    .line 1983
    .line 1984
    move-result-object v4

    .line 1985
    check-cast v4, Ljava/lang/String;

    .line 1986
    .line 1987
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 1988
    .line 1989
    .line 1990
    move-result-object v5

    .line 1991
    if-eqz v5, :cond_6c

    .line 1992
    .line 1993
    invoke-static {v6, v4}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 1994
    .line 1995
    .line 1996
    move-result-object v4

    .line 1997
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1998
    .line 1999
    .line 2000
    move-result-object v4

    .line 2001
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 2002
    .line 2003
    .line 2004
    move-result-object v4

    .line 2005
    invoke-virtual {v5}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 2006
    .line 2007
    .line 2008
    move-result-object v7

    .line 2009
    :cond_6d
    :goto_43
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 2010
    .line 2011
    .line 2012
    move-result v8

    .line 2013
    if-eqz v8, :cond_6e

    .line 2014
    .line 2015
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2016
    .line 2017
    .line 2018
    move-result-object v8

    .line 2019
    check-cast v8, Ljava/lang/String;

    .line 2020
    .line 2021
    invoke-virtual {v5, v8}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 2022
    .line 2023
    .line 2024
    move-result-object v10

    .line 2025
    if-eqz v10, :cond_6d

    .line 2026
    .line 2027
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2028
    .line 2029
    .line 2030
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2031
    .line 2032
    .line 2033
    invoke-static {v4, v8, v10}, Lwb/m4;->a(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Lorg/json/JSONObject;)Z

    .line 2034
    .line 2035
    .line 2036
    move-result v8

    .line 2037
    if-eqz v8, :cond_6d

    .line 2038
    .line 2039
    add-int/lit8 v3, v3, 0x1

    .line 2040
    .line 2041
    goto :goto_43

    .line 2042
    :cond_6e
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 2043
    .line 2044
    .line 2045
    goto :goto_42

    .line 2046
    :cond_6f
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2047
    .line 2048
    .line 2049
    move-result-object v0
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_18

    .line 2050
    goto :goto_45

    .line 2051
    :goto_44
    new-instance v2, Lsf/f;

    .line 2052
    .line 2053
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 2054
    .line 2055
    .line 2056
    move-object v0, v2

    .line 2057
    :goto_45
    nop

    .line 2058
    instance-of v2, v0, Lsf/f;

    .line 2059
    .line 2060
    if-eqz v2, :cond_70

    .line 2061
    .line 2062
    goto :goto_46

    .line 2063
    :cond_70
    move-object v11, v0

    .line 2064
    :goto_46
    check-cast v11, Ljava/lang/Number;

    .line 2065
    .line 2066
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 2067
    .line 2068
    .line 2069
    move-result v2

    .line 2070
    :goto_47
    if-lez v2, :cond_72

    .line 2071
    .line 2072
    sget-object v0, Lwb/r0;->c:Lfg/a;

    .line 2073
    .line 2074
    if-eqz v0, :cond_71

    .line 2075
    .line 2076
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 2077
    .line 2078
    .line 2079
    :cond_71
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2080
    .line 2081
    const-string v3, "\u5df2\u5bfc\u5165 "

    .line 2082
    .line 2083
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2084
    .line 2085
    .line 2086
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2087
    .line 2088
    .line 2089
    const-string v2, " \u9879\u914d\u7f6e\uff0c\u5f53\u524d\u8bbe\u7f6e\u9875\u5df2\u5237\u65b0"

    .line 2090
    .line 2091
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2092
    .line 2093
    .line 2094
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2095
    .line 2096
    .line 2097
    move-result-object v0

    .line 2098
    invoke-static {v6, v0, v9}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 2099
    .line 2100
    .line 2101
    move-result-object v0

    .line 2102
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 2103
    .line 2104
    .line 2105
    goto :goto_48

    .line 2106
    :cond_72
    const-string v0, "\u5bfc\u5165\u5931\u8d25\u6216\u6587\u4ef6\u65e0\u914d\u7f6e"

    .line 2107
    .line 2108
    const/4 v2, 0x0

    .line 2109
    invoke-static {v6, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 2110
    .line 2111
    .line 2112
    move-result-object v0

    .line 2113
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 2114
    .line 2115
    .line 2116
    :cond_73
    :goto_48
    return-void

    .line 2117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
