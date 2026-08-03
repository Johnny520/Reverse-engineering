.class public final Lc9/a2;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr8/g;


# direct methods
.method public synthetic constructor <init>(Lr8/g;I)V
    .locals 0

    .line 1
    iput p2, p0, Lc9/a2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lc9/a2;->b:Lr8/g;

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
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v2, v1, Lc9/a2;->a:I

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    packed-switch v2, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    :pswitch_0
    invoke-super/range {p0 .. p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    sget-object v2, Le9/q;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 20
    .line 21
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v2, v1, Lc9/a2;->b:Lr8/g;

    .line 24
    .line 25
    iget-object v2, v2, Lr8/g;->a:Landroid/content/Context;

    .line 26
    .line 27
    invoke-static {v0, v2}, Le9/q;->b(Ljava/lang/Object;Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    sget-object v0, Le9/q;->l:Ljava/lang/ThreadLocal;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Ljava/util/ArrayDeque;

    .line 41
    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-nez v3, :cond_0

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_1

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 60
    .line 61
    .line 62
    :cond_1
    return-void

    .line 63
    :pswitch_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    sget-object v2, Lc9/d2;->a:Lc9/d2;

    .line 67
    .line 68
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 69
    .line 70
    iget-object v2, v1, Lc9/a2;->b:Lr8/g;

    .line 71
    .line 72
    iget-object v2, v2, Lr8/g;->a:Landroid/content/Context;

    .line 73
    .line 74
    if-eqz v0, :cond_10

    .line 75
    .line 76
    invoke-static {v0}, Lc9/d2;->v(Ljava/lang/Object;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    if-nez v6, :cond_2

    .line 81
    .line 82
    goto/16 :goto_5

    .line 83
    .line 84
    :cond_2
    invoke-static {v2}, Lc9/o2;->i(Landroid/content/Context;)Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    :cond_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    if-eqz v8, :cond_4

    .line 97
    .line 98
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    move-object v9, v8

    .line 103
    check-cast v9, Lc9/a;

    .line 104
    .line 105
    iget-object v9, v9, Lc9/a;->a:Ljava/lang/String;

    .line 106
    .line 107
    invoke-static {v9}, Lc9/d2;->F(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    invoke-virtual {v9, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v9

    .line 115
    if-eqz v9, :cond_3

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_4
    const/4 v8, 0x0

    .line 119
    :goto_0
    check-cast v8, Lc9/a;

    .line 120
    .line 121
    if-nez v8, :cond_5

    .line 122
    .line 123
    goto/16 :goto_5

    .line 124
    .line 125
    :cond_5
    const-string v7, "adapter"

    .line 126
    .line 127
    invoke-static {v0, v7}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    if-eqz v7, :cond_6

    .line 132
    .line 133
    sget-object v9, Lc9/d2;->h:Ljava/util/Map;

    .line 134
    .line 135
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    check-cast v9, Ljava/util/Map;

    .line 139
    .line 140
    invoke-interface {v9, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    :cond_6
    const-string v9, "emptyTipTv"

    .line 144
    .line 145
    invoke-static {v0, v9}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    instance-of v10, v9, Landroid/widget/TextView;

    .line 150
    .line 151
    if-eqz v10, :cond_7

    .line 152
    .line 153
    check-cast v9, Landroid/widget/TextView;

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_7
    const/4 v9, 0x0

    .line 157
    :goto_1
    if-eqz v9, :cond_8

    .line 158
    .line 159
    const-string v10, "\u5f53\u524d\u5206\u7ec4\u6ca1\u6709\u4f1a\u8bdd"

    .line 160
    .line 161
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 162
    .line 163
    .line 164
    :cond_8
    const-string v9, "appbrandMessageLV"

    .line 165
    .line 166
    invoke-static {v0, v9}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    instance-of v10, v9, Landroid/widget/AdapterView;

    .line 171
    .line 172
    if-eqz v10, :cond_9

    .line 173
    .line 174
    check-cast v9, Landroid/widget/AdapterView;

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_9
    const/4 v9, 0x0

    .line 178
    :goto_2
    if-eqz v9, :cond_b

    .line 179
    .line 180
    iget-object v10, v8, Lc9/a;->a:Ljava/lang/String;

    .line 181
    .line 182
    sget-object v11, Lc9/d2;->i:Ljava/util/Map;

    .line 183
    .line 184
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    monitor-enter v11

    .line 188
    :try_start_0
    invoke-interface {v11, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    if-eqz v12, :cond_a

    .line 193
    .line 194
    monitor-exit v11

    .line 195
    goto :goto_3

    .line 196
    :cond_a
    :try_start_1
    invoke-virtual {v9}, Landroid/widget/AdapterView;->getOnItemLongClickListener()Landroid/widget/AdapterView$OnItemLongClickListener;

    .line 197
    .line 198
    .line 199
    move-result-object v12

    .line 200
    move-object v13, v11

    .line 201
    check-cast v13, Ljava/util/Map;

    .line 202
    .line 203
    invoke-interface {v13, v9, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 204
    .line 205
    .line 206
    monitor-exit v11

    .line 207
    new-instance v11, Lc9/m1;

    .line 208
    .line 209
    invoke-direct {v11, v10, v0, v12, v2}, Lc9/m1;-><init>(Ljava/lang/String;Ljava/lang/Object;Landroid/widget/AdapterView$OnItemLongClickListener;Landroid/content/Context;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v9, v11}, Landroid/widget/AdapterView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    .line 213
    .line 214
    .line 215
    goto :goto_3

    .line 216
    :catchall_0
    move-exception v0

    .line 217
    monitor-exit v11

    .line 218
    throw v0

    .line 219
    :cond_b
    :goto_3
    if-eqz v7, :cond_c

    .line 220
    .line 221
    sget-object v9, Lc9/d2;->p:Ljava/lang/reflect/Method;

    .line 222
    .line 223
    new-array v10, v4, [Ljava/lang/Object;

    .line 224
    .line 225
    invoke-static {v9, v7, v10}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v9

    .line 229
    if-eqz v9, :cond_c

    .line 230
    .line 231
    move v4, v5

    .line 232
    :cond_c
    if-eqz v7, :cond_d

    .line 233
    .line 234
    if-nez v4, :cond_d

    .line 235
    .line 236
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    const-string v5, "[Hchat:ConversationGroup] \u5237\u65b0\u5fae\u4fe1\u539f\u751f\u5206\u7ec4\u5217\u8868\u5931\u8d25: adapter="

    .line 245
    .line 246
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    invoke-static {v4}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    :cond_d
    iget-object v4, v8, Lc9/a;->b:Ljava/lang/String;

    .line 254
    .line 255
    invoke-static {v6, v0, v4, v7}, Lc9/d2;->x(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    iget-object v4, v8, Lc9/a;->a:Ljava/lang/String;

    .line 259
    .line 260
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    const-string v6, "addTextOptionMenu"

    .line 265
    .line 266
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 267
    .line 268
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    const-class v8, Ljava/lang/String;

    .line 272
    .line 273
    const-class v9, Landroid/view/MenuItem$OnMenuItemClickListener;

    .line 274
    .line 275
    filled-new-array {v7, v8, v9}, [Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    move-result-object v7

    .line 279
    invoke-static {v5, v6, v7}, Lh/Hchat/utils/KavaReflector;->findMethodRecursive(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    new-instance v6, Lc9/l1;

    .line 284
    .line 285
    invoke-direct {v6, v0, v4, v2}, Lc9/l1;-><init>(Ljava/lang/Object;Ljava/lang/String;Landroid/content/Context;)V

    .line 286
    .line 287
    .line 288
    const v2, 0x4843474d    # 199965.2f

    .line 289
    .line 290
    .line 291
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    const-string v4, "\u83dc\u5355"

    .line 296
    .line 297
    filled-new-array {v2, v4, v6}, [Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    invoke-static {v5, v0, v2}, Lh/Hchat/utils/KavaReflector;->invokeSuccessfully(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    if-nez v2, :cond_10

    .line 306
    .line 307
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    if-eqz v5, :cond_e

    .line 316
    .line 317
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    goto :goto_4

    .line 322
    :cond_e
    const/4 v3, 0x0

    .line 323
    :goto_4
    if-nez v3, :cond_f

    .line 324
    .line 325
    const-string v3, ""

    .line 326
    .line 327
    :cond_f
    new-instance v2, Ljava/lang/StringBuilder;

    .line 328
    .line 329
    const-string v4, "[Hchat:ConversationGroup] \u6dfb\u52a0\u5fae\u4fe1\u539f\u751f\u5206\u7ec4\u9875\u83dc\u5355\u5931\u8d25: fragment="

    .line 330
    .line 331
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    const-string v0, " method="

    .line 338
    .line 339
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    :cond_10
    :goto_5
    return-void

    .line 353
    :pswitch_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    sget-object v2, Lc9/d2;->j:Ljava/lang/ThreadLocal;

    .line 357
    .line 358
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    check-cast v2, Ljava/lang/String;

    .line 363
    .line 364
    if-eqz v2, :cond_29

    .line 365
    .line 366
    invoke-static {v2}, Lc9/d2;->q(Ljava/lang/String;)Z

    .line 367
    .line 368
    .line 369
    move-result v6

    .line 370
    if-eqz v6, :cond_11

    .line 371
    .line 372
    goto :goto_6

    .line 373
    :cond_11
    const/4 v2, 0x0

    .line 374
    :goto_6
    if-eqz v2, :cond_29

    .line 375
    .line 376
    invoke-virtual {v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v6

    .line 380
    instance-of v7, v6, Landroid/database/Cursor;

    .line 381
    .line 382
    if-eqz v7, :cond_12

    .line 383
    .line 384
    check-cast v6, Landroid/database/Cursor;

    .line 385
    .line 386
    goto :goto_7

    .line 387
    :cond_12
    const/4 v6, 0x0

    .line 388
    :goto_7
    if-eqz v6, :cond_29

    .line 389
    .line 390
    iget-object v7, v1, Lc9/a2;->b:Lr8/g;

    .line 391
    .line 392
    iget-object v7, v7, Lr8/g;->a:Landroid/content/Context;

    .line 393
    .line 394
    invoke-static {v7}, Lc9/o2;->i(Landroid/content/Context;)Ljava/util/List;

    .line 395
    .line 396
    .line 397
    move-result-object v7

    .line 398
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 399
    .line 400
    .line 401
    move-result-object v7

    .line 402
    :cond_13
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 403
    .line 404
    .line 405
    move-result v8

    .line 406
    if-eqz v8, :cond_14

    .line 407
    .line 408
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v8

    .line 412
    move-object v9, v8

    .line 413
    check-cast v9, Lc9/a;

    .line 414
    .line 415
    iget-object v9, v9, Lc9/a;->a:Ljava/lang/String;

    .line 416
    .line 417
    invoke-static {v9}, Lc9/d2;->F(Ljava/lang/String;)Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v9

    .line 421
    invoke-virtual {v9, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v9

    .line 425
    if-eqz v9, :cond_13

    .line 426
    .line 427
    goto :goto_8

    .line 428
    :cond_14
    const/4 v8, 0x0

    .line 429
    :goto_8
    check-cast v8, Lc9/a;

    .line 430
    .line 431
    if-eqz v8, :cond_15

    .line 432
    .line 433
    iget-object v2, v8, Lc9/a;->f:Ljava/util/List;

    .line 434
    .line 435
    goto :goto_9

    .line 436
    :cond_15
    const/4 v2, 0x0

    .line 437
    :goto_9
    if-nez v2, :cond_16

    .line 438
    .line 439
    sget-object v2, Ltf/t;->g:Ltf/t;

    .line 440
    .line 441
    :cond_16
    invoke-interface {v6}, Landroid/database/Cursor;->getCount()I

    .line 442
    .line 443
    .line 444
    move-result v7

    .line 445
    if-gtz v7, :cond_17

    .line 446
    .line 447
    goto/16 :goto_14

    .line 448
    .line 449
    :cond_17
    const-string v7, "username"

    .line 450
    .line 451
    invoke-interface {v6, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 452
    .line 453
    .line 454
    move-result v7

    .line 455
    if-gez v7, :cond_18

    .line 456
    .line 457
    goto/16 :goto_14

    .line 458
    .line 459
    :cond_18
    const-string v8, "flag"

    .line 460
    .line 461
    invoke-interface {v6, v8}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 462
    .line 463
    .line 464
    move-result v8

    .line 465
    new-instance v9, Lng/p;

    .line 466
    .line 467
    new-instance v10, Li/e0;

    .line 468
    .line 469
    const/16 v11, 0x19

    .line 470
    .line 471
    invoke-direct {v10, v2, v11}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 472
    .line 473
    .line 474
    const/4 v11, 0x2

    .line 475
    invoke-direct {v9, v10, v11}, Lng/p;-><init>(Ljava/lang/Object;I)V

    .line 476
    .line 477
    .line 478
    invoke-static {v9}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 479
    .line 480
    .line 481
    move-result v10

    .line 482
    invoke-static {v10}, Ltf/y;->a0(I)I

    .line 483
    .line 484
    .line 485
    move-result v10

    .line 486
    const/16 v12, 0x10

    .line 487
    .line 488
    if-ge v10, v12, :cond_19

    .line 489
    .line 490
    move v10, v12

    .line 491
    :cond_19
    new-instance v12, Ljava/util/LinkedHashMap;

    .line 492
    .line 493
    invoke-direct {v12, v10}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v9}, Lng/p;->iterator()Ljava/util/Iterator;

    .line 497
    .line 498
    .line 499
    move-result-object v9

    .line 500
    :goto_a
    move-object v10, v9

    .line 501
    check-cast v10, Lng/d;

    .line 502
    .line 503
    iget-object v13, v10, Lng/d;->i:Ljava/util/Iterator;

    .line 504
    .line 505
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 506
    .line 507
    .line 508
    move-result v13

    .line 509
    if-eqz v13, :cond_1a

    .line 510
    .line 511
    invoke-virtual {v10}, Lng/d;->next()Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v10

    .line 515
    check-cast v10, Ltf/w;

    .line 516
    .line 517
    iget v13, v10, Ltf/w;->a:I

    .line 518
    .line 519
    iget-object v10, v10, Ltf/w;->b:Ljava/lang/Object;

    .line 520
    .line 521
    check-cast v10, Ljava/lang/String;

    .line 522
    .line 523
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 524
    .line 525
    .line 526
    move-result-object v13

    .line 527
    invoke-interface {v12, v10, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    goto :goto_a

    .line 531
    :cond_1a
    invoke-interface {v6}, Landroid/database/Cursor;->getColumnNames()[Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v9

    .line 535
    new-instance v10, Ljava/util/ArrayList;

    .line 536
    .line 537
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 538
    .line 539
    .line 540
    move v13, v4

    .line 541
    :goto_b
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    .line 542
    .line 543
    .line 544
    move-result v14

    .line 545
    if-eqz v14, :cond_27

    .line 546
    .line 547
    array-length v14, v9

    .line 548
    new-array v15, v14, [Ljava/lang/Object;

    .line 549
    .line 550
    move v3, v4

    .line 551
    :goto_c
    if-ge v3, v14, :cond_1f

    .line 552
    .line 553
    invoke-interface {v6, v3}, Landroid/database/Cursor;->getType(I)I

    .line 554
    .line 555
    .line 556
    move-result v4

    .line 557
    if-eqz v4, :cond_1e

    .line 558
    .line 559
    if-eq v4, v5, :cond_1d

    .line 560
    .line 561
    if-eq v4, v11, :cond_1c

    .line 562
    .line 563
    const/4 v11, 0x4

    .line 564
    if-eq v4, v11, :cond_1b

    .line 565
    .line 566
    invoke-interface {v6, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v4

    .line 570
    goto :goto_d

    .line 571
    :cond_1b
    invoke-interface {v6, v3}, Landroid/database/Cursor;->getBlob(I)[B

    .line 572
    .line 573
    .line 574
    move-result-object v4

    .line 575
    goto :goto_d

    .line 576
    :cond_1c
    invoke-interface {v6, v3}, Landroid/database/Cursor;->getDouble(I)D

    .line 577
    .line 578
    .line 579
    move-result-wide v16

    .line 580
    invoke-static/range {v16 .. v17}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 581
    .line 582
    .line 583
    move-result-object v4

    .line 584
    goto :goto_d

    .line 585
    :cond_1d
    invoke-interface {v6, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 586
    .line 587
    .line 588
    move-result-wide v16

    .line 589
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 590
    .line 591
    .line 592
    move-result-object v4

    .line 593
    goto :goto_d

    .line 594
    :cond_1e
    const/4 v4, 0x0

    .line 595
    :goto_d
    aput-object v4, v15, v3

    .line 596
    .line 597
    add-int/lit8 v3, v3, 0x1

    .line 598
    .line 599
    const/4 v4, 0x0

    .line 600
    const/4 v11, 0x2

    .line 601
    goto :goto_c

    .line 602
    :cond_1f
    aget-object v3, v15, v7

    .line 603
    .line 604
    if-eqz v3, :cond_20

    .line 605
    .line 606
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object v3

    .line 610
    goto :goto_e

    .line 611
    :cond_20
    const/4 v3, 0x0

    .line 612
    :goto_e
    if-nez v3, :cond_21

    .line 613
    .line 614
    const-string v3, ""

    .line 615
    .line 616
    :cond_21
    if-ltz v8, :cond_25

    .line 617
    .line 618
    aget-object v4, v15, v8

    .line 619
    .line 620
    instance-of v11, v4, Ljava/lang/Number;

    .line 621
    .line 622
    if-eqz v11, :cond_22

    .line 623
    .line 624
    check-cast v4, Ljava/lang/Number;

    .line 625
    .line 626
    goto :goto_f

    .line 627
    :cond_22
    const/4 v4, 0x0

    .line 628
    :goto_f
    if-eqz v4, :cond_23

    .line 629
    .line 630
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 631
    .line 632
    .line 633
    move-result-wide v16

    .line 634
    goto :goto_10

    .line 635
    :cond_23
    const-wide/16 v16, 0x0

    .line 636
    .line 637
    :goto_10
    invoke-interface {v12, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 638
    .line 639
    .line 640
    move-result v4

    .line 641
    if-eqz v4, :cond_24

    .line 642
    .line 643
    const-wide/high16 v18, 0x4000000000000000L    # 2.0

    .line 644
    .line 645
    or-long v16, v16, v18

    .line 646
    .line 647
    goto :goto_11

    .line 648
    :cond_24
    const-wide v18, -0x4000000000000001L    # -1.9999999999999998

    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    and-long v16, v16, v18

    .line 654
    .line 655
    :goto_11
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 656
    .line 657
    .line 658
    move-result-object v4

    .line 659
    aput-object v4, v15, v8

    .line 660
    .line 661
    :cond_25
    invoke-virtual {v12, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object v3

    .line 665
    check-cast v3, Ljava/lang/Integer;

    .line 666
    .line 667
    if-eqz v3, :cond_26

    .line 668
    .line 669
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 670
    .line 671
    .line 672
    move-result v3

    .line 673
    goto :goto_12

    .line 674
    :cond_26
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 675
    .line 676
    .line 677
    move-result v3

    .line 678
    add-int/2addr v3, v13

    .line 679
    :goto_12
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 680
    .line 681
    .line 682
    move-result-object v3

    .line 683
    new-instance v4, Lsf/e;

    .line 684
    .line 685
    invoke-direct {v4, v3, v15}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 686
    .line 687
    .line 688
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 689
    .line 690
    .line 691
    add-int/lit8 v13, v13, 0x1

    .line 692
    .line 693
    const/4 v4, 0x0

    .line 694
    const/4 v11, 0x2

    .line 695
    goto/16 :goto_b

    .line 696
    .line 697
    :cond_27
    :try_start_2
    invoke-interface {v6}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 698
    .line 699
    .line 700
    :catchall_1
    new-instance v6, Landroid/database/MatrixCursor;

    .line 701
    .line 702
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 703
    .line 704
    .line 705
    move-result v2

    .line 706
    invoke-direct {v6, v9, v2}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;I)V

    .line 707
    .line 708
    .line 709
    new-instance v2, Lc9/h1;

    .line 710
    .line 711
    invoke-direct {v2, v5}, Lc9/h1;-><init>(I)V

    .line 712
    .line 713
    .line 714
    invoke-static {v10, v2}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 715
    .line 716
    .line 717
    move-result-object v2

    .line 718
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 719
    .line 720
    .line 721
    move-result-object v2

    .line 722
    :goto_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 723
    .line 724
    .line 725
    move-result v3

    .line 726
    if-eqz v3, :cond_28

    .line 727
    .line 728
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v3

    .line 732
    check-cast v3, Lsf/e;

    .line 733
    .line 734
    iget-object v3, v3, Lsf/e;->h:Ljava/lang/Object;

    .line 735
    .line 736
    check-cast v3, [Ljava/lang/Object;

    .line 737
    .line 738
    invoke-virtual {v6, v3}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    .line 739
    .line 740
    .line 741
    goto :goto_13

    .line 742
    :cond_28
    :goto_14
    invoke-virtual {v0, v6}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 743
    .line 744
    .line 745
    :cond_29
    return-void

    .line 746
    nop

    .line 747
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 36

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v2, v1, Lc9/a2;->a:I

    .line 6
    .line 7
    const-string v3, "msgSvrId"

    .line 8
    .line 9
    const-string v4, "field_msgSvrId"

    .line 10
    .line 11
    const-string v5, "talker"

    .line 12
    .line 13
    const-string v6, "field_talker"

    .line 14
    .line 15
    const-string v8, "block_at_all_notification_enable"

    .line 16
    .line 17
    const-string v9, "Hchat_block_at_all_notification_config"

    .line 18
    .line 19
    const-string v10, ""

    .line 20
    .line 21
    const-string v11, "custom_notification_enable"

    .line 22
    .line 23
    const-wide/16 v12, 0x0

    .line 24
    .line 25
    const/4 v14, 0x1

    .line 26
    const/4 v15, 0x0

    .line 27
    iget-object v7, v1, Lc9/a2;->b:Lr8/g;

    .line 28
    .line 29
    packed-switch v2, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    :pswitch_0
    invoke-super/range {p0 .. p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Ltf/l;->z0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    instance-of v2, v0, Lorg/json/JSONObject;

    .line 49
    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    check-cast v0, Lorg/json/JSONObject;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/4 v0, 0x0

    .line 56
    :goto_0
    if-eqz v0, :cond_2

    .line 57
    .line 58
    iget-object v2, v7, Lr8/g;->a:Landroid/content/Context;

    .line 59
    .line 60
    invoke-static {v0}, Lua/g;->i(Lorg/json/JSONObject;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    invoke-static {v2}, Lua/g;->g(Landroid/content/Context;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-static {v3, v0}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v2, v0}, Lua/g;->j(Landroid/content/Context;Ljava/util/ArrayList;)V

    .line 80
    .line 81
    .line 82
    :cond_2
    :goto_1
    return-void

    .line 83
    :pswitch_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 87
    .line 88
    if-eqz v2, :cond_4

    .line 89
    .line 90
    array-length v3, v2

    .line 91
    if-nez v3, :cond_3

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    array-length v3, v2

    .line 95
    sub-int/2addr v3, v14

    .line 96
    aget-object v2, v2, v3

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_4
    :goto_2
    const/4 v2, 0x0

    .line 100
    :goto_3
    instance-of v3, v2, Landroid/app/Notification;

    .line 101
    .line 102
    if-eqz v3, :cond_5

    .line 103
    .line 104
    check-cast v2, Landroid/app/Notification;

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_5
    const/4 v2, 0x0

    .line 108
    :goto_4
    if-eqz v2, :cond_35

    .line 109
    .line 110
    iget-object v3, v7, Lr8/g;->a:Landroid/content/Context;

    .line 111
    .line 112
    sget-object v4, Le9/q;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 113
    .line 114
    iget-object v4, v2, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 115
    .line 116
    if-eqz v4, :cond_6

    .line 117
    .line 118
    const-string v5, "hchat_custom_notification"

    .line 119
    .line 120
    invoke-virtual {v4, v5, v15}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-ne v5, v14, :cond_6

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_6
    if-eqz v4, :cond_7

    .line 128
    .line 129
    const-string v5, "hchat_keyword_notification"

    .line 130
    .line 131
    invoke-virtual {v4, v5, v15}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-ne v4, v14, :cond_7

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_7
    invoke-virtual {v2}, Landroid/app/Notification;->getChannelId()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    if-eqz v4, :cond_8

    .line 143
    .line 144
    const-string v5, "Hchat_custom_notification_"

    .line 145
    .line 146
    invoke-static {v4, v5, v15}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    if-ne v4, v14, :cond_8

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_8
    invoke-virtual {v2}, Landroid/app/Notification;->getChannelId()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    if-eqz v4, :cond_9

    .line 158
    .line 159
    const-string v5, "Hchat_keyword_notification_"

    .line 160
    .line 161
    invoke-static {v4, v5, v15}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-ne v4, v14, :cond_9

    .line 166
    .line 167
    :goto_5
    move v4, v14

    .line 168
    goto :goto_6

    .line 169
    :cond_9
    move v4, v15

    .line 170
    :goto_6
    iget-object v5, v2, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 171
    .line 172
    if-eqz v5, :cond_a

    .line 173
    .line 174
    const-string v6, "hchat_custom_notification_talker"

    .line 175
    .line 176
    invoke-virtual {v5, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    goto :goto_7

    .line 181
    :cond_a
    const/4 v5, 0x0

    .line 182
    :goto_7
    if-nez v5, :cond_b

    .line 183
    .line 184
    move-object v5, v10

    .line 185
    :cond_b
    iget-object v6, v2, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 186
    .line 187
    const-string v7, "hchat_custom_notification_native_msg_svr_id"

    .line 188
    .line 189
    if-eqz v6, :cond_c

    .line 190
    .line 191
    invoke-virtual {v6, v7, v12, v13}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 192
    .line 193
    .line 194
    move-result-wide v16

    .line 195
    move-wide/from16 v34, v16

    .line 196
    .line 197
    move-wide/from16 v16, v12

    .line 198
    .line 199
    move-wide/from16 v12, v34

    .line 200
    .line 201
    goto :goto_8

    .line 202
    :cond_c
    move-wide/from16 v16, v12

    .line 203
    .line 204
    :goto_8
    if-eqz v4, :cond_d

    .line 205
    .line 206
    goto/16 :goto_1f

    .line 207
    .line 208
    :cond_d
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    if-eqz v4, :cond_e

    .line 213
    .line 214
    goto/16 :goto_1f

    .line 215
    .line 216
    :cond_e
    sget-object v4, Lt8/b;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 217
    .line 218
    invoke-static {v3, v9}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    invoke-interface {v6, v8, v15}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 223
    .line 224
    .line 225
    move-result v6

    .line 226
    if-nez v6, :cond_10

    .line 227
    .line 228
    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 229
    .line 230
    .line 231
    :cond_f
    :goto_9
    const-wide/16 v18, 0x3a98

    .line 232
    .line 233
    goto :goto_a

    .line 234
    :cond_10
    invoke-static {v5}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    if-nez v6, :cond_11

    .line 243
    .line 244
    move-object v6, v10

    .line 245
    :cond_11
    invoke-static {v6}, Lt8/b;->b(Ljava/lang/String;)Z

    .line 246
    .line 247
    .line 248
    move-result v18

    .line 249
    if-eqz v18, :cond_f

    .line 250
    .line 251
    cmp-long v18, v12, v16

    .line 252
    .line 253
    if-gtz v18, :cond_12

    .line 254
    .line 255
    goto :goto_9

    .line 256
    :cond_12
    invoke-static {v3, v6}, Loh/h;->i(Landroid/content/Context;Ljava/lang/String;)Z

    .line 257
    .line 258
    .line 259
    move-result v18

    .line 260
    if-nez v18, :cond_13

    .line 261
    .line 262
    const-wide/16 v18, 0x3a98

    .line 263
    .line 264
    new-instance v8, Lt8/a;

    .line 265
    .line 266
    invoke-direct {v8, v6, v12, v13}, Lt8/a;-><init>(Ljava/lang/String;J)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v4, v8}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    goto :goto_a

    .line 273
    :cond_13
    const-wide/16 v18, 0x3a98

    .line 274
    .line 275
    new-instance v8, Lt8/a;

    .line 276
    .line 277
    invoke-direct {v8, v6, v12, v13}, Lt8/a;-><init>(Ljava/lang/String;J)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v4, v8}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v6

    .line 284
    check-cast v6, Ljava/lang/Long;

    .line 285
    .line 286
    if-eqz v6, :cond_15

    .line 287
    .line 288
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 289
    .line 290
    .line 291
    move-result-wide v20

    .line 292
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 293
    .line 294
    .line 295
    move-result-wide v22

    .line 296
    sub-long v22, v22, v20

    .line 297
    .line 298
    cmp-long v9, v22, v18

    .line 299
    .line 300
    if-gtz v9, :cond_14

    .line 301
    .line 302
    const/4 v9, 0x0

    .line 303
    invoke-virtual {v0, v9}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    goto/16 :goto_1f

    .line 307
    .line 308
    :cond_14
    invoke-virtual {v4, v8, v6}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    :cond_15
    :goto_a
    new-instance v4, Le9/s;

    .line 312
    .line 313
    invoke-direct {v4, v3}, Le9/s;-><init>(Landroid/content/Context;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v4, v11}, Le9/s;->b(Ljava/lang/String;)Z

    .line 317
    .line 318
    .line 319
    move-result v6

    .line 320
    if-nez v6, :cond_16

    .line 321
    .line 322
    goto/16 :goto_1f

    .line 323
    .line 324
    :cond_16
    invoke-virtual {v4, v5}, Le9/s;->a(Ljava/lang/String;)Le9/c;

    .line 325
    .line 326
    .line 327
    move-result-object v4

    .line 328
    if-eqz v4, :cond_35

    .line 329
    .line 330
    iget-boolean v6, v4, Le9/c;->f:Z

    .line 331
    .line 332
    if-nez v6, :cond_17

    .line 333
    .line 334
    goto/16 :goto_1f

    .line 335
    .line 336
    :cond_17
    sget-object v6, Le9/q;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 337
    .line 338
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 339
    .line 340
    .line 341
    move-result-wide v8

    .line 342
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 343
    .line 344
    .line 345
    move-result-object v8

    .line 346
    invoke-virtual {v6, v5, v8}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v6}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 350
    .line 351
    .line 352
    move-result v8

    .line 353
    const/16 v9, 0x80

    .line 354
    .line 355
    if-le v8, v9, :cond_18

    .line 356
    .line 357
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 358
    .line 359
    .line 360
    move-result-wide v8

    .line 361
    invoke-virtual {v6}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 362
    .line 363
    .line 364
    move-result-object v6

    .line 365
    new-instance v11, Lca/c;

    .line 366
    .line 367
    const/4 v15, 0x2

    .line 368
    invoke-direct {v11, v8, v9, v15}, Lca/c;-><init>(JI)V

    .line 369
    .line 370
    .line 371
    new-instance v8, Lbe/i;

    .line 372
    .line 373
    const/16 v9, 0x8

    .line 374
    .line 375
    invoke-direct {v8, v11, v9}, Lbe/i;-><init>(Ljava/lang/Object;I)V

    .line 376
    .line 377
    .line 378
    invoke-interface {v6, v8}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 379
    .line 380
    .line 381
    :cond_18
    cmp-long v6, v12, v16

    .line 382
    .line 383
    if-gtz v6, :cond_19

    .line 384
    .line 385
    goto/16 :goto_1f

    .line 386
    .line 387
    :cond_19
    invoke-static {v4, v5}, Le9/q;->A(Le9/c;Ljava/lang/String;)Z

    .line 388
    .line 389
    .line 390
    move-result v8

    .line 391
    if-eqz v8, :cond_1a

    .line 392
    .line 393
    const/4 v9, 0x0

    .line 394
    invoke-virtual {v0, v9}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    goto/16 :goto_1f

    .line 398
    .line 399
    :cond_1a
    iget-boolean v8, v4, Le9/c;->d:Z

    .line 400
    .line 401
    if-eqz v8, :cond_1c

    .line 402
    .line 403
    if-gtz v6, :cond_1b

    .line 404
    .line 405
    goto :goto_b

    .line 406
    :cond_1b
    new-instance v6, Le9/j;

    .line 407
    .line 408
    invoke-direct {v6, v5, v12, v13}, Le9/j;-><init>(Ljava/lang/String;J)V

    .line 409
    .line 410
    .line 411
    sget-object v5, Le9/q;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 412
    .line 413
    invoke-virtual {v5, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v8

    .line 417
    check-cast v8, Le9/i;

    .line 418
    .line 419
    if-eqz v8, :cond_1c

    .line 420
    .line 421
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 422
    .line 423
    .line 424
    move-result-wide v11

    .line 425
    iget-wide v14, v8, Le9/i;->b:J

    .line 426
    .line 427
    sub-long/2addr v11, v14

    .line 428
    cmp-long v9, v11, v18

    .line 429
    .line 430
    if-lez v9, :cond_1d

    .line 431
    .line 432
    invoke-virtual {v5, v6, v8}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    :cond_1c
    :goto_b
    const/4 v5, 0x0

    .line 436
    goto :goto_c

    .line 437
    :cond_1d
    iget-object v5, v8, Le9/i;->a:Ll8/c;

    .line 438
    .line 439
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 440
    .line 441
    .line 442
    move-result v5

    .line 443
    const/4 v13, 0x1

    .line 444
    if-eq v5, v13, :cond_1f

    .line 445
    .line 446
    const/4 v15, 0x2

    .line 447
    if-eq v5, v15, :cond_1e

    .line 448
    .line 449
    goto :goto_b

    .line 450
    :cond_1e
    iget-boolean v5, v4, Le9/c;->t:Z

    .line 451
    .line 452
    goto :goto_c

    .line 453
    :cond_1f
    iget-boolean v5, v4, Le9/c;->u:Z

    .line 454
    .line 455
    :goto_c
    if-eqz v5, :cond_20

    .line 456
    .line 457
    const/4 v12, 0x0

    .line 458
    invoke-virtual {v0, v12}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    goto/16 :goto_1f

    .line 462
    .line 463
    :cond_20
    const/4 v12, 0x0

    .line 464
    invoke-virtual {v0, v12}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 465
    .line 466
    .line 467
    iget v0, v4, Le9/c;->g:I

    .line 468
    .line 469
    if-eqz v0, :cond_35

    .line 470
    .line 471
    invoke-static {v4}, Le9/q;->k(Le9/c;)Z

    .line 472
    .line 473
    .line 474
    move-result v0

    .line 475
    if-eqz v0, :cond_21

    .line 476
    .line 477
    goto/16 :goto_1f

    .line 478
    .line 479
    :cond_21
    iget-object v0, v4, Le9/c;->b:Ljava/lang/String;

    .line 480
    .line 481
    invoke-static {v0}, Lg4/a;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v5

    .line 485
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 486
    .line 487
    .line 488
    move-result v6

    .line 489
    if-eqz v6, :cond_22

    .line 490
    .line 491
    iget-object v5, v4, Le9/c;->c:Ljava/lang/String;

    .line 492
    .line 493
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 494
    .line 495
    .line 496
    move-result v6

    .line 497
    if-eqz v6, :cond_22

    .line 498
    .line 499
    move-object v5, v0

    .line 500
    :cond_22
    move-object/from16 v22, v5

    .line 501
    .line 502
    const-string v5, "hchat_custom_notification_native_text"

    .line 503
    .line 504
    invoke-static {v2, v5}, Le9/q;->t(Landroid/app/Notification;Ljava/lang/String;)Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v23

    .line 508
    const-string v5, "hchat_custom_notification_native_summary"

    .line 509
    .line 510
    invoke-static {v2, v5}, Le9/q;->t(Landroid/app/Notification;Ljava/lang/String;)Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v24

    .line 514
    const-string v5, "android.bigText"

    .line 515
    .line 516
    invoke-static {v2, v5}, Le9/q;->t(Landroid/app/Notification;Ljava/lang/String;)Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v25

    .line 520
    const-string v5, "android.text"

    .line 521
    .line 522
    invoke-static {v2, v5}, Le9/q;->t(Landroid/app/Notification;Ljava/lang/String;)Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v26

    .line 526
    iget-object v5, v2, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 527
    .line 528
    if-eqz v5, :cond_23

    .line 529
    .line 530
    const-string v6, "android.textLines"

    .line 531
    .line 532
    invoke-virtual {v5, v6}, Landroid/os/Bundle;->getCharSequenceArray(Ljava/lang/String;)[Ljava/lang/CharSequence;

    .line 533
    .line 534
    .line 535
    move-result-object v9

    .line 536
    goto :goto_d

    .line 537
    :cond_23
    move-object v9, v12

    .line 538
    :goto_d
    if-nez v9, :cond_24

    .line 539
    .line 540
    const/4 v5, 0x0

    .line 541
    new-array v9, v5, [Ljava/lang/CharSequence;

    .line 542
    .line 543
    :cond_24
    check-cast v9, [Ljava/lang/CharSequence;

    .line 544
    .line 545
    array-length v5, v9

    .line 546
    add-int/lit8 v5, v5, -0x1

    .line 547
    .line 548
    if-ltz v5, :cond_28

    .line 549
    .line 550
    :goto_e
    add-int/lit8 v6, v5, -0x1

    .line 551
    .line 552
    aget-object v5, v9, v5

    .line 553
    .line 554
    if-eqz v5, :cond_26

    .line 555
    .line 556
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 557
    .line 558
    .line 559
    move-result v8

    .line 560
    if-eqz v8, :cond_25

    .line 561
    .line 562
    goto :goto_f

    .line 563
    :cond_25
    move-object v9, v5

    .line 564
    goto :goto_11

    .line 565
    :cond_26
    :goto_f
    if-gez v6, :cond_27

    .line 566
    .line 567
    goto :goto_10

    .line 568
    :cond_27
    move v5, v6

    .line 569
    goto :goto_e

    .line 570
    :cond_28
    :goto_10
    move-object v9, v12

    .line 571
    :goto_11
    if-eqz v9, :cond_29

    .line 572
    .line 573
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 574
    .line 575
    .line 576
    move-result-object v9

    .line 577
    goto :goto_12

    .line 578
    :cond_29
    move-object v9, v12

    .line 579
    :goto_12
    if-nez v9, :cond_2a

    .line 580
    .line 581
    move-object/from16 v27, v10

    .line 582
    .line 583
    goto :goto_13

    .line 584
    :cond_2a
    move-object/from16 v27, v9

    .line 585
    .line 586
    :goto_13
    const-string v5, "android.summaryText"

    .line 587
    .line 588
    invoke-static {v2, v5}, Le9/q;->t(Landroid/app/Notification;Ljava/lang/String;)Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v28

    .line 592
    iget-object v5, v2, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 593
    .line 594
    if-eqz v5, :cond_2b

    .line 595
    .line 596
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v9

    .line 600
    move-object/from16 v29, v9

    .line 601
    .line 602
    goto :goto_14

    .line 603
    :cond_2b
    move-object/from16 v29, v12

    .line 604
    .line 605
    :goto_14
    filled-new-array/range {v23 .. v29}, [Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v5

    .line 609
    invoke-static {v5}, Le9/q;->g([Ljava/lang/String;)Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v5

    .line 613
    iget-boolean v6, v4, Le9/c;->n:Z

    .line 614
    .line 615
    const-string v8, "[\u6536\u5230\u4e00\u6761\u65b0\u6d88\u606f]"

    .line 616
    .line 617
    if-eqz v6, :cond_2d

    .line 618
    .line 619
    invoke-static {v5}, Le9/q;->y(Ljava/lang/String;)Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object v5

    .line 623
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 624
    .line 625
    .line 626
    move-result v6

    .line 627
    if-eqz v6, :cond_2c

    .line 628
    .line 629
    goto :goto_15

    .line 630
    :cond_2c
    move-object v8, v5

    .line 631
    :cond_2d
    :goto_15
    move-object/from16 v23, v8

    .line 632
    .line 633
    iget-object v5, v2, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 634
    .line 635
    if-eqz v5, :cond_30

    .line 636
    .line 637
    const-string v6, "hchat_custom_notification_unread_count"

    .line 638
    .line 639
    const/4 v8, 0x0

    .line 640
    invoke-virtual {v5, v6, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 641
    .line 642
    .line 643
    move-result v5

    .line 644
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 645
    .line 646
    .line 647
    move-result-object v9

    .line 648
    if-lez v5, :cond_2e

    .line 649
    .line 650
    const/4 v5, 0x1

    .line 651
    goto :goto_16

    .line 652
    :cond_2e
    const/4 v5, 0x0

    .line 653
    :goto_16
    if-eqz v5, :cond_2f

    .line 654
    .line 655
    goto :goto_17

    .line 656
    :cond_2f
    move-object v9, v12

    .line 657
    :goto_17
    if-eqz v9, :cond_30

    .line 658
    .line 659
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 660
    .line 661
    .line 662
    move-result v5

    .line 663
    :goto_18
    move/from16 v24, v5

    .line 664
    .line 665
    goto :goto_19

    .line 666
    :cond_30
    invoke-static {v3, v0}, Le9/q;->d(Landroid/content/Context;Ljava/lang/String;)I

    .line 667
    .line 668
    .line 669
    move-result v5

    .line 670
    const/4 v13, 0x1

    .line 671
    add-int/2addr v5, v13

    .line 672
    goto :goto_18

    .line 673
    :goto_19
    invoke-static {v3, v0}, Le9/q;->p(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 674
    .line 675
    .line 676
    move-result-object v25

    .line 677
    iget-wide v5, v2, Landroid/app/Notification;->when:J

    .line 678
    .line 679
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    cmp-long v5, v5, v16

    .line 684
    .line 685
    if-lez v5, :cond_31

    .line 686
    .line 687
    const/4 v14, 0x1

    .line 688
    goto :goto_1a

    .line 689
    :cond_31
    const/4 v14, 0x0

    .line 690
    :goto_1a
    if-eqz v14, :cond_32

    .line 691
    .line 692
    goto :goto_1b

    .line 693
    :cond_32
    move-object v0, v12

    .line 694
    :goto_1b
    if-eqz v0, :cond_33

    .line 695
    .line 696
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 697
    .line 698
    .line 699
    move-result-wide v5

    .line 700
    :goto_1c
    move-wide/from16 v26, v5

    .line 701
    .line 702
    goto :goto_1d

    .line 703
    :cond_33
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 704
    .line 705
    .line 706
    move-result-wide v5

    .line 707
    goto :goto_1c

    .line 708
    :goto_1d
    iget-object v0, v2, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 709
    .line 710
    if-eqz v0, :cond_34

    .line 711
    .line 712
    move-wide/from16 v5, v16

    .line 713
    .line 714
    invoke-virtual {v0, v7, v5, v6}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 715
    .line 716
    .line 717
    move-result-wide v12

    .line 718
    move-wide/from16 v30, v12

    .line 719
    .line 720
    goto :goto_1e

    .line 721
    :cond_34
    const-wide/16 v30, 0x0

    .line 722
    .line 723
    :goto_1e
    iget-object v0, v2, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;

    .line 724
    .line 725
    new-instance v21, Le9/l;

    .line 726
    .line 727
    const-wide/16 v28, 0x0

    .line 728
    .line 729
    const/16 v33, 0x20

    .line 730
    .line 731
    move-object/from16 v32, v0

    .line 732
    .line 733
    invoke-direct/range {v21 .. v33}, Le9/l;-><init>(Ljava/lang/String;Ljava/lang/String;ILandroid/graphics/Bitmap;JJJLandroid/app/PendingIntent;I)V

    .line 734
    .line 735
    .line 736
    sget-object v6, Le9/q;->d:Ljava/util/concurrent/ExecutorService;

    .line 737
    .line 738
    new-instance v0, Lac/l;

    .line 739
    .line 740
    const/16 v5, 0xb

    .line 741
    .line 742
    move-object v2, v3

    .line 743
    move-object v3, v4

    .line 744
    move-object/from16 v4, v21

    .line 745
    .line 746
    invoke-direct/range {v0 .. v5}, Lac/l;-><init>(Ljava/lang/Object;Landroid/content/Context;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 747
    .line 748
    .line 749
    invoke-interface {v6, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 750
    .line 751
    .line 752
    :cond_35
    :goto_1f
    return-void

    .line 753
    :pswitch_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 754
    .line 755
    .line 756
    sget-object v1, Le9/q;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 757
    .line 758
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 759
    .line 760
    iget-object v1, v7, Lr8/g;->a:Landroid/content/Context;

    .line 761
    .line 762
    invoke-static {v0, v1}, Le9/q;->b(Ljava/lang/Object;Landroid/content/Context;)V

    .line 763
    .line 764
    .line 765
    return-void

    .line 766
    :pswitch_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 767
    .line 768
    .line 769
    sget-object v1, Le9/q;->l:Ljava/lang/ThreadLocal;

    .line 770
    .line 771
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object v2

    .line 775
    check-cast v2, Ljava/util/ArrayDeque;

    .line 776
    .line 777
    if-eqz v2, :cond_36

    .line 778
    .line 779
    goto :goto_20

    .line 780
    :cond_36
    new-instance v2, Ljava/util/ArrayDeque;

    .line 781
    .line 782
    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    .line 783
    .line 784
    .line 785
    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 786
    .line 787
    .line 788
    :goto_20
    sget-object v1, Le9/q;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 789
    .line 790
    iget-object v1, v7, Lr8/g;->a:Landroid/content/Context;

    .line 791
    .line 792
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 793
    .line 794
    if-eqz v0, :cond_37

    .line 795
    .line 796
    goto :goto_21

    .line 797
    :cond_37
    const/4 v8, 0x0

    .line 798
    new-array v0, v8, [Ljava/lang/Object;

    .line 799
    .line 800
    :goto_21
    new-instance v7, Le9/s;

    .line 801
    .line 802
    invoke-direct {v7, v1}, Le9/s;-><init>(Landroid/content/Context;)V

    .line 803
    .line 804
    .line 805
    invoke-virtual {v7, v11}, Le9/s;->b(Ljava/lang/String;)Z

    .line 806
    .line 807
    .line 808
    move-result v1

    .line 809
    if-nez v1, :cond_38

    .line 810
    .line 811
    goto/16 :goto_24

    .line 812
    .line 813
    :cond_38
    invoke-static {v0}, Le9/q;->f([Ljava/lang/Object;)Ljava/lang/Object;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    if-eqz v0, :cond_3f

    .line 818
    .line 819
    filled-new-array {v6, v5}, [Ljava/lang/String;

    .line 820
    .line 821
    .line 822
    move-result-object v1

    .line 823
    invoke-static {v0, v1}, Le9/q;->w(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 824
    .line 825
    .line 826
    move-result-object v1

    .line 827
    filled-new-array {v4, v3}, [Ljava/lang/String;

    .line 828
    .line 829
    .line 830
    move-result-object v3

    .line 831
    invoke-static {v0, v3}, Le9/q;->v(Ljava/lang/Object;[Ljava/lang/String;)J

    .line 832
    .line 833
    .line 834
    move-result-wide v3

    .line 835
    const-string v5, "field_type"

    .line 836
    .line 837
    const-string v6, "type"

    .line 838
    .line 839
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 840
    .line 841
    .line 842
    move-result-object v5

    .line 843
    invoke-static {v0, v5}, Le9/q;->u(Ljava/lang/Object;[Ljava/lang/String;)I

    .line 844
    .line 845
    .line 846
    move-result v5

    .line 847
    const-string v6, "field_isSend"

    .line 848
    .line 849
    const-string v8, "isSend"

    .line 850
    .line 851
    filled-new-array {v6, v8}, [Ljava/lang/String;

    .line 852
    .line 853
    .line 854
    move-result-object v6

    .line 855
    invoke-static {v0, v6}, Le9/q;->u(Ljava/lang/Object;[Ljava/lang/String;)I

    .line 856
    .line 857
    .line 858
    move-result v0

    .line 859
    const/4 v13, 0x1

    .line 860
    if-ne v0, v13, :cond_39

    .line 861
    .line 862
    const/4 v0, 0x1

    .line 863
    goto :goto_22

    .line 864
    :cond_39
    const/4 v0, 0x0

    .line 865
    :goto_22
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 866
    .line 867
    .line 868
    move-result v6

    .line 869
    if-nez v6, :cond_3f

    .line 870
    .line 871
    const-wide/16 v16, 0x0

    .line 872
    .line 873
    cmp-long v3, v3, v16

    .line 874
    .line 875
    if-lez v3, :cond_3f

    .line 876
    .line 877
    if-nez v0, :cond_3f

    .line 878
    .line 879
    const/16 v0, 0x2712

    .line 880
    .line 881
    const/16 v3, 0x2710

    .line 882
    .line 883
    if-gtz v5, :cond_3a

    .line 884
    .line 885
    goto :goto_23

    .line 886
    :cond_3a
    and-int/lit16 v4, v5, 0xff

    .line 887
    .line 888
    const v6, 0xffff

    .line 889
    .line 890
    .line 891
    and-int/2addr v6, v5

    .line 892
    ushr-int/lit8 v8, v5, 0x10

    .line 893
    .line 894
    if-nez v8, :cond_3b

    .line 895
    .line 896
    goto :goto_23

    .line 897
    :cond_3b
    if-eq v6, v3, :cond_3c

    .line 898
    .line 899
    if-eq v6, v0, :cond_3c

    .line 900
    .line 901
    if-eqz v4, :cond_3d

    .line 902
    .line 903
    if-ne v6, v4, :cond_3d

    .line 904
    .line 905
    move v5, v4

    .line 906
    goto :goto_23

    .line 907
    :cond_3c
    move v5, v6

    .line 908
    :cond_3d
    :goto_23
    if-eq v5, v3, :cond_3f

    .line 909
    .line 910
    if-ne v5, v0, :cond_3e

    .line 911
    .line 912
    goto :goto_24

    .line 913
    :cond_3e
    invoke-virtual {v7, v1}, Le9/s;->a(Ljava/lang/String;)Le9/c;

    .line 914
    .line 915
    .line 916
    move-result-object v0

    .line 917
    if-eqz v0, :cond_3f

    .line 918
    .line 919
    iget-boolean v3, v0, Le9/c;->f:Z

    .line 920
    .line 921
    if-eqz v3, :cond_3f

    .line 922
    .line 923
    iget v3, v0, Le9/c;->g:I

    .line 924
    .line 925
    if-eqz v3, :cond_3f

    .line 926
    .line 927
    invoke-static {v0}, Le9/q;->k(Le9/c;)Z

    .line 928
    .line 929
    .line 930
    move-result v3

    .line 931
    if-nez v3, :cond_3f

    .line 932
    .line 933
    invoke-static {v0, v1}, Le9/q;->A(Le9/c;Ljava/lang/String;)Z

    .line 934
    .line 935
    .line 936
    move-result v0

    .line 937
    if-nez v0, :cond_3f

    .line 938
    .line 939
    const/4 v14, 0x1

    .line 940
    goto :goto_25

    .line 941
    :cond_3f
    :goto_24
    const/4 v14, 0x0

    .line 942
    :goto_25
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 943
    .line 944
    .line 945
    move-result-object v0

    .line 946
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 947
    .line 948
    .line 949
    return-void

    .line 950
    :pswitch_5
    const/4 v12, 0x0

    .line 951
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 952
    .line 953
    .line 954
    sget-object v1, Le9/q;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 955
    .line 956
    iget-object v1, v7, Lr8/g;->a:Landroid/content/Context;

    .line 957
    .line 958
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 959
    .line 960
    if-eqz v0, :cond_40

    .line 961
    .line 962
    move-object v2, v0

    .line 963
    const/4 v0, 0x0

    .line 964
    goto :goto_26

    .line 965
    :cond_40
    const/4 v0, 0x0

    .line 966
    new-array v2, v0, [Ljava/lang/Object;

    .line 967
    .line 968
    :goto_26
    invoke-static {v1, v9}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 969
    .line 970
    .line 971
    move-result-object v7

    .line 972
    invoke-interface {v7, v8, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 973
    .line 974
    .line 975
    move-result v7

    .line 976
    new-instance v0, Le9/s;

    .line 977
    .line 978
    invoke-direct {v0, v1}, Le9/s;-><init>(Landroid/content/Context;)V

    .line 979
    .line 980
    .line 981
    invoke-virtual {v0, v11}, Le9/s;->b(Ljava/lang/String;)Z

    .line 982
    .line 983
    .line 984
    move-result v8

    .line 985
    if-nez v7, :cond_41

    .line 986
    .line 987
    if-nez v8, :cond_41

    .line 988
    .line 989
    goto/16 :goto_3e

    .line 990
    .line 991
    :cond_41
    invoke-static {v2}, Le9/q;->f([Ljava/lang/Object;)Ljava/lang/Object;

    .line 992
    .line 993
    .line 994
    move-result-object v9

    .line 995
    if-eqz v9, :cond_67

    .line 996
    .line 997
    invoke-static {v2}, Ltf/l;->k0([Ljava/lang/Object;)Lng/j;

    .line 998
    .line 999
    .line 1000
    move-result-object v11

    .line 1001
    sget-object v14, Le9/m;->h:Le9/m;

    .line 1002
    .line 1003
    new-instance v15, Lng/i;

    .line 1004
    .line 1005
    const/4 v13, 0x1

    .line 1006
    invoke-direct {v15, v11, v13, v14}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 1007
    .line 1008
    .line 1009
    new-instance v11, Le9/h;

    .line 1010
    .line 1011
    const/4 v14, 0x2

    .line 1012
    invoke-direct {v11, v14}, Le9/h;-><init>(I)V

    .line 1013
    .line 1014
    .line 1015
    invoke-static {v15, v11}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v11

    .line 1019
    iget-object v14, v11, Lng/t;->a:Lng/j;

    .line 1020
    .line 1021
    invoke-interface {v14}, Lng/j;->iterator()Ljava/util/Iterator;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v14

    .line 1025
    :goto_27
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 1026
    .line 1027
    .line 1028
    move-result v15

    .line 1029
    const-string v12, "@im.chatroom"

    .line 1030
    .line 1031
    const-string v13, "@chatroom"

    .line 1032
    .line 1033
    if-eqz v15, :cond_43

    .line 1034
    .line 1035
    iget-object v15, v11, Lng/t;->b:Lfg/l;

    .line 1036
    .line 1037
    move-object/from16 v18, v2

    .line 1038
    .line 1039
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v2

    .line 1043
    invoke-interface {v15, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v2

    .line 1047
    move-object v15, v2

    .line 1048
    check-cast v15, Ljava/lang/String;

    .line 1049
    .line 1050
    move-object/from16 v19, v2

    .line 1051
    .line 1052
    const/4 v2, 0x0

    .line 1053
    invoke-static {v15, v13, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1054
    .line 1055
    .line 1056
    move-result v20

    .line 1057
    if-nez v20, :cond_44

    .line 1058
    .line 1059
    invoke-static {v15, v12, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1060
    .line 1061
    .line 1062
    move-result v15

    .line 1063
    if-eqz v15, :cond_42

    .line 1064
    .line 1065
    goto :goto_28

    .line 1066
    :cond_42
    move-object/from16 v2, v18

    .line 1067
    .line 1068
    const/4 v12, 0x0

    .line 1069
    goto :goto_27

    .line 1070
    :cond_43
    move-object/from16 v18, v2

    .line 1071
    .line 1072
    const/16 v19, 0x0

    .line 1073
    .line 1074
    :cond_44
    :goto_28
    check-cast v19, Ljava/lang/String;

    .line 1075
    .line 1076
    if-eqz v19, :cond_45

    .line 1077
    .line 1078
    :goto_29
    move-object/from16 v2, v19

    .line 1079
    .line 1080
    const/4 v5, 0x0

    .line 1081
    goto :goto_2a

    .line 1082
    :cond_45
    filled-new-array {v6, v5}, [Ljava/lang/String;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v2

    .line 1086
    invoke-static {v9, v2}, Le9/q;->w(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v19

    .line 1090
    goto :goto_29

    .line 1091
    :goto_2a
    invoke-static {v2, v13, v5}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1092
    .line 1093
    .line 1094
    move-result v6

    .line 1095
    if-nez v6, :cond_46

    .line 1096
    .line 1097
    invoke-static {v2, v12, v5}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1098
    .line 1099
    .line 1100
    move-result v6

    .line 1101
    if-eqz v6, :cond_67

    .line 1102
    .line 1103
    :cond_46
    if-eqz v7, :cond_47

    .line 1104
    .line 1105
    invoke-static {v1, v2}, Loh/h;->i(Landroid/content/Context;Ljava/lang/String;)Z

    .line 1106
    .line 1107
    .line 1108
    move-result v5

    .line 1109
    if-eqz v5, :cond_47

    .line 1110
    .line 1111
    const/4 v5, 0x1

    .line 1112
    goto :goto_2b

    .line 1113
    :cond_47
    const/4 v5, 0x0

    .line 1114
    :goto_2b
    if-eqz v8, :cond_48

    .line 1115
    .line 1116
    invoke-virtual {v0, v2}, Le9/s;->a(Ljava/lang/String;)Le9/c;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v0

    .line 1120
    goto :goto_2c

    .line 1121
    :cond_48
    const/4 v0, 0x0

    .line 1122
    :goto_2c
    if-eqz v0, :cond_4b

    .line 1123
    .line 1124
    iget-boolean v6, v0, Le9/c;->f:Z

    .line 1125
    .line 1126
    if-eqz v6, :cond_4a

    .line 1127
    .line 1128
    iget-boolean v6, v0, Le9/c;->d:Z

    .line 1129
    .line 1130
    if-eqz v6, :cond_4a

    .line 1131
    .line 1132
    iget-boolean v6, v0, Le9/c;->t:Z

    .line 1133
    .line 1134
    if-nez v6, :cond_49

    .line 1135
    .line 1136
    iget-boolean v0, v0, Le9/c;->u:Z

    .line 1137
    .line 1138
    if-eqz v0, :cond_4a

    .line 1139
    .line 1140
    :cond_49
    const/4 v13, 0x1

    .line 1141
    goto :goto_2d

    .line 1142
    :cond_4a
    const/4 v13, 0x0

    .line 1143
    :goto_2d
    move v0, v13

    .line 1144
    goto :goto_2e

    .line 1145
    :cond_4b
    const/4 v0, 0x0

    .line 1146
    :goto_2e
    if-nez v5, :cond_4c

    .line 1147
    .line 1148
    if-nez v0, :cond_4c

    .line 1149
    .line 1150
    goto/16 :goto_3e

    .line 1151
    .line 1152
    :cond_4c
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v6

    .line 1156
    invoke-static {v6}, Le9/q;->j(Ljava/lang/Class;)Ljava/util/List;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v6

    .line 1160
    new-instance v7, Ldg/n;

    .line 1161
    .line 1162
    const/4 v8, 0x6

    .line 1163
    invoke-direct {v7, v6, v8}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 1164
    .line 1165
    .line 1166
    new-instance v6, Le9/h;

    .line 1167
    .line 1168
    const/4 v11, 0x3

    .line 1169
    invoke-direct {v6, v11}, Le9/h;-><init>(I)V

    .line 1170
    .line 1171
    .line 1172
    new-instance v11, Lng/i;

    .line 1173
    .line 1174
    const/4 v13, 0x1

    .line 1175
    invoke-direct {v11, v7, v13, v6}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 1176
    .line 1177
    .line 1178
    new-instance v6, Lc9/k1;

    .line 1179
    .line 1180
    invoke-direct {v6, v9, v8}, Lc9/k1;-><init>(Ljava/lang/Object;I)V

    .line 1181
    .line 1182
    .line 1183
    invoke-static {v11, v6}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v6

    .line 1187
    invoke-static {v6}, Lng/m;->b0(Lng/j;)Ljava/util/List;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v6

    .line 1191
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v7

    .line 1195
    :cond_4d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1196
    .line 1197
    .line 1198
    move-result v11

    .line 1199
    if-eqz v11, :cond_4e

    .line 1200
    .line 1201
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v11

    .line 1205
    move-object v12, v11

    .line 1206
    check-cast v12, Ljava/lang/String;

    .line 1207
    .line 1208
    const-string v14, "<msgsource"

    .line 1209
    .line 1210
    const/4 v13, 0x1

    .line 1211
    invoke-static {v12, v14, v13}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1212
    .line 1213
    .line 1214
    move-result v14

    .line 1215
    if-nez v14, :cond_4f

    .line 1216
    .line 1217
    const-string v14, "atuserlist"

    .line 1218
    .line 1219
    invoke-static {v12, v14, v13}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1220
    .line 1221
    .line 1222
    move-result v12

    .line 1223
    if-eqz v12, :cond_4d

    .line 1224
    .line 1225
    goto :goto_2f

    .line 1226
    :cond_4e
    const/4 v11, 0x0

    .line 1227
    :cond_4f
    :goto_2f
    check-cast v11, Ljava/lang/String;

    .line 1228
    .line 1229
    if-nez v11, :cond_50

    .line 1230
    .line 1231
    move-object v11, v10

    .line 1232
    :cond_50
    const-string v7, "field_content"

    .line 1233
    .line 1234
    const-string v12, "content"

    .line 1235
    .line 1236
    filled-new-array {v7, v12}, [Ljava/lang/String;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v7

    .line 1240
    const/4 v12, 0x0

    .line 1241
    :goto_30
    const/4 v15, 0x2

    .line 1242
    if-lt v12, v15, :cond_51

    .line 1243
    .line 1244
    move-object v14, v10

    .line 1245
    goto :goto_32

    .line 1246
    :cond_51
    aget-object v14, v7, v12

    .line 1247
    .line 1248
    invoke-static {v9, v14}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v14

    .line 1252
    instance-of v15, v14, Ljava/lang/String;

    .line 1253
    .line 1254
    if-eqz v15, :cond_52

    .line 1255
    .line 1256
    check-cast v14, Ljava/lang/String;

    .line 1257
    .line 1258
    goto :goto_31

    .line 1259
    :cond_52
    const/4 v14, 0x0

    .line 1260
    :goto_31
    if-eqz v14, :cond_66

    .line 1261
    .line 1262
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 1263
    .line 1264
    .line 1265
    move-result v15

    .line 1266
    if-lez v15, :cond_66

    .line 1267
    .line 1268
    :goto_32
    invoke-static/range {v18 .. v18}, Ltf/l;->k0([Ljava/lang/Object;)Lng/j;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v7

    .line 1272
    sget-object v12, Le9/m;->i:Le9/m;

    .line 1273
    .line 1274
    new-instance v15, Lng/i;

    .line 1275
    .line 1276
    const/4 v13, 0x1

    .line 1277
    invoke-direct {v15, v7, v13, v12}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 1278
    .line 1279
    .line 1280
    new-instance v7, Ldg/n;

    .line 1281
    .line 1282
    invoke-direct {v7, v6, v8}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 1283
    .line 1284
    .line 1285
    invoke-static {v15, v7}, Lng/m;->Y(Lng/j;Ldg/n;)Ldg/j;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v6

    .line 1289
    invoke-static {v6}, Lng/m;->b0(Lng/j;)Ljava/util/List;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v6

    .line 1293
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 1294
    .line 1295
    .line 1296
    move-result v7

    .line 1297
    if-eqz v7, :cond_54

    .line 1298
    .line 1299
    :cond_53
    const/4 v7, 0x0

    .line 1300
    goto :goto_33

    .line 1301
    :cond_54
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v7

    .line 1305
    :cond_55
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1306
    .line 1307
    .line 1308
    move-result v8

    .line 1309
    if-eqz v8, :cond_53

    .line 1310
    .line 1311
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v8

    .line 1315
    check-cast v8, Ljava/lang/String;

    .line 1316
    .line 1317
    const-string v12, "announcement@all"

    .line 1318
    .line 1319
    const/4 v13, 0x1

    .line 1320
    invoke-static {v8, v12, v13}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1321
    .line 1322
    .line 1323
    move-result v8

    .line 1324
    if-eqz v8, :cond_55

    .line 1325
    .line 1326
    const/4 v7, 0x1

    .line 1327
    :goto_33
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 1328
    .line 1329
    .line 1330
    move-result v8

    .line 1331
    if-eqz v8, :cond_57

    .line 1332
    .line 1333
    :cond_56
    const/4 v6, 0x0

    .line 1334
    goto :goto_34

    .line 1335
    :cond_57
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v6

    .line 1339
    :cond_58
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1340
    .line 1341
    .line 1342
    move-result v8

    .line 1343
    if-eqz v8, :cond_56

    .line 1344
    .line 1345
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v8

    .line 1349
    check-cast v8, Ljava/lang/String;

    .line 1350
    .line 1351
    const-string v12, "notify@all"

    .line 1352
    .line 1353
    const/4 v13, 0x1

    .line 1354
    invoke-static {v8, v12, v13}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1355
    .line 1356
    .line 1357
    move-result v8

    .line 1358
    if-eqz v8, :cond_58

    .line 1359
    .line 1360
    const/4 v6, 0x1

    .line 1361
    :goto_34
    sget-object v8, Lt8/b;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1362
    .line 1363
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->account()Lg8/a;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v8

    .line 1367
    if-eqz v8, :cond_59

    .line 1368
    .line 1369
    invoke-virtual {v8}, Lg8/a;->c()Ljava/lang/String;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v8

    .line 1373
    goto :goto_35

    .line 1374
    :cond_59
    const/4 v8, 0x0

    .line 1375
    :goto_35
    if-nez v8, :cond_5a

    .line 1376
    .line 1377
    move-object v8, v10

    .line 1378
    :cond_5a
    sget-object v12, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 1379
    .line 1380
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1381
    .line 1382
    .line 1383
    invoke-static {v11, v14, v8}, Ll8/d;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll8/c;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v8

    .line 1387
    sget-object v12, Ll8/c;->i:Ll8/c;

    .line 1388
    .line 1389
    if-ne v8, v12, :cond_5b

    .line 1390
    .line 1391
    const/4 v15, 0x1

    .line 1392
    goto :goto_36

    .line 1393
    :cond_5b
    const/4 v15, 0x0

    .line 1394
    :goto_36
    if-eqz v7, :cond_5c

    .line 1395
    .line 1396
    sget-object v6, Ll8/c;->j:Ll8/c;

    .line 1397
    .line 1398
    goto :goto_3a

    .line 1399
    :cond_5c
    if-nez v6, :cond_60

    .line 1400
    .line 1401
    if-eqz v15, :cond_5d

    .line 1402
    .line 1403
    goto :goto_39

    .line 1404
    :cond_5d
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->account()Lg8/a;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v6

    .line 1408
    if-eqz v6, :cond_5e

    .line 1409
    .line 1410
    invoke-virtual {v6}, Lg8/a;->c()Ljava/lang/String;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v6

    .line 1414
    goto :goto_37

    .line 1415
    :cond_5e
    const/4 v6, 0x0

    .line 1416
    :goto_37
    if-nez v6, :cond_5f

    .line 1417
    .line 1418
    goto :goto_38

    .line 1419
    :cond_5f
    move-object v10, v6

    .line 1420
    :goto_38
    invoke-static {v11, v14, v10}, Ll8/d;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll8/c;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v6

    .line 1424
    goto :goto_3a

    .line 1425
    :cond_60
    :goto_39
    move-object v6, v12

    .line 1426
    :goto_3a
    invoke-static/range {v18 .. v18}, Ltf/l;->k0([Ljava/lang/Object;)Lng/j;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v7

    .line 1430
    sget-object v8, Le9/m;->j:Le9/m;

    .line 1431
    .line 1432
    new-instance v10, Lng/i;

    .line 1433
    .line 1434
    const/4 v13, 0x1

    .line 1435
    invoke-direct {v10, v7, v13, v8}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 1436
    .line 1437
    .line 1438
    new-instance v7, Lng/h;

    .line 1439
    .line 1440
    invoke-direct {v7, v10}, Lng/h;-><init>(Lng/i;)V

    .line 1441
    .line 1442
    .line 1443
    :cond_61
    invoke-virtual {v7}, Lng/h;->hasNext()Z

    .line 1444
    .line 1445
    .line 1446
    move-result v8

    .line 1447
    if-eqz v8, :cond_62

    .line 1448
    .line 1449
    invoke-virtual {v7}, Lng/h;->next()Ljava/lang/Object;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v8

    .line 1453
    move-object v10, v8

    .line 1454
    check-cast v10, Ljava/lang/Number;

    .line 1455
    .line 1456
    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    .line 1457
    .line 1458
    .line 1459
    move-result-wide v10

    .line 1460
    const-wide/16 v16, 0x0

    .line 1461
    .line 1462
    cmp-long v10, v10, v16

    .line 1463
    .line 1464
    if-lez v10, :cond_61

    .line 1465
    .line 1466
    move-object v7, v8

    .line 1467
    goto :goto_3b

    .line 1468
    :cond_62
    const/4 v7, 0x0

    .line 1469
    :goto_3b
    check-cast v7, Ljava/lang/Long;

    .line 1470
    .line 1471
    if-eqz v7, :cond_63

    .line 1472
    .line 1473
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 1474
    .line 1475
    .line 1476
    move-result-wide v3

    .line 1477
    goto :goto_3c

    .line 1478
    :cond_63
    filled-new-array {v4, v3}, [Ljava/lang/String;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v3

    .line 1482
    invoke-static {v9, v3}, Le9/q;->v(Ljava/lang/Object;[Ljava/lang/String;)J

    .line 1483
    .line 1484
    .line 1485
    move-result-wide v3

    .line 1486
    :goto_3c
    if-eqz v0, :cond_65

    .line 1487
    .line 1488
    const-wide/16 v16, 0x0

    .line 1489
    .line 1490
    cmp-long v0, v3, v16

    .line 1491
    .line 1492
    if-lez v0, :cond_65

    .line 1493
    .line 1494
    sget-object v0, Ll8/c;->g:Ll8/c;

    .line 1495
    .line 1496
    if-eq v6, v0, :cond_65

    .line 1497
    .line 1498
    sget-object v0, Ll8/c;->k:Ll8/c;

    .line 1499
    .line 1500
    if-ne v6, v0, :cond_64

    .line 1501
    .line 1502
    goto :goto_3d

    .line 1503
    :cond_64
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1504
    .line 1505
    .line 1506
    move-result-wide v7

    .line 1507
    sget-object v0, Le9/q;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1508
    .line 1509
    new-instance v9, Le9/j;

    .line 1510
    .line 1511
    invoke-direct {v9, v2, v3, v4}, Le9/j;-><init>(Ljava/lang/String;J)V

    .line 1512
    .line 1513
    .line 1514
    new-instance v10, Le9/i;

    .line 1515
    .line 1516
    invoke-direct {v10, v6, v7, v8}, Le9/i;-><init>(Ll8/c;J)V

    .line 1517
    .line 1518
    .line 1519
    invoke-virtual {v0, v9, v10}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1520
    .line 1521
    .line 1522
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 1523
    .line 1524
    .line 1525
    move-result v9

    .line 1526
    const/16 v14, 0x80

    .line 1527
    .line 1528
    if-lt v9, v14, :cond_65

    .line 1529
    .line 1530
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v0

    .line 1534
    new-instance v9, Lca/c;

    .line 1535
    .line 1536
    const/4 v13, 0x1

    .line 1537
    invoke-direct {v9, v7, v8, v13}, Lca/c;-><init>(JI)V

    .line 1538
    .line 1539
    .line 1540
    new-instance v7, Lbe/i;

    .line 1541
    .line 1542
    const/4 v8, 0x7

    .line 1543
    invoke-direct {v7, v9, v8}, Lbe/i;-><init>(Ljava/lang/Object;I)V

    .line 1544
    .line 1545
    .line 1546
    invoke-interface {v0, v7}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 1547
    .line 1548
    .line 1549
    :cond_65
    :goto_3d
    if-eqz v5, :cond_67

    .line 1550
    .line 1551
    if-ne v6, v12, :cond_67

    .line 1552
    .line 1553
    invoke-static {v1, v2, v3, v4}, Lt8/b;->c(Landroid/content/Context;Ljava/lang/String;J)V

    .line 1554
    .line 1555
    .line 1556
    goto :goto_3e

    .line 1557
    :cond_66
    const/4 v13, 0x1

    .line 1558
    const/16 v14, 0x80

    .line 1559
    .line 1560
    const-wide/16 v16, 0x0

    .line 1561
    .line 1562
    add-int/lit8 v12, v12, 0x1

    .line 1563
    .line 1564
    goto/16 :goto_30

    .line 1565
    .line 1566
    :cond_67
    :goto_3e
    return-void

    .line 1567
    :pswitch_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1568
    .line 1569
    .line 1570
    sget-object v1, Lc9/d2;->j:Ljava/lang/ThreadLocal;

    .line 1571
    .line 1572
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v1

    .line 1576
    move-object v9, v1

    .line 1577
    check-cast v9, Ljava/lang/String;

    .line 1578
    .line 1579
    if-eqz v9, :cond_6a

    .line 1580
    .line 1581
    invoke-static {v9}, Lc9/d2;->q(Ljava/lang/String;)Z

    .line 1582
    .line 1583
    .line 1584
    move-result v1

    .line 1585
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1586
    .line 1587
    .line 1588
    move-result-object v1

    .line 1589
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1590
    .line 1591
    .line 1592
    move-result v1

    .line 1593
    if-eqz v1, :cond_68

    .line 1594
    .line 1595
    goto :goto_3f

    .line 1596
    :cond_68
    const/4 v9, 0x0

    .line 1597
    :goto_3f
    if-eqz v9, :cond_6a

    .line 1598
    .line 1599
    iget-object v1, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1600
    .line 1601
    const/4 v15, 0x2

    .line 1602
    if-eqz v1, :cond_69

    .line 1603
    .line 1604
    invoke-static {v15, v1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1605
    .line 1606
    .line 1607
    move-result-object v7

    .line 1608
    goto :goto_40

    .line 1609
    :cond_69
    const/4 v7, 0x0

    .line 1610
    :goto_40
    const-string v1, "conversationboxservice"

    .line 1611
    .line 1612
    invoke-static {v7, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1613
    .line 1614
    .line 1615
    move-result v1

    .line 1616
    if-eqz v1, :cond_6a

    .line 1617
    .line 1618
    iget-object v1, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1619
    .line 1620
    const/16 v20, 0x0

    .line 1621
    .line 1622
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1623
    .line 1624
    .line 1625
    move-result-object v2

    .line 1626
    aput-object v2, v1, v20

    .line 1627
    .line 1628
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1629
    .line 1630
    aput-object v9, v0, v15

    .line 1631
    .line 1632
    :cond_6a
    return-void

    .line 1633
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
