.class public final synthetic Lv0/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lv0/a;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lv0/a;->h:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lv0/a;->g:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lv0/a;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lz8/e;

    .line 11
    .line 12
    iget-object v2, v0, Lz8/e;->e:Lz8/g;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_5

    .line 16
    .line 17
    monitor-enter v2

    .line 18
    :try_start_0
    iget-boolean v0, v2, Lz8/g;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    monitor-exit v2

    .line 24
    move v0, v4

    .line 25
    goto/16 :goto_5

    .line 26
    .line 27
    :cond_0
    :try_start_1
    invoke-virtual {v2}, Lz8/g;->e()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v2}, Lz8/g;->d()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_1

    .line 40
    .line 41
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    if-eqz v6, :cond_1

    .line 46
    .line 47
    monitor-exit v2

    .line 48
    move v0, v3

    .line 49
    goto :goto_5

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    goto :goto_2

    .line 52
    :cond_1
    :try_start_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-eqz v6, :cond_2

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    check-cast v6, Ljava/lang/reflect/Method;

    .line 67
    .line 68
    sget-object v7, Lr8/i;->b:Lr8/i;

    .line 69
    .line 70
    new-instance v8, Lwb/yo;

    .line 71
    .line 72
    const/4 v9, 0x4

    .line 73
    invoke-direct {v8, v2, v9}, Lwb/yo;-><init>(Ljava/lang/Object;I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v7, v6, v8}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-eqz v5, :cond_3

    .line 89
    .line 90
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    check-cast v5, Lz8/f;

    .line 95
    .line 96
    sget-object v6, Lr8/i;->b:Lr8/i;

    .line 97
    .line 98
    iget-object v7, v5, Lz8/f;->a:Ljava/lang/reflect/Method;

    .line 99
    .line 100
    new-instance v8, Lc9/c2;

    .line 101
    .line 102
    const/16 v9, 0x11

    .line 103
    .line 104
    invoke-direct {v8, v2, v9, v5}, Lc9/c2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v6, v7, v8}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_3
    iput-boolean v4, v2, Lz8/g;->f:Z

    .line 112
    .line 113
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :goto_2
    :try_start_3
    new-instance v5, Lsf/f;

    .line 117
    .line 118
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    move-object v0, v5

    .line 122
    :goto_3
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    if-nez v5, :cond_4

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_4
    iget-object v0, v2, Lz8/g;->b:Ly9/b;

    .line 130
    .line 131
    const-string v6, "\u901a\u8bdd\u94c3\u58f0\u5c4f\u853d Hook \u5b89\u88c5\u5931\u8d25"

    .line 132
    .line 133
    invoke-virtual {v0, v6, v5}, Ly9/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 137
    .line 138
    :goto_4
    check-cast v0, Ljava/lang/Boolean;

    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 141
    .line 142
    .line 143
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 144
    monitor-exit v2

    .line 145
    :goto_5
    if-ne v0, v4, :cond_5

    .line 146
    .line 147
    move v3, v4

    .line 148
    goto :goto_6

    .line 149
    :catchall_1
    move-exception v0

    .line 150
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 151
    throw v0

    .line 152
    :cond_5
    :goto_6
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    return-object v0

    .line 157
    :pswitch_0
    iget-object v0, v1, Lv0/a;->h:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, Lz8/a;

    .line 160
    .line 161
    iget-object v2, v0, Lz8/a;->e:Lz8/d;

    .line 162
    .line 163
    const/4 v3, 0x0

    .line 164
    if-eqz v2, :cond_c

    .line 165
    .line 166
    monitor-enter v2

    .line 167
    :try_start_5
    iget-boolean v0, v2, Lz8/d;->g:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 168
    .line 169
    const/4 v4, 0x1

    .line 170
    if-eqz v0, :cond_6

    .line 171
    .line 172
    monitor-exit v2

    .line 173
    move v0, v4

    .line 174
    goto/16 :goto_c

    .line 175
    .line 176
    :cond_6
    :try_start_6
    invoke-virtual {v2}, Lz8/d;->d()Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-static {v0}, Lz8/d;->b(Ljava/util/List;)Z

    .line 181
    .line 182
    .line 183
    move-result v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 184
    if-nez v5, :cond_7

    .line 185
    .line 186
    monitor-exit v2

    .line 187
    :goto_7
    move v0, v3

    .line 188
    goto :goto_c

    .line 189
    :cond_7
    :try_start_7
    invoke-virtual {v2}, Lz8/d;->e()Ljava/lang/reflect/Method;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    if-eqz v5, :cond_a

    .line 194
    .line 195
    invoke-virtual {v2}, Lz8/d;->f()Lz8/b;

    .line 196
    .line 197
    .line 198
    move-result-object v6

    .line 199
    if-eqz v6, :cond_9

    .line 200
    .line 201
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v7

    .line 209
    if-eqz v7, :cond_8

    .line 210
    .line 211
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    check-cast v7, Ljava/lang/reflect/Method;

    .line 216
    .line 217
    sget-object v8, Lr8/i;->b:Lr8/i;

    .line 218
    .line 219
    new-instance v9, Lz8/c;

    .line 220
    .line 221
    const/4 v10, 0x0

    .line 222
    invoke-direct {v9, v2, v10}, Lz8/c;-><init>(Lz8/d;I)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v8, v7, v9}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 226
    .line 227
    .line 228
    goto :goto_8

    .line 229
    :catchall_2
    move-exception v0

    .line 230
    goto :goto_9

    .line 231
    :cond_8
    sget-object v0, Lr8/i;->b:Lr8/i;

    .line 232
    .line 233
    iget-object v7, v6, Lz8/b;->a:Ljava/lang/reflect/Method;

    .line 234
    .line 235
    new-instance v8, Lc9/c2;

    .line 236
    .line 237
    const/16 v9, 0x10

    .line 238
    .line 239
    invoke-direct {v8, v2, v9, v6}, Lc9/c2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, v7, v8}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 243
    .line 244
    .line 245
    new-instance v6, Lz8/c;

    .line 246
    .line 247
    const/4 v7, 0x1

    .line 248
    invoke-direct {v6, v2, v7}, Lz8/c;-><init>(Lz8/d;I)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0, v5, v6}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 252
    .line 253
    .line 254
    iput-boolean v4, v2, Lz8/d;->g:Z

    .line 255
    .line 256
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 257
    .line 258
    goto :goto_a

    .line 259
    :cond_9
    monitor-exit v2

    .line 260
    goto :goto_7

    .line 261
    :cond_a
    monitor-exit v2

    .line 262
    goto :goto_7

    .line 263
    :goto_9
    :try_start_8
    new-instance v5, Lsf/f;

    .line 264
    .line 265
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 266
    .line 267
    .line 268
    move-object v0, v5

    .line 269
    :goto_a
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    if-nez v5, :cond_b

    .line 274
    .line 275
    goto :goto_b

    .line 276
    :cond_b
    iget-object v0, v2, Lz8/d;->b:Ly9/b;

    .line 277
    .line 278
    const-string v6, "\u901a\u8bdd\u5a92\u4f53\u9650\u5236 Hook \u5b89\u88c5\u5931\u8d25"

    .line 279
    .line 280
    invoke-virtual {v0, v6, v5}, Ly9/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 284
    .line 285
    :goto_b
    check-cast v0, Ljava/lang/Boolean;

    .line 286
    .line 287
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 288
    .line 289
    .line 290
    move-result v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 291
    monitor-exit v2

    .line 292
    :goto_c
    if-ne v0, v4, :cond_c

    .line 293
    .line 294
    move v3, v4

    .line 295
    goto :goto_d

    .line 296
    :catchall_3
    move-exception v0

    .line 297
    :try_start_9
    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 298
    throw v0

    .line 299
    :cond_c
    :goto_d
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    return-object v0

    .line 304
    :pswitch_1
    iget-object v0, v1, Lv0/a;->h:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v0, Ly9/c;

    .line 307
    .line 308
    iget-object v2, v0, Ly9/c;->e:Ly9/e;

    .line 309
    .line 310
    const/4 v3, 0x0

    .line 311
    if-eqz v2, :cond_15

    .line 312
    .line 313
    iget-boolean v0, v2, Ly9/e;->j:Z

    .line 314
    .line 315
    const/4 v4, 0x1

    .line 316
    if-eqz v0, :cond_d

    .line 317
    .line 318
    goto/16 :goto_10

    .line 319
    .line 320
    :cond_d
    const-string v0, "fillingUsername:need getKfInfo"

    .line 321
    .line 322
    iget-object v5, v2, Ly9/e;->a:Lr8/g;

    .line 323
    .line 324
    iget-object v6, v5, Lr8/g;->a:Landroid/content/Context;

    .line 325
    .line 326
    iget-object v7, v5, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 327
    .line 328
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    invoke-static {v6, v7}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 332
    .line 333
    .line 334
    move-result-object v6

    .line 335
    iget-object v6, v6, Ll8/i;->h:Ljava/lang/String;

    .line 336
    .line 337
    iget-object v7, v2, Ly9/e;->i:Landroid/content/SharedPreferences;

    .line 338
    .line 339
    iget-object v5, v5, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 340
    .line 341
    const-string v8, "username_bind"

    .line 342
    .line 343
    invoke-static {v7, v6, v5, v8}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 344
    .line 345
    .line 346
    move-result-object v5

    .line 347
    const/4 v9, 0x0

    .line 348
    if-eqz v5, :cond_f

    .line 349
    .line 350
    invoke-virtual {v2, v5}, Ly9/e;->i(Ljava/lang/reflect/Method;)Z

    .line 351
    .line 352
    .line 353
    move-result v10

    .line 354
    if-eqz v10, :cond_e

    .line 355
    .line 356
    goto :goto_e

    .line 357
    :cond_e
    move-object v5, v9

    .line 358
    :goto_e
    if-eqz v5, :cond_f

    .line 359
    .line 360
    goto :goto_f

    .line 361
    :cond_f
    const-string v5, "MicroMsg.ChattingItem"

    .line 362
    .line 363
    filled-new-array {v5, v0}, [Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v5

    .line 367
    invoke-virtual {v2, v5}, Ly9/e;->c([Ljava/lang/String;)Ljava/util/List;

    .line 368
    .line 369
    .line 370
    move-result-object v5

    .line 371
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 372
    .line 373
    .line 374
    move-result v10

    .line 375
    if-eqz v10, :cond_10

    .line 376
    .line 377
    filled-new-array {v0}, [Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-virtual {v2, v0}, Ly9/e;->c([Ljava/lang/String;)Ljava/util/List;

    .line 382
    .line 383
    .line 384
    move-result-object v5

    .line 385
    :cond_10
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    :cond_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 390
    .line 391
    .line 392
    move-result v5

    .line 393
    if-eqz v5, :cond_12

    .line 394
    .line 395
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v5

    .line 399
    move-object v10, v5

    .line 400
    check-cast v10, Ljava/lang/reflect/Method;

    .line 401
    .line 402
    invoke-virtual {v2, v10}, Ly9/e;->i(Ljava/lang/reflect/Method;)Z

    .line 403
    .line 404
    .line 405
    move-result v10

    .line 406
    if-eqz v10, :cond_11

    .line 407
    .line 408
    move-object v9, v5

    .line 409
    :cond_12
    move-object v5, v9

    .line 410
    check-cast v5, Ljava/lang/reflect/Method;

    .line 411
    .line 412
    if-eqz v5, :cond_13

    .line 413
    .line 414
    invoke-static {v7, v6, v8, v5}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 415
    .line 416
    .line 417
    goto :goto_f

    .line 418
    :cond_13
    const-string v0, "cache.key"

    .line 419
    .line 420
    :try_start_a
    invoke-interface {v7}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 421
    .line 422
    .line 423
    move-result-object v9

    .line 424
    const-string v10, ""

    .line 425
    .line 426
    invoke-interface {v7, v0, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v7

    .line 430
    invoke-static {v7, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    move-result v7

    .line 434
    if-nez v7, :cond_14

    .line 435
    .line 436
    invoke-interface {v9}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 437
    .line 438
    .line 439
    move-result-object v7

    .line 440
    invoke-interface {v7, v0, v6}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 441
    .line 442
    .line 443
    :cond_14
    invoke-interface {v9, v8}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 448
    .line 449
    .line 450
    :catchall_4
    :goto_f
    if-eqz v5, :cond_15

    .line 451
    .line 452
    :try_start_b
    sget-object v0, Lr8/i;->b:Lr8/i;

    .line 453
    .line 454
    new-instance v6, Lwb/yo;

    .line 455
    .line 456
    const/4 v7, 0x2

    .line 457
    invoke-direct {v6, v2, v7}, Lwb/yo;-><init>(Ljava/lang/Object;I)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v0, v5, v6}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 461
    .line 462
    .line 463
    iput-boolean v4, v2, Ly9/e;->j:Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 464
    .line 465
    :goto_10
    move v3, v4

    .line 466
    goto :goto_11

    .line 467
    :catchall_5
    move-exception v0

    .line 468
    iget-object v2, v2, Ly9/e;->c:Ly9/b;

    .line 469
    .line 470
    const-string v4, "\u7fa4\u5458\u5934\u8854Hook\u5b89\u88c5\u5931\u8d25"

    .line 471
    .line 472
    invoke-virtual {v2, v4, v0}, Ly9/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    :cond_15
    :goto_11
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    return-object v0

    .line 480
    :pswitch_2
    iget-object v0, v1, Lv0/a;->h:Ljava/lang/Object;

    .line 481
    .line 482
    check-cast v0, Lxb/o;

    .line 483
    .line 484
    iget-object v2, v0, Lxb/o;->a:Lqg/t;

    .line 485
    .line 486
    new-instance v3, Lxb/n;

    .line 487
    .line 488
    const/4 v4, 0x2

    .line 489
    const/4 v5, 0x0

    .line 490
    invoke-direct {v3, v0, v5, v4}, Lxb/n;-><init>(Lxb/o;Lwf/c;I)V

    .line 491
    .line 492
    .line 493
    const/4 v0, 0x3

    .line 494
    invoke-static {v2, v5, v3, v0}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 495
    .line 496
    .line 497
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 498
    .line 499
    return-object v0

    .line 500
    :pswitch_3
    iget-object v0, v1, Lv0/a;->h:Ljava/lang/Object;

    .line 501
    .line 502
    check-cast v0, Lv/d;

    .line 503
    .line 504
    return-object v0

    .line 505
    :pswitch_4
    iget-object v0, v1, Lv0/a;->h:Ljava/lang/Object;

    .line 506
    .line 507
    move-object v2, v0

    .line 508
    check-cast v2, Lw0/s;

    .line 509
    .line 510
    :cond_16
    iget-object v3, v2, Lw0/s;->g:Ljava/lang/Object;

    .line 511
    .line 512
    monitor-enter v3

    .line 513
    :try_start_c
    iget-boolean v0, v2, Lw0/s;->c:Z

    .line 514
    .line 515
    if-nez v0, :cond_1d

    .line 516
    .line 517
    const/4 v0, 0x1

    .line 518
    iput-boolean v0, v2, Lw0/s;->c:Z
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 519
    .line 520
    :try_start_d
    iget-object v0, v2, Lw0/s;->f:Lj0/b;

    .line 521
    .line 522
    iget-object v5, v0, Lj0/b;->g:[Ljava/lang/Object;

    .line 523
    .line 524
    iget v0, v0, Lj0/b;->i:I

    .line 525
    .line 526
    const/4 v6, 0x0

    .line 527
    :goto_12
    if-ge v6, v0, :cond_1c

    .line 528
    .line 529
    aget-object v7, v5, v6

    .line 530
    .line 531
    check-cast v7, Lw0/r;

    .line 532
    .line 533
    iget-object v8, v7, Lw0/r;->g:Lf/l0;

    .line 534
    .line 535
    iget-object v7, v7, Lw0/r;->a:Lfg/l;

    .line 536
    .line 537
    iget-object v9, v8, Lf/l0;->b:[Ljava/lang/Object;

    .line 538
    .line 539
    iget-object v10, v8, Lf/l0;->a:[J

    .line 540
    .line 541
    array-length v11, v10

    .line 542
    add-int/lit8 v11, v11, -0x2

    .line 543
    .line 544
    if-ltz v11, :cond_1a

    .line 545
    .line 546
    const/4 v12, 0x0

    .line 547
    :goto_13
    aget-wide v13, v10, v12

    .line 548
    .line 549
    move-object/from16 v16, v5

    .line 550
    .line 551
    not-long v4, v13

    .line 552
    const/16 v17, 0x7

    .line 553
    .line 554
    shl-long v4, v4, v17

    .line 555
    .line 556
    and-long/2addr v4, v13

    .line 557
    const-wide v17, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    and-long v4, v4, v17

    .line 563
    .line 564
    cmp-long v4, v4, v17

    .line 565
    .line 566
    if-eqz v4, :cond_19

    .line 567
    .line 568
    sub-int v4, v12, v11

    .line 569
    .line 570
    not-int v4, v4

    .line 571
    ushr-int/lit8 v4, v4, 0x1f

    .line 572
    .line 573
    const/16 v5, 0x8

    .line 574
    .line 575
    rsub-int/lit8 v4, v4, 0x8

    .line 576
    .line 577
    const/4 v15, 0x0

    .line 578
    :goto_14
    if-ge v15, v4, :cond_18

    .line 579
    .line 580
    const-wide/16 v18, 0xff

    .line 581
    .line 582
    and-long v18, v13, v18

    .line 583
    .line 584
    const-wide/16 v20, 0x80

    .line 585
    .line 586
    cmp-long v18, v18, v20

    .line 587
    .line 588
    if-gez v18, :cond_17

    .line 589
    .line 590
    shl-int/lit8 v18, v12, 0x3

    .line 591
    .line 592
    add-int v18, v18, v15

    .line 593
    .line 594
    move/from16 v19, v5

    .line 595
    .line 596
    aget-object v5, v9, v18

    .line 597
    .line 598
    invoke-interface {v7, v5}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    goto :goto_15

    .line 602
    :cond_17
    move/from16 v19, v5

    .line 603
    .line 604
    :goto_15
    shr-long v13, v13, v19

    .line 605
    .line 606
    add-int/lit8 v15, v15, 0x1

    .line 607
    .line 608
    move/from16 v5, v19

    .line 609
    .line 610
    goto :goto_14

    .line 611
    :cond_18
    if-ne v4, v5, :cond_1b

    .line 612
    .line 613
    :cond_19
    if-eq v12, v11, :cond_1b

    .line 614
    .line 615
    add-int/lit8 v12, v12, 0x1

    .line 616
    .line 617
    move-object/from16 v5, v16

    .line 618
    .line 619
    goto :goto_13

    .line 620
    :cond_1a
    move-object/from16 v16, v5

    .line 621
    .line 622
    :cond_1b
    invoke-virtual {v8}, Lf/l0;->b()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 623
    .line 624
    .line 625
    add-int/lit8 v6, v6, 0x1

    .line 626
    .line 627
    move-object/from16 v5, v16

    .line 628
    .line 629
    goto :goto_12

    .line 630
    :goto_16
    const/4 v15, 0x0

    .line 631
    goto :goto_17

    .line 632
    :catchall_6
    move-exception v0

    .line 633
    goto :goto_16

    .line 634
    :cond_1c
    const/4 v15, 0x0

    .line 635
    :try_start_e
    iput-boolean v15, v2, Lw0/s;->c:Z

    .line 636
    .line 637
    goto :goto_18

    .line 638
    :catchall_7
    move-exception v0

    .line 639
    goto :goto_19

    .line 640
    :goto_17
    iput-boolean v15, v2, Lw0/s;->c:Z

    .line 641
    .line 642
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    .line 643
    :cond_1d
    :goto_18
    monitor-exit v3

    .line 644
    invoke-virtual {v2}, Lw0/s;->b()Z

    .line 645
    .line 646
    .line 647
    move-result v0

    .line 648
    if-nez v0, :cond_16

    .line 649
    .line 650
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 651
    .line 652
    return-object v0

    .line 653
    :goto_19
    monitor-exit v3

    .line 654
    throw v0

    .line 655
    :pswitch_5
    iget-object v0, v1, Lv0/a;->h:Ljava/lang/Object;

    .line 656
    .line 657
    check-cast v0, Lu2/k;

    .line 658
    .line 659
    invoke-virtual {v0}, Lu2/k;->b()J

    .line 660
    .line 661
    .line 662
    move-result-wide v2

    .line 663
    new-instance v0, Lu2/j;

    .line 664
    .line 665
    invoke-direct {v0, v2, v3}, Lu2/j;-><init>(J)V

    .line 666
    .line 667
    .line 668
    return-object v0

    .line 669
    :pswitch_6
    iget-object v0, v1, Lv0/a;->h:Ljava/lang/Object;

    .line 670
    .line 671
    check-cast v0, Lm/p1;

    .line 672
    .line 673
    new-instance v2, Lw/j1;

    .line 674
    .line 675
    const/4 v3, 0x0

    .line 676
    invoke-direct {v2, v0, v3}, Lw/j1;-><init>(Lm/p1;F)V

    .line 677
    .line 678
    .line 679
    return-object v2

    .line 680
    :pswitch_7
    iget-object v0, v1, Lv0/a;->h:Ljava/lang/Object;

    .line 681
    .line 682
    check-cast v0, Lw/q0;

    .line 683
    .line 684
    invoke-virtual {v0}, Lw/q0;->d()Lw/m1;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    return-object v0

    .line 689
    :pswitch_8
    iget-object v0, v1, Lv0/a;->h:Ljava/lang/Object;

    .line 690
    .line 691
    check-cast v0, Li2/g;

    .line 692
    .line 693
    return-object v0

    .line 694
    :pswitch_9
    iget-object v0, v1, Lv0/a;->h:Ljava/lang/Object;

    .line 695
    .line 696
    check-cast v0, Lv8/q;

    .line 697
    .line 698
    new-instance v2, Ljava/io/File;

    .line 699
    .line 700
    iget-object v3, v0, Lv8/q;->b:Landroid/content/Context;

    .line 701
    .line 702
    invoke-virtual {v3}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 703
    .line 704
    .line 705
    move-result-object v3

    .line 706
    const-string v4, "Hchat_auto_message_forward"

    .line 707
    .line 708
    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 709
    .line 710
    .line 711
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 712
    .line 713
    .line 714
    move-result-wide v3

    .line 715
    const-wide/32 v5, 0x5265c00

    .line 716
    .line 717
    .line 718
    sub-long/2addr v3, v5

    .line 719
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 720
    .line 721
    .line 722
    move-result-object v2

    .line 723
    if-eqz v2, :cond_1e

    .line 724
    .line 725
    invoke-static {v2}, Ltf/l;->k0([Ljava/lang/Object;)Lng/j;

    .line 726
    .line 727
    .line 728
    move-result-object v2

    .line 729
    new-instance v5, Leb/s0;

    .line 730
    .line 731
    const/4 v6, 0x3

    .line 732
    invoke-direct {v5, v3, v4, v0, v6}, Leb/s0;-><init>(JLjava/lang/Object;I)V

    .line 733
    .line 734
    .line 735
    new-instance v3, Lng/i;

    .line 736
    .line 737
    const/4 v4, 0x1

    .line 738
    invoke-direct {v3, v2, v4, v5}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 739
    .line 740
    .line 741
    new-instance v2, Lng/h;

    .line 742
    .line 743
    invoke-direct {v2, v3}, Lng/h;-><init>(Lng/i;)V

    .line 744
    .line 745
    .line 746
    :goto_1a
    invoke-virtual {v2}, Lng/h;->hasNext()Z

    .line 747
    .line 748
    .line 749
    move-result v3

    .line 750
    if-eqz v3, :cond_1e

    .line 751
    .line 752
    invoke-virtual {v2}, Lng/h;->next()Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v3

    .line 756
    check-cast v3, Ljava/io/File;

    .line 757
    .line 758
    invoke-virtual {v0, v3}, Lv8/q;->a(Ljava/io/File;)V

    .line 759
    .line 760
    .line 761
    goto :goto_1a

    .line 762
    :cond_1e
    new-instance v2, Lv0/a;

    .line 763
    .line 764
    const/4 v3, 0x2

    .line 765
    invoke-direct {v2, v0, v3}, Lv0/a;-><init>(Ljava/lang/Object;I)V

    .line 766
    .line 767
    .line 768
    const-wide/32 v3, 0x1499700

    .line 769
    .line 770
    .line 771
    invoke-virtual {v0, v3, v4, v2}, Lv8/q;->o(JLfg/a;)Z

    .line 772
    .line 773
    .line 774
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 775
    .line 776
    return-object v0

    .line 777
    :pswitch_a
    iget-object v0, v1, Lv0/a;->h:Ljava/lang/Object;

    .line 778
    .line 779
    check-cast v0, Lv0/i;

    .line 780
    .line 781
    iget-object v0, v0, Lv0/i;->i:Lp4/t;

    .line 782
    .line 783
    if-eqz v0, :cond_1f

    .line 784
    .line 785
    const/4 v2, 0x0

    .line 786
    new-array v3, v2, [Lsf/e;

    .line 787
    .line 788
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    move-result-object v2

    .line 792
    check-cast v2, [Lsf/e;

    .line 793
    .line 794
    invoke-static {v2}, Lx6/d;->n([Lsf/e;)Landroid/os/Bundle;

    .line 795
    .line 796
    .line 797
    move-result-object v2

    .line 798
    invoke-virtual {v0, v2}, Lp4/t;->G(Landroid/os/Bundle;)V

    .line 799
    .line 800
    .line 801
    invoke-virtual {v2}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 802
    .line 803
    .line 804
    move-result v0

    .line 805
    if-eqz v0, :cond_20

    .line 806
    .line 807
    :cond_1f
    const/4 v2, 0x0

    .line 808
    :cond_20
    return-object v2

    .line 809
    :pswitch_b
    iget-object v0, v1, Lv0/a;->h:Ljava/lang/Object;

    .line 810
    .line 811
    check-cast v0, Lv0/b;

    .line 812
    .line 813
    iget-object v2, v0, Lv0/b;->g:Lv0/j;

    .line 814
    .line 815
    iget-object v3, v0, Lv0/b;->j:Ljava/lang/Object;

    .line 816
    .line 817
    if-eqz v3, :cond_21

    .line 818
    .line 819
    invoke-interface {v2, v0, v3}, Lv0/j;->d(Lv0/b;Ljava/lang/Object;)Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    move-result-object v0

    .line 823
    goto :goto_1b

    .line 824
    :cond_21
    const-string v0, "Value should be initialized"

    .line 825
    .line 826
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 827
    .line 828
    .line 829
    const/4 v0, 0x0

    .line 830
    :goto_1b
    return-object v0

    .line 831
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
