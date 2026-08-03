.class public final synthetic Lc9/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lr8/g;


# direct methods
.method public synthetic constructor <init>(Lr8/g;I)V
    .locals 0

    .line 1
    iput p2, p0, Lc9/f;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lc9/f;->h:Lr8/g;

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
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lc9/f;->g:I

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, Lc9/f;->h:Lr8/g;

    .line 11
    .line 12
    sget-object v2, Leb/m0;->a:Leb/m0;

    .line 13
    .line 14
    invoke-virtual {v2, v0}, Leb/m0;->g(Lr8/g;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0

    .line 23
    :pswitch_0
    iget-object v0, v1, Lc9/f;->h:Lr8/g;

    .line 24
    .line 25
    invoke-static {v0, v3}, Lya/i;->d(Lr8/g;Z)Ljava/lang/reflect/Method;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->database()Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    invoke-static {v2, v0}, Lya/i;->g(Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;Ljava/lang/reflect/Method;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move v3, v4

    .line 45
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0

    .line 50
    :pswitch_1
    iget-object v0, v1, Lc9/f;->h:Lr8/g;

    .line 51
    .line 52
    iget-object v0, v0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 53
    .line 54
    return-object v0

    .line 55
    :pswitch_2
    iget-object v0, v1, Lc9/f;->h:Lr8/g;

    .line 56
    .line 57
    iget-object v0, v0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 58
    .line 59
    return-object v0

    .line 60
    :pswitch_3
    iget-object v0, v1, Lc9/f;->h:Lr8/g;

    .line 61
    .line 62
    sget-object v2, Leb/m0;->a:Leb/m0;

    .line 63
    .line 64
    invoke-virtual {v2, v0}, Leb/m0;->g(Lr8/g;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    return-object v0

    .line 73
    :pswitch_4
    iget-object v0, v1, Lc9/f;->h:Lr8/g;

    .line 74
    .line 75
    sget-object v2, Leb/m0;->a:Leb/m0;

    .line 76
    .line 77
    invoke-virtual {v2, v0}, Leb/m0;->g(Lr8/g;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    return-object v0

    .line 86
    :pswitch_5
    iget-object v0, v1, Lc9/f;->h:Lr8/g;

    .line 87
    .line 88
    sget-object v5, Leb/d;->a:Leb/d;

    .line 89
    .line 90
    monitor-enter v5

    .line 91
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    sget-boolean v0, Leb/d;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 95
    .line 96
    if-eqz v0, :cond_1

    .line 97
    .line 98
    monitor-exit v5

    .line 99
    goto :goto_6

    .line 100
    :cond_1
    :try_start_1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->chatroomChanges()Lg8/g;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    if-eqz v0, :cond_6

    .line 105
    .line 106
    iget-object v6, v0, Lg8/g;->a:Lo8/d;

    .line 107
    .line 108
    if-eqz v6, :cond_2

    .line 109
    .line 110
    invoke-virtual {v6}, Lo8/d;->f()Z

    .line 111
    .line 112
    .line 113
    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 114
    if-eqz v6, :cond_2

    .line 115
    .line 116
    move v6, v3

    .line 117
    goto :goto_1

    .line 118
    :cond_2
    move v6, v4

    .line 119
    :goto_1
    if-nez v6, :cond_3

    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_3
    :try_start_2
    invoke-static {}, Leb/d;->g()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 123
    .line 124
    .line 125
    :catchall_0
    :try_start_3
    new-instance v6, Leb/a;

    .line 126
    .line 127
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v6}, Lg8/g;->a(Lg8/f;)La2/a;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 131
    .line 132
    .line 133
    :try_start_4
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messageObserve()Lk8/p;

    .line 134
    .line 135
    .line 136
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 137
    goto :goto_2

    .line 138
    :catchall_1
    move-exception v0

    .line 139
    :try_start_5
    new-instance v6, Lsf/f;

    .line 140
    .line 141
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 142
    .line 143
    .line 144
    move-object v0, v6

    .line 145
    :goto_2
    nop

    .line 146
    instance-of v6, v0, Lsf/f;

    .line 147
    .line 148
    if-eqz v6, :cond_4

    .line 149
    .line 150
    const/4 v2, 0x0

    .line 151
    goto :goto_3

    .line 152
    :cond_4
    move-object v2, v0

    .line 153
    :goto_3
    check-cast v2, Lk8/p;

    .line 154
    .line 155
    if-eqz v2, :cond_5

    .line 156
    .line 157
    invoke-virtual {v2}, Lk8/p;->c()Z

    .line 158
    .line 159
    .line 160
    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 161
    if-eqz v0, :cond_5

    .line 162
    .line 163
    :try_start_6
    invoke-virtual {v2}, Lk8/p;->b()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 164
    .line 165
    .line 166
    :catchall_2
    :try_start_7
    new-instance v0, Leb/b;

    .line 167
    .line 168
    invoke-direct {v0, v4}, Leb/b;-><init>(I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, v0}, Lk8/p;->e(Lk8/n;)La2/a;

    .line 172
    .line 173
    .line 174
    goto :goto_4

    .line 175
    :catchall_3
    move-exception v0

    .line 176
    goto :goto_7

    .line 177
    :cond_5
    :goto_4
    sput-boolean v3, Leb/d;->b:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 178
    .line 179
    monitor-exit v5

    .line 180
    goto :goto_6

    .line 181
    :cond_6
    :goto_5
    monitor-exit v5

    .line 182
    move v3, v4

    .line 183
    :goto_6
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    return-object v0

    .line 188
    :goto_7
    :try_start_8
    monitor-exit v5
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 189
    throw v0

    .line 190
    :pswitch_6
    iget-object v0, v1, Lc9/f;->h:Lr8/g;

    .line 191
    .line 192
    sget-object v2, Leb/k;->a:Leb/k;

    .line 193
    .line 194
    invoke-virtual {v2, v0}, Leb/k;->j(Lr8/g;)V

    .line 195
    .line 196
    .line 197
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 198
    .line 199
    return-object v0

    .line 200
    :pswitch_7
    iget-object v0, v1, Lc9/f;->h:Lr8/g;

    .line 201
    .line 202
    sget-object v4, Leb/f;->a:Leb/f;

    .line 203
    .line 204
    monitor-enter v4

    .line 205
    :try_start_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    sget-boolean v0, Leb/f;->c:Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 209
    .line 210
    if-eqz v0, :cond_7

    .line 211
    .line 212
    monitor-exit v4

    .line 213
    goto :goto_a

    .line 214
    :cond_7
    :try_start_a
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->k()Lk8/i;

    .line 222
    .line 223
    .line 224
    move-result-object v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 225
    goto :goto_8

    .line 226
    :catchall_4
    const/4 v2, 0x0

    .line 227
    :goto_8
    if-eqz v2, :cond_8

    .line 228
    .line 229
    :try_start_b
    invoke-virtual {v2}, Lk8/i;->b()Z

    .line 230
    .line 231
    .line 232
    move-result v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 233
    if-eqz v0, :cond_8

    .line 234
    .line 235
    :try_start_c
    invoke-virtual {v2}, Lk8/i;->a()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 236
    .line 237
    .line 238
    :catchall_5
    :try_start_d
    new-instance v0, Leb/e;

    .line 239
    .line 240
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2, v0}, Lk8/i;->e(Lk8/h;)La2/a;

    .line 244
    .line 245
    .line 246
    sput-boolean v3, Leb/f;->c:Z

    .line 247
    .line 248
    goto :goto_9

    .line 249
    :catchall_6
    move-exception v0

    .line 250
    goto :goto_b

    .line 251
    :cond_8
    :goto_9
    sget-boolean v3, Leb/f;->c:Z
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 252
    .line 253
    monitor-exit v4

    .line 254
    :goto_a
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    return-object v0

    .line 259
    :goto_b
    :try_start_e
    monitor-exit v4
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 260
    throw v0

    .line 261
    :pswitch_8
    iget-object v0, v1, Lc9/f;->h:Lr8/g;

    .line 262
    .line 263
    sget-object v2, Leb/m0;->a:Leb/m0;

    .line 264
    .line 265
    invoke-virtual {v2, v0}, Leb/m0;->g(Lr8/g;)Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    return-object v0

    .line 274
    :pswitch_9
    const-string v5, "void"

    .line 275
    .line 276
    iget-object v6, v1, Lc9/f;->h:Lr8/g;

    .line 277
    .line 278
    sget-object v0, Lc9/d2;->a:Lc9/d2;

    .line 279
    .line 280
    const-string v7, "com.tencent.mm.ui.conversation."

    .line 281
    .line 282
    const-string v0, "com.tencent.mm.storage."

    .line 283
    .line 284
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    sget-object v10, Lc9/d2;->a:Lc9/d2;

    .line 288
    .line 289
    const-string v8, "main_conversation_query"

    .line 290
    .line 291
    const-class v17, Lc9/d2;

    .line 292
    .line 293
    invoke-static/range {v17 .. v17}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 294
    .line 295
    .line 296
    move-result-object v9

    .line 297
    invoke-interface {v9}, Lgg/e;->a()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    move-result-object v9

    .line 301
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    iget-object v9, v6, Lr8/g;->a:Landroid/content/Context;

    .line 305
    .line 306
    const-string v11, "Hchat_conversation_group_method_cache"

    .line 307
    .line 308
    invoke-static {v9, v11}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 309
    .line 310
    .line 311
    move-result-object v9

    .line 312
    iget-object v12, v6, Lr8/g;->a:Landroid/content/Context;

    .line 313
    .line 314
    iget-object v13, v6, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 315
    .line 316
    invoke-static {v12, v13}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v12

    .line 320
    invoke-static {v9, v12, v13, v8}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 321
    .line 322
    .line 323
    move-result-object v9

    .line 324
    if-eqz v9, :cond_9

    .line 325
    .line 326
    invoke-static {v10, v9}, Lc9/d2;->g(Lc9/d2;Ljava/lang/reflect/Method;)Z

    .line 327
    .line 328
    .line 329
    move-result v12

    .line 330
    if-eqz v12, :cond_9

    .line 331
    .line 332
    goto :goto_c

    .line 333
    :cond_9
    const/4 v9, 0x0

    .line 334
    :goto_c
    if-eqz v9, :cond_a

    .line 335
    .line 336
    move-object v4, v11

    .line 337
    :goto_d
    move-object v2, v9

    .line 338
    goto :goto_e

    .line 339
    :cond_a
    new-instance v9, Lch/e;

    .line 340
    .line 341
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 342
    .line 343
    .line 344
    new-instance v12, Lfh/k;

    .line 345
    .line 346
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v12, v3, v0}, Lfh/k;->l0(ILjava/lang/String;)V

    .line 350
    .line 351
    .line 352
    const-string v13, "select unReadCount, status, isSend, conversationTime, rconversation.username, content"

    .line 353
    .line 354
    const-string v14, "parentRef is null"

    .line 355
    .line 356
    const-string v15, "message_fold"

    .line 357
    .line 358
    filled-new-array {v13, v14, v15}, [Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v13

    .line 362
    invoke-static {v13}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 363
    .line 364
    .line 365
    move-result-object v13

    .line 366
    invoke-static {v12, v13}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 367
    .line 368
    .line 369
    iput-object v12, v9, Lch/e;->h:Lfh/k;

    .line 370
    .line 371
    move-object v12, v8

    .line 372
    new-instance v8, Lc0/f;

    .line 373
    .line 374
    move-object v13, v11

    .line 375
    invoke-static/range {v17 .. v17}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    move-result-object v11

    .line 379
    move-object v14, v12

    .line 380
    const-string v12, "isQueryMethod"

    .line 381
    .line 382
    move-object v15, v13

    .line 383
    const-string v13, "isQueryMethod(Ljava/lang/reflect/Method;)Z"

    .line 384
    .line 385
    move-object/from16 v16, v15

    .line 386
    .line 387
    const/4 v15, 0x0

    .line 388
    move-object/from16 v18, v16

    .line 389
    .line 390
    const/16 v16, 0x9

    .line 391
    .line 392
    move-object/from16 v19, v9

    .line 393
    .line 394
    const/4 v9, 0x1

    .line 395
    move-object/from16 v20, v14

    .line 396
    .line 397
    const/4 v14, 0x0

    .line 398
    move-object/from16 v4, v18

    .line 399
    .line 400
    move-object/from16 v3, v19

    .line 401
    .line 402
    move-object/from16 v2, v20

    .line 403
    .line 404
    invoke-direct/range {v8 .. v16}, Lc0/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v10, v6, v2, v3, v8}, Lc9/d2;->r(Lr8/g;Ljava/lang/String;Lch/e;Lfg/l;)Ljava/lang/reflect/Method;

    .line 408
    .line 409
    .line 410
    move-result-object v9

    .line 411
    goto :goto_d

    .line 412
    :goto_e
    if-eqz v2, :cond_3d

    .line 413
    .line 414
    const-string v3, "conversation_parent_update"

    .line 415
    .line 416
    invoke-static/range {v17 .. v17}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 417
    .line 418
    .line 419
    move-result-object v8

    .line 420
    invoke-interface {v8}, Lgg/e;->a()Ljava/lang/Class;

    .line 421
    .line 422
    .line 423
    move-result-object v8

    .line 424
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    iget-object v8, v6, Lr8/g;->a:Landroid/content/Context;

    .line 428
    .line 429
    invoke-static {v8, v4}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 430
    .line 431
    .line 432
    move-result-object v8

    .line 433
    iget-object v9, v6, Lr8/g;->a:Landroid/content/Context;

    .line 434
    .line 435
    iget-object v11, v6, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 436
    .line 437
    invoke-static {v9, v11}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v9

    .line 441
    invoke-static {v8, v9, v11, v3}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 442
    .line 443
    .line 444
    move-result-object v8

    .line 445
    if-eqz v8, :cond_b

    .line 446
    .line 447
    invoke-static {v10, v8}, Lc9/d2;->f(Lc9/d2;Ljava/lang/reflect/Method;)Z

    .line 448
    .line 449
    .line 450
    move-result v9

    .line 451
    if-eqz v9, :cond_b

    .line 452
    .line 453
    goto :goto_f

    .line 454
    :cond_b
    const/4 v8, 0x0

    .line 455
    :goto_f
    if-eqz v8, :cond_c

    .line 456
    .line 457
    :goto_10
    move-object v1, v8

    .line 458
    goto :goto_11

    .line 459
    :cond_c
    new-instance v8, Lch/e;

    .line 460
    .line 461
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 462
    .line 463
    .line 464
    new-instance v9, Lfh/k;

    .line 465
    .line 466
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 467
    .line 468
    .line 469
    const/4 v11, 0x1

    .line 470
    invoke-virtual {v9, v11, v0}, Lfh/k;->l0(ILjava/lang/String;)V

    .line 471
    .line 472
    .line 473
    const-string v11, "Update rconversation set parentRef = \'"

    .line 474
    .line 475
    const-string v12, "\' where 1 != 1 "

    .line 476
    .line 477
    filled-new-array {v11, v12}, [Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v11

    .line 481
    invoke-static {v11}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 482
    .line 483
    .line 484
    move-result-object v11

    .line 485
    invoke-static {v9, v11}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 486
    .line 487
    .line 488
    iput-object v9, v8, Lch/e;->h:Lfh/k;

    .line 489
    .line 490
    move-object v9, v8

    .line 491
    new-instance v8, Lc0/f;

    .line 492
    .line 493
    invoke-static/range {v17 .. v17}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 494
    .line 495
    .line 496
    move-result-object v11

    .line 497
    const-string v12, "isParentUpdateMethod"

    .line 498
    .line 499
    const-string v13, "isParentUpdateMethod(Ljava/lang/reflect/Method;)Z"

    .line 500
    .line 501
    const/4 v15, 0x0

    .line 502
    const/16 v16, 0x8

    .line 503
    .line 504
    move-object v14, v9

    .line 505
    const/4 v9, 0x1

    .line 506
    move-object/from16 v20, v14

    .line 507
    .line 508
    const/4 v14, 0x0

    .line 509
    move-object/from16 v1, v20

    .line 510
    .line 511
    invoke-direct/range {v8 .. v16}, Lc0/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v10, v6, v3, v1, v8}, Lc9/d2;->r(Lr8/g;Ljava/lang/String;Lch/e;Lfg/l;)Ljava/lang/reflect/Method;

    .line 515
    .line 516
    .line 517
    move-result-object v8

    .line 518
    goto :goto_10

    .line 519
    :goto_11
    if-eqz v1, :cond_3d

    .line 520
    .line 521
    const-string v3, "main_conversation_click"

    .line 522
    .line 523
    invoke-static/range {v17 .. v17}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 524
    .line 525
    .line 526
    move-result-object v8

    .line 527
    invoke-interface {v8}, Lgg/e;->a()Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    move-result-object v8

    .line 531
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 532
    .line 533
    .line 534
    iget-object v8, v6, Lr8/g;->a:Landroid/content/Context;

    .line 535
    .line 536
    invoke-static {v8, v4}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 537
    .line 538
    .line 539
    move-result-object v8

    .line 540
    iget-object v9, v6, Lr8/g;->a:Landroid/content/Context;

    .line 541
    .line 542
    iget-object v11, v6, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 543
    .line 544
    invoke-static {v9, v11}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v9

    .line 548
    invoke-static {v8, v9, v11, v3}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 549
    .line 550
    .line 551
    move-result-object v8

    .line 552
    if-eqz v8, :cond_d

    .line 553
    .line 554
    invoke-static {v10, v8}, Lc9/d2;->a(Lc9/d2;Ljava/lang/reflect/Method;)Z

    .line 555
    .line 556
    .line 557
    move-result v9

    .line 558
    if-eqz v9, :cond_d

    .line 559
    .line 560
    goto :goto_12

    .line 561
    :cond_d
    const/4 v8, 0x0

    .line 562
    :goto_12
    if-eqz v8, :cond_e

    .line 563
    .line 564
    move-object/from16 v21, v2

    .line 565
    .line 566
    :goto_13
    move-object v2, v8

    .line 567
    goto :goto_14

    .line 568
    :cond_e
    new-instance v8, Lch/e;

    .line 569
    .line 570
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 571
    .line 572
    .line 573
    new-instance v9, Lfh/k;

    .line 574
    .line 575
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 576
    .line 577
    .line 578
    const/4 v11, 0x1

    .line 579
    invoke-virtual {v9, v11, v7}, Lfh/k;->l0(ILjava/lang/String;)V

    .line 580
    .line 581
    .line 582
    const-string v11, "MicroMsg.ConversationClickListener"

    .line 583
    .line 584
    const-string v12, "null user at position = "

    .line 585
    .line 586
    filled-new-array {v11, v12}, [Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v11

    .line 590
    invoke-static {v11}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 591
    .line 592
    .line 593
    move-result-object v11

    .line 594
    invoke-static {v9, v11}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 595
    .line 596
    .line 597
    iput-object v9, v8, Lch/e;->h:Lfh/k;

    .line 598
    .line 599
    move-object v9, v8

    .line 600
    new-instance v8, Lc0/f;

    .line 601
    .line 602
    invoke-static/range {v17 .. v17}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    move-result-object v11

    .line 606
    const-string v12, "isClickMethod"

    .line 607
    .line 608
    const-string v13, "isClickMethod(Ljava/lang/reflect/Method;)Z"

    .line 609
    .line 610
    const/4 v15, 0x0

    .line 611
    const/16 v16, 0x2

    .line 612
    .line 613
    move-object v14, v9

    .line 614
    const/4 v9, 0x1

    .line 615
    move-object/from16 v20, v14

    .line 616
    .line 617
    const/4 v14, 0x0

    .line 618
    move-object/from16 v21, v2

    .line 619
    .line 620
    move-object/from16 v2, v20

    .line 621
    .line 622
    invoke-direct/range {v8 .. v16}, Lc0/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 623
    .line 624
    .line 625
    invoke-virtual {v10, v6, v3, v2, v8}, Lc9/d2;->r(Lr8/g;Ljava/lang/String;Lch/e;Lfg/l;)Ljava/lang/reflect/Method;

    .line 626
    .line 627
    .line 628
    move-result-object v8

    .line 629
    goto :goto_13

    .line 630
    :goto_14
    if-eqz v2, :cond_3d

    .line 631
    .line 632
    const-string v3, "fold_group_conversation_query"

    .line 633
    .line 634
    invoke-static/range {v17 .. v17}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 635
    .line 636
    .line 637
    move-result-object v8

    .line 638
    invoke-interface {v8}, Lgg/e;->a()Ljava/lang/Class;

    .line 639
    .line 640
    .line 641
    move-result-object v8

    .line 642
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 643
    .line 644
    .line 645
    iget-object v8, v6, Lr8/g;->a:Landroid/content/Context;

    .line 646
    .line 647
    invoke-static {v8, v4}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 648
    .line 649
    .line 650
    move-result-object v8

    .line 651
    iget-object v9, v6, Lr8/g;->a:Landroid/content/Context;

    .line 652
    .line 653
    iget-object v11, v6, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 654
    .line 655
    invoke-static {v9, v11}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 656
    .line 657
    .line 658
    move-result-object v9

    .line 659
    invoke-static {v8, v9, v11, v3}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 660
    .line 661
    .line 662
    move-result-object v8

    .line 663
    if-eqz v8, :cond_f

    .line 664
    .line 665
    invoke-static {v10, v8}, Lc9/d2;->c(Lc9/d2;Ljava/lang/reflect/Method;)Z

    .line 666
    .line 667
    .line 668
    move-result v9

    .line 669
    if-eqz v9, :cond_f

    .line 670
    .line 671
    goto :goto_15

    .line 672
    :cond_f
    const/4 v8, 0x0

    .line 673
    :goto_15
    if-eqz v8, :cond_10

    .line 674
    .line 675
    move-object/from16 v22, v2

    .line 676
    .line 677
    :goto_16
    move-object v2, v8

    .line 678
    goto :goto_17

    .line 679
    :cond_10
    new-instance v8, Lch/e;

    .line 680
    .line 681
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 682
    .line 683
    .line 684
    new-instance v9, Lfh/k;

    .line 685
    .line 686
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 687
    .line 688
    .line 689
    const/4 v11, 0x1

    .line 690
    invoke-virtual {v9, v11, v0}, Lfh/k;->l0(ILjava/lang/String;)V

    .line 691
    .line 692
    .line 693
    const-string v11, "select * from rconversation where"

    .line 694
    .line 695
    const-string v12, "parentRef = \'"

    .line 696
    .line 697
    filled-new-array {v11, v12}, [Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object v11

    .line 701
    invoke-static {v11}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 702
    .line 703
    .line 704
    move-result-object v11

    .line 705
    invoke-static {v9, v11}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 706
    .line 707
    .line 708
    iput-object v9, v8, Lch/e;->h:Lfh/k;

    .line 709
    .line 710
    move-object v9, v8

    .line 711
    new-instance v8, Lc0/f;

    .line 712
    .line 713
    invoke-static/range {v17 .. v17}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 714
    .line 715
    .line 716
    move-result-object v11

    .line 717
    const-string v12, "isNativeGroupQueryMethod"

    .line 718
    .line 719
    const-string v13, "isNativeGroupQueryMethod(Ljava/lang/reflect/Method;)Z"

    .line 720
    .line 721
    const/4 v15, 0x0

    .line 722
    const/16 v16, 0x5

    .line 723
    .line 724
    move-object v14, v9

    .line 725
    const/4 v9, 0x1

    .line 726
    move-object/from16 v20, v14

    .line 727
    .line 728
    const/4 v14, 0x0

    .line 729
    move-object/from16 v22, v2

    .line 730
    .line 731
    move-object/from16 v2, v20

    .line 732
    .line 733
    invoke-direct/range {v8 .. v16}, Lc0/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 734
    .line 735
    .line 736
    invoke-virtual {v10, v6, v3, v2, v8}, Lc9/d2;->r(Lr8/g;Ljava/lang/String;Lch/e;Lfg/l;)Ljava/lang/reflect/Method;

    .line 737
    .line 738
    .line 739
    move-result-object v8

    .line 740
    goto :goto_16

    .line 741
    :goto_17
    if-eqz v2, :cond_3d

    .line 742
    .line 743
    const-string v3, "fold_group_conversation_click"

    .line 744
    .line 745
    invoke-static/range {v17 .. v17}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 746
    .line 747
    .line 748
    move-result-object v8

    .line 749
    invoke-interface {v8}, Lgg/e;->a()Ljava/lang/Class;

    .line 750
    .line 751
    .line 752
    move-result-object v8

    .line 753
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 754
    .line 755
    .line 756
    iget-object v8, v6, Lr8/g;->a:Landroid/content/Context;

    .line 757
    .line 758
    invoke-static {v8, v4}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 759
    .line 760
    .line 761
    move-result-object v8

    .line 762
    iget-object v9, v6, Lr8/g;->a:Landroid/content/Context;

    .line 763
    .line 764
    iget-object v11, v6, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 765
    .line 766
    invoke-static {v9, v11}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 767
    .line 768
    .line 769
    move-result-object v9

    .line 770
    invoke-static {v8, v9, v11, v3}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 771
    .line 772
    .line 773
    move-result-object v8

    .line 774
    if-eqz v8, :cond_11

    .line 775
    .line 776
    invoke-static {v10, v8}, Lc9/d2;->a(Lc9/d2;Ljava/lang/reflect/Method;)Z

    .line 777
    .line 778
    .line 779
    move-result v9

    .line 780
    if-eqz v9, :cond_11

    .line 781
    .line 782
    goto :goto_18

    .line 783
    :cond_11
    const/4 v8, 0x0

    .line 784
    :goto_18
    if-eqz v8, :cond_12

    .line 785
    .line 786
    move-object/from16 v23, v2

    .line 787
    .line 788
    :goto_19
    move-object v2, v8

    .line 789
    goto :goto_1a

    .line 790
    :cond_12
    new-instance v8, Lch/e;

    .line 791
    .line 792
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 793
    .line 794
    .line 795
    new-instance v9, Lfh/k;

    .line 796
    .line 797
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 798
    .line 799
    .line 800
    const/4 v11, 0x1

    .line 801
    invoke-virtual {v9, v11, v7}, Lfh/k;->l0(ILjava/lang/String;)V

    .line 802
    .line 803
    .line 804
    const-string v11, "MicroMsg.ConvBoxServiceConversationFmUI"

    .line 805
    .line 806
    const-string v12, "user should not be null. position:%d, size:%d"

    .line 807
    .line 808
    const-string v13, "specific_chat_from_scene"

    .line 809
    .line 810
    const-string v14, "chat_from_scene_for_group_chats"

    .line 811
    .line 812
    filled-new-array {v11, v12, v13, v14}, [Ljava/lang/String;

    .line 813
    .line 814
    .line 815
    move-result-object v11

    .line 816
    invoke-static {v11}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 817
    .line 818
    .line 819
    move-result-object v11

    .line 820
    invoke-static {v9, v11}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 821
    .line 822
    .line 823
    iput-object v9, v8, Lch/e;->h:Lfh/k;

    .line 824
    .line 825
    move-object v9, v8

    .line 826
    new-instance v8, Lc0/f;

    .line 827
    .line 828
    invoke-static/range {v17 .. v17}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 829
    .line 830
    .line 831
    move-result-object v11

    .line 832
    const-string v12, "isClickMethod"

    .line 833
    .line 834
    const-string v13, "isClickMethod(Ljava/lang/reflect/Method;)Z"

    .line 835
    .line 836
    const/4 v15, 0x0

    .line 837
    const/16 v16, 0x3

    .line 838
    .line 839
    move-object v14, v9

    .line 840
    const/4 v9, 0x1

    .line 841
    move-object/from16 v20, v14

    .line 842
    .line 843
    const/4 v14, 0x0

    .line 844
    move-object/from16 v23, v2

    .line 845
    .line 846
    move-object/from16 v2, v20

    .line 847
    .line 848
    invoke-direct/range {v8 .. v16}, Lc0/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 849
    .line 850
    .line 851
    invoke-virtual {v10, v6, v3, v2, v8}, Lc9/d2;->r(Lr8/g;Ljava/lang/String;Lch/e;Lfg/l;)Ljava/lang/reflect/Method;

    .line 852
    .line 853
    .line 854
    move-result-object v8

    .line 855
    goto :goto_19

    .line 856
    :goto_1a
    if-eqz v2, :cond_3d

    .line 857
    .line 858
    const-string v3, "fold_group_adapter_refresh"

    .line 859
    .line 860
    invoke-static/range {v17 .. v17}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 861
    .line 862
    .line 863
    move-result-object v8

    .line 864
    invoke-interface {v8}, Lgg/e;->a()Ljava/lang/Class;

    .line 865
    .line 866
    .line 867
    move-result-object v8

    .line 868
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 869
    .line 870
    .line 871
    iget-object v8, v6, Lr8/g;->a:Landroid/content/Context;

    .line 872
    .line 873
    invoke-static {v8, v4}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 874
    .line 875
    .line 876
    move-result-object v8

    .line 877
    iget-object v9, v6, Lr8/g;->a:Landroid/content/Context;

    .line 878
    .line 879
    iget-object v11, v6, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 880
    .line 881
    invoke-static {v9, v11}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 882
    .line 883
    .line 884
    move-result-object v9

    .line 885
    invoke-static {v8, v9, v11, v3}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 886
    .line 887
    .line 888
    move-result-object v8

    .line 889
    if-eqz v8, :cond_13

    .line 890
    .line 891
    invoke-static {v10, v8}, Lc9/d2;->d(Lc9/d2;Ljava/lang/reflect/Method;)Z

    .line 892
    .line 893
    .line 894
    move-result v9

    .line 895
    if-eqz v9, :cond_13

    .line 896
    .line 897
    goto :goto_1b

    .line 898
    :cond_13
    const/4 v8, 0x0

    .line 899
    :goto_1b
    if-eqz v8, :cond_14

    .line 900
    .line 901
    move-object/from16 v24, v2

    .line 902
    .line 903
    :goto_1c
    move-object v2, v8

    .line 904
    goto :goto_1d

    .line 905
    :cond_14
    new-instance v8, Lch/e;

    .line 906
    .line 907
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 908
    .line 909
    .line 910
    new-instance v9, Lfh/k;

    .line 911
    .line 912
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 913
    .line 914
    .line 915
    const/4 v11, 0x1

    .line 916
    invoke-virtual {v9, v11, v7}, Lfh/k;->l0(ILjava/lang/String;)V

    .line 917
    .line 918
    .line 919
    const-string v11, "conversationboxservice"

    .line 920
    .line 921
    filled-new-array {v11}, [Ljava/lang/String;

    .line 922
    .line 923
    .line 924
    move-result-object v11

    .line 925
    invoke-virtual {v9, v11}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 926
    .line 927
    .line 928
    iput-object v9, v8, Lch/e;->h:Lfh/k;

    .line 929
    .line 930
    move-object v9, v8

    .line 931
    new-instance v8, Lc0/f;

    .line 932
    .line 933
    invoke-static/range {v17 .. v17}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 934
    .line 935
    .line 936
    move-result-object v11

    .line 937
    const-string v12, "isNativeGroupRefreshMethod"

    .line 938
    .line 939
    const-string v13, "isNativeGroupRefreshMethod(Ljava/lang/reflect/Method;)Z"

    .line 940
    .line 941
    const/4 v15, 0x0

    .line 942
    const/16 v16, 0x6

    .line 943
    .line 944
    move-object v14, v9

    .line 945
    const/4 v9, 0x1

    .line 946
    move-object/from16 v20, v14

    .line 947
    .line 948
    const/4 v14, 0x0

    .line 949
    move-object/from16 v24, v2

    .line 950
    .line 951
    move-object/from16 v2, v20

    .line 952
    .line 953
    invoke-direct/range {v8 .. v16}, Lc0/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 954
    .line 955
    .line 956
    invoke-virtual {v10, v6, v3, v2, v8}, Lc9/d2;->r(Lr8/g;Ljava/lang/String;Lch/e;Lfg/l;)Ljava/lang/reflect/Method;

    .line 957
    .line 958
    .line 959
    move-result-object v8

    .line 960
    goto :goto_1c

    .line 961
    :goto_1d
    if-eqz v2, :cond_3d

    .line 962
    .line 963
    const-string v3, "fold_group_mark_read"

    .line 964
    .line 965
    invoke-static/range {v17 .. v17}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 966
    .line 967
    .line 968
    move-result-object v8

    .line 969
    invoke-interface {v8}, Lgg/e;->a()Ljava/lang/Class;

    .line 970
    .line 971
    .line 972
    move-result-object v8

    .line 973
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 974
    .line 975
    .line 976
    iget-object v8, v6, Lr8/g;->a:Landroid/content/Context;

    .line 977
    .line 978
    invoke-static {v8, v4}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 979
    .line 980
    .line 981
    move-result-object v8

    .line 982
    iget-object v9, v6, Lr8/g;->a:Landroid/content/Context;

    .line 983
    .line 984
    iget-object v11, v6, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 985
    .line 986
    invoke-static {v9, v11}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 987
    .line 988
    .line 989
    move-result-object v9

    .line 990
    invoke-static {v8, v9, v11, v3}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 991
    .line 992
    .line 993
    move-result-object v8

    .line 994
    if-eqz v8, :cond_15

    .line 995
    .line 996
    invoke-static {v10, v8}, Lc9/d2;->b(Lc9/d2;Ljava/lang/reflect/Method;)Z

    .line 997
    .line 998
    .line 999
    move-result v9

    .line 1000
    if-eqz v9, :cond_15

    .line 1001
    .line 1002
    goto :goto_1e

    .line 1003
    :cond_15
    const/4 v8, 0x0

    .line 1004
    :goto_1e
    if-eqz v8, :cond_16

    .line 1005
    .line 1006
    :goto_1f
    move-object v3, v8

    .line 1007
    goto :goto_20

    .line 1008
    :cond_16
    new-instance v8, Lch/e;

    .line 1009
    .line 1010
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 1011
    .line 1012
    .line 1013
    new-instance v9, Lfh/k;

    .line 1014
    .line 1015
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 1016
    .line 1017
    .line 1018
    const/4 v11, 0x1

    .line 1019
    invoke-virtual {v9, v11, v0}, Lfh/k;->l0(ILjava/lang/String;)V

    .line 1020
    .line 1021
    .line 1022
    const-string v0, "update conversation failed"

    .line 1023
    .line 1024
    const-string v11, "updateUnreadByTalker %s"

    .line 1025
    .line 1026
    filled-new-array {v0, v11}, [Ljava/lang/String;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v0

    .line 1030
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v0

    .line 1034
    invoke-static {v9, v0}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 1035
    .line 1036
    .line 1037
    iput-object v9, v8, Lch/e;->h:Lfh/k;

    .line 1038
    .line 1039
    move-object v0, v8

    .line 1040
    new-instance v8, Lc0/f;

    .line 1041
    .line 1042
    invoke-static/range {v17 .. v17}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v11

    .line 1046
    const-string v12, "isNativeGroupMarkReadMethod"

    .line 1047
    .line 1048
    const-string v13, "isNativeGroupMarkReadMethod(Ljava/lang/reflect/Method;)Z"

    .line 1049
    .line 1050
    const/4 v15, 0x0

    .line 1051
    const/16 v16, 0x4

    .line 1052
    .line 1053
    const/4 v9, 0x1

    .line 1054
    const/4 v14, 0x0

    .line 1055
    invoke-direct/range {v8 .. v16}, Lc0/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 1056
    .line 1057
    .line 1058
    invoke-virtual {v10, v6, v3, v0, v8}, Lc9/d2;->r(Lr8/g;Ljava/lang/String;Lch/e;Lfg/l;)Ljava/lang/reflect/Method;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v8

    .line 1062
    goto :goto_1f

    .line 1063
    :goto_20
    if-eqz v3, :cond_3d

    .line 1064
    .line 1065
    const-string v0, "fold_group_status_notify"

    .line 1066
    .line 1067
    invoke-static/range {v17 .. v17}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v8

    .line 1071
    invoke-interface {v8}, Lgg/e;->a()Ljava/lang/Class;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v8

    .line 1075
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1076
    .line 1077
    .line 1078
    iget-object v8, v6, Lr8/g;->a:Landroid/content/Context;

    .line 1079
    .line 1080
    invoke-static {v8, v4}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v8

    .line 1084
    iget-object v9, v6, Lr8/g;->a:Landroid/content/Context;

    .line 1085
    .line 1086
    iget-object v11, v6, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 1087
    .line 1088
    invoke-static {v9, v11}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v9

    .line 1092
    invoke-static {v8, v9, v11, v0}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v8

    .line 1096
    if-eqz v8, :cond_17

    .line 1097
    .line 1098
    invoke-static {v10, v8}, Lc9/d2;->e(Lc9/d2;Ljava/lang/reflect/Method;)Z

    .line 1099
    .line 1100
    .line 1101
    move-result v9

    .line 1102
    if-eqz v9, :cond_17

    .line 1103
    .line 1104
    goto :goto_21

    .line 1105
    :cond_17
    const/4 v8, 0x0

    .line 1106
    :goto_21
    if-eqz v8, :cond_18

    .line 1107
    .line 1108
    move-object/from16 v20, v3

    .line 1109
    .line 1110
    goto :goto_22

    .line 1111
    :cond_18
    new-instance v8, Lch/e;

    .line 1112
    .line 1113
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 1114
    .line 1115
    .line 1116
    new-instance v9, Lfh/k;

    .line 1117
    .line 1118
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 1119
    .line 1120
    .line 1121
    const-string v11, "enterSession %s %s"

    .line 1122
    .line 1123
    filled-new-array {v11}, [Ljava/lang/String;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v11

    .line 1127
    invoke-virtual {v9, v11}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 1128
    .line 1129
    .line 1130
    iput-object v9, v8, Lch/e;->h:Lfh/k;

    .line 1131
    .line 1132
    move-object v9, v8

    .line 1133
    new-instance v8, Lc0/f;

    .line 1134
    .line 1135
    invoke-static/range {v17 .. v17}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v11

    .line 1139
    const-string v12, "isNativeGroupStatusNotifyMethod"

    .line 1140
    .line 1141
    const-string v13, "isNativeGroupStatusNotifyMethod(Ljava/lang/reflect/Method;)Z"

    .line 1142
    .line 1143
    const/4 v15, 0x0

    .line 1144
    const/16 v16, 0x7

    .line 1145
    .line 1146
    move-object v14, v9

    .line 1147
    const/4 v9, 0x1

    .line 1148
    move-object/from16 v17, v14

    .line 1149
    .line 1150
    const/4 v14, 0x0

    .line 1151
    move-object/from16 v20, v3

    .line 1152
    .line 1153
    move-object/from16 v3, v17

    .line 1154
    .line 1155
    invoke-direct/range {v8 .. v16}, Lc0/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 1156
    .line 1157
    .line 1158
    invoke-virtual {v10, v6, v0, v3, v8}, Lc9/d2;->r(Lr8/g;Ljava/lang/String;Lch/e;Lfg/l;)Ljava/lang/reflect/Method;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v8

    .line 1162
    :goto_22
    iget-object v0, v6, Lr8/g;->a:Landroid/content/Context;

    .line 1163
    .line 1164
    iget-object v3, v6, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 1165
    .line 1166
    invoke-static {v0, v4}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v4

    .line 1170
    iget-object v0, v6, Lr8/g;->a:Landroid/content/Context;

    .line 1171
    .line 1172
    iget-object v9, v6, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 1173
    .line 1174
    invoke-static {v0, v9}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v10

    .line 1178
    const-string v11, "fold_group_menu_create"

    .line 1179
    .line 1180
    invoke-static {v4, v10, v9, v11}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v0

    .line 1184
    const-string v12, "fold_group_menu_click"

    .line 1185
    .line 1186
    invoke-static {v4, v10, v9, v12}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v13

    .line 1190
    const/4 v14, 0x2

    .line 1191
    const/4 v15, 0x5

    .line 1192
    if-eqz v0, :cond_19

    .line 1193
    .line 1194
    if-eqz v13, :cond_19

    .line 1195
    .line 1196
    invoke-static {v0, v13}, Lc9/d2;->u(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)Ljava/lang/Class;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v16

    .line 1200
    if-eqz v16, :cond_19

    .line 1201
    .line 1202
    new-instance v3, Lc9/w1;

    .line 1203
    .line 1204
    invoke-direct {v3, v0, v13}, Lc9/w1;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 1205
    .line 1206
    .line 1207
    move-object/from16 v17, v8

    .line 1208
    .line 1209
    goto/16 :goto_2f

    .line 1210
    .line 1211
    :cond_19
    :try_start_f
    new-instance v0, Lch/e;

    .line 1212
    .line 1213
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1214
    .line 1215
    .line 1216
    new-instance v13, Lfh/k;

    .line 1217
    .line 1218
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 1219
    .line 1220
    .line 1221
    invoke-virtual {v13, v14, v7}, Lfh/k;->l0(ILjava/lang/String;)V

    .line 1222
    .line 1223
    .line 1224
    const-string v14, "onCreateContextMenu"
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_a

    .line 1225
    .line 1226
    move-object/from16 v17, v8

    .line 1227
    .line 1228
    :try_start_10
    new-instance v8, Lgh/c;

    .line 1229
    .line 1230
    invoke-direct {v8, v14, v15}, Lgh/c;-><init>(Ljava/lang/String;I)V

    .line 1231
    .line 1232
    .line 1233
    iput-object v8, v13, Lfh/k;->g:Lgh/c;

    .line 1234
    .line 1235
    invoke-static {v13, v5}, Lfh/k;->q0(Lfh/k;Ljava/lang/String;)V

    .line 1236
    .line 1237
    .line 1238
    const-string v8, "android.view.ContextMenu"

    .line 1239
    .line 1240
    const-string v14, "android.view.View"

    .line 1241
    .line 1242
    const-string v15, "android.view.ContextMenu$ContextMenuInfo"

    .line 1243
    .line 1244
    filled-new-array {v8, v14, v15}, [Ljava/lang/String;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v8

    .line 1248
    invoke-virtual {v13, v8}, Lfh/k;->o0([Ljava/lang/String;)V

    .line 1249
    .line 1250
    .line 1251
    iput-object v13, v0, Lch/e;->h:Lfh/k;

    .line 1252
    .line 1253
    invoke-virtual {v3, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v0

    .line 1257
    new-instance v8, Ljava/util/ArrayList;

    .line 1258
    .line 1259
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1260
    .line 1261
    .line 1262
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v13

    .line 1266
    :cond_1a
    :goto_23
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 1267
    .line 1268
    .line 1269
    move-result v0

    .line 1270
    if-eqz v0, :cond_1c

    .line 1271
    .line 1272
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v0

    .line 1276
    check-cast v0, Lhh/o;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    .line 1277
    .line 1278
    :try_start_11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1279
    .line 1280
    .line 1281
    invoke-virtual {v0}, Lhh/o;->p()Llh/d;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v0

    .line 1285
    invoke-virtual {v0, v9}, Llh/d;->b(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 1289
    goto :goto_24

    .line 1290
    :catchall_7
    move-exception v0

    .line 1291
    :try_start_12
    new-instance v14, Lsf/f;

    .line 1292
    .line 1293
    invoke-direct {v14, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1294
    .line 1295
    .line 1296
    move-object v0, v14

    .line 1297
    :goto_24
    nop

    .line 1298
    instance-of v14, v0, Lsf/f;

    .line 1299
    .line 1300
    if-eqz v14, :cond_1b

    .line 1301
    .line 1302
    const/4 v0, 0x0

    .line 1303
    :cond_1b
    check-cast v0, Ljava/lang/reflect/Method;

    .line 1304
    .line 1305
    if-eqz v0, :cond_1a

    .line 1306
    .line 1307
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1308
    .line 1309
    .line 1310
    goto :goto_23

    .line 1311
    :catchall_8
    move-exception v0

    .line 1312
    goto/16 :goto_2d

    .line 1313
    .line 1314
    :cond_1c
    new-instance v13, Ljava/util/ArrayList;

    .line 1315
    .line 1316
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 1317
    .line 1318
    .line 1319
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v0

    .line 1323
    :cond_1d
    :goto_25
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1324
    .line 1325
    .line 1326
    move-result v8

    .line 1327
    if-eqz v8, :cond_1e

    .line 1328
    .line 1329
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v8

    .line 1333
    move-object v14, v8

    .line 1334
    check-cast v14, Ljava/lang/reflect/Method;

    .line 1335
    .line 1336
    invoke-static {v14}, Lc9/d2;->p(Ljava/lang/reflect/Method;)Z

    .line 1337
    .line 1338
    .line 1339
    move-result v14

    .line 1340
    if-eqz v14, :cond_1d

    .line 1341
    .line 1342
    invoke-virtual {v13, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1343
    .line 1344
    .line 1345
    goto :goto_25

    .line 1346
    :cond_1e
    new-instance v0, Lch/e;

    .line 1347
    .line 1348
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1349
    .line 1350
    .line 1351
    new-instance v8, Lfh/k;

    .line 1352
    .line 1353
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 1354
    .line 1355
    .line 1356
    const/4 v14, 0x2

    .line 1357
    invoke-virtual {v8, v14, v7}, Lfh/k;->l0(ILjava/lang/String;)V

    .line 1358
    .line 1359
    .line 1360
    const-string v7, "onMMMenuItemSelected"

    .line 1361
    .line 1362
    new-instance v14, Lgh/c;

    .line 1363
    .line 1364
    const/4 v15, 0x5

    .line 1365
    invoke-direct {v14, v7, v15}, Lgh/c;-><init>(Ljava/lang/String;I)V

    .line 1366
    .line 1367
    .line 1368
    iput-object v14, v8, Lfh/k;->g:Lgh/c;

    .line 1369
    .line 1370
    invoke-static {v8, v5}, Lfh/k;->q0(Lfh/k;Ljava/lang/String;)V

    .line 1371
    .line 1372
    .line 1373
    const-string v5, "android.view.MenuItem"

    .line 1374
    .line 1375
    const-string v7, "int"

    .line 1376
    .line 1377
    filled-new-array {v5, v7}, [Ljava/lang/String;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v5

    .line 1381
    invoke-virtual {v8, v5}, Lfh/k;->o0([Ljava/lang/String;)V

    .line 1382
    .line 1383
    .line 1384
    iput-object v8, v0, Lch/e;->h:Lfh/k;

    .line 1385
    .line 1386
    invoke-virtual {v3, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v0

    .line 1390
    new-instance v3, Ljava/util/ArrayList;

    .line 1391
    .line 1392
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1393
    .line 1394
    .line 1395
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v5

    .line 1399
    :cond_1f
    :goto_26
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1400
    .line 1401
    .line 1402
    move-result v0

    .line 1403
    if-eqz v0, :cond_21

    .line 1404
    .line 1405
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v0

    .line 1409
    check-cast v0, Lhh/o;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    .line 1410
    .line 1411
    :try_start_13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1412
    .line 1413
    .line 1414
    invoke-virtual {v0}, Lhh/o;->p()Llh/d;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v0

    .line 1418
    invoke-virtual {v0, v9}, Llh/d;->b(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_9

    .line 1422
    goto :goto_27

    .line 1423
    :catchall_9
    move-exception v0

    .line 1424
    :try_start_14
    new-instance v7, Lsf/f;

    .line 1425
    .line 1426
    invoke-direct {v7, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1427
    .line 1428
    .line 1429
    move-object v0, v7

    .line 1430
    :goto_27
    nop

    .line 1431
    instance-of v7, v0, Lsf/f;

    .line 1432
    .line 1433
    if-eqz v7, :cond_20

    .line 1434
    .line 1435
    const/4 v0, 0x0

    .line 1436
    :cond_20
    check-cast v0, Ljava/lang/reflect/Method;

    .line 1437
    .line 1438
    if-eqz v0, :cond_1f

    .line 1439
    .line 1440
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1441
    .line 1442
    .line 1443
    goto :goto_26

    .line 1444
    :cond_21
    new-instance v0, Ljava/util/ArrayList;

    .line 1445
    .line 1446
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1447
    .line 1448
    .line 1449
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v3

    .line 1453
    :cond_22
    :goto_28
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1454
    .line 1455
    .line 1456
    move-result v5

    .line 1457
    if-eqz v5, :cond_23

    .line 1458
    .line 1459
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1460
    .line 1461
    .line 1462
    move-result-object v5

    .line 1463
    move-object v7, v5

    .line 1464
    check-cast v7, Ljava/lang/reflect/Method;

    .line 1465
    .line 1466
    invoke-static {v7}, Lc9/d2;->o(Ljava/lang/reflect/Method;)Z

    .line 1467
    .line 1468
    .line 1469
    move-result v7

    .line 1470
    if-eqz v7, :cond_22

    .line 1471
    .line 1472
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1473
    .line 1474
    .line 1475
    goto :goto_28

    .line 1476
    :cond_23
    new-instance v3, Ljava/util/ArrayList;

    .line 1477
    .line 1478
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1479
    .line 1480
    .line 1481
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1482
    .line 1483
    .line 1484
    move-result-object v5

    .line 1485
    :goto_29
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1486
    .line 1487
    .line 1488
    move-result v7

    .line 1489
    if-eqz v7, :cond_27

    .line 1490
    .line 1491
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v7

    .line 1495
    check-cast v7, Ljava/lang/reflect/Method;

    .line 1496
    .line 1497
    new-instance v8, Ljava/util/ArrayList;

    .line 1498
    .line 1499
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1500
    .line 1501
    .line 1502
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v9

    .line 1506
    :cond_24
    :goto_2a
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1507
    .line 1508
    .line 1509
    move-result v13

    .line 1510
    if-eqz v13, :cond_26

    .line 1511
    .line 1512
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v13

    .line 1516
    check-cast v13, Ljava/lang/reflect/Method;

    .line 1517
    .line 1518
    invoke-static {v7, v13}, Lc9/d2;->u(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)Ljava/lang/Class;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v14

    .line 1522
    if-eqz v14, :cond_25

    .line 1523
    .line 1524
    new-instance v14, Lc9/w1;

    .line 1525
    .line 1526
    invoke-direct {v14, v7, v13}, Lc9/w1;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 1527
    .line 1528
    .line 1529
    goto :goto_2b

    .line 1530
    :cond_25
    const/4 v14, 0x0

    .line 1531
    :goto_2b
    if-eqz v14, :cond_24

    .line 1532
    .line 1533
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1534
    .line 1535
    .line 1536
    goto :goto_2a

    .line 1537
    :cond_26
    invoke-static {v3, v8}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1538
    .line 1539
    .line 1540
    goto :goto_29

    .line 1541
    :cond_27
    new-instance v0, Ljava/util/HashSet;

    .line 1542
    .line 1543
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 1544
    .line 1545
    .line 1546
    new-instance v5, Ljava/util/ArrayList;

    .line 1547
    .line 1548
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1549
    .line 1550
    .line 1551
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v3

    .line 1555
    :cond_28
    :goto_2c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1556
    .line 1557
    .line 1558
    move-result v7

    .line 1559
    if-eqz v7, :cond_29

    .line 1560
    .line 1561
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v7

    .line 1565
    move-object v8, v7

    .line 1566
    check-cast v8, Lc9/w1;

    .line 1567
    .line 1568
    iget-object v9, v8, Lc9/w1;->a:Ljava/lang/reflect/Method;

    .line 1569
    .line 1570
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v9

    .line 1574
    iget-object v8, v8, Lc9/w1;->b:Ljava/lang/reflect/Method;

    .line 1575
    .line 1576
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 1577
    .line 1578
    .line 1579
    move-result-object v8

    .line 1580
    new-instance v13, Ljava/lang/StringBuilder;

    .line 1581
    .line 1582
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 1583
    .line 1584
    .line 1585
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1586
    .line 1587
    .line 1588
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1589
    .line 1590
    .line 1591
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1592
    .line 1593
    .line 1594
    move-result-object v8

    .line 1595
    invoke-virtual {v0, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1596
    .line 1597
    .line 1598
    move-result v8

    .line 1599
    if-eqz v8, :cond_28

    .line 1600
    .line 1601
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1602
    .line 1603
    .line 1604
    goto :goto_2c

    .line 1605
    :cond_29
    invoke-static {v5}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v0

    .line 1609
    check-cast v0, Lc9/w1;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_8

    .line 1610
    .line 1611
    goto :goto_2e

    .line 1612
    :catchall_a
    move-exception v0

    .line 1613
    move-object/from16 v17, v8

    .line 1614
    .line 1615
    :goto_2d
    new-instance v3, Lsf/f;

    .line 1616
    .line 1617
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1618
    .line 1619
    .line 1620
    move-object v0, v3

    .line 1621
    :goto_2e
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v3

    .line 1625
    if-eqz v3, :cond_2a

    .line 1626
    .line 1627
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v5

    .line 1631
    const-string v7, "[Hchat:ConversationGroup] \u5b9a\u4f4d\u5fae\u4fe1\u539f\u751f\u5206\u7ec4\u957f\u6309\u83dc\u5355\u5931\u8d25: "

    .line 1632
    .line 1633
    invoke-static {v7, v5, v3}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1634
    .line 1635
    .line 1636
    :cond_2a
    instance-of v3, v0, Lsf/f;

    .line 1637
    .line 1638
    if-eqz v3, :cond_2b

    .line 1639
    .line 1640
    const/4 v0, 0x0

    .line 1641
    :cond_2b
    move-object v3, v0

    .line 1642
    check-cast v3, Lc9/w1;

    .line 1643
    .line 1644
    if-nez v3, :cond_2c

    .line 1645
    .line 1646
    invoke-static {v4, v10, v11}, Le8/b;->a(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    .line 1647
    .line 1648
    .line 1649
    invoke-static {v4, v10, v12}, Le8/b;->a(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    .line 1650
    .line 1651
    .line 1652
    const-string v0, "[Hchat:ConversationGroup] \u5fae\u4fe1\u539f\u751f\u5206\u7ec4\u957f\u6309\u83dc\u5355\u7f3a\u5931\u6216\u5019\u9009\u4e0d\u552f\u4e00"

    .line 1653
    .line 1654
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 1655
    .line 1656
    .line 1657
    goto :goto_2f

    .line 1658
    :cond_2c
    iget-object v0, v3, Lc9/w1;->a:Ljava/lang/reflect/Method;

    .line 1659
    .line 1660
    invoke-static {v4, v10, v11, v0}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 1661
    .line 1662
    .line 1663
    iget-object v0, v3, Lc9/w1;->b:Ljava/lang/reflect/Method;

    .line 1664
    .line 1665
    invoke-static {v4, v10, v12, v0}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 1666
    .line 1667
    .line 1668
    :goto_2f
    sget-object v0, Lxa/a;->a:Lxa/a;

    .line 1669
    .line 1670
    new-instance v4, Lc9/n1;

    .line 1671
    .line 1672
    const/4 v5, 0x0

    .line 1673
    invoke-direct {v4, v5, v5}, Lc9/n1;-><init>(BI)V

    .line 1674
    .line 1675
    .line 1676
    invoke-virtual {v0, v6, v4}, Lxa/a;->d(Lr8/g;Lfg/p;)Ljava/lang/reflect/Method;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v0

    .line 1680
    if-eqz v0, :cond_3c

    .line 1681
    .line 1682
    sput-object v1, Lc9/d2;->o:Ljava/lang/reflect/Method;

    .line 1683
    .line 1684
    sput-object v2, Lc9/d2;->p:Ljava/lang/reflect/Method;

    .line 1685
    .line 1686
    sget-object v4, Lc9/d2;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1687
    .line 1688
    const/4 v11, 0x1

    .line 1689
    invoke-virtual {v4, v5, v11}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1690
    .line 1691
    .line 1692
    move-result v4

    .line 1693
    if-nez v4, :cond_2d

    .line 1694
    .line 1695
    goto :goto_30

    .line 1696
    :cond_2d
    iget-object v4, v6, Lr8/g;->a:Landroid/content/Context;

    .line 1697
    .line 1698
    const-string v5, "Hchat_conversation_groups"

    .line 1699
    .line 1700
    invoke-static {v4, v5}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 1701
    .line 1702
    .line 1703
    move-result-object v4

    .line 1704
    new-instance v5, Lb9/b;

    .line 1705
    .line 1706
    invoke-direct {v5, v6, v11}, Lb9/b;-><init>(Ljava/lang/Object;I)V

    .line 1707
    .line 1708
    .line 1709
    invoke-interface {v4, v5}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 1710
    .line 1711
    .line 1712
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->conversationChanges()Lh8/b;

    .line 1713
    .line 1714
    .line 1715
    move-result-object v4

    .line 1716
    if-eqz v4, :cond_2e

    .line 1717
    .line 1718
    new-instance v5, Lc9/q1;

    .line 1719
    .line 1720
    invoke-direct {v5, v6}, Lc9/q1;-><init>(Lr8/g;)V

    .line 1721
    .line 1722
    .line 1723
    iget-object v4, v4, Lh8/b;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1724
    .line 1725
    invoke-virtual {v4, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->addIfAbsent(Ljava/lang/Object;)Z

    .line 1726
    .line 1727
    .line 1728
    :cond_2e
    iget-object v4, v6, Lr8/g;->a:Landroid/content/Context;

    .line 1729
    .line 1730
    invoke-static {v4}, Lc9/d2;->y(Landroid/content/Context;)V

    .line 1731
    .line 1732
    .line 1733
    :goto_30
    new-instance v4, Lc9/b2;

    .line 1734
    .line 1735
    invoke-direct {v4, v1, v6}, Lc9/b2;-><init>(Ljava/lang/reflect/Method;Lr8/g;)V

    .line 1736
    .line 1737
    .line 1738
    move-object/from16 v9, v21

    .line 1739
    .line 1740
    invoke-static {v9, v4}, Lc9/d2;->m(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 1741
    .line 1742
    .line 1743
    move-result v1

    .line 1744
    new-instance v4, Lba/f;

    .line 1745
    .line 1746
    const/4 v14, 0x2

    .line 1747
    invoke-direct {v4, v14}, Lba/f;-><init>(I)V

    .line 1748
    .line 1749
    .line 1750
    move-object/from16 v8, v22

    .line 1751
    .line 1752
    invoke-static {v8, v4}, Lc9/d2;->m(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 1753
    .line 1754
    .line 1755
    move-result v4

    .line 1756
    new-instance v5, Lc9/a2;

    .line 1757
    .line 1758
    const/4 v7, 0x0

    .line 1759
    invoke-direct {v5, v6, v7}, Lc9/a2;-><init>(Lr8/g;I)V

    .line 1760
    .line 1761
    .line 1762
    move-object/from16 v8, v23

    .line 1763
    .line 1764
    invoke-static {v8, v5}, Lc9/d2;->m(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 1765
    .line 1766
    .line 1767
    move-result v5

    .line 1768
    new-instance v7, Lba/f;

    .line 1769
    .line 1770
    const/16 v8, 0xb

    .line 1771
    .line 1772
    invoke-direct {v7, v8}, Lba/f;-><init>(I)V

    .line 1773
    .line 1774
    .line 1775
    move-object/from16 v8, v24

    .line 1776
    .line 1777
    invoke-static {v8, v7}, Lc9/d2;->m(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 1778
    .line 1779
    .line 1780
    move-result v7

    .line 1781
    new-instance v8, Lba/f;

    .line 1782
    .line 1783
    const/4 v9, 0x7

    .line 1784
    invoke-direct {v8, v9}, Lba/f;-><init>(I)V

    .line 1785
    .line 1786
    .line 1787
    invoke-static {v2, v8}, Lc9/d2;->m(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 1788
    .line 1789
    .line 1790
    move-result v2

    .line 1791
    new-instance v8, Lba/f;

    .line 1792
    .line 1793
    const/4 v9, 0x6

    .line 1794
    invoke-direct {v8, v9}, Lba/f;-><init>(I)V

    .line 1795
    .line 1796
    .line 1797
    move-object/from16 v9, v20

    .line 1798
    .line 1799
    invoke-static {v9, v8}, Lc9/d2;->m(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 1800
    .line 1801
    .line 1802
    move-result v8

    .line 1803
    if-eqz v17, :cond_2f

    .line 1804
    .line 1805
    new-instance v9, Lba/f;

    .line 1806
    .line 1807
    const/16 v10, 0x8

    .line 1808
    .line 1809
    invoke-direct {v9, v10}, Lba/f;-><init>(I)V

    .line 1810
    .line 1811
    .line 1812
    move-object/from16 v10, v17

    .line 1813
    .line 1814
    invoke-static {v10, v9}, Lc9/d2;->m(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 1815
    .line 1816
    .line 1817
    move-result v11

    .line 1818
    goto :goto_31

    .line 1819
    :cond_2f
    const/4 v11, 0x1

    .line 1820
    :goto_31
    const-string v9, "com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI"

    .line 1821
    .line 1822
    iget-object v10, v6, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 1823
    .line 1824
    invoke-static {v9, v10}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 1825
    .line 1826
    .line 1827
    move-result-object v9

    .line 1828
    if-eqz v9, :cond_37

    .line 1829
    .line 1830
    const-string v10, "onActivityCreated"

    .line 1831
    .line 1832
    const-class v12, Landroid/os/Bundle;

    .line 1833
    .line 1834
    filled-new-array {v12}, [Ljava/lang/Class;

    .line 1835
    .line 1836
    .line 1837
    move-result-object v12

    .line 1838
    invoke-static {v9, v10, v12}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 1839
    .line 1840
    .line 1841
    move-result-object v10

    .line 1842
    if-eqz v10, :cond_37

    .line 1843
    .line 1844
    const-string v12, "com.tencent.mm.ui.FragmentActivitySupport"

    .line 1845
    .line 1846
    iget-object v13, v6, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 1847
    .line 1848
    invoke-static {v12, v13}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 1849
    .line 1850
    .line 1851
    move-result-object v12

    .line 1852
    if-eqz v12, :cond_37

    .line 1853
    .line 1854
    const-string v13, "getStringExtra"

    .line 1855
    .line 1856
    const-class v14, Ljava/lang/String;

    .line 1857
    .line 1858
    filled-new-array {v14}, [Ljava/lang/Class;

    .line 1859
    .line 1860
    .line 1861
    move-result-object v14

    .line 1862
    invoke-static {v12, v13, v14}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 1863
    .line 1864
    .line 1865
    move-result-object v12

    .line 1866
    if-eqz v12, :cond_37

    .line 1867
    .line 1868
    new-instance v13, Lba/f;

    .line 1869
    .line 1870
    const/16 v14, 0xa

    .line 1871
    .line 1872
    invoke-direct {v13, v14}, Lba/f;-><init>(I)V

    .line 1873
    .line 1874
    .line 1875
    invoke-static {v12, v13}, Lc9/d2;->m(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 1876
    .line 1877
    .line 1878
    move-result v12

    .line 1879
    new-instance v13, Lc9/a2;

    .line 1880
    .line 1881
    const/4 v14, 0x1

    .line 1882
    invoke-direct {v13, v6, v14}, Lc9/a2;-><init>(Lr8/g;I)V

    .line 1883
    .line 1884
    .line 1885
    invoke-static {v10, v13}, Lc9/d2;->m(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 1886
    .line 1887
    .line 1888
    move-result v10

    .line 1889
    const-string v13, "onPause"

    .line 1890
    .line 1891
    const-string v15, "onResume"

    .line 1892
    .line 1893
    filled-new-array {v13, v15}, [Ljava/lang/String;

    .line 1894
    .line 1895
    .line 1896
    move-result-object v13

    .line 1897
    invoke-static {v13}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 1898
    .line 1899
    .line 1900
    move-result-object v13

    .line 1901
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    .line 1902
    .line 1903
    .line 1904
    move-result v15

    .line 1905
    if-eqz v15, :cond_30

    .line 1906
    .line 1907
    move/from16 v16, v1

    .line 1908
    .line 1909
    move/from16 v17, v2

    .line 1910
    .line 1911
    move v1, v14

    .line 1912
    const/4 v14, 0x0

    .line 1913
    goto :goto_34

    .line 1914
    :cond_30
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1915
    .line 1916
    .line 1917
    move-result-object v13

    .line 1918
    :goto_32
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 1919
    .line 1920
    .line 1921
    move-result v15

    .line 1922
    if-eqz v15, :cond_33

    .line 1923
    .line 1924
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1925
    .line 1926
    .line 1927
    move-result-object v15

    .line 1928
    check-cast v15, Ljava/lang/String;

    .line 1929
    .line 1930
    move/from16 v16, v1

    .line 1931
    .line 1932
    const/4 v14, 0x0

    .line 1933
    new-array v1, v14, [Ljava/lang/Class;

    .line 1934
    .line 1935
    invoke-static {v9, v15, v1}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 1936
    .line 1937
    .line 1938
    move-result-object v1

    .line 1939
    move/from16 v17, v2

    .line 1940
    .line 1941
    if-eqz v1, :cond_31

    .line 1942
    .line 1943
    new-instance v2, Lc9/c2;

    .line 1944
    .line 1945
    invoke-direct {v2, v15, v14, v6}, Lc9/c2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1946
    .line 1947
    .line 1948
    invoke-static {v1, v2}, Lc9/d2;->m(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 1949
    .line 1950
    .line 1951
    move-result v1

    .line 1952
    goto :goto_33

    .line 1953
    :cond_31
    move v1, v14

    .line 1954
    :goto_33
    if-nez v1, :cond_32

    .line 1955
    .line 1956
    move v1, v14

    .line 1957
    goto :goto_34

    .line 1958
    :cond_32
    move/from16 v1, v16

    .line 1959
    .line 1960
    move/from16 v2, v17

    .line 1961
    .line 1962
    const/4 v14, 0x1

    .line 1963
    goto :goto_32

    .line 1964
    :cond_33
    move/from16 v16, v1

    .line 1965
    .line 1966
    move/from16 v17, v2

    .line 1967
    .line 1968
    const/4 v14, 0x0

    .line 1969
    const/4 v1, 0x1

    .line 1970
    :goto_34
    if-eqz v12, :cond_34

    .line 1971
    .line 1972
    if-eqz v10, :cond_34

    .line 1973
    .line 1974
    if-nez v1, :cond_35

    .line 1975
    .line 1976
    :cond_34
    const-string v2, "[Hchat:ConversationGroup] \u5fae\u4fe1\u539f\u751f\u5206\u7ec4\u9875\u9762 Hook \u5b89\u88c5\u4e0d\u5b8c\u6574: fragment=com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI"

    .line 1977
    .line 1978
    invoke-static {v2}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 1979
    .line 1980
    .line 1981
    :cond_35
    if-eqz v12, :cond_36

    .line 1982
    .line 1983
    if-eqz v10, :cond_36

    .line 1984
    .line 1985
    if-eqz v1, :cond_36

    .line 1986
    .line 1987
    const/4 v1, 0x1

    .line 1988
    goto :goto_36

    .line 1989
    :cond_36
    :goto_35
    move v1, v14

    .line 1990
    goto :goto_36

    .line 1991
    :cond_37
    move/from16 v16, v1

    .line 1992
    .line 1993
    move/from16 v17, v2

    .line 1994
    .line 1995
    const/4 v14, 0x0

    .line 1996
    goto :goto_35

    .line 1997
    :goto_36
    if-eqz v3, :cond_3a

    .line 1998
    .line 1999
    iget-object v2, v3, Lc9/w1;->b:Ljava/lang/reflect/Method;

    .line 2000
    .line 2001
    new-instance v6, Lba/f;

    .line 2002
    .line 2003
    const/4 v9, 0x3

    .line 2004
    invoke-direct {v6, v9}, Lba/f;-><init>(I)V

    .line 2005
    .line 2006
    .line 2007
    invoke-static {v2, v6}, Lc9/d2;->m(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 2008
    .line 2009
    .line 2010
    move-result v2

    .line 2011
    if-eqz v2, :cond_38

    .line 2012
    .line 2013
    iget-object v3, v3, Lc9/w1;->a:Ljava/lang/reflect/Method;

    .line 2014
    .line 2015
    new-instance v6, Lba/f;

    .line 2016
    .line 2017
    const/4 v9, 0x4

    .line 2018
    invoke-direct {v6, v9}, Lba/f;-><init>(I)V

    .line 2019
    .line 2020
    .line 2021
    invoke-static {v3, v6}, Lc9/d2;->m(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 2022
    .line 2023
    .line 2024
    move-result v3

    .line 2025
    if-eqz v3, :cond_38

    .line 2026
    .line 2027
    const/4 v3, 0x1

    .line 2028
    goto :goto_37

    .line 2029
    :cond_38
    move v3, v14

    .line 2030
    :goto_37
    if-eqz v2, :cond_39

    .line 2031
    .line 2032
    if-nez v3, :cond_3a

    .line 2033
    .line 2034
    :cond_39
    const-string v2, "[Hchat:ConversationGroup] \u5fae\u4fe1\u539f\u751f\u5206\u7ec4\u957f\u6309\u83dc\u5355 Hook \u5b89\u88c5\u4e0d\u5b8c\u6574\uff0c\u5df2\u4fdd\u7559\u539f\u751f\u83dc\u5355"

    .line 2035
    .line 2036
    invoke-static {v2}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 2037
    .line 2038
    .line 2039
    :cond_3a
    new-instance v2, Lba/f;

    .line 2040
    .line 2041
    const/4 v15, 0x5

    .line 2042
    invoke-direct {v2, v15}, Lba/f;-><init>(I)V

    .line 2043
    .line 2044
    .line 2045
    invoke-static {v0, v2}, Lc9/d2;->m(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 2046
    .line 2047
    .line 2048
    move-result v0

    .line 2049
    if-eqz v16, :cond_3b

    .line 2050
    .line 2051
    if-eqz v4, :cond_3b

    .line 2052
    .line 2053
    if-eqz v5, :cond_3b

    .line 2054
    .line 2055
    if-eqz v7, :cond_3b

    .line 2056
    .line 2057
    if-eqz v17, :cond_3b

    .line 2058
    .line 2059
    if-eqz v8, :cond_3b

    .line 2060
    .line 2061
    if-eqz v11, :cond_3b

    .line 2062
    .line 2063
    if-eqz v1, :cond_3b

    .line 2064
    .line 2065
    if-eqz v0, :cond_3b

    .line 2066
    .line 2067
    const/4 v3, 0x1

    .line 2068
    goto :goto_38

    .line 2069
    :cond_3b
    move v3, v14

    .line 2070
    :goto_38
    move v4, v3

    .line 2071
    goto :goto_3a

    .line 2072
    :cond_3c
    move v14, v5

    .line 2073
    goto :goto_39

    .line 2074
    :cond_3d
    const/4 v14, 0x0

    .line 2075
    :goto_39
    move v4, v14

    .line 2076
    :goto_3a
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2077
    .line 2078
    .line 2079
    move-result-object v0

    .line 2080
    return-object v0

    .line 2081
    :pswitch_data_0
    .packed-switch 0x0
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
